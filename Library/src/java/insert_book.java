
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.FileRenamePolicy;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.Part;

import javax.servlet.annotation.WebServlet;
@WebServlet(name = "insert_book", urlPatterns = {"/insert_book"})
public class insert_book extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String contentType = request.getContentType();

            if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
                String ref = request.getHeader("Referer");
                String link;

                String ftp = "D:\\m";

                try {
                    multipartRequest = new MultipartRequest(request, ftp, 20 * 1024 * 1024, new FileRenamePolicy(){

       @Override
       public File rename(File f) {
           String pName = f.toString();
//                            String path = pName.substring(0, pName.lastIndexOf('\\'));
//                            String file = pName.substring(pName.lastIndexOf('\\') + 1, pName.length());
//                            f = new File(path + "//" + file);
           // out.print("shamim");
           FileDerectory fd = new FileDerectory();
           fd.filePath = f;
           return f;
       }
   });
                    String bookid = multipartRequest.getParameter("book_id");
                    String writtername = multipartRequest.getParameter("writter_name");
                    String bookname = multipartRequest.getParameter("book_name");
                    File path = FileDerectory.filePath;
                    String a=path.toString();
                    out.println(a);                   
                    a = a.replace(" ", "_"); 
                    a=a.substring(5);
                    Jdbc j = new Jdbc();
                    j.connection();
                    String sql = "insert into book_details(book_id,writter_name,book_name,location) values('" + bookid + "','" + writtername + "','" + bookname+ "','" + a+ "')";
                    if (j.CreateTable(sql)) {
                        //response.sendRedirect("Html.jsp?msg=1");
                        out.println("<h1>Insert Success....</h1>");
                        out.println("<meta http-equiv=\"REFRESH\" content=\"1;url=" + request.getHeader("Referer") + "\">");
                    } else {
                        out.print("failed to insert");
                    }
                    j.close();
                    
                    response.sendRedirect("welcome_admin.jsp");

                } catch (Exception e) {
                    System.err.println(e);
                }/*
                 * end of inner try
                 */


            }/*
             * end of if
             */ else {
                out.print("eorng");
            }
        } finally {
            out.close();
        }/*
         * end of outer try
         */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

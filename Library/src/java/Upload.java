


import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.IOException;
import com.oreilly.servlet.multipart.FileRenamePolicy;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sms
 */
@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class Upload extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String contentType = request.getContentType();

            if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
                String ref = request.getHeader("Referer");
                String link;

                String ftp = "D://";
                File file = new File(ftp);
                file.mkdirs();
                try {
                    MultipartRequest multipartRequest = new MultipartRequest(request, ftp, 20 * 1024 * 1024, new FileRenamePolicy() {

                        @Override
                        public File rename(File f) {
                            String pName = f.toString();
                            String path = pName.substring(0, pName.lastIndexOf('\\'));
                            String file = "upload_" + pName.substring(pName.lastIndexOf('\\') + 1, pName.length());
                            f = new File(path + "\\" + file);
                            FileDerectory fd = new FileDerectory();
                            fd.filePath = f;
                            return f;
                        }
                    });
                    
                    File path = FileDerectory.filePath;
                    out.println(path);
                   // out.print("info");

//                Jdbc j = new Jdbc();
//                j.connection();
//                System.out.println(link);
//                String sql = "INSERT INTO TeacherAssignment(Email, AccessCode, Title, Content, Link, AssignDate, LastDate) "
//                        + "VALUES('" + email + "', '" + accessCode + "', '" + title + "', '" + content + "', '" + link + "',"
//                        + " CURRENT_TIMESTAMP, '" + lastDate + "')";
//                if (j.CreateTable(sql)) {
//                    response.sendRedirect(ref);
//                } else {
//                    ep.Set(response, "An error has occured!", ref);
//                }
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        } finally {
            out.close();
        }
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

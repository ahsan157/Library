
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "show_book", urlPatterns = {"/show_book"})
public class show_book extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        List dataList = new ArrayList();
        try {
            Jdbc j = new Jdbc();
            j.connection();
            //String bookName=request.getParameter("search");
            String sql = "select book_id,writter_name,book_name,location from book_details";
            ResultSet rs = j.ShowResult(sql);

            String m, n;
            try {
                while (rs.next()) {

                    //Add records into data list
                    // dataList.add(rs.getInt("serial"));
                    dataList.add(rs.getString("book_id"));
                    dataList.add(rs.getString("writter_name"));
                    dataList.add(rs.getString("book_name"));
                    dataList.add(rs.getString("location"));


                }
                rs.close();
            } catch (Exception e) {
            }
            request.setAttribute("data", dataList);
            //Disptching request
            RequestDispatcher dispatcher = request.getRequestDispatcher("show_book.jsp");
            if (dispatcher != null) {
                dispatcher.forward(request, response);
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "update_user", urlPatterns = {"/update_user"})
public class update_user extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Jdbc j = new Jdbc();
            j.connection();
            String name = request.getParameter("user_name");
            String fname = request.getParameter("father_name");
            String email1 = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("birthday-mm");




//            j.CreateTable("update member_information set name ='"+ name+
//                    "',fname = '" + fname + "',email = '" + email1 +
//                    "',password = '" + password + "',address = '" + address +
//                    "',designation = '" + designation + "' where email='"+m+"'");
            String sql = "update member_information set name='" + name
                    + "',fname='" + fname + "',password='"
                    + password + "',gender='" + gender + "',dob='"
                    + dob + "' where eamil='" + email1 + "'";
             if(j.CreateTable(sql)){
               // response.sendRedirect("Html.jsp?msg=1");
                out.println("<h3>Insert Success....</h3>");
                out.println("<meta http-equiv=\"REFRESH\" content=\"2;url=" + request.getHeader("Referer") + "\">");
                
             }
             response.sendRedirect("welcome_admin.jsp");
             
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
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
@WebServlet(urlPatterns = {"/Member_Register"})
public class Member_Register extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Jdbc j = new Jdbc();
            j.connection();
           
            String name = request.getParameter("user_name");
           // out.print("sms");
            String fname = request.getParameter("father_name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("birthday-mm");
            
            String sql = "insert into member_information values('" + name + "','"+fname+"','"+email+"','"+password+"','"+gender+"','"+dob+"')";
            if(j.CreateTable(sql)){
               // response.sendRedirect("Html.jsp?msg=1");
                out.println("<h3>Insert Success....</h3>");
                out.println("<meta http-equiv=\"REFRESH\" content=\"1;url=" + request.getHeader("Referer") + "\">");
            }
            else{
                response.sendRedirect("member_register2.jsp?");
//                out.println("<h3>Insert Error</h3>");
//                out.println("<meta http-equiv=\"REFRESH\" content=\"2;url=" + request.getHeader("Referer") + "\">");
            }
            j.close();

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

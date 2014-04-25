
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import org.apache.catalina.Session;

import javax.servlet.annotation.WebServlet;
@WebServlet(name = "Welcome_member", urlPatterns = {"/Welcome_member"})
public class Welcome_member extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();HttpSession session = request.getSession(true);
        
        try {
            String userName = request.getParameter("user_name");
            String passwordd = request.getParameter("admin_password");
            String user = "sms", pass = "sms";
           
//           out.print(password);
            Jdbc j = new Jdbc();
            int i=0;
            j.connection();
            
            String sql = "select name,password from member_information";

           ResultSet rs = j.ShowResult(sql);
           //out.print("sms");
            
           try{
               
            while(rs.next()){
            if(rs.getString("name").equals(userName) && rs.getString("password").equals(passwordd)) 
            {
            i=1;
          // out.print("sms"); 
            break;
            }
            }
            }catch(Exception e){}
           
            if(i==1){
                
               session.setAttribute("userName" ,userName);
                response.sendRedirect("index2.jsp");
            }
        else{
            request.setAttribute("error", 1);
            RequestDispatcher rd = request.getRequestDispatcher("log.jsp");
            rd.include(request, response);
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

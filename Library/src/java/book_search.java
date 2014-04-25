import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "book_search", urlPatterns = {"/book_search"})
public class book_search extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         List dataList = new ArrayList();
         String book=request.getParameter("book_name");
         String book_write=request.getParameter("book_search");
        if(book.length()!=0){
         try {
            Jdbc j = new Jdbc();
            j.connection();
            //String bookName=request.getParameter("search");
            String sql = "select book_id,writter_name,book_name from book_details where "
                    + "book_name ='"+book+"'";
            ResultSet rs = j.ShowResult(sql);

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
            } catch (Exception e){}
            
            request.setAttribute("data", dataList);
            //Disptching request
            RequestDispatcher dispatcher = request.getRequestDispatcher("show_book.jsp");
            if (dispatcher != null)
            {
                dispatcher.forward(request, response);
            }
        } finally {            
            out.close();
        }
        }//end of if
        
        else
             try {
            Jdbc j = new Jdbc();
            j.connection();
            //String bookName=request.getParameter("search");
            String sql = "select * from book_details where "
                    + "writter_name ='"+book_write+"'";
            ResultSet rs = j.ShowResult(sql);

            try {
                while (rs.next()) {
                    //Add records into data list
                    //dataList.add(rs.getInt("serial"));
                    dataList.add(rs.getString("book_id"));
                    dataList.add(rs.getString("book_name"));
                    dataList.add(rs.getString("writter_name"));
                  
                    dataList.add(rs.getString("location"));

                }
                rs.close();
            } catch (Exception e){}
            
            request.setAttribute("data", dataList);
            //Disptching request
            RequestDispatcher dispatcher = request.getRequestDispatcher("show_book.jsp");
            if (dispatcher != null)
            {
                dispatcher.forward(request, response);
            }
        } finally {            
            out.close();
        }
        
        out.print("sms");
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

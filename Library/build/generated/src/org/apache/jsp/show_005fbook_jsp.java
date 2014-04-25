package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class show_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Data Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            .modalDialog {\n");
      out.write("                position: fixed;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                top: 0;\n");
      out.write("                right: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("                background: rgba(0,0,0,.5);\n");
      out.write("                z-index: 99999;\n");
      out.write("                opacity:0;\n");
      out.write("                -webkit-transition: opacity 400ms ease-in;\n");
      out.write("                -moz-transition: opacity 400ms ease-in;\n");
      out.write("                transition: opacity 400ms ease-in;\n");
      out.write("                pointer-events: none;\n");
      out.write("            }\n");
      out.write("            .modalDialog:target {\n");
      out.write("                opacity:1;\n");
      out.write("                pointer-events: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modalDialog > div {\n");
      out.write("                width: 400px;\n");
      out.write("                position: relative;\n");
      out.write("                margin: 10% auto;\n");
      out.write("                padding: 5px 20px 13px 20px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background: #fff;\n");
      out.write("                background: -moz-linear-gradient(#fff, #999);\n");
      out.write("                background: -webkit-linear-gradient(#fff, #999);\n");
      out.write("                background: -o-linear-gradient(#fff, #999);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr> \n");
      out.write("                <td><form action=\"show_book.jsp\" method=\"post\">\n");
      out.write("                        <strong>Book Name:</strong>\n");
      out.write("                        <input type=\"\" name=\"book_name\">\n");
      out.write("                        <input type=submit value=\"Search\"> \n");
      out.write("                    </form>  \n");
      out.write("            </tr><tr><td>\n");
      out.write("                    <form action=\"show_book.jsp\" method=\"post\">\n");
      out.write("                        <strong>Writer Name:</strong>\n");
      out.write("                        <input type=\"\" name=\"writer_name\">\n");
      out.write("                        <input type=submit value=\"Search\">                  \n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr><br> \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <center>\n");
      out.write("        <table border=\"3\" >\n");
      out.write("            <br>\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td width=\"119\"><b>Book ID</b></td>\n");
      out.write("                <td width=\"168\"><b>Writer Name</b></td>\n");
      out.write("                <td width=\"168\"><b>Book Name</b></td>\n");
      out.write("                <td width=\"168\"><b>Download</b></td>                            \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
                
                String p = null;
                try {
                    
                    
                    String user = "root";
                    String password = "123";
                    String database = "test";
                    Connection con;
                    String url = "jdbc:mysql://localhost:3306/" + database + "?useUnicode=true&amp;characterEncoding=UTF8;";
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection(url, user, password);
                    Statement stms = con.createStatement();
                    //String bookName=request.getParameter("search");
                    String m = request.getParameter("book_name");
                    String n = request.getParameter("writer_name");
                    
                    String sql;
                    if (m != null) {
                        sql = "select book_id,writter_name,book_name,location from book_details where book_name='" + m + "'";
                    } else if (n != null) {
                        sql = "select book_id,writter_name,book_name,location from book_details where writter_name='" + n + "'";
                    } else {
                        sql = "select book_id,writter_name,book_name,location from book_details";
                    }
                    ResultSet rs = stms.executeQuery(sql);
                    PrintWriter ou = response.getWriter();
                    
                    
                    
                    try {
                        
                        while (rs.next()) {

                            //Add records into data list
                            // dataList.add(rs.getInt("serial"));
                            // dataList.add(rs.getString("book_id"));
                            //// dataList.add(rs.getString("writter_name"));
                            //dataList.add(rs.getString("book_name"));
                            //dataList.add(rs.getString("location"));

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td width=\"168\">");
out.print(rs.getString("book_id"));
      out.write("</td>\n");
      out.write("                <td width=\"168\">");
out.print(rs.getString("writter_name"));
      out.write("</td>\n");
      out.write("                <td width=\"168\">");
out.print(rs.getString("book_name"));
      out.write("</td>\n");
      out.write("                ");
 p = rs.getString("location");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td><a href=\"#openModal\"value=\"");
out.print(p);
      out.write('"');
      out.write('>');
out.print(p);
      out.write("</a></td>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
                        
                        
                    }
                    
                    
                } catch (Exception e) {
                }
                
            
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");
        
    } catch (Exception e) {
    }
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    <div id=\"openModal\" class=\"modalDialog\">\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            ");
request.getParameter("id");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"#close\" title=\"Close\" class=\"close\">X</a>\n");
      out.write("            <form method=\"Get\" action=\"download1\" enctype=\"multipart/form-data\">\n");
      out.write("                \n");
      out.write("                <td>Please Login First</br></br></td>\n");
      out.write("                <td>User Name</td>            \n");
      out.write("                \n");
      out.write("                <td><td><input type=\"hidden\" name=\"id\" value=\"");
 out.print(p);  
      out.write("\" /></td></td>\n");
      out.write("                <td><input type=\"text\" name=\"user_name\" value=\"\" /></td></br>\n");
      out.write("                <td>password</td>\n");
      out.write("                 <td><input type=\"password\" name=\"pass\" value=\"\" /></td>\n");
      out.write("                <td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

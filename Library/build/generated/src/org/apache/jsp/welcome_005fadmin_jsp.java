package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>welcome admin</title>\n");
      out.write("        <meta name=\"author\" content=\"Jake Rocheleau\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"jquery/styles.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            if ((session.getAttribute("userName") == null) || (session.getAttribute("userid") == "")) {
        
      out.write("\n");
      out.write("        You are not logged in<br/>\n");
      out.write("        ");
 response.sendRedirect("administrator.jsp"); 
      out.write("\n");
      out.write("        \n");
      out.write("                ");
} else {
                
      out.write("\n");
      out.write("                <div id=\"wrapper\">\n");
      out.write("                    <center><h2>Welcome Administrator</h2></center>\n");
      out.write("\n");
      out.write("                    <div id=\"form-container\">\n");
      out.write("                        <form  action=\"Member_Register\" method=\"post\">\n");
      out.write("                            <center>\n");
      out.write("                                <h2> <a href=\"update_user.jsp\">Update User Information</a></h2><br>\n");
      out.write("                                <h2><a href=\"delete_user.jsp\">Delete User Information</a></h2><br>\n");
      out.write("                                <h2><a href=\"insert_book.jsp\">Insert Book Details</a></h2><br>\n");
      out.write("                                <h2><a href=\"show_details.jsp\">Show Book Details</a></h2>\n");
      out.write("                                <h3><a href=\"index.jsp\">Home</a></h3>\n");
      out.write("\n");
      out.write("                            </center>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </body>\n");
      out.write("                </html>");
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

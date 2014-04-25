package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_005fadmin2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"library.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.slidertron-1.0.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <img src=\"images/logo.png\" alt=\"Site Title\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"current_page\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"administrator.jsp\"/>Administrator</a></li>\n");
      out.write("                <li><a href=\"member_register.jsp\"/>Member</a></li>\n");
      out.write("                <li><a href=\"#\">Book Details</a></li>\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <dv id=\"left\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </dv>\n");
      out.write("\n");
      out.write("    <div id=\"right\">\n");
      out.write("       \n");
      out.write("        <h3 align=\"center\">Welcome Administrator</h3>\n");
      out.write("        \n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"create_info.jsp\">Create New User</td><br>\n");
      out.write("                <td><a href=\"update_info.jsp\">Update User Information</td><br>\n");
      out.write("                <td><a href=\"delete_info.jsp\">Delete User Information</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"footer\">\n");
      out.write("\n");
      out.write("    </div>\n");
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

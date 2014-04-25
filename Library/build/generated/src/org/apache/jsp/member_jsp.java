package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"library.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"current_page\"><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"administrator.jsp\"/>Administrator</a></li>\n");
      out.write("                <li><a href=\"member_register.jsp\"/>Member</a></li>\n");
      out.write("                <li><a href=\"#\">Book Details</a></li>\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <div id=\"right\">\n");
      out.write("        \n");
      out.write("         <div>\n");
      out.write("            <h3>Sign Up </h3>\n");
      out.write("           <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>User Name :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"user_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td>E-mail:</td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td>password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td><input type=\"submit\" value=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"footer\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

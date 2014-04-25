package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Guided Registration Form - Vandelay Design Demo</title>\n");
      out.write("  <meta name=\"author\" content=\"Jake Rocheleau\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"jquery/styles.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("            <center><h2>Register Now and Join the Site!</h2></center>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"form-container\">\n");
      out.write("\t\t\t<form action=\"insert_book\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label >Book ID &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"book_id\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"1\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"row\">\n");
      out.write("\t\t\t\t\t<label>Book Name: &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\"  name=\"book_name\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"email\">Writer Name:  &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\"name=\"writer_name\" class=\"reg-input\" autocomplete=\"off\" tabindex=\"3\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label>Upload Book: &rarr;</label>\n");
      out.write("                                        <input  type=\"file\" name=\"file\" class=\"reg-input\" autocomplete=\"off\" tabindex=\"4\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("                            <center><input type=\"submit\" value=\"Sign Up!\" name=\"submit\" id=\"submit\" class=\"sub-btn\" tabindex=\"11\"></center>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"admin_header\">\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"Site Title\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu-wrapper\">\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"current_page\"><a href=\"index2.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"administrator.jsp\"/>Administrator</a></li>\n");
      out.write("                        <li><a href=\"member_register.jsp\"/>Member</a></li>\n");
      out.write("                        <li><a href=\"show_book\">Book Details</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">  \n");
      out.write("                <br>\n");
      out.write("                <center>\n");
      out.write("\n");
      out.write("                    <form action=\"insert_book\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <table border=\"0\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>Book ID:</strong></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"book_id\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>Writter Name:</strong></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"writter_name\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>Book Name:</strong></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"book_name\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b>Upload Book:</b></td>\n");
      out.write("                                    <td><INPUT NAME=\"file\" TYPE=\"file\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\" align=\"center\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\" align=\"center\"><input type=\"submit\"\n");
      out.write("                                                                          value=\"Send File\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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

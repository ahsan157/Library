package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link href=\"css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/s3slider.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/s3Slider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#slider').s3Slider({\n");
      out.write("                    timeOut: 3000\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            function clearText(field)\n");
      out.write("            {\n");
      out.write("                if (field.defaultValue == field.value) field.value = '';\n");
      out.write("                else if (field.value == '') field.value = field.defaultValue;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("                        <li class=\"current_page\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"administrator.jsp\"/>Administrator</a></li>\n");
      out.write("                        <li><a href=\"member_register2.jsp\"/>Member</a></li>\n");
      out.write("                        <li><a href=\"show_book.jsp\">Book Details</a></li>\n");
      out.write("                        <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_banner_wrapper\">\n");
      out.write("\n");
      out.write("                <div id=\"templatemo_banner\">\n");
      out.write("\n");
      out.write("                    <div id=\"slider\">\n");
      out.write("                        <ul id=\"sliderContent\">\n");
      out.write("                            <li class=\"sliderImage\">\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><img src=\"gallery/01.jpg\" alt=\"1\" /></a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sliderImage\">\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><img src=\"gallery/02.jpg\" alt=\"2\" /></a>\n");
      out.write("                                <span class=\"bottom\"><strong>Project 2</strong><br />uisque eget elit quis augue pharetra feugiat.</span>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sliderImage\">\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><img src=\"gallery/03.jpg\" alt=\"3\" /></a>\n");
      out.write("                                <span class=\"bottom\"><strong>Project 3</strong><br />Sed et quam vitae ipsum vulputate varius vitae semper nunc.</span>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sliderImage\">\n");
      out.write("                                <a href=\"#\" target=\"_blank\"><img src=\"gallery/04.jpg\" alt=\"4\" /></a>\n");
      out.write("                                <span class=\"bottom\"><strong></strong><br /></span>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clear sliderImage\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"banner_content\">\n");
      out.write("                        <h2>Welcome to the Public Library Online</h2>\n");
      out.write("\n");
      out.write("                        <p>  \n");
      out.write("                            Public Library Online offers access to a dynamic range of fiction and non-fiction titles, \n");
      out.write("                            from a range of renowned publishers. Simply access the books using any internet enabled \n");
      out.write("                            device in the library, whilst you’re on the move, or from the comfort of your own home </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> <!-- end of banner-->\n");
      out.write("\n");
      out.write("            </div> <!-- end of banner wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <p>Copyright (c) 2011 sms@masud.com. All rights reserved. Design by <a href=\"http://www.google.com/\"> shamim & masud</a>.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administrator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Guided Registration Form - Vandelay Design Demo</title>\n");
      out.write("  <meta name=\"author\" content=\"Jake Rocheleau\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"jquery/styles.css\">\n");
      out.write("          <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("            function dil(form)\n");
      out.write("            {\n");
      out.write("                for (var i = 0; i < form.elements.length; i++)\n");
      out.write("                {\n");
      out.write("                    if (form.elements[i].value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Insert User Name and Password\");\n");
      out.write("                        document.F1.user_name.focus;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </SCRIPT>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>  \n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("            <center><h2>Enter As Administrator</h2></center>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"form-container\">\n");
      out.write("\t\t\t<form  name=F1 onSubmit=\"return dil(this)\" action=\"welcome_admin\" method=\"post\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"username\">Enter a Username &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"user_name\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"1\">\n");
      out.write("\t\t\t\t</div>                                                             \t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"password\">Choose a Password &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"admin_password\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");

                                if (request.getAttribute("error") != null) {

                            
      out.write("\n");
      out.write("                            <center><h1 style=\"color: red;\">User Name Password error!!</h1></center>>\n");
      out.write("                            ");
                                }
                            
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("                            \n");
      out.write("                            <input type=\"submit\" value=\"Sign Up!\" name=\"submit\" id=\"submit\" class=\"sub-btn\" tabindex=\"11\">\n");
      out.write("\t\t\t</form\n");
      out.write("                       \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>");
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

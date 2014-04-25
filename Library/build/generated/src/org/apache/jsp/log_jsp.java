package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Guided Registration Form - Vandelay Design Demo</title>\n");
      out.write("        <meta name=\"author\" content=\"Jake Rocheleau\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"jquery/styles.css\">\n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("            function dil(form)\n");
      out.write("            {\n");
      out.write("                for (var i = 0; i < form.elements.length; i++)\n");
      out.write("                {\n");
      out.write("                    if (form.elements[i].value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Fill out all Fields\");\n");
      out.write("                        document.F1.user_name.focus;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if (!isNaN(document.F1.user_name.value))\n");
      out.write("                {\n");
      out.write("                    alert(\"User Name  must  be  char's & can't be null\");\n");
      out.write("                    document.F1.user_name.value = \"\";\n");
      out.write("                    document.F1.user_name.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (!isNaN(document.F1.email.value))\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    alert(\"User Name  must  be  char's & can't be null\");\n");
      out.write("\n");
      out.write("                    document.F1.email.value = \"\";\n");
      out.write("                    document.F1.email.focus();\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if (document.F1.email.value != document.F1.email2.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Email Does Not Match \");\n");
      out.write("                    document.F1.email2.value = \"\";\n");
      out.write("                    document.F1.email2.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (document.F1.password.value != document.F1.repassword.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password Does Not Match \");\n");
      out.write("                    document.F1.repassword.value = \"\";\n");
      out.write("                    document.F1.repassword.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </SCRIPT>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <center><h2>Register Now and Join the Site!</h2></center>\n");
      out.write("\n");
      out.write("            <div id=\"form-container\">\n");
      out.write("                <form  name=F1 onSubmit=\"return dil(this)\" action=\"Member_Register\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <a href=\"new_register.jsp\"Sign In>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                           <a href=\"new_register.jsp\"Sign Up>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <center><input type=\"submit\" value=\"Sign Up!\" name=\"submit\" id=\"submit\" class=\"sub-btn\" tabindex=\"11\"></center>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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

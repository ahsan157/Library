package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005fregister2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <script type=\"text/javascript\" language=\"javascript\" src=\"http://code.jquery.com/jquery-1.7.2.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" language=\"javascript\" src=\"regform.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<h2>Register Now and Join the Site!</h2>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"form-container\">\n");
      out.write("\t\t\t<form id=\"register\" name=\"register\" action=\"index.html\" method=\"post\">\n");
      out.write("\t\t\t\t<h3>100% free, and account registration only takes 60 seconds!</h3>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"username\">Enter a Username &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"user_name\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"1\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"fathername\">Enter a Father name &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"fathername\" name=\"father_name\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"1\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"email\">E-mail Address &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" id=\"email\" name=\"email\" class=\"reg-input\" autocomplete=\"off\" tabindex=\"2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"email2\">Re-type E-mail Address &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" id=\"email2\" name=\"email2\" class=\"reg-input\" autocomplete=\"off\" tabindex=\"3\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"password\">Choose a Password &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"password\" id=\"password\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"4\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"password\">Re-type your Password &rarr;</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"password2\" id=\"password2\" class=\"reg-input tiny\" autocomplete=\"off\" tabindex=\"5\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"gender\">Gender(optional) &rarr;</label>\n");
      out.write("\t\t\t\t\t<select name=\"gender\" id=\"gender\" class=\"sel-input\" tabindex=\"6\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\" selected=\"selected\"></option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">Boy</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Girl</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">Undeclared</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<div class=\"note\"><span id=\"note-gender\">Feel free to share, or don't!</span></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label for=\"birthday\">Your Birthday(optional) &rarr;</label>\n");
      out.write("\t\t\t\t\t<select name=\"birthday-mm\" id=\"birthday-mm\" tabindex=\"7\">\n");
      out.write("\t\t\t\t\t\t<option value=\"00\">Month</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"01\">01</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"02\">02</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"03\">03</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"04\">04</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"05\">05</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"06\">06</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"07\">07</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"08\">08</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"09\">09</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"10\">10</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"11\">11</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"12\">12</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<select name=\"birthday-dd\" id=\"birthday-dd\" tabindex=\"8\">\n");
      out.write("\t\t\t\t\t\t<option value=\"00\">Day</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"01\">01</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"02\">02</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"03\">03</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"04\">04</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"05\">05</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"06\">06</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"07\">07</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"08\">08</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"09\">09</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"10\">10</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"11\">11</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"12\">12</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"13\">13</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"14\">14</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"15\">15</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"16\">16</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"17\">17</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"18\">18</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"19\">19</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"20\">20</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"21\">21</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"22\">22</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"23\">23</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"24\">24</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"25\">25</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"26\">26</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"27\">27</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"28\">28</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"29\">29</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"30\">30</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"31\">31</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<select name=\"birthday-yyyy\" id=\"birthday-yyyy\" tabindex=\"9\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0000\">Year</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2003\">2003</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2002\">2002</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2001\">2001</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2000\">2000</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1999\">1999</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1998\">1998</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1997\">1997</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1996\">1996</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1995\">1995</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1994\">1994</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1993\">1993</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1992\">1992</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1991\">1991</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1990\">1990</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1989\">1989</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1988\">1988</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1987\">1987</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1986\">1986</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1985\">1985</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1984\">1984</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1983\">1983</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1982\">1982</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1981\">1981</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1980\">1980</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1979\">1979</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1978\">1978</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1977\">1977</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1976\">1976</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1975\">1975</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1974\">1974</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1973\">1973</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1972\">1972</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1971\">1971</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1970\">1970</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1969\">1969</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1968\">1968</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1967\">1967</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1966\">1966</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1965\">1965</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1964\">1964</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1963\">1963</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1962\">1962</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1961\">1961</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1960\">1960</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1959\">1959</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1958\">1958</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1957\">1957</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1956\">1956</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1955\">1955</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1954\">1954</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1953\">1953</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1952\">1952</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1951\">1951</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1950\">1950</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1949\">1949</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1948\">1948</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1947\">1947</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1946\">1946</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1945\">1945</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1944\">1944</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1943\">1943</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1942\">1942</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1941\">1941</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1940\">1940</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1939\">1939</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1938\">1938</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1937\">1937</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1936\">1936</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1935\">1935</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1934\">1934</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1933\">1933</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1932\">1932</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1931\">1931</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1930\">1930</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1929\">1929</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1928\">1928</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1927\">1927</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1926\">1926</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1925\">1925</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1924\">1924</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1923\">1923</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1922\">1922</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1921\">1921</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Sign Up!\" name=\"submit\" id=\"submit\" class=\"sub-btn\" tabindex=\"10\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
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

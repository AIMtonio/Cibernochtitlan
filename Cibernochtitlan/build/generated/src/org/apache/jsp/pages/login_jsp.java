package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"\">\n");
      out.write("<head>\n");
      out.write("<title>Inicia sesión</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"../layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"../layout/styles/framework.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"../images/ico/calendarioTransparencia.ico\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- Top Background Image Wrapper -->\n");
      out.write("<div class=\"bgded overlay\" style=\"background-image:url('../images/pictures/leon-tukker-tenochtitlan-leontukkeras.jpg');\"> \n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("  <div id=\"pageintro\" class=\"hoc clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <article>\n");
      out.write("     <!-- <h3 class=\"heading\">Imperdiet consequat integer est</h3>-->\n");
      out.write("     <a href=\"../index.jsp\"> <img src=\"../images/banners/cibernochtitlanmipropiacom.png\" width=\"200%\" height=\"220%\"></a><br><br><br>\n");
      out.write("           \n");
      out.write("               <center>          \n");
      out.write("                   <input class=\"btmspace-15\" type=\"email\" value=\"\" placeholder=\"Introduce tu correo\" id=\"correo\" name=\"correo\">\n");
      out.write("                   <input class=\"btmspace-15\" type=\"password\" value=\"\" placeholder=\"Ingresa tu clave\" id=\"pass\" name=\"pass\"> <br>  \n");
      out.write("      <footer>\n");
      out.write("        <ul class=\"nospace inline pushright\">\n");
      out.write("            <li><a class=\"btn\" onclick=\"ingresar();\">Inicia sesión </a></li>\n");
      out.write("          <li><a class=\"btn inverse\" href=\"../pages/register.jsp\">Registrate</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </footer>\n");
      out.write("                   <div id=\"respuesta\"></div>\n");
      out.write("                     </center>\n");
      out.write("    </article>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </div>\n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("  <div class=\"wrapper row0\">\n");
      out.write("    <div id=\"topbar\" class=\"hoc clear\"> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <div class=\"fl_left\">\n");
      out.write("        <ul>\n");
      out.write("          <li><i class=\"fa fa-phone\"></i> +52 (55) 10 72 71 66</li>\n");
      out.write("          <li><i class=\"fa fa-envelope-o\"></i> antoniomc159807@gmail.com</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"fl_right\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"../index.jsp\"><i class=\"fa fa-lg fa-home\"></i></a></li>\n");
      out.write("            <li><a href=\"../pages/login.jsp\">Ingresa</a></li>\n");
      out.write("            <li><a href=\"../pages/register.jsp\">Registrate</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("</div>\n");
      out.write("<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("<!-- JAVASCRIPTS -->\n");
      out.write("<script src=\"../layout/scripts/login.js\"></script>\n");
      out.write("<script src=\"../layout/scripts/jquery.min.js\"></script>\n");
      out.write("<script src=\"../layout/scripts/jquery.backtotop.js\"></script>\n");
      out.write("<script src=\"../layout/scripts/jquery.mobilemenu.js\"></script>\n");
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

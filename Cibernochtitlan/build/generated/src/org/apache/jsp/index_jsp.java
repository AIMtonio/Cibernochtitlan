package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Cibernochtitlan</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"images/ico/calendarioTransparencia.ico\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- Top Background Image Wrapper -->\r\n");
      out.write("<div class=\"bgded overlay\" style=\"background-image:url('images/pictures/leon-tukker-tenochtitlan-leontukkeras.jpg');\"> \r\n");
      out.write("  <!-- ################################################################################################ -->\r\n");
      out.write("  <div id=\"pageintro\" class=\"hoc clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <article>\r\n");
      out.write("     <!-- <h3 class=\"heading\">Imperdiet consequat integer est</h3>-->\r\n");
      out.write("     <a href=\"index.jsp\"><img src=\"images/banners/cibernochtitlanmipropiacom.png\" width=\"200%\" height=\"220%\"></a><br><br>\r\n");
      out.write("     <font size=\"4\"> Bienvenido a Cibernochtitlan.com un sitio web ideal para quien este \r\n");
      out.write("          en busca de conocimiento, que sus ideales e intereses lo lleven en\r\n");
      out.write("          busca de temas de su elección, así como la interacción con demás \r\n");
      out.write("          usuarios y opiniones para ayudar a crecer esta gran ciudad virtual.</font>\r\n");
      out.write("          <p class=\"font-x1 \"><i> \"El conocimiento es libre y público, la compasión por el saber permitirá el desarrollo igualitario.\"</i></p>\r\n");
      out.write("      <footer>\r\n");
      out.write("        <ul class=\"nospace inline pushright\">\r\n");
      out.write("            <li><a class=\"btn\" href=\"pages/login.jsp\">Inicia sesión </a></li>\r\n");
      out.write("            <li><a class=\"btn inverse\" href=\"pages/register.jsp\">Registrate</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </footer>\r\n");
      out.write("    </article>\r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ################################################################################################ -->\r\n");
      out.write("  <div class=\"wrapper row0\">\r\n");
      out.write("    <div id=\"topbar\" class=\"hoc clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"fl_left\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><i class=\"fa fa-phone\"></i> +52 (55) 10 72 71 66</li>\r\n");
      out.write("          <li><i class=\"fa fa-envelope-o\"></i> antoniomc159807@gmail.com</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"fl_right\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"index.jsp\"><i class=\"fa fa-lg fa-home\"></i></a></li>\r\n");
      out.write("            <li><a href=\"pages/login.jsp\"\">Ingresa</a></li>\r\n");
      out.write("            <li><a href=\"pages/register.jsp\">Registrate</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ################################################################################################ -->\r\n");
      out.write("</div>\r\n");
      out.write("<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("<!-- JAVASCRIPTS -->\r\n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"layout/scripts/jquery.backtotop.js\"></script>\r\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\r\n");
      out.write("</body>\r\n");
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

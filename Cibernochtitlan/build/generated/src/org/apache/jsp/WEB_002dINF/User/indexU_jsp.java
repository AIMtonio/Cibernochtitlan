package org.apache.jsp.WEB_002dINF.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexU_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Inicio Usuario</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"../layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"../layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"../layout/styles/framework.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"../images/ico/calendarioTransparencia.ico\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- Top Background Image Wrapper -->\n");
      out.write("<div class=\"bgded overlay\" style=\"background-image:url('images/demo/backgrounds/01.png');\"> \n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("  <div id=\"pageintro\" class=\"hoc clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <article>\n");
      out.write("      <h3 class=\"heading\">Imperdiet consequat integer est</h3>\n");
      out.write("      <p>Tempus leo in dictum lectus urna vitae dolor integer ut nibh ut dapibus etiam in augue phasellus ultricies ligula</p>\n");
      out.write("      <p class=\"font-x1 uppercase bold\">Libero cursus malesuada etiam</p>\n");
      out.write("      <footer>\n");
      out.write("        <ul class=\"nospace inline pushright\">\n");
      out.write("          <li><a class=\"btn\" href=\"#\">Facilisis</a></li>\n");
      out.write("          <li><a class=\"btn inverse\" href=\"#\">Venenatis</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </footer>\n");
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
      out.write("          <li><i class=\"fa fa-phone\"></i> +00 (123) 456 7890</li>\n");
      out.write("          <li><i class=\"fa fa-envelope-o\"></i> info@domain.com</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"fl_right\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\"><i class=\"fa fa-lg fa-home\"></i></a></li>\n");
      out.write("          <li><a href=\"#\">Login</a></li>\n");
      out.write("          <li><a href=\"#\">Register</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- ################################################################################################ -->\n");
      out.write("</div>\n");
      out.write("<!-- End Top Background Image Wrapper -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"hoc clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("      <h1><a href=\"index.html\">Halice</a></h1>\n");
      out.write("    </div>\n");
      out.write("    <nav id=\"mainav\" class=\"fl_right\">\n");
      out.write("      <ul class=\"clear\">\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a class=\"drop\" href=\"#\">Pages</a>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"pages/gallery.html\">Gallery</a></li>\n");
      out.write("            <li><a href=\"pages/full-width.html\">Full Width</a></li>\n");
      out.write("            <li><a href=\"pages/sidebar-left.html\">Sidebar Left</a></li>\n");
      out.write("            <li><a href=\"pages/sidebar-right.html\">Sidebar Right</a></li>\n");
      out.write("            <li><a href=\"pages/basic-grid.html\">Basic Grid</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"drop\" href=\"#\">Dropdown</a>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">Level 2</a></li>\n");
      out.write("            <li><a class=\"drop\" href=\"#\">Level 2 + Drop</a>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"#\">Level 3</a></li>\n");
      out.write("                <li><a href=\"#\">Level 3</a></li>\n");
      out.write("                <li><a href=\"#\">Level 3</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">Level 2</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Link Text</a></li>\n");
      out.write("        <li><a href=\"#\">Link Text</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <main class=\"hoc container clear\"> \n");
      out.write("    <!-- main body -->\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"center btmspace-80\">\n");
      out.write("      <h6 class=\"heading\">Sed justo sapien donec eget massa</h6>\n");
      out.write("      <p class=\"heading font-x3\">Odio vestibulum id lacus vel lorem</p>\n");
      out.write("      <p>Ullamcorper dapibus curabitur imperdiet lacus et tincidunt tristique sapien ipsum aliquam nisl a vehicula nisl nisi in sem duis ut neque eu augue vulputate.</p>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nospace group element btmspace-80\">\n");
      out.write("      <li class=\"one_quarter first\">\n");
      out.write("        <article><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Quis aliquam metus</h6>\n");
      out.write("            <p>Tincidunt curabitur a erat ut nulla rutrum tempus vitae laoreet [&hellip;]</p>\n");
      out.write("            <footer><a href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Rhoncus ut morbi</h6>\n");
      out.write("            <p>Arcu duis interdum ullamcorper quam non porttitor etiam auctor [&hellip;]</p>\n");
      out.write("            <footer><a href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Fermentum rutrum</h6>\n");
      out.write("            <p>Odio id posuere lectus class aptent taciti sociosqu ad litora torquent [&hellip;]</p>\n");
      out.write("            <footer><a href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Et luctus integer</h6>\n");
      out.write("            <p>Per conubia nostra per inceptos himenaeos in molestie euismod ex [&hellip;]</p>\n");
      out.write("            <footer><a href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <footer class=\"center\"><a class=\"btn\" href=\"#\">Nisl sollicitudin porta</a></footer>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <!-- / main body -->\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper bgded overlay\" style=\"background-image:url('images/demo/backgrounds/02.png');\">\n");
      out.write("  <article class=\"hoc cta clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"three_quarter first\">\n");
      out.write("      <h6 class=\"header nospace\">Risus vel mollis massa</h6>\n");
      out.write("      <p class=\"nospace\">Iaculis morbi ultricies ullamcorper ipsum et blandit proin fringilla pharetra</p>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"one_quarter\"><a class=\"btn\" href=\"#\">Dictum a ipsum &raquo;</a></footer>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </article>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <section class=\"hoc container clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"sectiontitle center\">\n");
      out.write("      <h6 class=\"heading\">Lectus et vehicula</h6>\n");
      out.write("      <p>Enim ac congue libero quisque enim nisi quis</p>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nospace group\">\n");
      out.write("      <li class=\"one_quarter first\">\n");
      out.write("        <article><a href=\"#\"><i class=\"icon btmspace-30 fa fa-gitlab\"></i></a>\n");
      out.write("          <h6 class=\"heading font-x1\">Tincidunt fusce</h6>\n");
      out.write("          <p>Donec vel nunc velit etiam interdum commodo ornare nunc sed felis odio in [&hellip;]</p>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><a href=\"#\"><i class=\"icon btmspace-30 fa fa-globe\"></i></a>\n");
      out.write("          <h6 class=\"heading font-x1\">Id enim vulputate</h6>\n");
      out.write("          <p>Et lobortis orci vitae laoreet nisi donec malesuada sed elit nec bibendum [&hellip;]</p>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><a href=\"#\"><i class=\"icon btmspace-30 fa fa-tencent-weibo\"></i></a>\n");
      out.write("          <h6 class=\"heading font-x1\">Dignissim mauris</h6>\n");
      out.write("          <p>Nec orci sed lorem tempor dictum vitae imperdiet tellus curabitur semper [&hellip;]</p>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_quarter\">\n");
      out.write("        <article><a href=\"#\"><i class=\"icon btmspace-30 fa fa-wpexplorer\"></i></a>\n");
      out.write("          <h6 class=\"heading font-x1\">Dapibus viverra</h6>\n");
      out.write("          <p>Felis at massa elementum imperdiet id imperdiet ligula nulla eget hendrerit [&hellip;]</p>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </section>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper bgded overlay\" style=\"background-image:url('images/demo/backgrounds/03.png')\">\n");
      out.write("  <section class=\"hoc container clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"sectiontitle center\">\n");
      out.write("      <h6 class=\"heading\">Venenatis quam aenean</h6>\n");
      out.write("      <p>Sodales blandit felis in <a href=\"#\">venenatis facilisis</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"group testimonials\">\n");
      out.write("      <article class=\"one_half first\"><img src=\"images/demo/100x100.png\" alt=\"\">\n");
      out.write("        <blockquote>Fusce dignissim ex ac fermentum volutpat cras euismod vitae odio non luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus in tempor.</blockquote>\n");
      out.write("        <h6 class=\"heading\">John D.</h6>\n");
      out.write("        <em>Finibus enim vel</em></article>\n");
      out.write("      <article class=\"one_half\"><img src=\"images/demo/100x100.png\" alt=\"\">\n");
      out.write("        <blockquote>Iaculis neque at euismod proin sed luctus ex etiam mattis tortor est at mattis enim ultrices quis donec sed accumsan arcu in varius magna aenean ut lectus semper lorem ut.</blockquote>\n");
      out.write("        <h6 class=\"heading\">Jane D.</h6>\n");
      out.write("        <em>Pretium lectus sed</em></article>\n");
      out.write("    </div>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </section>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"hoc container clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"sectiontitle center\">\n");
      out.write("      <h6 class=\"heading\">Efficitur tincidunt dui sed</h6>\n");
      out.write("      <p>Facilisis mi efficitur quis vestibulum ante ipsum primis in faucibus orci</p>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nospace group element\">\n");
      out.write("      <li class=\"one_third first\">\n");
      out.write("        <article>\n");
      out.write("          <figure><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("            <figcaption>\n");
      out.write("              <time datetime=\"2045-04-06T08:15+00:00\"><strong>06</strong> <em>Apr</em></time>\n");
      out.write("              <div><i class=\"fa fa-comments\"></i> <a href=\"#\">5</a></div>\n");
      out.write("            </figcaption>\n");
      out.write("          </figure>\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Luctus et ultrices</h6>\n");
      out.write("            <p>Facilisis urna fusce metus velit semper sit amet iaculis non sollicitudin sit amet purus aliquam erat [&hellip;]</p>\n");
      out.write("            <footer><a class=\"btn\" href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_third\">\n");
      out.write("        <article>\n");
      out.write("          <figure><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("            <figcaption>\n");
      out.write("              <time datetime=\"2045-04-05T08:15+00:00\"><strong>05</strong> <em>Apr</em></time>\n");
      out.write("              <div><i class=\"fa fa-comments\"></i> <a href=\"#\">5</a></div>\n");
      out.write("            </figcaption>\n");
      out.write("          </figure>\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Posuere cubilia curae</h6>\n");
      out.write("            <p>Volutpat nam nec vehicula nunc sed et enim justo quisque in rhoncus ex quisque placerat felis sed [&hellip;]</p>\n");
      out.write("            <footer><a class=\"btn\" href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"one_third\">\n");
      out.write("        <article>\n");
      out.write("          <figure><img src=\"images/demo/320x320.png\" alt=\"\">\n");
      out.write("            <figcaption>\n");
      out.write("              <time datetime=\"2045-04-04T08:15+00:00\"><strong>04</strong> <em>Apr</em></time>\n");
      out.write("              <div><i class=\"fa fa-comments\"></i> <a href=\"#\">5</a></div>\n");
      out.write("            </figcaption>\n");
      out.write("          </figure>\n");
      out.write("          <div class=\"txtwrap\">\n");
      out.write("            <h6 class=\"heading\">Habitant morbi tristique</h6>\n");
      out.write("            <p>Nisi commodo interdum feugiat sagittis lectus in lacinia fusce sollicitudin pharetra dui ut malesuada [&hellip;]</p>\n");
      out.write("            <footer><a class=\"btn\" href=\"#\">Read More</a></footer>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row4 bgded overlay\" style=\"background-image:url('images/demo/backgrounds/04.png');\">\n");
      out.write("  <footer id=\"footer\" class=\"hoc clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"center btmspace-50\">\n");
      out.write("      <h2 class=\"heading\">Halice</h2>\n");
      out.write("      <nav>\n");
      out.write("        <ul class=\"nospace inline pushright uppercase\">\n");
      out.write("          <li><a href=\"index.html\"><i class=\"fa fa-lg fa-home\"></i></a></li>\n");
      out.write("          <li><a href=\"#\">About</a></li>\n");
      out.write("          <li><a href=\"#\">Contact</a></li>\n");
      out.write("          <li><a href=\"#\">Terms</a></li>\n");
      out.write("          <li><a href=\"#\">Privacy</a></li>\n");
      out.write("          <li><a href=\"#\">Cookies</a></li>\n");
      out.write("          <li><a href=\"#\">Disclaimer</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <hr class=\"btmspace-50\">\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div class=\"group\">\n");
      out.write("      <div class=\"one_third first\">\n");
      out.write("        <h6 class=\"heading\">Augue curabitur vitae</h6>\n");
      out.write("        <ul class=\"nospace btmspace-30 linklist contact\">\n");
      out.write("          <li><i class=\"fa fa-map-marker\"></i>\n");
      out.write("            <address>\n");
      out.write("            Street Name &amp; Number, Town, Postcode/Zip\n");
      out.write("            </address>\n");
      out.write("          </li>\n");
      out.write("          <li><i class=\"fa fa-phone\"></i> +00 (123) 456 7890</li>\n");
      out.write("          <li><i class=\"fa fa-fax\"></i> +00 (123) 456 7890</li>\n");
      out.write("          <li><i class=\"fa fa-envelope-o\"></i> info@domain.com</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"one_third\">\n");
      out.write("        <h6 class=\"heading\">Velit volutpat lobortis</h6>\n");
      out.write("        <figure><a href=\"#\"><img class=\"borderedbox inspace-10 btmspace-15\" src=\"images/demo/320x168.png\" alt=\"\"></a>\n");
      out.write("          <figcaption>\n");
      out.write("            <h6 class=\"nospace font-x1\"><a href=\"#\">Lacus mattis rutrum eget</a></h6>\n");
      out.write("            <time class=\"font-xs block btmspace-10\" datetime=\"2045-04-06\">Friday, 6<sup>th</sup> April 2045</time>\n");
      out.write("          </figcaption>\n");
      out.write("        </figure>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"one_third\">\n");
      out.write("        <h6 class=\"heading\">Magna vitae aliquet</h6>\n");
      out.write("        <p class=\"nospace btmspace-30\">Tellus mauris volutpat luctus sapien ac luctus urna scelerisque nec.</p>\n");
      out.write("        <form method=\"post\" action=\"#\">\n");
      out.write("          <fieldset>\n");
      out.write("            <legend>Newsletter:</legend>\n");
      out.write("            <input class=\"btmspace-15\" type=\"text\" value=\"\" placeholder=\"Name\">\n");
      out.write("            <input class=\"btmspace-15\" type=\"text\" value=\"\" placeholder=\"Email\">\n");
      out.write("            <button type=\"submit\" value=\"submit\">Submit</button>\n");
      out.write("          </fieldset>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"hoc clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2017 - All Rights Reserved - <a href=\"#\">Domain Name</a></p>\n");
      out.write("    <p class=\"fl_right\">Template by <a target=\"_blank\" href=\"http://www.os-templates.com/\" title=\"Free Website Templates\">OS Templates</a></p>\n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("<!-- JAVASCRIPTS -->\n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.backtotop.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
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

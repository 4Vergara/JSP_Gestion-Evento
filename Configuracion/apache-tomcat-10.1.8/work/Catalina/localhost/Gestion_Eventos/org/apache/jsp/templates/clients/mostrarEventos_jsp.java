/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-05-25 06:38:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.clients;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class mostrarEventos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Logistics</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"../../static/img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"../../static/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../../static/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"../../static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"../../static/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-xxl position-relative bg-white d-flex p-0\">\r\n");
      out.write("        <!-- Spinner Start -->\r\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("                <span class=\"sr-only\">Cargando...</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar Start -->\r\n");
      out.write("        <div class=\"sidebar pe-4 pb-3\">\r\n");
      out.write("            <nav class=\"navbar bg-light navbar-light\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"navbar-brand mx-4 mb-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa me-2\"></i>Logistic</h3>\r\n");
      out.write("                </a>                \r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Sidebar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Start -->\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <!-- Navbar Start -->            \r\n");
      out.write("            <nav class=\"navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0\">\r\n");
      out.write("                <nav class=\"navbar bg-light navbar-light\">\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"navbar-brand mx-4 mb-3\">                        \r\n");
      out.write("                    </a>                \r\n");
      out.write("                </nav>                              \r\n");
      out.write("                <div class=\"navbar-nav align-items-center ms-auto justify-content-end\">\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <form action=\"http://localhost:8080/Gestion_Eventos/templates/clients/descargarCertificado.jsp\" method=\"get\" class=\"nav-link\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary py-2 w-100 mb-3\">Descargar certificado</button>\r\n");
      out.write("                        </form>                           \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <form action=\"http://localhost:8080/Gestion_Eventos/templates/clients/registrarse.jsp\" method=\"get\" class=\"nav-link\">                            \r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary py-2 w-100 mb-3\">Registrarte</button>\r\n");
      out.write("                        </form>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <form action=\"http://localhost:8080/Gestion_Eventos/templates/clients/ingresar.jsp\" method=\"get\" class=\"nav-link\">                            \r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary py-2 w-100 mb-3\">Ingresar</button>\r\n");
      out.write("                        </form>                        \r\n");
      out.write("                    </div>                      \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Blank Start -->\r\n");
      out.write("            <div class=\"container-fluid pt-4 px-4\">\r\n");
      out.write("                <div class=\"row vh-100 bg-light rounded align-items-center justify-content-center mx-0\">\r\n");
      out.write("                    <div class=\"col-md-6 text-center\">\r\n");
      out.write("                        <h3>This is blank page</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Blank End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer Start -->\r\n");
      out.write("            <div class=\"container-fluid pt-4 px-4\">\r\n");
      out.write("                <div class=\"bg-light rounded-top p-4\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-sm-6 text-center text-sm-start\">\r\n");
      out.write("                            &copy; <a href=\"#\">Logistic</a>, Todos los derechso reservados. \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-sm-6 text-center text-sm-end\">\r\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                            Diseñado por <a href=\"https://htmlcodex.com\">HTML Codex</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Footer End -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Content End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/chart/chart.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"../../static/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
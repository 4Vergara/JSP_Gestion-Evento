/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-05-28 00:18:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.clients;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;
import domain.Evento;
import model.EventoDaoJDBC;

public final class registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("domain.Evento");
    _jspx_imports_classes.add("model.EventoDaoJDBC");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container-xxl position-relative bg-white d-flex p-0\">\r\n");
      out.write("        <!-- Spinner Start -->\r\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("                <span class=\"sr-only\">Cargando...</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Sign Up Start -->\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row h-100 align-items-center justify-content-center\" style=\"min-height: 100vh;\">\r\n");
      out.write("                <div class=\"col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4\">\r\n");
      out.write("                    <div class=\"bg-light rounded p-4 p-sm-5 my-4 mx-3\">\r\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                            <a href=\"http://localhost:8080/Gestion_Eventos/templates/clients/mostrarEventos.jsp\" class=\"\">\r\n");
      out.write("                                <h3 class=\"text-primary\"><i class=\"fa me-2\"></i>Logistic</h3>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <h3>Registrate</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form action=\"../../ClienteController\" method=\"get\" onsubmit=\"return validarFormulario()\">\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"floatingText\" placeholder=\"Nombre\" required pattern=\"[A-Za-z\\s]+\">\r\n");
      out.write("                                <label for=\"floatingText\">Nombre</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input type=\"text\" name=\"apellido\" class=\"form-control\" id=\"floatingText\" placeholder=\"Apellido\" required pattern=\"[A-Za-z\\s]+\">\r\n");
      out.write("                                <label for=\"floatingText\">Apellido</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input type=\"text\" name=\"cedula\" class=\"form-control\" id=\"floatingCedula\" placeholder=\"123456789\" required pattern=\"[0-9]+\">\r\n");
      out.write("                                <label for=\"floatingCedula\">Cédula</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input type=\"text\" name=\"telefono\" class=\"form-control\" id=\"floatingTelefono\" placeholder=\"123456789\" required pattern=\"[0-9]+\">\r\n");
      out.write("                                <label for=\"floatingTelefono\">Teléfono</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input type=\"email\" name=\"correo\" class=\"form-control\" id=\"floatingInput\" placeholder=\"nombre@ejemplo.com\" required>\r\n");
      out.write("                                <label for=\"floatingInput\">Correo</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <select class=\"form-select\" id=\"eventoSelect\" required>\r\n");
      out.write("                                    <option value=\"\" selected disabled>Selecciona un evento</option>\r\n");
      out.write("                                    ");
 List<Evento> eventos = EventoDaoJDBC.getNombres();
                                    for (Evento evento : eventos) { 
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( evento.getNombre() );
      out.write('"');
      out.write('>');
      out.print( evento.getNombre() );
      out.write("</option>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <label for=\"eventoSelect\">Evento</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" name=\"submit\" class=\"btn btn-primary py-3 w-100 mb-4\">Registrate</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function validarFormulario() {\r\n");
      out.write("                                // Validar el campo nombre\r\n");
      out.write("                                var nombre = document.querySelector('input[name=\"nombre\"]').value;\r\n");
      out.write("                                if (!/^[A-Za-z\\s]+$/.test(nombre)) {\r\n");
      out.write("                                    alert(\"El nombre solo puede contener letras.\");\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Validar el campo apellido\r\n");
      out.write("                                var apellido = document.querySelector('input[name=\"apellido\"]').value;\r\n");
      out.write("                                if (!/^[A-Za-z\\s]+$/.test(apellido)) {\r\n");
      out.write("                                    alert(\"El apellido solo puede contener letras.\");\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Validar el campo cedula\r\n");
      out.write("                                var cedula = document.querySelector('input[name=\"cedula\"]').value;\r\n");
      out.write("                                if (!/^[0-9]+$/.test(cedula)) {\r\n");
      out.write("                                    alert(\"La cédula solo puede contener números.\");\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Validar el campo telefono\r\n");
      out.write("                                var telefono = document.querySelector('input[name=\"telefono\"]').value;\r\n");
      out.write("                                if (!/^[0-9]+$/.test(telefono)) {\r\n");
      out.write("                                    alert(\"El teléfono solo puede contener números.\");\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Si todos los campos son válidos, se puede enviar el formulario\r\n");
      out.write("                                return true;                                \r\n");
      out.write("                        </script>\r\n");
      out.write("                      \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Sign Up End -->\r\n");
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
      out.write("\r\n");
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

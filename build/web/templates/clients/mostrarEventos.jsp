<%-- 
    Document   : mostrarEventos
    Created on : 23 may. 2023, 19:25:30
    Author     : Lytos
--%>

<%-- 
    Document   : index
    Created on : 21 may. 2023, 23:58:34
    Author     : Lytos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Logistics</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="../../static/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="../../static/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="../../static/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="../../static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="../../static/css/style.css" rel="stylesheet">
</head>

<body>
    <%@page import="java.util.List"%>
    <%@page import="domain.Evento"%>
    <%@page import="model.EventoDaoJDBC"%>
    <div class="container-xxl position-relative bg-white d-flex p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Cargando...</span>
            </div>
        </div>
        <!-- Spinner End -->
        
        <style>
            /* Estilos para la barra superior */
            .top-bar-carlos {
                background-color: #ffffff;
                padding: 10px;
                display: flex;
                justify-content: space-between;
                align-items: center;
            }

            /* Estilos para el h1 dentro de la barra */
            .top-bar-carlos h1 {
                margin: 0;
                font-size: 50px; /* Ajusta el tamaño de fuente según tus necesidades */
            }

            /* Estilos para el botón dentro de la barra */
            .top-bar-carlos .nav-link {
                margin-left: auto;                
            }
            /* Estilos para posicionar el título en la esquina superior izquierda */
            h1.text-primary {
                position: absolute;
                top: 0;
                left: 0;
            }

            /* Estilos para posicionar el botón en la esquina superior derecha */
            form.nav-link {
                position: absolute;
                top: 0;
                right: 0;
            }
            /* Estilos para posicionar el footer en la parte inferior */
            footer {
                position: fixed;
                bottom: 0;
                left: 0;                
                width: 100%;
                background-color: #ffffff;
            }
            
        </style>

        
        
        <!-- Content Start -->
        
        <!-- Contiene el nombre de la empresa, el boton de registrase y extrae los nombres de los eventos de EventosDaoJDBC -->
            <div class="container-fluid pt-4 px-4">
                <div class="top-bar-carlos">
                    <a href="http://localhost:8080/Gestion_Eventos/templates/clients/mostrarEventos.jsp" class="">
                        <h1 class="text-primary"><i class="fa me-2"></i>Logistic</h1>
                    </a>
                    <form action="http://localhost:8080/Gestion_Eventos/templates/clients/inscribirse.jsp" method="get" class="nav-link">
                        <button type="submit" class="btn btn-primary py-2">Inscribirse</button>
                    </form>                    
                </div>
                <div class="row vh-100 bg-light rounded align-items-center justify-content-center mx-0 mt-4">
                    <% List<Evento> eventos = EventoDaoJDBC.getNombres();
                    for (Evento evento : eventos) { %>
                    <div class="col-md-12 text-center border-bottom py-5">
                        <h3><%= evento.getNombre() %></h3>
                        <p><%= evento.getDescripcion() %></p>
                        <p>Fecha inicio: <%= evento.getFechaInicio() %></p>
                        <p>Fecha Finalizacion: <%= evento.getFechaFin() %></p>
                        <!-- Agrega más información sobre el evento según sea necesario -->
                    </div>
                    <% } %>
                </div>
            </div>
            <!-- Principal -->


            <!--<footer>
                <div class="container-fluid pt-4 px-4">
                    <div class="bg-light rounded-top p-4">
                        <div class="row">
                            <div class="col-12 col-sm-6 text-center text-sm-start">
                                &copy; <a href="#">Logistic</a>, Todos los derechos reservados.
                            </div>
                            <div class="col-12 col-sm-6 text-center text-sm-end">                                
                                Diseñado por <a href="https://htmlcodex.com">HTML Codex</a>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>-->
            <!-- Footer End -->
        </div>
        <!-- Content End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="../../static/lib/chart/chart.min.js"></script>
    <script src="../../static/lib/easing/easing.min.js"></script>
    <script src="../../static/lib/waypoints/waypoints.min.js"></script>
    <script src="../../static/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="../../static/lib/tempusdominus/js/moment.min.js"></script>
    <script src="../../static/lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="../../static/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="../../static/js/main.js"></script>
</body>

</html>

<%-- 
    Document   : registrarse
    Created on : 23 may. 2023, 19:20:51
    Author     : Lytos
--%>

<%-- 
    Document   : index
    Created on : 15 may. 2023, 22:44:52
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

        <!-- Sign Up Start -->
        <div class="container-fluid">
            <div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
                <div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
                    <div class="bg-light rounded p-4 p-sm-5 my-4 mx-3">
                        <div class="d-flex align-items-center justify-content-between mb-3">
                            <a href="http://localhost:8080/Gestion_Eventos/templates/clients/mostrarEventos.jsp" class="">
                                <h3 class="text-primary"><i class="fa me-2"></i>Logistic</h3>
                            </a>
                            <h3>Registrate</h3>
                        </div>
                        <form action="../../ClienteController" method="get" onsubmit="return validarFormulario()">
                            <div class="form-floating mb-3">
                                <input type="text" name="nombre" class="form-control" id="floatingText" placeholder="Nombre" required pattern="[A-Za-z\s]+">
                                <label for="floatingText">Nombre</label>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" name="apellido" class="form-control" id="floatingText" placeholder="Apellido" required pattern="[A-Za-z\s]+">
                                <label for="floatingText">Apellido</label>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" name="cedula" class="form-control" id="floatingCedula" placeholder="123456789" required pattern="[0-9]+">
                                <label for="floatingCedula">Cédula</label>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" name="telefono" class="form-control" id="floatingTelefono" placeholder="123456789" required pattern="[0-9]+">
                                <label for="floatingTelefono">Teléfono</label>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="email" name="correo" class="form-control" id="floatingInput" placeholder="nombre@ejemplo.com" required>
                                <label for="floatingInput">Correo</label>
                            </div>
                            <div class="form-floating mb-3">
                                <select class="form-select" id="eventoSelect" required>
                                    <option value="" selected disabled>Selecciona un evento</option>
                                    <% List<Evento> eventos = EventoDaoJDBC.getNombres();
                                    for (Evento evento : eventos) { %>
                                        <option value="<%= evento.getNombre() %>"><%= evento.getNombre() %></option>
                                    <% } %>
                                </select>
                                <label for="eventoSelect">Evento</label>
                            </div>
                            <button type="submit" name="submit" class="btn btn-primary py-3 w-100 mb-4">Registrarte</button>
                        </form>

                        <script>
                            function validarFormulario() {
                                // Validar el campo nombre
                                var nombre = document.querySelector('input[name="nombre"]').value;
                                if (!/^[A-Za-z\s]+$/.test(nombre)) {
                                    alert("El nombre solo puede contener letras.");
                                    return false;
                                }

                                // Validar el campo apellido
                                var apellido = document.querySelector('input[name="apellido"]').value;
                                if (!/^[A-Za-z\s]+$/.test(apellido)) {
                                    alert("El apellido solo puede contener letras.");
                                    return false;
                                }

                                // Validar el campo cedula
                                var cedula = document.querySelector('input[name="cedula"]').value;
                                if (!/^[0-9]+$/.test(cedula)) {
                                    alert("La cédula solo puede contener números.");
                                    return false;
                                }

                                // Validar el campo telefono
                                var telefono = document.querySelector('input[name="telefono"]').value;
                                if (!/^[0-9]+$/.test(telefono)) {
                                    alert("El teléfono solo puede contener números.");
                                    return false;
                                }

                                // Si todos los campos son válidos, se puede enviar el formulario
                                return true;                                
                        </script>
                      
                    </div>
                </div>
            </div>
        </div>
        <!-- Sign Up End -->
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


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import domain.Cliente;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import model.ClienteDaoJDBC;

/**
 *
 * @author Lytos
 */
public class ClienteController extends HttpServlet {

    protected void processRequest(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EventoController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EventoController at " + request.getContextPath() + "</h1>");            
            String nombre = (String) request.getAttribute("nombre");
            String apellido = (String) request.getAttribute("apellido");
            long cedula = (long) request.getAttribute("cedula");
            long telefono = (long) request.getAttribute("telefono");
            String correo = (String) request.getAttribute("correo");
            

            out.println("<p> Cliente: " + nombre + apellido + cedula + telefono + correo +  "</p>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long cedula = Long.parseLong(request.getParameter("cedula"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");        
        String correo = request.getParameter("correo");
        long telefono = Long.parseLong(request.getParameter("telefono"));        
        
        request.setAttribute("cedula", cedula);
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);                
        request.setAttribute("correo", correo);
        request.setAttribute("telefono", telefono);

        Cliente cliente = new Cliente();
        cliente.setCedula(cedula); 
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);               
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);        

        ClienteDaoJDBC clienteDao = new ClienteDaoJDBC();
        clienteDao.insertar(cliente);

        response.sendRedirect("http://localhost:8080/Gestion_Eventos/templates/clients/formaPago.jsp");

    }

}

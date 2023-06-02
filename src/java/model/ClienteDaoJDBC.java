/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import config.Conexion;
import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author lYTOS
 */
public class ClienteDaoJDBC {

    Conexion con = new Conexion();
    Connection cn = con.connect();
    PreparedStatement stmt;

    private static final String SQL_INSERT = "INSERT INTO Cliente (  cedula, nombre, apellido, correo, telefono)"
            + "VALUES (?, ?, ?, ?, ?)";

    public int insertar(Cliente cliente) {

        int rows = 0;
        try {
            stmt = cn.prepareStatement(SQL_INSERT);
            stmt.setLong(1, cliente.getCedula());            
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellido());
            stmt.setString(4, cliente.getCorreo());
            stmt.setLong(5, cliente.getTelefono());                        

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rows;
    }
        
    public static int verificarCliente(long cedulaCliente) {
    int existeCliente = 0;
    try {
        Conexion con = new Conexion();
        Connection cn = con.connect();
        PreparedStatement stmt;

        String SQL_SELECT_CEDULAS = "SELECT cedula FROM Cliente WHERE cedula = ?";

        stmt = cn.prepareStatement(SQL_SELECT_CEDULAS);
        stmt.setLong(1, cedulaCliente);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            existeCliente = 1;
            System.out.println("El cliente con cédula " + cedulaCliente + " existe.");
        } 
    } catch (SQLException e) {
        System.out.println("Error al buscar cédulas de clientes");
    }
    return existeCliente;
}
    
    public static int verificarCorreo(String correoCliente) {
    int existeCorreo = 0;
    try {
        Conexion con = new Conexion();
        Connection cn = con.connect();
        PreparedStatement stmt;

        String SQL_SELECT_CORREO = "SELECT correo FROM Cliente WHERE correo = ?";

        stmt = cn.prepareStatement(SQL_SELECT_CORREO);
        stmt.setString(1, correoCliente);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            existeCorreo = 1;
            System.out.println("El cliente con correo " + existeCorreo + " existe.");
        } 
    } catch (SQLException e) {
        System.out.println("Error al buscar correos de clientes");
    }
    return existeCorreo;
}


}

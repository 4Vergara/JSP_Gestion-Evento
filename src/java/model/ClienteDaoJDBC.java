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

/**
 *
 * @author lYTOS
 */
public class ClienteDaoJDBC {

    Conexion con = new Conexion();
    Connection cn = con.connect();
    PreparedStatement stmt;

    private static final String SQL_INSERT = "INSERT INTO cliente (  cedula, nombre, apellido, correo, telefono)"
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

}

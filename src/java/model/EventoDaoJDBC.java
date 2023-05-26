/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import config.Conexion;
import domain.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EventoDaoJDBC {    

    public static List<Evento> getNombres() {
        List<Evento> nombres = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cn = con.connect();
            PreparedStatement stmt;

            String SQL_SELECT_NOMBRES = "SELECT nombre FROM evento";           
            
            stmt = cn.prepareStatement(SQL_SELECT_NOMBRES);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Evento evento = new Evento();
                evento.setNombre(rs.getString(1));
                nombres.add(evento);
            }
            System.out.println("Se encontraron eventos ");
        } catch (Exception e) {
            System.out.println("Error al buscar eventos");            
        }
        return nombres;
    }
}
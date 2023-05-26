package domain;

import java.sql.Date;
import java.sql.Time;
/**
 *
 * @author Lytos
 */
public class Evento {
    private int idEvento;
    private String nombre;
    private Date fechaInicio;
    private Time horaInicio;
    private Date fechaFin;
    private Time horaFin;
    private String descripcion;
    private double costo;
    private String estado;
    private int empleadoId;
    private int ciudadId;
    
    public Evento(){        
    }
    
    public Evento(int id, String nombre){        
        this.nombre = nombre;
    }
    
    public Evento(int idEvento, String nombre, Date fechaInicio, Time horaInicio, Date fechaFin, Time horaFin,
                  String descripcion, double costo, String estado, int empleadoId, int ciudadId) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
        this.empleadoId = empleadoId;
        this.ciudadId = ciudadId;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public int getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(int ciudadId) {
        this.ciudadId = ciudadId;
    }
    
    
}



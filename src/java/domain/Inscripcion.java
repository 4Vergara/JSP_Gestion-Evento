
package domain;

import java.sql.Date;
import java.sql.Time;

public class Inscripcion {
    private int idInscripcion;
    private Date fecha;
    private Time hora;
    private String estado;
    private String asistencia;
    private int idEvento;
    private int idCliente;
    private int idEmpleado;
    
    public Inscripcion(){
        
    }

    public Inscripcion(int idInscripcion, Date fecha, Time hora, String estado, String asistencia, int idEvento, int idCliente) {
        this.idInscripcion = idInscripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.asistencia = asistencia;
        this.idEvento = idEvento;
        this.idCliente = idCliente;        
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
}

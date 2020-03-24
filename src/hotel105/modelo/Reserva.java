package hotel105.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class Reserva {
    private int id;
    private Date fecha;
    //private String nombre;
    private String tipo;
    private int salon;
    private int idEvento;
    //private int asistentes;

    public Reserva(int id, Date fecha, String tipo, int salon, int idEvento) {
        this.id = id;
        this.fecha = fecha;
        //this.nombre = nombre;
        this.tipo = tipo;
        this.salon = salon;
        this.idEvento=idEvento;
        //this.asistentes = asistentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

     
         
    public ArrayList obtenerTodasReservas(){
        ManejoDB m = new ManejoDB();
        ArrayList reservas=null;
        try{
            reservas = m.obtenerReservas();
        }catch(SQLException e){
            e.getMessage();
        }
        return reservas;
    }
}

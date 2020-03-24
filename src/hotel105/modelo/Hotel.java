/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.modelo;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel
 */
public class Hotel {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Evento> eventos = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    ManejoDB m = new ManejoDB();

    public Hotel() {
        try{
            clientes= m.obtenerClientes();
            reservas = m.obtenerReservas();
            eventos = m.obtenerEventosConReserva();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
    

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    public DefaultTableModel obtenerClientes(){
        
        DefaultTableModel model=null;
        try{
            m.conexion();
            model = new DefaultTableModel(new String[]{"ID", "DNI", "Nombre", "Apellidos", "Dirección", "Teléfono"}, 0);
           
            for (int i = 0; i < clientes.size(); i++) {
                Cliente c= (Cliente) clientes.get(i);
                model.addRow(new Object[]{c.getId(),c.getDni(), c.getNombre(),c.getApellidos(), c.getDireccion(), c.getTelefono()});
            }
        }catch(ClassNotFoundException e){
            e.getMessage();
        }finally{
            m.cerrarConexion();
        }
        return model;
    }
        
   
   public ArrayList obtenerEventos(){
       try{
            ArrayList eventos = m.obtenerEventosConReserva();
       }catch(SQLException e){
           e.getMessage();
       }
       return eventos;
   }
   
    public boolean comprobarDni(String dni){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getDni().equals(dni))
               return true;
        }
       return false;
    }
   
    public Cliente devolverCliente(String dni){
        Cliente c=null;
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getDni().equals(dni)){
               c = clientes.get(i);
            }
        }
        return c;
    }
        
    public ArrayList diasDisponibles(){
        ManejoDB m = new ManejoDB();
        char[] diasDisponiblesS1 = new char[24];
        char[] diasDisponiblesS2 = new char[24];
        char[] diasDisponiblesS3 = new char[24];
        char[] diasDisponiblesS4 = new char[24];
        Date[] numeroDias = new Date[24];
        
        ArrayList salones = new ArrayList();
        Date[] dias = new Date[24];
        try{
            ArrayList reservas = m.obtenerReservas();
            Date fechaActual = new Date();
            Date fecha= new Date();
            
            new SimpleDateFormat("yyyy-MM-dd").format(fechaActual);
            new SimpleDateFormat("yyyy-MM-dd").format(fecha);

            for (int i = 0; i < dias.length; i++) {
               
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fecha);                     
                    
                //Día de la semana actual
                int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

                //Suma días para estar solo en fin de semanas
                if(i==0){
                    if (diaSemana==1) {
                        calendar.add(Calendar.DAY_OF_YEAR, 5);  
                    }else if (diaSemana==2) {
                        calendar.add(Calendar.DAY_OF_YEAR, 4);  
                    }else if (diaSemana==3) {
                        calendar.add(Calendar.DAY_OF_YEAR, 3);  
                    }else if (diaSemana==4) {
                        calendar.add(Calendar.DAY_OF_YEAR, 2);  
                    }else if (diaSemana==5) {
                        calendar.add(Calendar.DAY_OF_YEAR, 1);  
                    }else if (diaSemana==6) {
                        calendar.add(Calendar.DAY_OF_YEAR, 0);  
                    }else if (diaSemana==7) {
                        calendar.add(Calendar.DAY_OF_YEAR, 6);  
                    }
                }else{
                    if (diaSemana==1) {
                        calendar.add(Calendar.DAY_OF_YEAR, 5);  
                    }else if (diaSemana==6) {
                        calendar.add(Calendar.DAY_OF_YEAR, 1);  
                    }else if (diaSemana==7) {
                        calendar.add(Calendar.DAY_OF_YEAR, 1);  
                    }
                }
                
                //Nueva fecha
                fecha =  calendar.getTime(); 
                dias[i]=fecha;
                numeroDias[i]=fecha;
            }
            for (int a = 0; a < reservas.size(); a++) {
                
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                String date1 = dateFormat.format(this.reservas.get(a).getFecha());//Fecha de la reserva pasada a String para compararla
                String date2 = dateFormat.format(fechaActual);//Fecha actual pasada a String para compararla
                
                if (date1.compareTo(date2)==0 || date1.compareTo(date2)>0) {//Compara la fecha de la reserva con la actual
                    for (int x = 0; x < dias.length; x++) {
                        if (new SimpleDateFormat("yyyy-MM-dd").format(this.reservas.get(a).getFecha()).equals(new SimpleDateFormat("yyyy-MM-dd").format(dias[x]))){
                            for (int i = 0; i < eventos.size(); i++) {
                                if (this.reservas.get(a).getIdEvento()==eventos.get(i).getId()) {
                                    if (this.reservas.get(a).getSalon()==1) {
                                        if (eventos.get(i).getNumeroDias()==1) {
                                            diasDisponiblesS1[x]='X';
                                        }else if(eventos.get(i).getNumeroDias()==2){
                                            diasDisponiblesS1[x]='X';
                                            diasDisponiblesS1[x+1]='X';
                                        }else if(eventos.get(i).getNumeroDias()==3){
                                            diasDisponiblesS1[x]='X';
                                            diasDisponiblesS1[x+1]='X';
                                            diasDisponiblesS1[x+2]='X';
                                        }
                                    }else if(this.reservas.get(a).getSalon()==2){
                                        if (eventos.get(i).getNumeroDias()==1) {
                                            diasDisponiblesS2[x]='X';
                                        }else if(eventos.get(i).getNumeroDias()==2){
                                            diasDisponiblesS2[x]='X';
                                            diasDisponiblesS2[x+1]='X';
                                        }else if(eventos.get(i).getNumeroDias()==3){
                                            diasDisponiblesS2[x]='X';
                                            diasDisponiblesS2[x+1]='X';
                                            diasDisponiblesS2[x+2]='X';
                                        }
                                    }else if(this.reservas.get(a).getSalon()==3){
                                        if (eventos.get(i).getNumeroDias()==1) {
                                            diasDisponiblesS3[x]='X';
                                        }else if(eventos.get(i).getNumeroDias()==2){
                                            diasDisponiblesS3[x]='X';
                                            diasDisponiblesS3[x+1]='X';
                                        }else if(eventos.get(i).getNumeroDias()==3){
                                            diasDisponiblesS3[x]='X';
                                            diasDisponiblesS3[x+1]='X';
                                            diasDisponiblesS3[x+2]='X';
                                        }
                                    }else if(this.reservas.get(a).getSalon()==4){
                                        if (eventos.get(i).getNumeroDias()==1) {
                                            diasDisponiblesS4[x]='X';
                                        }else if(eventos.get(i).getNumeroDias()==2){
                                            diasDisponiblesS4[x]='X';
                                            diasDisponiblesS4[x+1]='X';
                                        }else if(eventos.get(i).getNumeroDias()==3){
                                            diasDisponiblesS4[x]='X';
                                            diasDisponiblesS4[x+1]='X';
                                            diasDisponiblesS4[x+2]='X';
                                        }
                                    }
                                }
                            }
                            
                        }else{
                            
                        }  
                    }
                }
            }
             
        }catch(SQLException e){
            e.getMessage();
        }
        
        salones.add(diasDisponiblesS1);
        salones.add(diasDisponiblesS2);
        salones.add(diasDisponiblesS3);
        salones.add(diasDisponiblesS4);
        salones.add(numeroDias);
        
        return salones;
    }
    
    public ArrayList obtenerEventosConReserva(){
         ArrayList eventosReservas=null;
        try{
            eventosReservas = m.obtenerEventosConReserva();
        }catch(SQLException e){
            e.getMessage();
        }
        return eventosReservas;
    }
    
    public ArrayList obtenerReservas(){
        try{
            reservas = m.obtenerReservas();
        }catch(SQLException e){
            e.getMessage();
        }
        return reservas;
    }
    
    public ArrayList obtenerReservasFecha(int id_salon){
        ArrayList obtenido = m.obtenerReservaFecha(id_salon);
        return obtenido;
    }
    
    public ArrayList obtenerMenus(){
        ArrayList menus = m.obtenerMenus();
        return menus;
    }
    
    public ArrayList obtenerHabitaciones(){
        ArrayList habitaciones = m.obtenerHabitaciones();
        return habitaciones;
    }
}

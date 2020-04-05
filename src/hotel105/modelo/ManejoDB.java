package hotel105.modelo;


import hotel105.modelo.Reserva;
import hotel105.modelo.Cliente;
import hotel105.vista.ErrorBD;
import hotel105.vista.VentanaPrincipal;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class ManejoDB {
    private String url = "jdbc:mariadb://localhost/di_t02_p02_e1_m";
    private String user = "root";
    private String pass = "";
    public java.sql.Connection conexion=null;
    public java.sql.Statement sentencia=null;
    public java.sql.ResultSet resultset=null;
    int resultado=0;
    ErrorBD error = new ErrorBD();
    private VentanaPrincipal vp;
    
    public ManejoDB(){
    }

    public ManejoDB(VentanaPrincipal vp) {
        this.vp = vp;
    }
    
    public void conexion() throws ClassNotFoundException{
        try{      
            //Class.forName("org.mariadb.jdbc.Driver");
            this.conexion = DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            error.setVisible(true);
            error.setDefaultCloseOperation(error.DISPOSE_ON_CLOSE);
            error.setBounds(400, 200, 500, 300);
        }
    }
     
    public void cerrarConexion(){
        if (conexion != null) {
            try {
                conexion.close();
            }catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    
    public ArrayList obtenerClientes() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList();
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT id, dni, nombre, apellidos, direccion, telefono FROM clientes GROUP BY id");
            while(resultset.next()){
                int id = resultset.getInt(1);
                String dni = resultset.getString(2);
                String nombre = resultset.getString(3);
                String apellidos = resultset.getString(4);
                String direccion = resultset.getString(5);
                int telefono = resultset.getInt(6);
                Cliente c = new Cliente(id, dni, nombre,apellidos, direccion,telefono);
                clientes.add(c);
            }
        }catch(ClassNotFoundException e){
            e.getMessage();
        }catch(NullPointerException npe){
            vp.setVisible(false);
        }finally{
            cerrarConexion();
        }
        return clientes;
    }
    
    public String obtenerNombreCliente(int id){
        String nombre="";
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            PreparedStatement ps = conexion.prepareStatement("SELECT clientes.nombre, clientes.apellidos FROM clientes, reservas WHERE clientes.id=reservas.id_cliente AND reservas.id_evento=?;");
            ps.setInt(1, id);
            
            resultset = ps.executeQuery();
            
            while(resultset.next()){
                    nombre = resultset.getString(1) + " " + resultset.getString(2);
                }
        }catch(ClassNotFoundException cnfe){
            cnfe.getMessage();
        }catch(SQLException sqle){
            sqle.getMessage();
        }
        return nombre;
    }
    
    public String obtenerNombreSalon(int id){
        String nombre="";
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            PreparedStatement ps = conexion.prepareStatement("SELECT salones.nombre FROM salones, reservas WHERE salones.id=reservas.id_salon AND reservas.id_evento=?;");
            ps.setInt(1, id);
            
            resultset = ps.executeQuery();
            
            while(resultset.next()){
                    nombre = resultset.getString(1);
                }
        }catch(ClassNotFoundException cnfe){
            cnfe.getMessage();
        }catch(SQLException sqle){
            sqle.getMessage();
        }
        return nombre;
    }
    
    public ArrayList obtenerEventosConReserva() throws SQLException {
        ArrayList<Evento> eventos = new ArrayList();
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT e.id, e.num_dias, e.nombre, e.tipo, e.asistentes FROM eventos e, reservas r WHERE e.id=r.id_evento;");
            while(resultset.next()){
                int id = resultset.getInt(1);
                int dias = resultset.getInt(2);
                String nombre = resultset.getString(3);
                String tipo = resultset.getString(4);
                int asistentes = resultset.getInt(5);

                TipoEvento tipoEvento=null;
                if (tipo.equals("Banquete")) {
                    tipoEvento=TipoEvento.Banquete;
                }else if(tipo.equals("Congreso")){
                    tipoEvento=TipoEvento.Congreso;
                }else if(tipo.equals("Jornada")){
                    tipoEvento=TipoEvento.Jornada;
                }
                
                Evento e = new Evento(id, nombre, tipoEvento, asistentes, dias);
                eventos.add(e);
            }
        }catch(ClassNotFoundException e){
            e.getMessage();
        }catch(NullPointerException npe){
            vp.setVisible(false);
        }finally{
            cerrarConexion();
        }
        return eventos;
    }
    
    public ArrayList obtenerReservas() throws SQLException {
        ArrayList<Reserva> reservas = new ArrayList();
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT e.id, e.nombre, e.asistentes, e.tipo, r.fecha, r.id_salon, r.id_evento FROM reservas r, eventos e WHERE r.id_evento=e.id ORDER BY r.fecha ASC;");
            while(resultset.next()){
                int id = resultset.getInt(1);
                String nombre = resultset.getString(2);
                int asistentes = resultset.getInt(3);
                String tipo = resultset.getString(4);
                Date fecha = resultset.getDate(5);
                int salon = resultset.getInt(6);
                int idEvento = resultset.getInt(7);
                Reserva r = new Reserva(id, fecha, tipo, salon, idEvento);
                reservas.add(r);
            }
        }catch(ClassNotFoundException e){
            e.getMessage();
        }catch(NullPointerException npe){
            vp.setVisible(false);
        }finally{
            cerrarConexion();
        }
        return reservas;
    }
    
    public void insertarReserva(int idCliente, int idSalon, int idEvento, String fecha){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO reservas (id_cliente, id_salon, id_evento, fecha) VALUES(?,?,?,?)");
            
            ps.setInt(1, idCliente);
            ps.setInt(2, idSalon);
            ps.setInt(3, idEvento);
            ps.setString(4, fecha);
            
            resultset = ps.executeQuery();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
        public void insertarEvento(int id, String nombre, String tipo, int asistentes, int dias){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO eventos (id, nombre, tipo, asistentes, num_dias) VALUES(?,?,?,?,?)");
            
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, tipo);
            ps.setInt(4, asistentes);
            ps.setInt(5, dias);
            resultset = ps.executeQuery();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    
    
    public void insertarHabitacion(int idEvento, int numeroHabitaciones, String tipo){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO habitacion_congresos (id_evento, num_hab, tipo) VALUES(?,?,?)");
            
            ps.setInt(1, idEvento);
            ps.setInt(2, numeroHabitaciones);
            ps.setString(3, tipo);
            
            int resultado = ps.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void insertarBanquete(int idEvento, String primero, String segundo){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO menu_banquetes (id_evento, primero, segundo) VALUES(?,?,?)");
            
            ps.setInt(1, idEvento);
            ps.setString(2, primero);
            ps.setString(3, segundo);
            
            int resultado = ps.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public int obtenerUltimoId(){
        int id=-1;
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT MAX(id) FROM eventos;");
            
            while(resultset.next()){
                id = resultset.getInt(1);
            }
            
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        
        return id;
    }
  
    
    public void eliminarReserva(String fecha, String salon){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM reservas WHERE fecha=? AND id_salon=?;");
            
            ps.setString(1, fecha);
            int numeroSalon = Integer.parseInt(salon);
            ps.setInt(2, numeroSalon);
            
            int resultado = ps.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void eliminarEvento(int id){
        try{
            conexion();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM eventos WHERE id=?;");
            
            ps.setInt(1, id);
            
            int resultado = ps.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void proximasReservas(){
        try{
            ArrayList eventos = obtenerEventosConReserva();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
    public ArrayList obtenerReservaFecha(int id_salon){
        ArrayList<Reserva> reservas = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList obtenidos = new ArrayList();
        
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            PreparedStatement ps = conexion.prepareStatement("SELECT e.id, r.fecha, e.nombre, e.tipo, e.asistentes, e.num_dias, r.id_salon FROM reservas r, eventos e WHERE r.id_evento=e.id AND r.id_salon=? ORDER BY r.fecha ASC;");
            
            ps.setInt(1, id_salon);
            
            resultset = ps.executeQuery();
            
            while(resultset.next()){
                int id = resultset.getInt(1);
                Date fecha = resultset.getDate(2);
                String nombre = resultset.getString(3);
                String tipo = resultset.getString(4);
                int asistentes = resultset.getInt(5);
                int numDias = resultset.getInt(6);
                int salon = resultset.getInt(7);
                
                Reserva r = new Reserva(id, fecha, tipo, salon, id);
                
                TipoEvento tipoEvento=null;
                if (tipo.equals("Banquete")) {
                    tipoEvento=TipoEvento.Banquete;
                }else if(tipo.equals("Congreso")){
                    tipoEvento=TipoEvento.Congreso;
                }else if(tipo.equals("Jornada")){
                    tipoEvento=TipoEvento.Jornada;
                }
                
                Evento e = new Evento(id, nombre, tipoEvento, asistentes, numDias);

                eventos.add(e);
               reservas.add(r);
            }
            
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        obtenidos.add(reservas);
        obtenidos.add(eventos);
        
        return obtenidos;
    }
    
    public ArrayList<MenuBanquete> obtenerMenus(){
        ArrayList<MenuBanquete> menus = new ArrayList();
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT * FROM menu_banquetes GROUP BY id_evento;");
            
            while(resultset.next()){
                int id = resultset.getInt(1);
                String primero = resultset.getString(2);
                String segundo = resultset.getString(3);
                
                Plato plato1=null;
                Plato plato2=null;
                if (primero.equals(Plato.Ensalada.toString())) {
                    plato1 = Plato.Ensalada;
                }else if(primero.equals(Plato.Filetes.toString())){
                    plato1 = Plato.Filetes;
                }else if(primero.equals(Plato.Macarrones.toString())){
                    plato1 = Plato.Macarrones;
                }else if(primero.equals(Plato.Pescado.toString())){
                    plato1 = Plato.Pescado;
                }else if(primero.equals(Plato.Sopa.toString())){
                    plato1 = Plato.Sopa;
                }else if(primero.equals(Plato.Tortilla.toString())){
                    plato1 = Plato.Tortilla;
                }
                
                if (segundo.equals(Plato.Ensalada.toString())) {
                    plato2 = Plato.Ensalada;
                }else if(segundo.equals(Plato.Filetes.toString())){
                    plato2 = Plato.Filetes;
                }else if(segundo.equals(Plato.Macarrones.toString())){
                    plato2 = Plato.Macarrones;
                }else if(segundo.equals(Plato.Pescado.toString())){
                    plato2 = Plato.Pescado;
                }else if(segundo.equals(Plato.Sopa.toString())){
                    plato2 = Plato.Sopa;
                }else if(segundo.equals(Plato.Tortilla.toString())){
                    plato2 = Plato.Tortilla;
                }
                
                MenuBanquete menu = new MenuBanquete(id, plato1, plato2);
                menus.add(menu);
            }
            
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        
        return menus;
    }
    
    public ArrayList<HabitacionCongreso> obtenerHabitaciones(){
        ArrayList<HabitacionCongreso> habitaciones = new ArrayList<>();
        try{
            conexion();
            this.sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("SELECT * FROM habitacion_congresos;");
            
            while(resultset.next()){
                int id = resultset.getInt(1);
                int numHabitaciones = resultset.getInt(2);
                String tipo = resultset.getString(3);
                
                TipoHabitaciones tipoHabitacion=null;
                if (tipo.toLowerCase().equals(TipoHabitaciones.Doble.toString().toLowerCase())) {
                    tipoHabitacion = TipoHabitaciones.Doble;
                }else if (tipo.toLowerCase().equals(TipoHabitaciones.Individual.toString().toLowerCase())) {
                    tipoHabitacion = TipoHabitaciones.Individual;
                }
                
                HabitacionCongreso h = new HabitacionCongreso(id, numHabitaciones, tipoHabitacion);
                habitaciones.add(h);
            }
            
        }catch(SQLException e){
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        
        return habitaciones;
    }
}

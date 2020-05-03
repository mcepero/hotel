package hotel105.vista;


import hotel105.modelo.Evento;
import hotel105.modelo.HabitacionCongreso;
import hotel105.modelo.Hotel;
import hotel105.modelo.ManejoDB;
import hotel105.modelo.MenuBanquete;
import hotel105.modelo.ModeloTablaReservas;
import hotel105.modelo.Reserva;
import hotel105.modelo.TipoEvento;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    Hotel hotel = new Hotel();
    ManejoDB m = new ManejoDB();
    ModeloTablaReservas model = new ModeloTablaReservas();

    public VentanaPrincipal() {
        
        initComponents();
        jTableReservas.setModel(model);
        jTableClientes.setModel(hotel.obtenerClientes());  
        jTableClientes.setDefaultEditor(Object.class, null);

        model.refreshTableModel(hotel);
        asignarTamañoTabla();
        porcentajeReservas();
        jTextAreaInformacion.setEditable(false);
        proximasReservas(hotel, 1);
        jButtonEliminar.setEnabled(false);
    }

    public ModeloTablaReservas getModel() {
        return model;
    }

    public void setModel(ModeloTablaReservas model) {
        this.model = model;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel h) {
        this.hotel = h;
    }

    public JComboBox<String> getjComboBoxSalon() {
        return jComboBoxSalon;
    }

    public void setjComboBoxSalon(JComboBox<String> jComboBoxSalon) {
        this.jComboBoxSalon = jComboBoxSalon;
    }

    public JTable getjTableReservas() {
        return jTableReservas;
    }

    public void setjTableReservas(JTable jTableReservas) {
        this.jTableReservas = jTableReservas;
    }

    public JTextArea getjTextAreaInformacion() {
        return jTextAreaInformacion;
    }

    public void setjTextAreaInformacion(JTextArea jTextAreaInformacion) {
        this.jTextAreaInformacion = jTextAreaInformacion;
    }

    public ManejoDB getManejoDB() {
        return m;
    }

    public void setManejoDB(ManejoDB m) {
        this.m = m;
    }

    public void asignarTamañoTabla(){
        jTableReservas.getColumnModel().getColumn(0).setPreferredWidth(1);
        jTableReservas.getColumnModel().getColumn(1).setPreferredWidth(25);
        jTableReservas.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableReservas.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTableReservas.getColumnModel().getColumn(4).setPreferredWidth(40);
        jTableReservas.getColumnModel().getColumn(5).setPreferredWidth(10);
    }
    
    public void porcentajeReservas(){
        ArrayList<Evento> eventos = hotel.obtenerEventosConReserva();
        ArrayList<Reserva> reservas = hotel.obtenerReservas();
        double reservasSalon1=0;
        double reservasSalon2=0;
        double reservasSalon3=0;
        double reservasSalon4=0;
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        
        for (int i = 0; i < eventos.size(); i++) {
            for (int j = 0; j < reservas.size(); j++) { 
                if (reservas.get(j).getFecha().after(new Date()) || new SimpleDateFormat("yyyy-MM-dd").format(reservas.get(j).getFecha()).equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date())) && diaSemana==6) {
                    if (eventos.get(i).getId()==reservas.get(j).getIdEvento()){
                        if (reservas.get(j).getSalon()==1) {
                            reservasSalon1+=eventos.get(i).getNumeroDias();
                        }else if (reservas.get(j).getSalon()==2) {
                            reservasSalon2+=eventos.get(i).getNumeroDias();
                        }else if (reservas.get(j).getSalon()==3) {
                            reservasSalon3+=eventos.get(i).getNumeroDias();
                        }else if (reservas.get(j).getSalon()==4) {
                            reservasSalon4+=eventos.get(i).getNumeroDias();
                        }
                    }
                }
            }
        }

        double media=(reservasSalon1*100)/24;
        jLabelSalon1.setText("Tierra Media: " + Math.round(media * 100d) / 100d + "% reservado");
        media = (reservasSalon2*100)/24;
        jLabelSalon2.setText("Narnia: " + Math.round(media * 100d) / 100d+"% reservado");
        media = (reservasSalon3*100)/24;
        jLabelSalon3.setText("Asgard: " + Math.round(media * 100d) / 100d +"% reservado");
        media = (reservasSalon4*100)/24;
        jLabelSalon4.setText("Namek: " + Math.round(media * 100d) / 100d+"% reservado");
    }
    
        public void proximasReservas(Hotel h, int salon) {
            JLabel listaJLabel[][] = new JLabel[8][4];
            JPanel listaJPanel[][] = new JPanel[8][4];
            
            
            listaJLabel[0][0] = jLabel1;
            listaJLabel[1][0] = jLabel2;
            listaJLabel[2][0] = jLabel3;
            listaJLabel[3][0] = jLabel4;
            listaJLabel[4][0] = jLabel5;
            listaJLabel[5][0] = jLabel6;
            listaJLabel[6][0] = jLabel7;
            listaJLabel[7][0] = jLabel8;
            listaJLabel[0][1] = jLabel9;
            listaJLabel[1][1] = jLabel10;
            listaJLabel[2][1] = jLabel11;
            listaJLabel[3][1] = jLabel12;
            listaJLabel[4][1] = jLabel13;
            listaJLabel[5][1] = jLabel14;
            listaJLabel[6][1] = jLabel15;
            listaJLabel[7][1] = jLabel16;
            listaJLabel[0][2] = jLabel17;
            listaJLabel[1][2] = jLabel18;
            listaJLabel[2][2] = jLabel19;
            listaJLabel[3][2] = jLabel20;
            listaJLabel[4][2] = jLabel21;
            listaJLabel[5][2] = jLabel22;
            listaJLabel[6][2] = jLabel23;
            listaJLabel[7][2] = jLabel24;
            listaJLabel[0][3] = jLabel25;
            listaJLabel[1][3] = jLabel26;
            listaJLabel[2][3] = jLabel27;
            listaJLabel[3][3] = jLabel28;
            listaJLabel[4][3] = jLabel29;
            listaJLabel[5][3] = jLabel30;
            listaJLabel[6][3] = jLabel31;
            listaJLabel[7][3] = jLabel32;
            
            listaJPanel[0][0] = jPanel01;
            listaJPanel[1][0] = jPanel02;
            listaJPanel[2][0] = jPanel03;
            listaJPanel[3][0] = jPanel04;
            listaJPanel[4][0] = jPanel05;
            listaJPanel[5][0] = jPanel06;
            listaJPanel[6][0] = jPanel07;
            listaJPanel[7][0] = jPanel08;
            listaJPanel[0][1] = jPanel09;
            listaJPanel[1][1] = jPanel010;
            listaJPanel[2][1] = jPanel011;
            listaJPanel[3][1] = jPanel012;
            listaJPanel[4][1] = jPanel013;
            listaJPanel[5][1] = jPanel014;
            listaJPanel[6][1] = jPanel015;
            listaJPanel[7][1] = jPanel016;
            listaJPanel[0][2] = jPanel017;
            listaJPanel[1][2] = jPanel018;
            listaJPanel[2][2] = jPanel019;
            listaJPanel[3][2] = jPanel020;
            listaJPanel[4][2] = jPanel021;
            listaJPanel[5][2] = jPanel022;
            listaJPanel[6][2] = jPanel023;
            listaJPanel[7][2] = jPanel024;
            listaJPanel[0][3] = jPanel025;
            listaJPanel[1][3] = jPanel026;
            listaJPanel[2][3] = jPanel027;
            listaJPanel[3][3] = jPanel028;
            listaJPanel[4][3] = jPanel029;
            listaJPanel[5][3] = jPanel030;
            listaJPanel[6][3] = jPanel031;
            listaJPanel[7][3] = jPanel032;
            
            if(h==null)
            return;

            int numFilas=h.getReservas().size();
            
            ArrayList obtenidos = h.obtenerReservasFecha(salon);
            ArrayList<Reserva> reservas = (ArrayList<Reserva>) obtenidos.get(0);
            ArrayList<Evento> eventos = (ArrayList<Evento>) obtenidos.get(1);
            
            ArrayList dias = h.diasDisponibles();
            Date[] numeroDias = (Date[]) dias.get(4);
            
            int contadorEscribirFecha = 0;
            int contadorDias=0;
            
           
            int fila=0;
            int f=0;
            
            //Deja en blanco todos los labels para volver a comprobar
            for (int i = 0; i < listaJLabel.length; i++) {
                for (int j = 0; j < listaJLabel[i].length; j++) {
                    listaJLabel[i][j].setText("");
                    if (listaJPanel[i][j].getComponentCount()>1) {
                        listaJPanel[i][j].remove(1);
                    }
                    
                }
            }

            for (int i = 0; i < 8; i++) {
                String texto = new SimpleDateFormat("dd-MM-yyyy").format(numeroDias[contadorEscribirFecha]) + " - " + new SimpleDateFormat("dd-MM-yyyy").format(numeroDias[contadorEscribirFecha+2]);
                listaJLabel[i][0].setText(texto);
                contadorEscribirFecha+=3;
            }
            
            for(int g=0; g<23; g++){
                for (int i = 0; i < reservas.size(); i++) {
                    if(contadorDias<24){
                        if (new SimpleDateFormat("dd-MM-yyyy").format(reservas.get(i).getFecha()).equals(new SimpleDateFormat("dd-MM-yyyy").format(numeroDias[contadorDias]))) {
                            for (int j = 0; j < eventos.size(); j++) {
                                if (reservas.get(i).getIdEvento()==eventos.get(j).getId()) {

                                   Calendar calendar = Calendar.getInstance();
                                   calendar.setTime(reservas.get(i).getFecha());
                                   int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

                                    if (eventos.get(j).getNumeroDias()==1) {
                                        if (diaSemana==1) {
                                            listaJLabel[f][3].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        }else if(diaSemana==6){
                                            listaJLabel[f][1].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        }else{
                                            listaJLabel[f][2].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        }

                                    }else if(eventos.get(j).getNumeroDias()==2){
                                        if(diaSemana==6){
                                            listaJLabel[f][1].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                            listaJLabel[f][2].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        }else if(diaSemana==7){
                                            listaJLabel[f][2].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                            listaJLabel[f][3].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        }
                                    }else if(eventos.get(j).getNumeroDias()==3){
                                        listaJLabel[f][1].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        listaJLabel[f][2].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                        listaJLabel[f][3].setText(reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes());
                                    }
                                }
                            }
                        }
                    
                    }
                    
                }
                fila++;
                if (fila%3==0) {
                     f++;
                }
                contadorDias++;
            }
            
            for (int i = 0; i < listaJLabel.length; i++) {
                for (int j = 0; j < listaJLabel[i].length; j++) {
                    listaJLabel[i][j].setVisible(true);
                    if (listaJLabel[i][j].getText().length()>30) {
                        listaJLabel[i][j].setToolTipText(listaJLabel[i][j].getText());
                        listaJLabel[i][j].setText((String) listaJLabel[i][j].getText().subSequence(0, 29)+"...");
                    }
                }
            }
                
            for (int i = 0; i < listaJLabel.length; i++) {
                for (int j = 0; j < listaJLabel[i].length; j++) {
                    if (listaJLabel[i][j].getText().equals("")) {
                        ImagenDisponible imagen=new ImagenDisponible(); 
                        imagen.setVisible(true);
                        imagen.setSize(100,100);
                        listaJPanel[i][j].add(imagen);                     
                        listaJPanel[i][j].repaint();
                     }
                }
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanelReservas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaInformacion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxSalon = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabelSalon3 = new javax.swing.JLabel();
        jLabelSalon2 = new javax.swing.JLabel();
        jLabelSalon4 = new javax.swing.JLabel();
        jLabelSalon1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanelDias = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jPanel028 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel020 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel011 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel06 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelViernes1 = new javax.swing.JLabel();
        jPanel019 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel024 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel032 = new javax.swing.JPanel();
        jPanel08 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelViernes2 = new javax.swing.JLabel();
        jPanel03 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel010 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel026 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel05 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel030 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel029 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel07 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel09 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel015 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel04 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel017 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel027 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel013 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabelViernes = new javax.swing.JLabel();
        jPanel014 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel025 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel021 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel012 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel022 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel016 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel023 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel018 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel031 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcciones = new javax.swing.JMenu();
        jMenuItemReserva = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuAcerca = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPanelReservas.setPreferredSize(new java.awt.Dimension(470, 499));

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableReservas);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTextAreaInformacion.setColumns(20);
        jTextAreaInformacion.setRows(5);
        jScrollPane4.setViewportView(jTextAreaInformacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPanelReservas.addTab("Reservas", jPanel1);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanelReservas.addTab("Clientes", jPanel2);

        jComboBoxSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tierra Media", "Narnia", "Asgard", "Namek" }));
        jComboBoxSalon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSalonItemStateChanged(evt);
            }
        });
        jComboBoxSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalonActionPerformed(evt);
            }
        });
        jComboBoxSalon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxSalonPropertyChange(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelSalon3.setText("Asgard: ");

        jLabelSalon2.setText("Narnia: ");

        jLabelSalon4.setText("Namek:");

        jLabelSalon1.setText("Tierra Media: ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Porcentaje de ocupación");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSalon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelSalon1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSalon4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalon2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalon2)
                    .addComponent(jLabelSalon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalon3)
                    .addComponent(jLabelSalon4))
                .addGap(28, 28, 28))
        );

        jPanelDias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFecha.setText("Fecha");
        jPanelDias.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 134, -1));

        javax.swing.GroupLayout jPanel028Layout = new javax.swing.GroupLayout(jPanel028);
        jPanel028.setLayout(jPanel028Layout);
        jPanel028Layout.setHorizontalGroup(
            jPanel028Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel028Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel028Layout.setVerticalGroup(
            jPanel028Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel028Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel028, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 160, -1, -1));

        javax.swing.GroupLayout jPanel020Layout = new javax.swing.GroupLayout(jPanel020);
        jPanel020.setLayout(jPanel020Layout);
        jPanel020Layout.setHorizontalGroup(
            jPanel020Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel020Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel020Layout.setVerticalGroup(
            jPanel020Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel020Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel020, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 160, -1, -1));

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel02Layout.setVerticalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        javax.swing.GroupLayout jPanel011Layout = new javax.swing.GroupLayout(jPanel011);
        jPanel011.setLayout(jPanel011Layout);
        jPanel011Layout.setHorizontalGroup(
            jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel011Layout.setVerticalGroup(
            jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel011, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 115, -1, -1));

        javax.swing.GroupLayout jPanel06Layout = new javax.swing.GroupLayout(jPanel06);
        jPanel06.setLayout(jPanel06Layout);
        jPanel06Layout.setHorizontalGroup(
            jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel06Layout.setVerticalGroup(
            jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabelViernes1.setText("Sábado");
        jPanelDias.add(jLabelViernes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 10, 63, -1));

        javax.swing.GroupLayout jPanel019Layout = new javax.swing.GroupLayout(jPanel019);
        jPanel019.setLayout(jPanel019Layout);
        jPanel019Layout.setHorizontalGroup(
            jPanel019Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel019Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel019Layout.setVerticalGroup(
            jPanel019Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel019Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel019, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 115, -1, -1));

        javax.swing.GroupLayout jPanel024Layout = new javax.swing.GroupLayout(jPanel024);
        jPanel024.setLayout(jPanel024Layout);
        jPanel024Layout.setHorizontalGroup(
            jPanel024Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel024Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel024Layout.setVerticalGroup(
            jPanel024Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel024Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel024, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 336, -1, -1));

        javax.swing.GroupLayout jPanel032Layout = new javax.swing.GroupLayout(jPanel032);
        jPanel032.setLayout(jPanel032Layout);
        jPanel032Layout.setHorizontalGroup(
            jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        jPanel032Layout.setVerticalGroup(
            jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanelDias.add(jPanel032, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 336, -1, -1));

        javax.swing.GroupLayout jPanel08Layout = new javax.swing.GroupLayout(jPanel08);
        jPanel08.setLayout(jPanel08Layout);
        jPanel08Layout.setHorizontalGroup(
            jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel08Layout.setVerticalGroup(
            jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel08, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, -1, -1));

        jLabelViernes2.setText("Domingo");
        jPanelDias.add(jLabelViernes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 10, 97, -1));

        javax.swing.GroupLayout jPanel03Layout = new javax.swing.GroupLayout(jPanel03);
        jPanel03.setLayout(jPanel03Layout);
        jPanel03Layout.setHorizontalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel03Layout.setVerticalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        javax.swing.GroupLayout jPanel010Layout = new javax.swing.GroupLayout(jPanel010);
        jPanel010.setLayout(jPanel010Layout);
        jPanel010Layout.setHorizontalGroup(
            jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel010Layout.setVerticalGroup(
            jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel010, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 72, -1, -1));

        javax.swing.GroupLayout jPanel026Layout = new javax.swing.GroupLayout(jPanel026);
        jPanel026.setLayout(jPanel026Layout);
        jPanel026Layout.setHorizontalGroup(
            jPanel026Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel026Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel026Layout.setVerticalGroup(
            jPanel026Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel026Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel026, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 72, -1, -1));

        javax.swing.GroupLayout jPanel05Layout = new javax.swing.GroupLayout(jPanel05);
        jPanel05.setLayout(jPanel05Layout);
        jPanel05Layout.setHorizontalGroup(
            jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel05Layout.setVerticalGroup(
            jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        javax.swing.GroupLayout jPanel030Layout = new javax.swing.GroupLayout(jPanel030);
        jPanel030.setLayout(jPanel030Layout);
        jPanel030Layout.setHorizontalGroup(
            jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel030Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
        );
        jPanel030Layout.setVerticalGroup(
            jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel030, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 250, -1, -1));

        javax.swing.GroupLayout jPanel029Layout = new javax.swing.GroupLayout(jPanel029);
        jPanel029.setLayout(jPanel029Layout);
        jPanel029Layout.setHorizontalGroup(
            jPanel029Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel029Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel029Layout.setVerticalGroup(
            jPanel029Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel029Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel029, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 205, -1, -1));

        javax.swing.GroupLayout jPanel07Layout = new javax.swing.GroupLayout(jPanel07);
        jPanel07.setLayout(jPanel07Layout);
        jPanel07Layout.setHorizontalGroup(
            jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel07Layout.setVerticalGroup(
            jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 293, -1, -1));

        javax.swing.GroupLayout jPanel09Layout = new javax.swing.GroupLayout(jPanel09);
        jPanel09.setLayout(jPanel09Layout);
        jPanel09Layout.setHorizontalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel09Layout.setVerticalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelDias.add(jPanel09, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 29, 216, 33));

        javax.swing.GroupLayout jPanel015Layout = new javax.swing.GroupLayout(jPanel015);
        jPanel015.setLayout(jPanel015Layout);
        jPanel015Layout.setHorizontalGroup(
            jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel015Layout.setVerticalGroup(
            jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel015, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 293, -1, -1));

        javax.swing.GroupLayout jPanel04Layout = new javax.swing.GroupLayout(jPanel04);
        jPanel04.setLayout(jPanel04Layout);
        jPanel04Layout.setHorizontalGroup(
            jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel04Layout.setVerticalGroup(
            jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        javax.swing.GroupLayout jPanel017Layout = new javax.swing.GroupLayout(jPanel017);
        jPanel017.setLayout(jPanel017Layout);
        jPanel017Layout.setHorizontalGroup(
            jPanel017Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel017Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel017Layout.setVerticalGroup(
            jPanel017Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel017Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel017, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 29, -1, -1));

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelDias.add(jPanel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, 33));

        javax.swing.GroupLayout jPanel027Layout = new javax.swing.GroupLayout(jPanel027);
        jPanel027.setLayout(jPanel027Layout);
        jPanel027Layout.setHorizontalGroup(
            jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel027Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(605, 605, 605)))
        );
        jPanel027Layout.setVerticalGroup(
            jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel027, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 115, 216, -1));

        javax.swing.GroupLayout jPanel013Layout = new javax.swing.GroupLayout(jPanel013);
        jPanel013.setLayout(jPanel013Layout);
        jPanel013Layout.setHorizontalGroup(
            jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel013Layout.setVerticalGroup(
            jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel013, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 205, -1, -1));

        jLabelViernes.setText("Viernes");
        jPanelDias.add(jLabelViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 10, 89, -1));

        javax.swing.GroupLayout jPanel014Layout = new javax.swing.GroupLayout(jPanel014);
        jPanel014.setLayout(jPanel014Layout);
        jPanel014Layout.setHorizontalGroup(
            jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel014Layout.setVerticalGroup(
            jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel014, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 250, -1, -1));

        javax.swing.GroupLayout jPanel025Layout = new javax.swing.GroupLayout(jPanel025);
        jPanel025.setLayout(jPanel025Layout);
        jPanel025Layout.setHorizontalGroup(
            jPanel025Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel025Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel025Layout.setVerticalGroup(
            jPanel025Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel025Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel025, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 29, -1, -1));

        javax.swing.GroupLayout jPanel021Layout = new javax.swing.GroupLayout(jPanel021);
        jPanel021.setLayout(jPanel021Layout);
        jPanel021Layout.setHorizontalGroup(
            jPanel021Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel021Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel021Layout.setVerticalGroup(
            jPanel021Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel021Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel021, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 205, -1, -1));

        javax.swing.GroupLayout jPanel012Layout = new javax.swing.GroupLayout(jPanel012);
        jPanel012.setLayout(jPanel012Layout);
        jPanel012Layout.setHorizontalGroup(
            jPanel012Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel012Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel012Layout.setVerticalGroup(
            jPanel012Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel012Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel012, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 160, -1, -1));

        javax.swing.GroupLayout jPanel022Layout = new javax.swing.GroupLayout(jPanel022);
        jPanel022.setLayout(jPanel022Layout);
        jPanel022Layout.setHorizontalGroup(
            jPanel022Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel022Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel022Layout.setVerticalGroup(
            jPanel022Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel022Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel022, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 250, -1, -1));

        javax.swing.GroupLayout jPanel016Layout = new javax.swing.GroupLayout(jPanel016);
        jPanel016.setLayout(jPanel016Layout);
        jPanel016Layout.setHorizontalGroup(
            jPanel016Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel016Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel016Layout.setVerticalGroup(
            jPanel016Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel016Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel016, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 336, -1, -1));

        javax.swing.GroupLayout jPanel023Layout = new javax.swing.GroupLayout(jPanel023);
        jPanel023.setLayout(jPanel023Layout);
        jPanel023Layout.setHorizontalGroup(
            jPanel023Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel023Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel023Layout.setVerticalGroup(
            jPanel023Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel023Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel023, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 291, -1, -1));

        javax.swing.GroupLayout jPanel018Layout = new javax.swing.GroupLayout(jPanel018);
        jPanel018.setLayout(jPanel018Layout);
        jPanel018Layout.setHorizontalGroup(
            jPanel018Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel018Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel018Layout.setVerticalGroup(
            jPanel018Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel018Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel018, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 72, -1, -1));

        javax.swing.GroupLayout jPanel031Layout = new javax.swing.GroupLayout(jPanel031);
        jPanel031.setLayout(jPanel031Layout);
        jPanel031Layout.setHorizontalGroup(
            jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel031Layout.createSequentialGroup()
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        jPanel031Layout.setVerticalGroup(
            jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        jPanelDias.add(jPanel031, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 291, -1, -1));
        jPanelDias.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 334, 217, 33));

        jScrollPane3.setViewportView(jPanelDias);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelReservas.addTab("Próximas reservas", jPanel3);

        jMenuAcciones.setText("Acciones");

        jMenuItemReserva.setText("Nueva reserva");
        jMenuItemReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemReservaMouseClicked(evt);
            }
        });
        jMenuItemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservaActionPerformed(evt);
            }
        });
        jMenuAcciones.add(jMenuItemReserva);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSalirMouseClicked(evt);
            }
        });
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuAcciones.add(jMenuItemSalir);

        jMenuBar1.add(jMenuAcciones);

        jMenuAcerca.setText("Acerca de");
        jMenuAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcercaMouseClicked(evt);
            }
        });
        jMenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSalirMouseClicked

    }//GEN-LAST:event_jMenuItemSalirMouseClicked

    private void jMenuItemReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemReservaMouseClicked

    }//GEN-LAST:event_jMenuItemReservaMouseClicked

    private void jMenuItemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservaActionPerformed
        NuevaReserva r = new NuevaReserva(this);
        r.setVisible(true);
    }//GEN-LAST:event_jMenuItemReservaActionPerformed

    private void jMenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaActionPerformed

    }//GEN-LAST:event_jMenuAcercaActionPerformed

    private void jMenuAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcercaMouseClicked
        Acerca a = new Acerca();
        a.setVisible(true);
        a.setSize(250,250);
    }//GEN-LAST:event_jMenuAcercaMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (jTableReservas.getSelectedRowCount()!=0) {
            AvisoEliminarReserva aviso = new AvisoEliminarReserva(this);  
            aviso.setVisible(true);
            aviso.setBounds(250, 250, 500, 250);
        } 
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservasMouseClicked
        if (jTableReservas.getSelectedRow()>=0){
            jButtonEliminar.setEnabled(true);
        }else{
            jButtonEliminar.setEnabled(false);
        }
        
        ArrayList<MenuBanquete> menus = hotel.obtenerMenus();
        ArrayList<HabitacionCongreso> habitaciones = hotel.obtenerHabitaciones();
        if (jTabbedPanelReservas.getSelectedIndex()>=0){
            Reserva r = hotel.getReservas().get(jTableReservas.getSelectedRow());
            Evento e = null;
            for (int i = 0; i < hotel.getEventos().size(); i++) {
                if (hotel.getEventos().get(i).getId()==r.getId()) {
                    e=hotel.getEventos().get(i);
                }
            }
            String nombreCliente = m.obtenerNombreCliente(r.getId());
            String nombreSalon = m.obtenerNombreSalon(r.getId());
            int asistentes = e.getAsistentes();

            if (r.getTipo().equals(TipoEvento.Banquete.toString())) {
                for (int i = 0; i < menus.size(); i++) {
                    if (r.getIdEvento()==menus.get(i).getIdEvento()) {
                        jTextAreaInformacion.setText("Cliente: " + nombreCliente  + "\nSalón: " + nombreSalon + "\nAsistentes: " + asistentes + "\nPrimer plato: " + menus.get(i).getPrimero() + "\nSegundo plato: " + menus.get(i).getSegundo());
                    }
                }
            }else if(r.getTipo().equals(TipoEvento.Congreso.toString())){
                for (int i = 0; i < habitaciones.size(); i++) {
                    if (r.getIdEvento()==habitaciones.get(i).getIdEvento()) {
                        jTextAreaInformacion.setText("Cliente: " + nombreCliente + "\nSalón: " + nombreSalon + "\nAsistentes: " + asistentes + "\nNúmero de habitaciones: " + habitaciones.get(i).getNumeroHab()+ "\nTipo de habitaciones: " + habitaciones.get(i).getTipo().toString());
                    }
                }
            }else if(r.getTipo().equals(TipoEvento.Jornada.toString())){
                jTextAreaInformacion.setText("Cliente: " + nombreCliente + "\nSalón: " + nombreSalon + "\nAsistentes: " + asistentes);
            }

        }

    }//GEN-LAST:event_jTableReservasMouseClicked

    private void jComboBoxSalonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxSalonPropertyChange

    }//GEN-LAST:event_jComboBoxSalonPropertyChange

    private void jComboBoxSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalonActionPerformed
        proximasReservas(hotel, jComboBoxSalon.getSelectedIndex()+1);
    }//GEN-LAST:event_jComboBoxSalonActionPerformed

    private void jComboBoxSalonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSalonItemStateChanged
        // modeloProximas.proximasReservas(hotel, jComboBoxSalon.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxSalonItemStateChanged

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaPrincipal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelSalon1;
    private javax.swing.JLabel jLabelSalon2;
    private javax.swing.JLabel jLabelSalon3;
    private javax.swing.JLabel jLabelSalon4;
    private javax.swing.JLabel jLabelViernes;
    private javax.swing.JLabel jLabelViernes1;
    private javax.swing.JLabel jLabelViernes2;
    private javax.swing.JMenu jMenuAcciones;
    private javax.swing.JMenu jMenuAcerca;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemReserva;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel010;
    private javax.swing.JPanel jPanel011;
    private javax.swing.JPanel jPanel012;
    private javax.swing.JPanel jPanel013;
    private javax.swing.JPanel jPanel014;
    private javax.swing.JPanel jPanel015;
    private javax.swing.JPanel jPanel016;
    private javax.swing.JPanel jPanel017;
    private javax.swing.JPanel jPanel018;
    private javax.swing.JPanel jPanel019;
    private javax.swing.JPanel jPanel02;
    private javax.swing.JPanel jPanel020;
    private javax.swing.JPanel jPanel021;
    private javax.swing.JPanel jPanel022;
    private javax.swing.JPanel jPanel023;
    private javax.swing.JPanel jPanel024;
    private javax.swing.JPanel jPanel025;
    private javax.swing.JPanel jPanel026;
    private javax.swing.JPanel jPanel027;
    private javax.swing.JPanel jPanel028;
    private javax.swing.JPanel jPanel029;
    private javax.swing.JPanel jPanel03;
    private javax.swing.JPanel jPanel030;
    private javax.swing.JPanel jPanel031;
    private javax.swing.JPanel jPanel032;
    private javax.swing.JPanel jPanel04;
    private javax.swing.JPanel jPanel05;
    private javax.swing.JPanel jPanel06;
    private javax.swing.JPanel jPanel07;
    private javax.swing.JPanel jPanel08;
    private javax.swing.JPanel jPanel09;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanelReservas;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTextArea jTextAreaInformacion;
    // End of variables declaration//GEN-END:variables
}

package hotel105.vista;


import hotel105.modelo.Reserva;
import hotel105.modelo.Cliente;
import hotel105.modelo.Cliente;
import hotel105.modelo.Evento;
import hotel105.modelo.HabitacionCongreso;
import hotel105.modelo.Hotel;
import hotel105.modelo.ManejoDB;
import hotel105.modelo.MenuBanquete;
import hotel105.modelo.ModeloTablaProximasReservas;
import hotel105.modelo.ModeloTablaReservas;
import hotel105.modelo.Reserva;
import hotel105.modelo.TipoEvento;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
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
    ModeloTablaProximasReservas modeloProximas = new ModeloTablaProximasReservas();

    public VentanaPrincipal() {
        
        initComponents();
        jTableReservas.setModel(model);
        jTableClientes.setModel(hotel.obtenerClientes());  
        jTableClientes.setDefaultEditor(Object.class, null);
        jTableProximosEventos.setModel(modeloProximas);
        modeloProximas.refreshTableModel(hotel, jComboBoxSalon.getSelectedIndex()+1);
        
        model.refreshTableModel(hotel);
        porcentajeReservas();
        jTextAreaInformacion.setEditable(false);
        imagenDisponible();
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
    
    public ModeloTablaProximasReservas getModeloProximas() {
        return modeloProximas;
    }

    public void setModeloProximas(ModeloTablaProximasReservas modeloProximas) {
        this.modeloProximas = modeloProximas;
    }

    public JTable getjTableProximosEventos() {
        return jTableProximosEventos;
    }

    public void setjTableProximosEventos(JTable jTableProximosEventos) {
        this.jTableProximosEventos = jTableProximosEventos;
    }

    public JTable getjTableReservas() {
        return jTableReservas;
    }

    public void setjTableReservas(JTable jTableReservas) {
        this.jTableReservas = jTableReservas;
    }
    
    
    
    
    public void porcentajeReservas(){
        ArrayList<Evento> eventos = hotel.obtenerEventosConReserva();
        ArrayList<Reserva> reservas = hotel.obtenerReservas();
        double reservasSalon1=0;
        double reservasSalon2=0;
        double reservasSalon3=0;
        double reservasSalon4=0;
        
        for (int i = 0; i < eventos.size(); i++) {
            for (int j = 0; j < reservas.size(); j++) {
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
        jLabelSalon1.setText("Tierra Media: " + (reservasSalon1*100)/24+"% reservado");
        jLabelSalon2.setText("Narnia: " + (reservasSalon2*100)/24+"% reservado");
        jLabelSalon3.setText("Asgard: " + (reservasSalon3*100)/24+"% reservado");
        jLabelSalon4.setText("Namek: " + (reservasSalon4*100)/24+"% reservado");
    }
    
    public void imagenDisponible(){
        for (int i = 0; i < jTableProximosEventos.getRowCount(); i++) {
            for (int j = 0; j < jTableProximosEventos.getColumnCount(); j++) {
                //jTableProximosEventos.setDefaultRenderer(Object.class, new hotel105.modelo.TableCellRenderer());
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
        jLabelSalon1 = new javax.swing.JLabel();
        jLabelSalon2 = new javax.swing.JLabel();
        jLabelSalon3 = new javax.swing.JLabel();
        jLabelSalon4 = new javax.swing.JLabel();
        jComboBoxSalon = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProximosEventos = new javax.swing.JTable();
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanelReservas.addTab("Clientes", jPanel2);

        jLabelSalon1.setText("Tierra Media: ");

        jLabelSalon2.setText("Narnia: ");

        jLabelSalon3.setText("Asgard: ");

        jLabelSalon4.setText("Namek:");

        jComboBoxSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tierra Media", "Narnia", "Asgard", "Namek" }));
        jComboBoxSalon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSalonItemStateChanged(evt);
            }
        });
        jComboBoxSalon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxSalonPropertyChange(evt);
            }
        });

        jTableProximosEventos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableProximosEventos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelSalon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSalon2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jLabelSalon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSalon1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalon1)
                    .addComponent(jLabelSalon2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalon3)
                    .addComponent(jLabelSalon4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jTabbedPanelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            int row = jTableReservas.getSelectedRow();
            String fecha=String.valueOf(model.getValueAt(row,1));
            String salon = String.valueOf(model.getValueAt(row,4));
            for (int i = 0; i < hotel.getEventos().size(); i++) {
                if (hotel.getEventos().get(i).getId()==hotel.getReservas().get(row).getIdEvento()) {
                    hotel.getEventos().remove(i);
                }
            }
             hotel.getReservas().remove(row);
            m.eliminarEvento(Integer.parseInt(String.valueOf(model.getValueAt(row, 0))));
            model.refreshTableModel(hotel);
            jTextAreaInformacion.setText("");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxSalonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxSalonPropertyChange

    }//GEN-LAST:event_jComboBoxSalonPropertyChange

    private void jComboBoxSalonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSalonItemStateChanged
        modeloProximas.refreshTableModel(hotel, jComboBoxSalon.getSelectedIndex()+1);
    }//GEN-LAST:event_jComboBoxSalonItemStateChanged

    private void jTableReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservasMouseClicked
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxSalon;
    private javax.swing.JLabel jLabelSalon1;
    private javax.swing.JLabel jLabelSalon2;
    private javax.swing.JLabel jLabelSalon3;
    private javax.swing.JLabel jLabelSalon4;
    private javax.swing.JMenu jMenuAcciones;
    private javax.swing.JMenu jMenuAcerca;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemReserva;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanelReservas;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProximosEventos;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTextArea jTextAreaInformacion;
    // End of variables declaration//GEN-END:variables
}

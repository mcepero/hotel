/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.vista;

import hotel105.modelo.Cliente;
import hotel105.modelo.Evento;
import hotel105.modelo.Hotel;
import hotel105.modelo.ManejoDB;
import hotel105.modelo.Plato;
import hotel105.modelo.Reserva;
import hotel105.modelo.TipoEvento;
import java.awt.CheckboxGroup;
import java.awt.Image;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author Manuel
 */
public class NuevaReserva extends javax.swing.JFrame {
    ManejoDB m = new ManejoDB();
    Date fecha;
    DiasDisponibles d = new DiasDisponibles(this);
    VentanaPrincipal ventanaPrincipal;
    ArrayList<String> platosSeleccionados = new ArrayList<String>();
    int id;
    public NuevaReserva(VentanaPrincipal v) {
        initComponents();
        this.ventanaPrincipal=v;
        
        jLabelAsistentes.setEnabled(false);
        jSpinnerAsistentes.setEnabled(false);
        jButtonDisponibilidad.setEnabled(false);
        jLabelEvento.setEnabled(false);
        jComboBoxEvento.setEnabled(false);
        jCheckBoxPlato1.setEnabled(false);
        jCheckBoxPlato2.setEnabled(false);
        jCheckBoxPlato3.setEnabled(false);
        jCheckBoxPlato4.setEnabled(false);
        jCheckBoxPlato5.setEnabled(false);
        jCheckBoxPlato6.setEnabled(false);
        jLabelBanquete.setEnabled(false);
        jPanelPlatosMenu.setEnabled(false);
        jSpinnerHabitaciones.setEnabled(false);
        jComboBoxHabitaciones.setEnabled(false);
        jButtonAceptar.setEnabled(false);
        jLabelNombreEvento.setEnabled(false);
        jTextFieldNombreEvento.setEnabled(false);
        jPanelDias.setVisible(false);
        jSliderDias.setValue(1);
        setSize(600, 650);
        rellenarEventos();
        
        id = m.obtenerUltimoId()+1;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public JButton getjButtonDisponibilidad() {
        return jButtonDisponibilidad;
    }

    public void setjButtonDisponibilidad(JButton jButtonDisponibilidad) {
        this.jButtonDisponibilidad = jButtonDisponibilidad;
    }

    public JComboBox<String> getjComboBoxEvento() {
        return jComboBoxEvento;
    }

    public void setjComboBoxEvento(JComboBox<String> jComboBoxEvento) {
        this.jComboBoxEvento = jComboBoxEvento;
    }

    public JLabel getjLabelEvento() {
        return jLabelEvento;
    }

    public void setjLabelEvento(JLabel jLabelEvento) {
        this.jLabelEvento = jLabelEvento;
    }

    public JButton getjButtonAceptar() {
        return jButtonAceptar;
    }

    public void setjButtonAceptar(JButton jButtonAceptar) {
        this.jButtonAceptar = jButtonAceptar;
    }

    public JCheckBox getjCheckBoxPlato1() {
        return jCheckBoxPlato1;
    }

    public void setjCheckBoxPlato1(JCheckBox jCheckBoxPlato1) {
        this.jCheckBoxPlato1 = jCheckBoxPlato1;
    }

    public JCheckBox getjCheckBoxPlato2() {
        return jCheckBoxPlato2;
    }

    public void setjCheckBoxPlato2(JCheckBox jCheckBoxPlato2) {
        this.jCheckBoxPlato2 = jCheckBoxPlato2;
    }

    public JCheckBox getjCheckBoxPlato3() {
        return jCheckBoxPlato3;
    }

    public void setjCheckBoxPlato3(JCheckBox jCheckBoxPlato3) {
        this.jCheckBoxPlato3 = jCheckBoxPlato3;
    }

    public JCheckBox getjCheckBoxPlato4() {
        return jCheckBoxPlato4;
    }

    public void setjCheckBoxPlato4(JCheckBox jCheckBoxPlato4) {
        this.jCheckBoxPlato4 = jCheckBoxPlato4;
    }

    public JCheckBox getjCheckBoxPlato5() {
        return jCheckBoxPlato5;
    }

    public void setjCheckBoxPlato5(JCheckBox jCheckBoxPlato5) {
        this.jCheckBoxPlato5 = jCheckBoxPlato5;
    }

    public JCheckBox getjCheckBoxPlato6() {
        return jCheckBoxPlato6;
    }

    public void setjCheckBoxPlato6(JCheckBox jCheckBoxPlato6) {
        this.jCheckBoxPlato6 = jCheckBoxPlato6;
    }

    public JComboBox<String> getjComboBoxHabitaciones() {
        return jComboBoxHabitaciones;
    }

    public void setjComboBoxHabitaciones(JComboBox<String> jComboBoxHabitaciones) {
        this.jComboBoxHabitaciones = jComboBoxHabitaciones;
    }

    public JLabel getjLabelHabitaciones() {
        return jLabelHabitaciones;
    }

    public void setjLabelHabitaciones(JLabel jLabelHabitaciones) {
        this.jLabelHabitaciones = jLabelHabitaciones;
    }

    public JLabel getjLabelBanquete() {
        return jLabelBanquete;
    }

    public void setjLabelBanquete(JLabel jLabelBanquete) {
        this.jLabelBanquete = jLabelBanquete;
    }

    public JSpinner getjSpinnerHabitaciones() {
        return jSpinnerHabitaciones;
    }

    public void setjSpinnerHabitaciones(JSpinner jSpinnerHabitaciones) {
        this.jSpinnerHabitaciones = jSpinnerHabitaciones;
    }
    
    
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void eventoSeleccionado(){
        String evento = jComboBoxEvento.getSelectedItem().toString();
        if(evento.equals("Banquete")){
            jPanelPlatosMenu.setVisible(true);
            jPanelDias.setVisible(false);
            jCheckBoxPlato1.setText(Plato.Ensalada.name());
            jCheckBoxPlato2.setText(Plato.Filetes.name());
            jCheckBoxPlato3.setText(Plato.Macarrones.name());
            jCheckBoxPlato4.setText(Plato.Pescado.name());
            jCheckBoxPlato5.setText(Plato.Sopa.name());
            jCheckBoxPlato6.setText(Plato.Tortilla.name());
            
        }else if(evento.equals("Jornada")){
            jPanelPlatosMenu.setVisible(false);
            jPanelDias.setVisible(false);
            jTextFieldNombreEvento.setEnabled(true);
            jLabelNombreEvento.setEnabled(true);
        }else if(evento.equals("Congreso")){
            jPanelPlatosMenu.setVisible(false);
            jPanelDias.setVisible(true);

            //comprobarDiasSlider();
        }
    }
    
    public void comprobarSeleccionados(){
        int contador=0;
        if (jCheckBoxPlato1.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato1.setSelected(false);
            }
            contador++;
        }
        if (jCheckBoxPlato2.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato2.setSelected(false);
            }
            contador++;
        }
        if (jCheckBoxPlato3.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato3.setSelected(false);
            }
            contador++;
        }
        if (jCheckBoxPlato4.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato4.setSelected(false);
            }
            contador++;
        }
        if (jCheckBoxPlato5.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato5.setSelected(false);
            }
            contador++;
        }
        if (jCheckBoxPlato6.isSelected()) {
            if(contador>=2){
                jCheckBoxPlato6.setSelected(false);
            }
            contador++;
        }
        
    }
    
    public DefaultComboBoxModel rellenarEventos(){
       DefaultComboBoxModel cb = new DefaultComboBoxModel();
        Class c = TipoEvento.class;
        Object constantes[] = c.getEnumConstants();
        for (int i = 0; i < constantes.length; i++) {
            cb.addElement(constantes[i]);
        }
        return cb;
    }
    
    public void insertarReserva(){
        Cliente c = ventanaPrincipal.getHotel().devolverCliente(jTextFieldDni.getText());
        
        Reserva r = new Reserva(id, d.getDiaSeleccionado(), jComboBoxEvento.getSelectedItem().toString(), d.getSalonSeleccionado(), id);
        
        ventanaPrincipal.getHotel().getReservas().add(r);
        
        m.insertarReserva(c.getId(), d.getSalonSeleccionado(),id, new SimpleDateFormat("yyyy-MM-dd").format(d.getDiaSeleccionado()));
    }
    
    public void insertarEvento(){
       TipoEvento t=null;
        if (jComboBoxEvento.getSelectedItem().equals("Banquete")) {
            t=TipoEvento.Banquete;
        }else if (jComboBoxEvento.getSelectedItem().equals("Congreso")) {
            t=TipoEvento.Congreso;
        }else if (jComboBoxEvento.getSelectedItem().equals("Jornada")) {
            t=TipoEvento.Jornada;
        }
        
        Evento e = new Evento(id, jSliderDias.getValue(), jTextFieldNombreEvento.getText(), t, Integer.parseInt(jSpinnerAsistentes.getValue().toString()));
        ventanaPrincipal.getHotel().getEventos().add(e);
        m.insertarEvento(id, jTextFieldNombreEvento.getText() ,jComboBoxEvento.getSelectedItem().toString(),(Integer)jSpinnerAsistentes.getValue(), jSliderDias.getValue());
    }
    
    public void insertarHabitaciones(){
        if (jComboBoxEvento.getSelectedItem().toString().equals(TipoEvento.Congreso.toString())) {
            m.insertarHabitacion(id, Integer.parseInt(jSpinnerHabitaciones.getValue().toString()), jComboBoxHabitaciones.getSelectedItem().toString());
        }
    }
    
    
    public void comprobarPlatosSeleccionados(){
        if(jCheckBoxPlato1.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato1.getText());
        }
        if(jCheckBoxPlato2.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato2.getText());
        }
        if(jCheckBoxPlato3.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato3.getText());
        }
        if(jCheckBoxPlato4.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato4.getText());
        }
        if(jCheckBoxPlato5.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato5.getText());
        }
        if(jCheckBoxPlato6.isSelected()){
            platosSeleccionados.add(jCheckBoxPlato6.getText());
        }
    }
    
    public void insertarBanquete(){
        comprobarPlatosSeleccionados();
        if (jComboBoxEvento.getSelectedItem().toString().equals(TipoEvento.Banquete.toString())) {
            m.insertarBanquete(id, platosSeleccionados.get(0), platosSeleccionados.get(1));
        }
    }
    
    public void comprobarDiasSlider(){
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(d.getDiaSeleccionado());
                    
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
                                     
        if (diaSemana==1) {
            jSliderDias.setMaximum(1);
        }else if (diaSemana==6) {
            jSliderDias.setMaximum(3);
        }else if (diaSemana==7) {
            jSliderDias.setMaximum(2);
        } 
    }
    
    public void activarBotonAceptar(){
        platosSeleccionados = new ArrayList<>();
        comprobarPlatosSeleccionados();
        if (jComboBoxEvento.getSelectedItem().toString().equals(TipoEvento.Banquete.toString())) {
            if (d.getDiaSeleccionado()!=null && platosSeleccionados.size()==2) {
                jLabelNombreEvento.setEnabled(true);
                jTextFieldNombreEvento.setEnabled(true);
                jButtonAceptar.setEnabled(true);
            }else{
                jLabelNombreEvento.setEnabled(false);
                jTextFieldNombreEvento.setEnabled(false);
                jButtonAceptar.setEnabled(false);
            }
        }else{
            if (d.getDiaSeleccionado()!=null) {
                jLabelNombreEvento.setEnabled(true);
                jTextFieldNombreEvento.setEnabled(true);
                jButtonAceptar.setEnabled(true);
            }else{
                jLabelNombreEvento.setEnabled(false);
                jTextFieldNombreEvento.setEnabled(false);
                jButtonAceptar.setEnabled(false);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        jPanelTodo = new javax.swing.JPanel();
        jPanelRestoDeCampos = new javax.swing.JPanel();
        jComboBoxEvento = new javax.swing.JComboBox<>();
        jLabelEvento = new javax.swing.JLabel();
        jLabelAsistentes = new javax.swing.JLabel();
        jButtonDisponibilidad = new javax.swing.JButton();
        jPanelDias = new javax.swing.JPanel();
        jLabeldias = new javax.swing.JLabel();
        jSliderDias = new javax.swing.JSlider();
        jLabelHabitaciones = new javax.swing.JLabel();
        jRadioButtonHabitacionesSi = new javax.swing.JRadioButton();
        jRadioButtonHabitacionesNo = new javax.swing.JRadioButton();
        jSpinnerHabitaciones = new javax.swing.JSpinner();
        jComboBoxHabitaciones = new javax.swing.JComboBox<>();
        jPanelPlatosMenu = new javax.swing.JPanel();
        jLabelBanquete = new javax.swing.JLabel();
        jCheckBoxPlato1 = new javax.swing.JCheckBox();
        jCheckBoxPlato2 = new javax.swing.JCheckBox();
        jCheckBoxPlato3 = new javax.swing.JCheckBox();
        jCheckBoxPlato4 = new javax.swing.JCheckBox();
        jCheckBoxPlato5 = new javax.swing.JCheckBox();
        jCheckBoxPlato6 = new javax.swing.JCheckBox();
        jSpinnerAsistentes = new javax.swing.JSpinner();
        jTextFieldNombreEvento = new javax.swing.JTextField();
        jLabelNombreEvento = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jPanelDni = new javax.swing.JPanel();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelDatosCliente = new javax.swing.JLabel();
        miImagenPanel1 = new hotel105.vista.MiImagenPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxEvento.setModel(rellenarEventos());
        jComboBoxEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEventoActionPerformed(evt);
            }
        });

        jLabelEvento.setText("Tipo evento: ");

        jLabelAsistentes.setText("Nº asistentes: ");

        jButtonDisponibilidad.setText("Ver disponibilidad");
        jButtonDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisponibilidadActionPerformed(evt);
            }
        });

        jLabeldias.setText("Nº días:");

        jSliderDias.setMajorTickSpacing(1);
        jSliderDias.setMaximum(3);
        jSliderDias.setMinimum(1);
        jSliderDias.setPaintLabels(true);
        jSliderDias.setPaintTicks(true);
        jSliderDias.setSnapToTicks(true);
        jSliderDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSliderDiasMouseClicked(evt);
            }
        });

        jLabelHabitaciones.setText("Habitaciones:");

        buttonGroupHabitaciones.add(jRadioButtonHabitacionesSi);
        jRadioButtonHabitacionesSi.setText("Si");
        jRadioButtonHabitacionesSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHabitacionesSiActionPerformed(evt);
            }
        });

        buttonGroupHabitaciones.add(jRadioButtonHabitacionesNo);
        jRadioButtonHabitacionesNo.setText("No");
        jRadioButtonHabitacionesNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHabitacionesNoActionPerformed(evt);
            }
        });

        jSpinnerHabitaciones.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerHabitacionesMouseClicked(evt);
            }
        });

        jComboBoxHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble" }));
        jComboBoxHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHabitacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDiasLayout = new javax.swing.GroupLayout(jPanelDias);
        jPanelDias.setLayout(jPanelDiasLayout);
        jPanelDiasLayout.setHorizontalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addComponent(jLabelHabitaciones)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonHabitacionesSi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonHabitacionesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addComponent(jLabeldias, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSliderDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanelDiasLayout.setVerticalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHabitaciones)
                        .addComponent(jRadioButtonHabitacionesSi)
                        .addComponent(jRadioButtonHabitacionesNo))
                    .addComponent(jSpinnerHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelBanquete.setText("Banquete");

        jCheckBoxPlato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato1ActionPerformed(evt);
            }
        });

        jCheckBoxPlato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato2ActionPerformed(evt);
            }
        });

        jCheckBoxPlato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato3ActionPerformed(evt);
            }
        });

        jCheckBoxPlato4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato4ActionPerformed(evt);
            }
        });

        jCheckBoxPlato5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato5ActionPerformed(evt);
            }
        });

        jCheckBoxPlato6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlato6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPlatosMenuLayout = new javax.swing.GroupLayout(jPanelPlatosMenu);
        jPanelPlatosMenu.setLayout(jPanelPlatosMenuLayout);
        jPanelPlatosMenuLayout.setHorizontalGroup(
            jPanelPlatosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatosMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBanquete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxPlato1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxPlato2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxPlato3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxPlato4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxPlato5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxPlato6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPlatosMenuLayout.setVerticalGroup(
            jPanelPlatosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatosMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelPlatosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBanquete)
                    .addComponent(jCheckBoxPlato1)
                    .addComponent(jCheckBoxPlato2)
                    .addComponent(jCheckBoxPlato3)
                    .addComponent(jCheckBoxPlato4)
                    .addComponent(jCheckBoxPlato5)
                    .addComponent(jCheckBoxPlato6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jSpinnerAsistentes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 500, 1));

        jTextFieldNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreEventoActionPerformed(evt);
            }
        });
        jTextFieldNombreEvento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextFieldNombreEventoPropertyChange(evt);
            }
        });
        jTextFieldNombreEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreEventoKeyPressed(evt);
            }
        });

        jLabelNombreEvento.setText("Nombre del evento:");

        javax.swing.GroupLayout jPanelRestoDeCamposLayout = new javax.swing.GroupLayout(jPanelRestoDeCampos);
        jPanelRestoDeCampos.setLayout(jPanelRestoDeCamposLayout);
        jPanelRestoDeCamposLayout.setHorizontalGroup(
            jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                        .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                                .addComponent(jLabelAsistentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                                .addComponent(jLabelEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                        .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanelPlatosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                                .addComponent(jLabelNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelRestoDeCamposLayout.setVerticalGroup(
            jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRestoDeCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRestoDeCamposLayout.createSequentialGroup()
                        .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAsistentes)
                            .addComponent(jSpinnerAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDisponibilidad)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEvento)
                            .addComponent(jComboBoxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelPlatosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRestoDeCamposLayout.createSequentialGroup()
                        .addGroup(jPanelRestoDeCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreEvento))
                        .addContainerGap())))
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTodoLayout = new javax.swing.GroupLayout(jPanelTodo);
        jPanelTodo.setLayout(jPanelTodoLayout);
        jPanelTodoLayout.setHorizontalGroup(
            jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addComponent(jPanelRestoDeCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTodoLayout.setVerticalGroup(
            jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addComponent(jPanelRestoDeCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButtonAceptar))
        );

        jLabelDni.setText("DNI: ");

        miImagenPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miImagenPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout miImagenPanel1Layout = new javax.swing.GroupLayout(miImagenPanel1);
        miImagenPanel1.setLayout(miImagenPanel1Layout);
        miImagenPanel1Layout.setHorizontalGroup(
            miImagenPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        miImagenPanel1Layout.setVerticalGroup(
            miImagenPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDniLayout = new javax.swing.GroupLayout(jPanelDni);
        jPanelDni.setLayout(jPanelDniLayout);
        jPanelDniLayout.setHorizontalGroup(
            jPanelDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDniLayout.createSequentialGroup()
                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(miImagenPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanelDniLayout.setVerticalGroup(
            jPanelDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDni))
                    .addComponent(miImagenPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEventoActionPerformed
        eventoSeleccionado();
        activarBotonAceptar();
    }//GEN-LAST:event_jComboBoxEventoActionPerformed

    private void jCheckBoxPlato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato1ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato1ActionPerformed

    private void jCheckBoxPlato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato2ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato2ActionPerformed

    private void jCheckBoxPlato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato3ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato3ActionPerformed

    private void jCheckBoxPlato4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato4ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato4ActionPerformed

    private void jCheckBoxPlato5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato5ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato5ActionPerformed

    private void jCheckBoxPlato6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlato6ActionPerformed
        comprobarSeleccionados();
        activarBotonAceptar();
    }//GEN-LAST:event_jCheckBoxPlato6ActionPerformed

    private void jRadioButtonHabitacionesNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHabitacionesNoActionPerformed
        if(jRadioButtonHabitacionesNo.isSelected()){
            jSpinnerHabitaciones.setVisible(false);
            jComboBoxHabitaciones.setVisible(false);
        }
        if (d.getDiaSeleccionado()!=null && platosSeleccionados.size()==2) {
                jButtonAceptar.setVisible(true);
        }
            
    }//GEN-LAST:event_jRadioButtonHabitacionesNoActionPerformed

    private void jRadioButtonHabitacionesSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHabitacionesSiActionPerformed
        if(jRadioButtonHabitacionesSi.isSelected()){
            jSpinnerHabitaciones.setVisible(true);
            jComboBoxHabitaciones.setVisible(true);
        }
        activarBotonAceptar();
    }//GEN-LAST:event_jRadioButtonHabitacionesSiActionPerformed

    private void jButtonDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisponibilidadActionPerformed
        d.setAsistentes((Integer)jSpinnerAsistentes.getValue());
        d.comprobarAsistentes();
        d.setVisible(true);
    }//GEN-LAST:event_jButtonDisponibilidadActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        insertarEvento();
        insertarReserva();
        insertarHabitaciones();
        insertarBanquete();
        ventanaPrincipal.getModel().refreshTableModel(ventanaPrincipal.getHotel());
        ventanaPrincipal.getModeloProximas().refreshTableModel(ventanaPrincipal.getHotel(), ventanaPrincipal.getjComboBoxSalon().getSelectedIndex());
        ventanaPrincipal.porcentajeReservas();
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jSliderDiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderDiasMouseClicked
        comprobarDiasSlider();
    }//GEN-LAST:event_jSliderDiasMouseClicked

    private void miImagenPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miImagenPanel1MouseClicked
        if(ventanaPrincipal.getHotel().comprobarDni(jTextFieldDni.getText())==true){
            jTextFieldDni.setEditable(false);
            jTextFieldDni.setEnabled(false);
            jSpinnerAsistentes.setEnabled(true);
            jButtonDisponibilidad.setEnabled(true);
            Cliente c = ventanaPrincipal.getHotel().devolverCliente(jTextFieldDni.getText());
            jLabelDatosCliente.setText("Nombre: " + c.getNombre() + " " + c.getApellidos());
            jPanelRestoDeCampos.setVisible(true);
        }
    }//GEN-LAST:event_miImagenPanel1MouseClicked

    private void jComboBoxHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionesActionPerformed
        activarBotonAceptar();
    }//GEN-LAST:event_jComboBoxHabitacionesActionPerformed

    private void jSpinnerHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerHabitacionesMouseClicked
        activarBotonAceptar();
    }//GEN-LAST:event_jSpinnerHabitacionesMouseClicked

    private void jTextFieldNombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreEventoActionPerformed

    }//GEN-LAST:event_jTextFieldNombreEventoActionPerformed

    private void jTextFieldNombreEventoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextFieldNombreEventoPropertyChange

    }//GEN-LAST:event_jTextFieldNombreEventoPropertyChange

    private void jTextFieldNombreEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreEventoKeyPressed
        if(!jTextFieldNombreEvento.getText().isEmpty())
            jButtonAceptar.setVisible(true);
        else
            jButtonAceptar.setVisible(false);
    }//GEN-LAST:event_jTextFieldNombreEventoKeyPressed

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
            java.util.logging.Logger.getLogger(NuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new NuevaReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonDisponibilidad;
    private javax.swing.JCheckBox jCheckBoxPlato1;
    private javax.swing.JCheckBox jCheckBoxPlato2;
    private javax.swing.JCheckBox jCheckBoxPlato3;
    private javax.swing.JCheckBox jCheckBoxPlato4;
    private javax.swing.JCheckBox jCheckBoxPlato5;
    private javax.swing.JCheckBox jCheckBoxPlato6;
    private javax.swing.JComboBox<String> jComboBoxEvento;
    private javax.swing.JComboBox<String> jComboBoxHabitaciones;
    private javax.swing.JLabel jLabelAsistentes;
    private javax.swing.JLabel jLabelBanquete;
    private javax.swing.JLabel jLabelDatosCliente;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JLabel jLabelHabitaciones;
    private javax.swing.JLabel jLabelNombreEvento;
    private javax.swing.JLabel jLabeldias;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JPanel jPanelDni;
    private javax.swing.JPanel jPanelPlatosMenu;
    private javax.swing.JPanel jPanelRestoDeCampos;
    private javax.swing.JPanel jPanelTodo;
    private javax.swing.JRadioButton jRadioButtonHabitacionesNo;
    private javax.swing.JRadioButton jRadioButtonHabitacionesSi;
    private javax.swing.JSlider jSliderDias;
    private javax.swing.JSpinner jSpinnerAsistentes;
    private javax.swing.JSpinner jSpinnerHabitaciones;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombreEvento;
    private hotel105.vista.MiImagenPanel miImagenPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.vista;

import hotel105.modelo.Evento;
import hotel105.modelo.Hotel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Manuel
 */
public class DiasDisponibles extends javax.swing.JFrame {

    ArrayList<JRadioButton> botonesSalon1 = new ArrayList<JRadioButton>();
    ArrayList<JRadioButton> botonesSalon2 = new ArrayList<JRadioButton>();
    ArrayList<JRadioButton> botonesSalon3 = new ArrayList<JRadioButton>();
    ArrayList<JRadioButton> botonesSalon4 = new ArrayList<JRadioButton>();
    char[] diasS1;
    char[] diasS2;
    char[] diasS3;
    char[] diasS4;
    Hotel h = new Hotel();
    ArrayList salones = h.diasDisponibles();
    Date[] numerosDias = (Date[]) salones.get(4);
    ArrayList<JLabel> fechas= new ArrayList<>();
    boolean semana;
    ButtonGroup botones = new ButtonGroup();
    NuevaReserva nuevaReserva;
    private Date diaSeleccionado;
    private int salonSeleccionado;
    private int asistentes;
   
    public DiasDisponibles(NuevaReserva nr) {
        setResizable(false);
        numerosDias = (Date[]) salones.get(4);
        semana=true;
        this.nuevaReserva=nr;
        diasS1 = (char[]) salones.get(0);
        diasS2 = (char[]) salones.get(1);
        diasS3 = (char[]) salones.get(2);
        diasS4 = (char[]) salones.get(3);
        initComponents();
        jButtonPrimeras4.setVisible(false);
        anadir();  
    }

    public void anadir(){        
        for (int i = 0; i < 24; i++) {
            JRadioButton j = new JRadioButton();
            botonesSalon1.add(j);
            botones.add(j);
        }
        
        for (int i = 0; i < 24; i++) {
            JRadioButton j = new JRadioButton();
            botonesSalon2.add(j);
            botones.add(j);
        }
        
        for (int i = 0; i < 24; i++) {
            JRadioButton j = new JRadioButton();
            botonesSalon3.add(j);
            botones.add(j);
        }
        
        for (int i = 0; i < 24; i++) {
            JRadioButton j = new JRadioButton();
            botonesSalon4.add(j);
            botones.add(j);
        }
        
               
        Calendar calendar= Calendar.getInstance();
        for (int i = 0; i < numerosDias.length; i++) {
            calendar.setTime(numerosDias[i]);
            String numero = calendar.get(Calendar.DAY_OF_MONTH)+"";
            if (calendar.get(Calendar.DAY_OF_MONTH)<10) {
                numero = "0"+calendar.get(Calendar.DAY_OF_MONTH);
            }
            fechas.add(new JLabel(numero));
        }

        
        GridBagLayout gridBag = new GridBagLayout ();
        GridBagConstraints restricciones = new GridBagConstraints ();
        restricciones.insets = new Insets(4,4,4,4);
        jPanelPrimeras4Semanas.setLayout(gridBag);
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.weightx = 1.5; 
        
            restricciones.gridwidth=13;
            jPanelPrimeras4Semanas.add(new JLabel());
            for (int i = 0; i < 12; i++) {
                if (i==11) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JLabel dia = fechas.get(i);
                gridBag.setConstraints (dia, restricciones); 
                jPanelPrimeras4Semanas.add(dia);
            }

            restricciones.gridwidth=13;
            jPanelPrimeras4Semanas.add(new JLabel());
            for (int i = 0; i < 4; i++) {
                JLabel j = new JLabel(" V");
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);

                j = new JLabel(" S");
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);

                if (i==3) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }

                j = new JLabel(" D");
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);
            }

            restricciones.gridwidth=13;
            jPanelPrimeras4Semanas.add(new JLabel("Tierra Media"));
            for (int i = 0; i < 12; i++) {
                if (i==11) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon1.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelPrimeras4Semanas.add(new JLabel("Narnia"));
            for (int i = 0; i < 12; i++) {
                if (i==11) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon2.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelPrimeras4Semanas.add(new JLabel("Asgard"));
            for (int i = 0; i < 12; i++) {
                if (i==11) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon3.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelPrimeras4Semanas.add(new JLabel("Namek"));
            for (int i = 0; i < 12; i++) {
                if (i==11) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon4.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelPrimeras4Semanas.add(j);
            }

            jPanelPrimeras4Semanas.setVisible(true);

            
            gridBag = new GridBagLayout ();
            restricciones = new GridBagConstraints ();
            restricciones.insets = new Insets(4,4,4,4);
            jPanelSegundas4semanas.setLayout(gridBag);
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.weightx = 1.5; 
            restricciones.gridwidth=13;
            jPanelSegundas4semanas.add(new JLabel());
            for (int i = 12; i < 24; i++) {
                if (i==23) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JLabel dia = fechas.get(i);
                gridBag.setConstraints (dia, restricciones); 
                jPanelSegundas4semanas.add(dia);
            }

            restricciones.gridwidth=13;
            jPanelSegundas4semanas.add(new JLabel());
            for (int i = 0; i < 4; i++) {
                JLabel j = new JLabel(" V");
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);

                j = new JLabel(" S");
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);

                if (i==3) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }

                j = new JLabel(" D");
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);
            }

            restricciones.gridwidth=13;
            jPanelSegundas4semanas.add(new JLabel("Tierra Media"));
            for (int i = 12; i < 24; i++) {
                if (i==23) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon1.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelSegundas4semanas.add(new JLabel("Narnia"));
            for (int i = 12; i < 24; i++) {
                if (i==23) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon2.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelSegundas4semanas.add(new JLabel("Asgard"));
            for (int i = 12; i < 24; i++) {
                if (i==23) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon3.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);
            }

            restricciones.gridwidth= 13;
            jPanelSegundas4semanas.add(new JLabel("Namek"));
            for (int i = 12; i < 24; i++) {
                if (i==23) {
                   restricciones.gridwidth = GridBagConstraints.REMAINDER;
                }
                JRadioButton j = botonesSalon4.get(i);
                gridBag.setConstraints (j, restricciones); 
                jPanelSegundas4semanas.add(j);
            }

            jPanelSegundas4semanas.setVisible(false);

    }
    
    public JRadioButton botonSeleccionado() {
        JRadioButton j=null;
        for (int i = 0; i < botonesSalon1.size(); i++) {
            if (botonesSalon1.get(i).isSelected()) {
                j = botonesSalon1.get(i);
                SpinnerNumberModel model = new SpinnerNumberModel(Integer.parseInt(String.valueOf(nuevaReserva.getjSpinnerAsistentes().getValue())), 0, 100, 1);  
                nuevaReserva.getjSpinnerAsistentes().setModel(model);
                return j;
            }
        }
        
        for (int i = 0; i < botonesSalon2.size(); i++) {
            if (botonesSalon2.get(i).isSelected()) {
                j = botonesSalon2.get(i);
                SpinnerNumberModel model = new SpinnerNumberModel(Integer.parseInt(String.valueOf(nuevaReserva.getjSpinnerAsistentes().getValue())), 0, 150, 1);  
                nuevaReserva.getjSpinnerAsistentes().setModel(model);
                return j;
            }
        }
        
        for (int i = 0; i < botonesSalon3.size(); i++) {
            if (botonesSalon3.get(i).isSelected()) {
                j = botonesSalon3.get(i);
                SpinnerNumberModel model = new SpinnerNumberModel(Integer.parseInt(String.valueOf(nuevaReserva.getjSpinnerAsistentes().getValue())), 0, 250, 1);  
                nuevaReserva.getjSpinnerAsistentes().setModel(model);
                return j;
            }
        }
        
        for (int i = 0; i < botonesSalon4.size(); i++) {
            if (botonesSalon4.get(i).isSelected()) {
                j = botonesSalon4.get(i);
                SpinnerNumberModel model = new SpinnerNumberModel(Integer.parseInt(String.valueOf(nuevaReserva.getjSpinnerAsistentes().getValue())), 0, 500, 1);  
                nuevaReserva.getjSpinnerAsistentes().setModel(model);
                return j;
            }
        }
        return null;
        
    }
    
    public void activarElementos(){
        nuevaReserva.getjLabelEvento().setEnabled(true);
        nuevaReserva.getjComboBoxEvento().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato1().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato2().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato3().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato4().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato5().setEnabled(true);
        nuevaReserva.getjCheckBoxPlato6().setEnabled(true);
        nuevaReserva.getjLabelHabitaciones().setEnabled(true);
        nuevaReserva.getjComboBoxHabitaciones().setEnabled(true);
        nuevaReserva.getjLabelBanquete().setEnabled(true);
        nuevaReserva.getjSpinnerHabitaciones().setEnabled(true);
        nuevaReserva.eventoSeleccionado();
    }
    
    public void comprobarAsistentes(){
        if(asistentes>250){
            for (int i = 0; i < diasS1.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon1.get(i);
                j.setEnabled(false);
            }
            
            for (int i = 0; i < diasS2.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon2.get(i);
                j.setEnabled(false);
            }
            
            for (int i = 0; i < diasS3.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon3.get(i);
                j.setEnabled(false);
            }
            
        }else if(asistentes > 150 && asistentes <=250){
            comprobarDisponibilidad();
            
            for (int i = 0; i < diasS1.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon1.get(i);
                j.setEnabled(false);
            }
            
            for (int i = 0; i < diasS2.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon2.get(i);
                j.setEnabled(false);
            }
        }else if(asistentes>100 && asistentes<=150){
            comprobarDisponibilidad();
            
            for (int i = 0; i < diasS1.length; i++) {
                JRadioButton j = (JRadioButton) botonesSalon1.get(i);
                j.setEnabled(false);
            }    
        }else{        
            comprobarDisponibilidad();
        }
    }

        public void comprobarDisponibilidad(){
        ArrayList<Evento> eventos = new ArrayList<>();
         //eventos=h.obtenerEventos();
        
         for (int i = 0; i < diasS1.length; i++) {
             JRadioButton j = (JRadioButton) botonesSalon1.get(i);
             j.setEnabled(true);
             if (diasS1[i]=='X') {
                j.setEnabled(false);
             }
         }
        
       for (int i = 0; i < diasS2.length; i++) {
            JRadioButton j = (JRadioButton) botonesSalon2.get(i);
            j.setEnabled(true);
            if (diasS2[i]=='X') {
                j.setEnabled(false);
            }
        }
        
        for (int i = 0; i < diasS3.length; i++) {
            JRadioButton j = (JRadioButton) botonesSalon3.get(i);
            j.setEnabled(true);
            if (diasS3[i]=='X') {
                j.setEnabled(false);
            }
        }
        
        for (int i = 0; i < diasS4.length; i++) {
            JRadioButton j = (JRadioButton) botonesSalon4.get(i);
            j.setEnabled(true);
            if (diasS4[i]=='X') {
                j.setEnabled(false);
            }
        }
    }
    
    public Date getDiaSeleccionado() {
        return diaSeleccionado;
    }

    public void setDiaSeleccionado(Date diaSeleccionado) {
        this.diaSeleccionado = diaSeleccionado;
    }

    public int getSalonSeleccionado() {
        return salonSeleccionado;
    }

    public void setSalonSeleccionado(int salonSeleccionado) {
        this.salonSeleccionado = salonSeleccionado;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrimeras4Semanas = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelCambioSemana = new javax.swing.JPanel();
        jButtonPrimeras4 = new javax.swing.JButton();
        jButtonSegundas4 = new javax.swing.JButton();
        jLabelSemana = new javax.swing.JLabel();
        jPanelSegundas4semanas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanelPrimeras4SemanasLayout = new javax.swing.GroupLayout(jPanelPrimeras4Semanas);
        jPanelPrimeras4Semanas.setLayout(jPanelPrimeras4SemanasLayout);
        jPanelPrimeras4SemanasLayout.setHorizontalGroup(
            jPanelPrimeras4SemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        jPanelPrimeras4SemanasLayout.setVerticalGroup(
            jPanelPrimeras4SemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButtonPrimeras4.setText("<");
        jButtonPrimeras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeras4ActionPerformed(evt);
            }
        });

        jButtonSegundas4.setText(">");
        jButtonSegundas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSegundas4ActionPerformed(evt);
            }
        });

        jLabelSemana.setText("Primeras 4 semanas");

        javax.swing.GroupLayout jPanelCambioSemanaLayout = new javax.swing.GroupLayout(jPanelCambioSemana);
        jPanelCambioSemana.setLayout(jPanelCambioSemanaLayout);
        jPanelCambioSemanaLayout.setHorizontalGroup(
            jPanelCambioSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioSemanaLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButtonPrimeras4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSegundas4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCambioSemanaLayout.setVerticalGroup(
            jPanelCambioSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambioSemanaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanelCambioSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimeras4)
                    .addComponent(jButtonSegundas4)
                    .addComponent(jLabelSemana))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSegundas4semanasLayout = new javax.swing.GroupLayout(jPanelSegundas4semanas);
        jPanelSegundas4semanas.setLayout(jPanelSegundas4semanasLayout);
        jPanelSegundas4semanasLayout.setHorizontalGroup(
            jPanelSegundas4semanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        jPanelSegundas4semanasLayout.setVerticalGroup(
            jPanelSegundas4semanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCambioSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanelPrimeras4Semanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSegundas4semanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCambioSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrimeras4Semanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSegundas4semanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (botonSeleccionado()!=null) {
            for (int i = 0; i < botonesSalon1.size(); i++) {
                if (botonSeleccionado().equals(botonesSalon1.get(i))) {
                    diaSeleccionado = numerosDias[i];
                    salonSeleccionado=1;
                    activarElementos();
                }
            }
        
            for (int i = 0; i < botonesSalon2.size(); i++) {
                if (botonSeleccionado().equals(botonesSalon2.get(i))) {
                    diaSeleccionado = numerosDias[i];
                    salonSeleccionado=2;
                    activarElementos();
                }
            }
                
            for (int i = 0; i < botonesSalon3.size(); i++) {
                if (botonSeleccionado().equals(botonesSalon3.get(i))) {
                    diaSeleccionado = numerosDias[i];
                    salonSeleccionado=3;
                    activarElementos();
                }
            }

            for (int i = 0; i < botonesSalon4.size(); i++) {
                if (botonSeleccionado().equals(botonesSalon4.get(i))) {
                    diaSeleccionado = numerosDias[i];
                    salonSeleccionado=4;
                    activarElementos();
                }
            }
            nuevaReserva.getjLabelDiaSeleccionado().setText("Fecha seleccionada: " + new SimpleDateFormat("dd/MM/yyyy").format(diaSeleccionado));
            nuevaReserva.comprobarDiasSlider();
            dispose();
        }else{
            AvisoDiaSeleccionado a = new AvisoDiaSeleccionado();
            a.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonPrimeras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeras4ActionPerformed
        jPanelPrimeras4Semanas.setVisible(true);
        jPanelSegundas4semanas.setVisible(false);
        jButtonSegundas4.setVisible(true);
        jButtonPrimeras4.setVisible(false);
        jLabelSemana.setText("Primeras 4 semanas");
    }//GEN-LAST:event_jButtonPrimeras4ActionPerformed

    private void jButtonSegundas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSegundas4ActionPerformed
        jButtonSegundas4.setVisible(false);
        jButtonPrimeras4.setVisible(true);
        jLabelSemana.setText("Segundas 4 semanas");
        jPanelPrimeras4Semanas.setVisible(false);
        jPanelSegundas4semanas.setVisible(true);
    }//GEN-LAST:event_jButtonSegundas4ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DiasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DiasDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPrimeras4;
    private javax.swing.JButton jButtonSegundas4;
    private javax.swing.JLabel jLabelSemana;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCambioSemana;
    private javax.swing.JPanel jPanelPrimeras4Semanas;
    private javax.swing.JPanel jPanelSegundas4semanas;
    // End of variables declaration//GEN-END:variables
}

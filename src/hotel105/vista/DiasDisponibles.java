/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.vista;

import hotel105.modelo.Evento;
import hotel105.modelo.Hotel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Manuel
 */
public class DiasDisponibles extends javax.swing.JFrame {

    private Date diaSeleccionado;
    private int salonSeleccionado;
    private boolean salir = false;
    NuevaReserva nuevaReserva;
    
    char[] diasS1;
    char[] diasS2;
    char[] diasS3;
    char[] diasS4;
    Date[] numerosDias;
    private int asistentes;
    ArrayList<JRadioButton> botonesSalon1;
    ArrayList<JRadioButton> botonesSalon2;
    ArrayList<JRadioButton> botonesSalon3;
    ArrayList<JRadioButton> botonesSalon4;
    Hotel h = new Hotel();
    
    public DiasDisponibles(NuevaReserva nr) {
        initComponents();
        jPanelSegundos8Dias.setVisible(false);
        ArrayList salones = h.diasDisponibles();
        
        diasS1 = (char[]) salones.get(0);
        diasS2 = (char[]) salones.get(1);
        diasS3 = (char[]) salones.get(2);
        diasS4 = (char[]) salones.get(3);
        numerosDias = (Date[]) salones.get(4);
        
        botonesSalon1 = new ArrayList<>();
        botonesSalon2 = new ArrayList<>();
        botonesSalon3 = new ArrayList<>();
        botonesSalon4 = new ArrayList<>();
        
        this.nuevaReserva=nr;
        
        dibujarDias();
    }
    
    public void dibujarDias(){
        
        String texto = "";
        String diasSemana = "";
        jButtonAnterioresSemanas.setVisible(false);
        
        
        for (int i = 0; i < 4; i++) {
           diasSemana+=" V    S    D   ";
        }
        
        jLabelDiasSemana.setText(diasSemana);
        jLabelDiasSemana2.setText(diasSemana);

        
        botonesSalon1.add(jRadioButtonS1Dia1);
        botonesSalon1.add(jRadioButtonS1Dia2);
        botonesSalon1.add(jRadioButtonS1Dia3);
        botonesSalon1.add(jRadioButtonS1Dia4);
        botonesSalon1.add(jRadioButtonS1Dia5);
        botonesSalon1.add(jRadioButtonS1Dia6);
        botonesSalon1.add(jRadioButtonS1Dia7);
        botonesSalon1.add(jRadioButtonS1Dia8);
        botonesSalon1.add(jRadioButtonS1Dia9);
        botonesSalon1.add(jRadioButtonS1Dia10);
        botonesSalon1.add(jRadioButtonS1Dia11);
        botonesSalon1.add(jRadioButtonS1Dia12);
        botonesSalon1.add(jRadioButtonS1Dia13);
        botonesSalon1.add(jRadioButtonS1Dia14);
        botonesSalon1.add(jRadioButtonS1Dia15);
        botonesSalon1.add(jRadioButtonS1Dia16);
        botonesSalon1.add(jRadioButtonS1Dia17);
        botonesSalon1.add(jRadioButtonS1Dia18);
        botonesSalon1.add(jRadioButtonS1Dia19);
        botonesSalon1.add(jRadioButtonS1Dia20);
        botonesSalon1.add(jRadioButtonS1Dia21);
        botonesSalon1.add(jRadioButtonS1Dia22);
        botonesSalon1.add(jRadioButtonS1Dia23);
        botonesSalon1.add(jRadioButtonS1Dia24);
        botonesSalon2.add(jRadioButtonS2Dia1);
        botonesSalon2.add(jRadioButtonS2Dia2);
        botonesSalon2.add(jRadioButtonS2Dia3);
        botonesSalon2.add(jRadioButtonS2Dia4);
        botonesSalon2.add(jRadioButtonS2Dia5);
        botonesSalon2.add(jRadioButtonS2Dia6);
        botonesSalon2.add(jRadioButtonS2Dia7);
        botonesSalon2.add(jRadioButtonS2Dia8);
        botonesSalon2.add(jRadioButtonS2Dia9);
        botonesSalon2.add(jRadioButtonS2Dia10);
        botonesSalon2.add(jRadioButtonS2Dia11);
        botonesSalon2.add(jRadioButtonS2Dia12);
        botonesSalon2.add(jRadioButtonS2Dia13);
        botonesSalon2.add(jRadioButtonS2Dia14);
        botonesSalon2.add(jRadioButtonS2Dia15);
        botonesSalon2.add(jRadioButtonS2Dia16);
        botonesSalon2.add(jRadioButtonS2Dia17);
        botonesSalon2.add(jRadioButtonS2Dia18);
        botonesSalon2.add(jRadioButtonS2Dia19);
        botonesSalon2.add(jRadioButtonS2Dia20);
        botonesSalon2.add(jRadioButtonS2Dia21);
        botonesSalon2.add(jRadioButtonS2Dia22);
        botonesSalon2.add(jRadioButtonS2Dia23);
        botonesSalon2.add(jRadioButtonS2Dia24);
        botonesSalon3.add(jRadioButtonS3Dia1);
        botonesSalon3.add(jRadioButtonS3Dia2);
        botonesSalon3.add(jRadioButtonS3Dia3);
        botonesSalon3.add(jRadioButtonS3Dia4);
        botonesSalon3.add(jRadioButtonS3Dia5);
        botonesSalon3.add(jRadioButtonS3Dia6);
        botonesSalon3.add(jRadioButtonS3Dia7);
        botonesSalon3.add(jRadioButtonS3Dia8);
        botonesSalon3.add(jRadioButtonS3Dia9);
        botonesSalon3.add(jRadioButtonS3Dia10);
        botonesSalon3.add(jRadioButtonS3Dia11);
        botonesSalon3.add(jRadioButtonS3Dia12);
        botonesSalon3.add(jRadioButtonS3Dia13);
        botonesSalon3.add(jRadioButtonS3Dia14);
        botonesSalon3.add(jRadioButtonS3Dia15);
        botonesSalon3.add(jRadioButtonS3Dia16);
        botonesSalon3.add(jRadioButtonS3Dia17);
        botonesSalon3.add(jRadioButtonS3Dia18);
        botonesSalon3.add(jRadioButtonS3Dia19);
        botonesSalon3.add(jRadioButtonS3Dia20);
        botonesSalon3.add(jRadioButtonS3Dia21);
        botonesSalon3.add(jRadioButtonS3Dia22);
        botonesSalon3.add(jRadioButtonS3Dia23);
        botonesSalon3.add(jRadioButtonS3Dia24);
        botonesSalon4.add(jRadioButtonS4Dia1);
        botonesSalon4.add(jRadioButtonS4Dia2);
        botonesSalon4.add(jRadioButtonS4Dia3);
        botonesSalon4.add(jRadioButtonS4Dia4);
        botonesSalon4.add(jRadioButtonS4Dia5);
        botonesSalon4.add(jRadioButtonS4Dia6);
        botonesSalon4.add(jRadioButtonS4Dia7);
        botonesSalon4.add(jRadioButtonS4Dia8);
        botonesSalon4.add(jRadioButtonS4Dia9);
        botonesSalon4.add(jRadioButtonS4Dia10);
        botonesSalon4.add(jRadioButtonS4Dia11);
        botonesSalon4.add(jRadioButtonS4Dia12);
        botonesSalon4.add(jRadioButtonS4Dia13);
        botonesSalon4.add(jRadioButtonS4Dia14);
        botonesSalon4.add(jRadioButtonS4Dia15);
        botonesSalon4.add(jRadioButtonS4Dia16);
        botonesSalon4.add(jRadioButtonS4Dia17);
        botonesSalon4.add(jRadioButtonS4Dia18);
        botonesSalon4.add(jRadioButtonS4Dia19);
        botonesSalon4.add(jRadioButtonS4Dia20);
        botonesSalon4.add(jRadioButtonS4Dia21);
        botonesSalon4.add(jRadioButtonS4Dia22);
        botonesSalon4.add(jRadioButtonS4Dia23);
        botonesSalon4.add(jRadioButtonS4Dia24);
            
        comprobarDisponibilidad();
        
        String nDias="";
        for (int i = 0; i < 12; i++) {
            nDias+=numerosDias[i].getDate() + "   ";
        }
        jLabelNumeroDia.setText(nDias);
        
        nDias=" ";
        for (int i = 12; i < 24; i++) {
            nDias+=numerosDias[i].getDate()+ "   ";
        }
        jLabelNumeroDia2.setText(nDias);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSemana = new javax.swing.ButtonGroup();
        jPanelTodo = new javax.swing.JPanel();
        jLabelSalon1 = new javax.swing.JLabel();
        jLabelSalon2 = new javax.swing.JLabel();
        jLabelSalon3 = new javax.swing.JLabel();
        jPanelPrimeros8Dias = new javax.swing.JPanel();
        jRadioButtonS1Dia1 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia2 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia3 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia4 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia5 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia6 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia7 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia8 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia9 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia10 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia11 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia12 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia1 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia2 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia3 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia4 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia5 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia6 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia7 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia8 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia9 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia10 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia11 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia12 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia1 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia2 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia3 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia4 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia5 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia6 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia7 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia8 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia9 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia10 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia11 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia12 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia1 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia2 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia3 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia4 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia5 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia6 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia7 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia8 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia9 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia10 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia11 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia12 = new javax.swing.JRadioButton();
        jLabelDiasSemana = new javax.swing.JLabel();
        jLabelNumeroDia = new javax.swing.JLabel();
        jLabelSalon4 = new javax.swing.JLabel();
        jPanelSegundos8Dias = new javax.swing.JPanel();
        jRadioButtonS1Dia13 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia14 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia15 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia16 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia17 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia18 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia19 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia20 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia21 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia22 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia23 = new javax.swing.JRadioButton();
        jRadioButtonS1Dia24 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia13 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia14 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia15 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia16 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia17 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia18 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia19 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia20 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia21 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia22 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia23 = new javax.swing.JRadioButton();
        jRadioButtonS2Dia24 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia13 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia14 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia15 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia16 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia17 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia18 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia19 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia20 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia21 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia22 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia23 = new javax.swing.JRadioButton();
        jRadioButtonS3Dia24 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia13 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia14 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia15 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia16 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia17 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia18 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia19 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia20 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia21 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia22 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia23 = new javax.swing.JRadioButton();
        jRadioButtonS4Dia24 = new javax.swing.JRadioButton();
        jLabelDiasSemana2 = new javax.swing.JLabel();
        jLabelNumeroDia2 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jLabelNumeroSemanas = new javax.swing.JLabel();
        jButtonSiguientesSemanas = new javax.swing.JButton();
        jButtonAnterioresSemanas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelSalon1.setText("Tierra Media");

        jLabelSalon2.setText("Narnia");

        jLabelSalon3.setText("Asgard");

        buttonGroupSemana.add(jRadioButtonS1Dia1);
        jRadioButtonS1Dia1.setName(""); // NOI18N

        buttonGroupSemana.add(jRadioButtonS1Dia2);

        buttonGroupSemana.add(jRadioButtonS1Dia3);

        buttonGroupSemana.add(jRadioButtonS1Dia4);

        buttonGroupSemana.add(jRadioButtonS1Dia5);

        buttonGroupSemana.add(jRadioButtonS1Dia6);

        buttonGroupSemana.add(jRadioButtonS1Dia7);

        buttonGroupSemana.add(jRadioButtonS1Dia8);

        buttonGroupSemana.add(jRadioButtonS1Dia9);

        buttonGroupSemana.add(jRadioButtonS1Dia10);

        buttonGroupSemana.add(jRadioButtonS1Dia11);

        buttonGroupSemana.add(jRadioButtonS1Dia12);

        buttonGroupSemana.add(jRadioButtonS2Dia1);

        buttonGroupSemana.add(jRadioButtonS2Dia2);

        buttonGroupSemana.add(jRadioButtonS2Dia3);

        buttonGroupSemana.add(jRadioButtonS2Dia4);

        buttonGroupSemana.add(jRadioButtonS2Dia5);

        buttonGroupSemana.add(jRadioButtonS2Dia6);

        buttonGroupSemana.add(jRadioButtonS2Dia7);

        buttonGroupSemana.add(jRadioButtonS2Dia8);

        buttonGroupSemana.add(jRadioButtonS2Dia9);

        buttonGroupSemana.add(jRadioButtonS2Dia10);

        buttonGroupSemana.add(jRadioButtonS2Dia11);

        buttonGroupSemana.add(jRadioButtonS2Dia12);

        buttonGroupSemana.add(jRadioButtonS3Dia1);

        buttonGroupSemana.add(jRadioButtonS3Dia2);

        buttonGroupSemana.add(jRadioButtonS3Dia3);

        buttonGroupSemana.add(jRadioButtonS3Dia4);

        buttonGroupSemana.add(jRadioButtonS3Dia5);

        buttonGroupSemana.add(jRadioButtonS3Dia6);

        buttonGroupSemana.add(jRadioButtonS3Dia7);

        buttonGroupSemana.add(jRadioButtonS3Dia8);

        buttonGroupSemana.add(jRadioButtonS3Dia9);

        buttonGroupSemana.add(jRadioButtonS3Dia10);

        buttonGroupSemana.add(jRadioButtonS3Dia11);

        buttonGroupSemana.add(jRadioButtonS3Dia12);

        buttonGroupSemana.add(jRadioButtonS4Dia1);

        buttonGroupSemana.add(jRadioButtonS4Dia2);

        buttonGroupSemana.add(jRadioButtonS4Dia3);

        buttonGroupSemana.add(jRadioButtonS4Dia4);

        buttonGroupSemana.add(jRadioButtonS4Dia5);

        buttonGroupSemana.add(jRadioButtonS4Dia6);

        buttonGroupSemana.add(jRadioButtonS4Dia7);

        buttonGroupSemana.add(jRadioButtonS4Dia8);

        buttonGroupSemana.add(jRadioButtonS4Dia9);

        buttonGroupSemana.add(jRadioButtonS4Dia10);

        buttonGroupSemana.add(jRadioButtonS4Dia11);

        buttonGroupSemana.add(jRadioButtonS4Dia12);

        javax.swing.GroupLayout jPanelPrimeros8DiasLayout = new javax.swing.GroupLayout(jPanelPrimeros8Dias);
        jPanelPrimeros8Dias.setLayout(jPanelPrimeros8DiasLayout);
        jPanelPrimeros8DiasLayout.setHorizontalGroup(
            jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrimeros8DiasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDiasSemana, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS1Dia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia12))
                    .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS2Dia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia12))
                    .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia1)
                            .addComponent(jRadioButtonS4Dia1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia6))
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia8))
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia12))
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia12))))
                    .addComponent(jLabelNumeroDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanelPrimeros8DiasLayout.setVerticalGroup(
            jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNumeroDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDiasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonS1Dia1)
                    .addComponent(jRadioButtonS1Dia2)
                    .addComponent(jRadioButtonS1Dia3)
                    .addComponent(jRadioButtonS1Dia4)
                    .addComponent(jRadioButtonS1Dia5)
                    .addComponent(jRadioButtonS1Dia6)
                    .addComponent(jRadioButtonS1Dia7)
                    .addComponent(jRadioButtonS1Dia8)
                    .addComponent(jRadioButtonS1Dia9)
                    .addComponent(jRadioButtonS1Dia10)
                    .addComponent(jRadioButtonS1Dia11)
                    .addComponent(jRadioButtonS1Dia12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButtonS2Dia1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButtonS2Dia2)
                        .addComponent(jRadioButtonS2Dia3))
                    .addComponent(jRadioButtonS2Dia4)
                    .addComponent(jRadioButtonS2Dia5)
                    .addComponent(jRadioButtonS2Dia6)
                    .addComponent(jRadioButtonS2Dia7)
                    .addComponent(jRadioButtonS2Dia8)
                    .addComponent(jRadioButtonS2Dia9)
                    .addComponent(jRadioButtonS2Dia10)
                    .addComponent(jRadioButtonS2Dia11)
                    .addComponent(jRadioButtonS2Dia12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonS3Dia10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonS4Dia10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS4Dia11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS4Dia12, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS3Dia7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonS4Dia7))
                    .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonS3Dia1)
                                .addComponent(jRadioButtonS3Dia2)
                                .addComponent(jRadioButtonS3Dia3)
                                .addComponent(jRadioButtonS3Dia4)
                                .addComponent(jRadioButtonS3Dia5)
                                .addComponent(jRadioButtonS3Dia6))
                            .addComponent(jRadioButtonS3Dia9)
                            .addComponent(jRadioButtonS3Dia8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonS4Dia8))
                            .addGroup(jPanelPrimeros8DiasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrimeros8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButtonS4Dia6)
                                        .addComponent(jRadioButtonS4Dia5)
                                        .addComponent(jRadioButtonS4Dia4)
                                        .addComponent(jRadioButtonS4Dia3)
                                        .addComponent(jRadioButtonS4Dia2)
                                        .addComponent(jRadioButtonS4Dia1))
                                    .addComponent(jRadioButtonS4Dia9, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(6, 6, 6))
        );

        jLabelSalon4.setText("Namek");

        buttonGroupSemana.add(jRadioButtonS1Dia13);

        buttonGroupSemana.add(jRadioButtonS1Dia14);

        buttonGroupSemana.add(jRadioButtonS1Dia15);

        buttonGroupSemana.add(jRadioButtonS1Dia16);

        buttonGroupSemana.add(jRadioButtonS1Dia17);

        buttonGroupSemana.add(jRadioButtonS1Dia18);

        buttonGroupSemana.add(jRadioButtonS1Dia19);

        buttonGroupSemana.add(jRadioButtonS1Dia20);

        buttonGroupSemana.add(jRadioButtonS1Dia21);

        buttonGroupSemana.add(jRadioButtonS1Dia22);

        buttonGroupSemana.add(jRadioButtonS1Dia23);

        buttonGroupSemana.add(jRadioButtonS1Dia24);

        buttonGroupSemana.add(jRadioButtonS2Dia13);

        buttonGroupSemana.add(jRadioButtonS2Dia14);

        buttonGroupSemana.add(jRadioButtonS2Dia15);

        buttonGroupSemana.add(jRadioButtonS2Dia16);

        buttonGroupSemana.add(jRadioButtonS2Dia17);

        buttonGroupSemana.add(jRadioButtonS2Dia18);

        buttonGroupSemana.add(jRadioButtonS2Dia19);

        buttonGroupSemana.add(jRadioButtonS2Dia20);

        buttonGroupSemana.add(jRadioButtonS2Dia21);

        buttonGroupSemana.add(jRadioButtonS2Dia22);

        buttonGroupSemana.add(jRadioButtonS2Dia23);

        buttonGroupSemana.add(jRadioButtonS2Dia24);

        buttonGroupSemana.add(jRadioButtonS3Dia13);

        buttonGroupSemana.add(jRadioButtonS3Dia14);

        buttonGroupSemana.add(jRadioButtonS3Dia15);

        buttonGroupSemana.add(jRadioButtonS3Dia16);

        buttonGroupSemana.add(jRadioButtonS3Dia17);

        buttonGroupSemana.add(jRadioButtonS3Dia18);

        buttonGroupSemana.add(jRadioButtonS3Dia19);

        buttonGroupSemana.add(jRadioButtonS3Dia20);

        buttonGroupSemana.add(jRadioButtonS3Dia21);

        buttonGroupSemana.add(jRadioButtonS3Dia22);

        buttonGroupSemana.add(jRadioButtonS3Dia23);

        buttonGroupSemana.add(jRadioButtonS3Dia24);

        buttonGroupSemana.add(jRadioButtonS4Dia13);

        buttonGroupSemana.add(jRadioButtonS4Dia14);

        buttonGroupSemana.add(jRadioButtonS4Dia15);

        buttonGroupSemana.add(jRadioButtonS4Dia16);

        buttonGroupSemana.add(jRadioButtonS4Dia17);

        buttonGroupSemana.add(jRadioButtonS4Dia18);

        buttonGroupSemana.add(jRadioButtonS4Dia19);

        buttonGroupSemana.add(jRadioButtonS4Dia20);

        buttonGroupSemana.add(jRadioButtonS4Dia21);

        buttonGroupSemana.add(jRadioButtonS4Dia22);

        buttonGroupSemana.add(jRadioButtonS4Dia23);

        buttonGroupSemana.add(jRadioButtonS4Dia24);

        javax.swing.GroupLayout jPanelSegundos8DiasLayout = new javax.swing.GroupLayout(jPanelSegundos8Dias);
        jPanelSegundos8Dias.setLayout(jPanelSegundos8DiasLayout);
        jPanelSegundos8DiasLayout.setHorizontalGroup(
            jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSegundos8DiasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDiasSemana2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS1Dia13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS1Dia24))
                    .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS2Dia13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonS2Dia24))
                    .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia13)
                            .addComponent(jRadioButtonS4Dia13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia18))
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia20))
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS3Dia21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS3Dia24))
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addComponent(jRadioButtonS4Dia21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonS4Dia24))))
                    .addComponent(jLabelNumeroDia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanelSegundos8DiasLayout.setVerticalGroup(
            jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNumeroDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDiasSemana2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonS1Dia13)
                    .addComponent(jRadioButtonS1Dia14)
                    .addComponent(jRadioButtonS1Dia15)
                    .addComponent(jRadioButtonS1Dia16)
                    .addComponent(jRadioButtonS1Dia17)
                    .addComponent(jRadioButtonS1Dia18)
                    .addComponent(jRadioButtonS1Dia19)
                    .addComponent(jRadioButtonS1Dia20)
                    .addComponent(jRadioButtonS1Dia21)
                    .addComponent(jRadioButtonS1Dia22)
                    .addComponent(jRadioButtonS1Dia23)
                    .addComponent(jRadioButtonS1Dia24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButtonS2Dia13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButtonS2Dia14)
                        .addComponent(jRadioButtonS2Dia15))
                    .addComponent(jRadioButtonS2Dia16)
                    .addComponent(jRadioButtonS2Dia17)
                    .addComponent(jRadioButtonS2Dia18)
                    .addComponent(jRadioButtonS2Dia19)
                    .addComponent(jRadioButtonS2Dia20)
                    .addComponent(jRadioButtonS2Dia21)
                    .addComponent(jRadioButtonS2Dia22)
                    .addComponent(jRadioButtonS2Dia23)
                    .addComponent(jRadioButtonS2Dia24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonS3Dia22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS3Dia24, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonS4Dia22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS4Dia23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonS4Dia24, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addComponent(jRadioButtonS3Dia19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonS4Dia19))
                    .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonS3Dia13)
                                .addComponent(jRadioButtonS3Dia14)
                                .addComponent(jRadioButtonS3Dia15)
                                .addComponent(jRadioButtonS3Dia16)
                                .addComponent(jRadioButtonS3Dia17)
                                .addComponent(jRadioButtonS3Dia18))
                            .addComponent(jRadioButtonS3Dia21)
                            .addComponent(jRadioButtonS3Dia20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonS4Dia20))
                            .addGroup(jPanelSegundos8DiasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSegundos8DiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButtonS4Dia18)
                                        .addComponent(jRadioButtonS4Dia17)
                                        .addComponent(jRadioButtonS4Dia16)
                                        .addComponent(jRadioButtonS4Dia15)
                                        .addComponent(jRadioButtonS4Dia14)
                                        .addComponent(jRadioButtonS4Dia13))
                                    .addComponent(jRadioButtonS4Dia21, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(6, 6, 6))
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
                .addGroup(jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTodoLayout.createSequentialGroup()
                        .addGroup(jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelSalon2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabelSalon3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSalon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSalon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelPrimeros8Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSegundos8Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTodoLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelTodoLayout.setVerticalGroup(
            jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addGroup(jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTodoLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelSalon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalon3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalon4))
                    .addGroup(jPanelTodoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSegundos8Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelPrimeros8Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonAceptar))
        );

        jLabelNumeroSemanas.setText("Primeras 4 semanas");

        jButtonSiguientesSemanas.setText(">");
        jButtonSiguientesSemanas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSiguientesSemanasMouseClicked(evt);
            }
        });
        jButtonSiguientesSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguientesSemanasActionPerformed(evt);
            }
        });

        jButtonAnterioresSemanas.setText("<");
        jButtonAnterioresSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnterioresSemanasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButtonAnterioresSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumeroSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSiguientesSemanas)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSiguientesSemanas)
                    .addComponent(jButtonAnterioresSemanas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguientesSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguientesSemanasActionPerformed
       jPanelPrimeros8Dias.setVisible(false);
       jPanelSegundos8Dias.setVisible(true);
       jButtonAnterioresSemanas.setVisible(true);
       jButtonSiguientesSemanas.setVisible(false);
       jLabelNumeroSemanas.setText("Segundas 4 semanas");
    }//GEN-LAST:event_jButtonSiguientesSemanasActionPerformed

    private void jButtonSiguientesSemanasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguientesSemanasMouseClicked

    }//GEN-LAST:event_jButtonSiguientesSemanasMouseClicked

    private void jButtonAnterioresSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnterioresSemanasActionPerformed
       jPanelPrimeros8Dias.setVisible(true);
       jPanelSegundos8Dias.setVisible(false);
       jButtonAnterioresSemanas.setVisible(false);
       jButtonSiguientesSemanas.setVisible(true);
       jLabelNumeroSemanas.setText("Primeras 4 semanas");
    }//GEN-LAST:event_jButtonAnterioresSemanasActionPerformed

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
        }
        salir=true;
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new DiasDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSemana;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAnterioresSemanas;
    private javax.swing.JButton jButtonSiguientesSemanas;
    private javax.swing.JLabel jLabelDiasSemana;
    private javax.swing.JLabel jLabelDiasSemana2;
    private javax.swing.JLabel jLabelNumeroDia;
    private javax.swing.JLabel jLabelNumeroDia2;
    private javax.swing.JLabel jLabelNumeroSemanas;
    private javax.swing.JLabel jLabelSalon1;
    private javax.swing.JLabel jLabelSalon2;
    private javax.swing.JLabel jLabelSalon3;
    private javax.swing.JLabel jLabelSalon4;
    private javax.swing.JPanel jPanelPrimeros8Dias;
    private javax.swing.JPanel jPanelSegundos8Dias;
    private javax.swing.JPanel jPanelTodo;
    private javax.swing.JRadioButton jRadioButtonS1Dia1;
    private javax.swing.JRadioButton jRadioButtonS1Dia10;
    private javax.swing.JRadioButton jRadioButtonS1Dia11;
    private javax.swing.JRadioButton jRadioButtonS1Dia12;
    private javax.swing.JRadioButton jRadioButtonS1Dia13;
    private javax.swing.JRadioButton jRadioButtonS1Dia14;
    private javax.swing.JRadioButton jRadioButtonS1Dia15;
    private javax.swing.JRadioButton jRadioButtonS1Dia16;
    private javax.swing.JRadioButton jRadioButtonS1Dia17;
    private javax.swing.JRadioButton jRadioButtonS1Dia18;
    private javax.swing.JRadioButton jRadioButtonS1Dia19;
    private javax.swing.JRadioButton jRadioButtonS1Dia2;
    private javax.swing.JRadioButton jRadioButtonS1Dia20;
    private javax.swing.JRadioButton jRadioButtonS1Dia21;
    private javax.swing.JRadioButton jRadioButtonS1Dia22;
    private javax.swing.JRadioButton jRadioButtonS1Dia23;
    private javax.swing.JRadioButton jRadioButtonS1Dia24;
    private javax.swing.JRadioButton jRadioButtonS1Dia3;
    private javax.swing.JRadioButton jRadioButtonS1Dia4;
    private javax.swing.JRadioButton jRadioButtonS1Dia5;
    private javax.swing.JRadioButton jRadioButtonS1Dia6;
    private javax.swing.JRadioButton jRadioButtonS1Dia7;
    private javax.swing.JRadioButton jRadioButtonS1Dia8;
    private javax.swing.JRadioButton jRadioButtonS1Dia9;
    private javax.swing.JRadioButton jRadioButtonS2Dia1;
    private javax.swing.JRadioButton jRadioButtonS2Dia10;
    private javax.swing.JRadioButton jRadioButtonS2Dia11;
    private javax.swing.JRadioButton jRadioButtonS2Dia12;
    private javax.swing.JRadioButton jRadioButtonS2Dia13;
    private javax.swing.JRadioButton jRadioButtonS2Dia14;
    private javax.swing.JRadioButton jRadioButtonS2Dia15;
    private javax.swing.JRadioButton jRadioButtonS2Dia16;
    private javax.swing.JRadioButton jRadioButtonS2Dia17;
    private javax.swing.JRadioButton jRadioButtonS2Dia18;
    private javax.swing.JRadioButton jRadioButtonS2Dia19;
    private javax.swing.JRadioButton jRadioButtonS2Dia2;
    private javax.swing.JRadioButton jRadioButtonS2Dia20;
    private javax.swing.JRadioButton jRadioButtonS2Dia21;
    private javax.swing.JRadioButton jRadioButtonS2Dia22;
    private javax.swing.JRadioButton jRadioButtonS2Dia23;
    private javax.swing.JRadioButton jRadioButtonS2Dia24;
    private javax.swing.JRadioButton jRadioButtonS2Dia3;
    private javax.swing.JRadioButton jRadioButtonS2Dia4;
    private javax.swing.JRadioButton jRadioButtonS2Dia5;
    private javax.swing.JRadioButton jRadioButtonS2Dia6;
    private javax.swing.JRadioButton jRadioButtonS2Dia7;
    private javax.swing.JRadioButton jRadioButtonS2Dia8;
    private javax.swing.JRadioButton jRadioButtonS2Dia9;
    private javax.swing.JRadioButton jRadioButtonS3Dia1;
    private javax.swing.JRadioButton jRadioButtonS3Dia10;
    private javax.swing.JRadioButton jRadioButtonS3Dia11;
    private javax.swing.JRadioButton jRadioButtonS3Dia12;
    private javax.swing.JRadioButton jRadioButtonS3Dia13;
    private javax.swing.JRadioButton jRadioButtonS3Dia14;
    private javax.swing.JRadioButton jRadioButtonS3Dia15;
    private javax.swing.JRadioButton jRadioButtonS3Dia16;
    private javax.swing.JRadioButton jRadioButtonS3Dia17;
    private javax.swing.JRadioButton jRadioButtonS3Dia18;
    private javax.swing.JRadioButton jRadioButtonS3Dia19;
    private javax.swing.JRadioButton jRadioButtonS3Dia2;
    private javax.swing.JRadioButton jRadioButtonS3Dia20;
    private javax.swing.JRadioButton jRadioButtonS3Dia21;
    private javax.swing.JRadioButton jRadioButtonS3Dia22;
    private javax.swing.JRadioButton jRadioButtonS3Dia23;
    private javax.swing.JRadioButton jRadioButtonS3Dia24;
    private javax.swing.JRadioButton jRadioButtonS3Dia3;
    private javax.swing.JRadioButton jRadioButtonS3Dia4;
    private javax.swing.JRadioButton jRadioButtonS3Dia5;
    private javax.swing.JRadioButton jRadioButtonS3Dia6;
    private javax.swing.JRadioButton jRadioButtonS3Dia7;
    private javax.swing.JRadioButton jRadioButtonS3Dia8;
    private javax.swing.JRadioButton jRadioButtonS3Dia9;
    private javax.swing.JRadioButton jRadioButtonS4Dia1;
    private javax.swing.JRadioButton jRadioButtonS4Dia10;
    private javax.swing.JRadioButton jRadioButtonS4Dia11;
    private javax.swing.JRadioButton jRadioButtonS4Dia12;
    private javax.swing.JRadioButton jRadioButtonS4Dia13;
    private javax.swing.JRadioButton jRadioButtonS4Dia14;
    private javax.swing.JRadioButton jRadioButtonS4Dia15;
    private javax.swing.JRadioButton jRadioButtonS4Dia16;
    private javax.swing.JRadioButton jRadioButtonS4Dia17;
    private javax.swing.JRadioButton jRadioButtonS4Dia18;
    private javax.swing.JRadioButton jRadioButtonS4Dia19;
    private javax.swing.JRadioButton jRadioButtonS4Dia2;
    private javax.swing.JRadioButton jRadioButtonS4Dia20;
    private javax.swing.JRadioButton jRadioButtonS4Dia21;
    private javax.swing.JRadioButton jRadioButtonS4Dia22;
    private javax.swing.JRadioButton jRadioButtonS4Dia23;
    private javax.swing.JRadioButton jRadioButtonS4Dia24;
    private javax.swing.JRadioButton jRadioButtonS4Dia3;
    private javax.swing.JRadioButton jRadioButtonS4Dia4;
    private javax.swing.JRadioButton jRadioButtonS4Dia5;
    private javax.swing.JRadioButton jRadioButtonS4Dia6;
    private javax.swing.JRadioButton jRadioButtonS4Dia7;
    private javax.swing.JRadioButton jRadioButtonS4Dia8;
    private javax.swing.JRadioButton jRadioButtonS4Dia9;
    // End of variables declaration//GEN-END:variables
}

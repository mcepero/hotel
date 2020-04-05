/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.vista;

import hotel105.modelo.Evento;
import hotel105.modelo.Hotel;
import hotel105.modelo.Reserva;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Manuel
 */
public class ProximasReservas extends javax.swing.JPanel {
    private Hotel hotel;
    /**
     * Creates new form ProximasReservas
     */
    public ProximasReservas(Hotel hotel) {
        this.hotel=hotel;
        initComponents();
    }

    
    
    public JLabel getjLabel1() {

        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JLabel getjLabelFecha() {
        return jLabelFecha;
    }

    public void setjLabelFecha(JLabel jLabelFecha) {
        this.jLabelFecha = jLabelFecha;
    }

    public JLabel getjLabelSalon1() {
        return jLabelSalon1;
    }

    public void setjLabelSalon1(JLabel jLabelSalon1) {
        this.jLabelSalon1 = jLabelSalon1;
    }

    public JLabel getjLabelSalon2() {
        return jLabelSalon2;
    }

    public void setjLabelSalon2(JLabel jLabelSalon2) {
        this.jLabelSalon2 = jLabelSalon2;
    }

    public JLabel getjLabelSalon3() {
        return jLabelSalon3;
    }

    public void setjLabelSalon3(JLabel jLabelSalon3) {
        this.jLabelSalon3 = jLabelSalon3;
    }

    public JLabel getjLabelSalon4() {
        return jLabelSalon4;
    }

    public void setjLabelSalon4(JLabel jLabelSalon4) {
        this.jLabelSalon4 = jLabelSalon4;
    }

    public JLabel getjLabelViernes() {
        return jLabelViernes;
    }

    public void setjLabelViernes(JLabel jLabelViernes) {
        this.jLabelViernes = jLabelViernes;
    }

    public JLabel getjLabelViernes1() {
        return jLabelViernes1;
    }

    public void setjLabelViernes1(JLabel jLabelViernes1) {
        this.jLabelViernes1 = jLabelViernes1;
    }

    public JLabel getjLabelViernes2() {
        return jLabelViernes2;
    }

    public void setjLabelViernes2(JLabel jLabelViernes2) {
        this.jLabelViernes2 = jLabelViernes2;
    }

    public JPanel getjPanel01() {
        return jPanel01;
    }

    public void setjPanel01(JPanel jPanel01) {
        this.jPanel01 = jPanel01;
    }

    public JPanel getjPanel010() {
        return jPanel010;
    }

    public void setjPanel010(JPanel jPanel010) {
        this.jPanel010 = jPanel010;
    }

    public JPanel getjPanel011() {
        return jPanel011;
    }

    public void setjPanel011(JPanel jPanel011) {
        this.jPanel011 = jPanel011;
    }

    public JPanel getjPanel012() {
        return jPanel012;
    }

    public void setjPanel012(JPanel jPanel012) {
        this.jPanel012 = jPanel012;
    }

    public JPanel getjPanel013() {
        return jPanel013;
    }

    public void setjPanel013(JPanel jPanel013) {
        this.jPanel013 = jPanel013;
    }

    public JPanel getjPanel014() {
        return jPanel014;
    }

    public void setjPanel014(JPanel jPanel014) {
        this.jPanel014 = jPanel014;
    }

    public JPanel getjPanel015() {
        return jPanel015;
    }

    public void setjPanel015(JPanel jPanel015) {
        this.jPanel015 = jPanel015;
    }

    public JPanel getjPanel016() {
        return jPanel016;
    }

    public void setjPanel016(JPanel jPanel016) {
        this.jPanel016 = jPanel016;
    }

    public JPanel getjPanel017() {
        return jPanel017;
    }

    public void setjPanel017(JPanel jPanel017) {
        this.jPanel017 = jPanel017;
    }

    public JPanel getjPanel018() {
        return jPanel018;
    }

    public void setjPanel018(JPanel jPanel018) {
        this.jPanel018 = jPanel018;
    }

    public JPanel getjPanel019() {
        return jPanel019;
    }

    public void setjPanel019(JPanel jPanel019) {
        this.jPanel019 = jPanel019;
    }

    public JPanel getjPanel02() {
        return jPanel02;
    }

    public void setjPanel02(JPanel jPanel02) {
        this.jPanel02 = jPanel02;
    }

    public JPanel getjPanel020() {
        return jPanel020;
    }

    public void setjPanel020(JPanel jPanel020) {
        this.jPanel020 = jPanel020;
    }

    public JPanel getjPanel021() {
        return jPanel021;
    }

    public void setjPanel021(JPanel jPanel021) {
        this.jPanel021 = jPanel021;
    }

    public JPanel getjPanel022() {
        return jPanel022;
    }

    public void setjPanel022(JPanel jPanel022) {
        this.jPanel022 = jPanel022;
    }

    public JPanel getjPanel023() {
        return jPanel023;
    }

    public void setjPanel023(JPanel jPanel023) {
        this.jPanel023 = jPanel023;
    }

    public JPanel getjPanel024() {
        return jPanel024;
    }

    public void setjPanel024(JPanel jPanel024) {
        this.jPanel024 = jPanel024;
    }

    public JPanel getjPanel025() {
        return jPanel025;
    }

    public void setjPanel025(JPanel jPanel025) {
        this.jPanel025 = jPanel025;
    }

    public JPanel getjPanel026() {
        return jPanel026;
    }

    public void setjPanel026(JPanel jPanel026) {
        this.jPanel026 = jPanel026;
    }

    public JPanel getjPanel027() {
        return jPanel027;
    }

    public void setjPanel027(JPanel jPanel027) {
        this.jPanel027 = jPanel027;
    }

    public JPanel getjPanel028() {
        return jPanel028;
    }

    public void setjPanel028(JPanel jPanel028) {
        this.jPanel028 = jPanel028;
    }

    public JPanel getjPanel029() {
        return jPanel029;
    }

    public void setjPanel029(JPanel jPanel029) {
        this.jPanel029 = jPanel029;
    }

    public JPanel getjPanel03() {
        return jPanel03;
    }

    public void setjPanel03(JPanel jPanel03) {
        this.jPanel03 = jPanel03;
    }

    public JPanel getjPanel030() {
        return jPanel030;
    }

    public void setjPanel030(JPanel jPanel030) {
        this.jPanel030 = jPanel030;
    }

    public JPanel getjPanel031() {
        return jPanel031;
    }

    public void setjPanel031(JPanel jPanel031) {
        this.jPanel031 = jPanel031;
    }

    public JPanel getjPanel032() {
        return jPanel032;
    }

    public void setjPanel032(JPanel jPanel032) {
        this.jPanel032 = jPanel032;
    }

    public JPanel getjPanel04() {
        return jPanel04;
    }

    public void setjPanel04(JPanel jPanel04) {
        this.jPanel04 = jPanel04;
    }

    public JPanel getjPanel05() {
        return jPanel05;
    }

    public void setjPanel05(JPanel jPanel05) {
        this.jPanel05 = jPanel05;
    }

    public JPanel getjPanel06() {
        return jPanel06;
    }

    public void setjPanel06(JPanel jPanel06) {
        this.jPanel06 = jPanel06;
    }

    public JPanel getjPanel07() {
        return jPanel07;
    }

    public void setjPanel07(JPanel jPanel07) {
        this.jPanel07 = jPanel07;
    }

    public JPanel getjPanel08() {
        return jPanel08;
    }

    public void setjPanel08(JPanel jPanel08) {
        this.jPanel08 = jPanel08;
    }

    public JPanel getjPanel09() {
        return jPanel09;
    }

    public void setjPanel09(JPanel jPanel09) {
        this.jPanel09 = jPanel09;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelSalon1 = new javax.swing.JLabel();
        jLabelSalon2 = new javax.swing.JLabel();
        jLabelSalon3 = new javax.swing.JLabel();
        jLabelSalon4 = new javax.swing.JLabel();
        jComboBoxSalon = new javax.swing.JComboBox<>();
        jLabelFecha = new javax.swing.JLabel();
        jLabelViernes = new javax.swing.JLabel();
        jLabelViernes1 = new javax.swing.JLabel();
        jLabelViernes2 = new javax.swing.JLabel();
        jPanel01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel04 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel03 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel05 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel06 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel07 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel08 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel09 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel010 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel011 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel012 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel013 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel014 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel015 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel016 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel017 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel018 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel019 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel020 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel021 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel022 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel023 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel024 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel025 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel030 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel026 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel027 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel028 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel029 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel032 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel031 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

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

        jLabelFecha.setText("Fecha");

        jLabelViernes.setText("Viernes");

        jLabelViernes1.setText("Sábado");

        jLabelViernes2.setText("Domingo");

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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel09Layout = new javax.swing.GroupLayout(jPanel09);
        jPanel09.setLayout(jPanel09Layout);
        jPanel09Layout.setHorizontalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel09Layout.setVerticalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel010Layout = new javax.swing.GroupLayout(jPanel010);
        jPanel010.setLayout(jPanel010Layout);
        jPanel010Layout.setHorizontalGroup(
            jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel010Layout.setVerticalGroup(
            jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel010Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel011Layout = new javax.swing.GroupLayout(jPanel011);
        jPanel011.setLayout(jPanel011Layout);
        jPanel011Layout.setHorizontalGroup(
            jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel011Layout.setVerticalGroup(
            jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel011Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel013Layout = new javax.swing.GroupLayout(jPanel013);
        jPanel013.setLayout(jPanel013Layout);
        jPanel013Layout.setHorizontalGroup(
            jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel013Layout.setVerticalGroup(
            jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel014Layout = new javax.swing.GroupLayout(jPanel014);
        jPanel014.setLayout(jPanel014Layout);
        jPanel014Layout.setHorizontalGroup(
            jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel014Layout.setVerticalGroup(
            jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel014Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel015Layout = new javax.swing.GroupLayout(jPanel015);
        jPanel015.setLayout(jPanel015Layout);
        jPanel015Layout.setHorizontalGroup(
            jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel015Layout.setVerticalGroup(
            jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel015Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel017Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel018Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel019Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel020Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel021Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel030Layout = new javax.swing.GroupLayout(jPanel030);
        jPanel030.setLayout(jPanel030Layout);
        jPanel030Layout.setHorizontalGroup(
            jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel030Layout.setVerticalGroup(
            jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel030Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel026Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel027Layout = new javax.swing.GroupLayout(jPanel027);
        jPanel027.setLayout(jPanel027Layout);
        jPanel027Layout.setHorizontalGroup(
            jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel027Layout.setVerticalGroup(
            jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel027Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel032Layout = new javax.swing.GroupLayout(jPanel032);
        jPanel032.setLayout(jPanel032Layout);
        jPanel032Layout.setHorizontalGroup(
            jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel032Layout.setVerticalGroup(
            jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel032Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel031Layout = new javax.swing.GroupLayout(jPanel031);
        jPanel031.setLayout(jPanel031Layout);
        jPanel031Layout.setHorizontalGroup(
            jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );
        jPanel031Layout.setVerticalGroup(
            jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel031Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabelViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel04, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel06, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel07, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel08, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel010, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel011, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel013, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel014, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel015, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel016, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel027, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel022, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel030, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel023, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel031, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel024, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel032, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel020, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel028, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel026, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel029, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelViernes1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelViernes2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel025, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSalon1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSalon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSalon4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSalon2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSalon1)
                            .addComponent(jLabelSalon2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSalon3)
                                    .addComponent(jLabelSalon4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelFecha)
                                    .addComponent(jLabelViernes)
                                    .addComponent(jLabelViernes1)
                                    .addComponent(jLabelViernes2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel017, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel025, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel010, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel018, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel026, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel011, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel019, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel027, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jPanel04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPanel020, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPanel028, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jPanel05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPanel013, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPanel021, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPanel029, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jPanel012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jPanel06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jPanel022, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel030, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jPanel014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel031, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel023, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanel015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel032, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel024, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSalonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSalonItemStateChanged
        // modeloProximas.refreshTableModel(hotel, jComboBoxSalon.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxSalonItemStateChanged

    private void jComboBoxSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalonActionPerformed
        //refreshTableModel(hotel, jComboBoxSalon.getSelectedIndex()+1);
    }//GEN-LAST:event_jComboBoxSalonActionPerformed

    private void jComboBoxSalonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxSalonPropertyChange

    }//GEN-LAST:event_jComboBoxSalonPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

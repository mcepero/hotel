/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Manuel
 */
public class MiImagenPanel extends javax.swing.JPanel {

    /**
     * Creates new form MiImagenPanel
     */
    private Image _imagen;

    public MiImagenPanel() {
       try {                
          _imagen = ImageIO.read(getClass().
                                    getResource("/hotel105/imagenes/lupa.png")); 
       } catch (IOException ex) { }
    }

     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(_imagen, 0, 0, 20, 20, null);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

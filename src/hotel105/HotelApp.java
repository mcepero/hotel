/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105;

import hotel105.modelo.ManejoDB;
import hotel105.vista.ErrorBD;
import hotel105.vista.VentanaPrincipal;

/**
 *
 * @author Manuel
 */
public class HotelApp {
    public static void main(String[] args) {
        try{
            VentanaPrincipal m = new VentanaPrincipal();
            m.setVisible(true);
        }catch(NullPointerException npe){
            npe.getMessage();
        }
    }
}

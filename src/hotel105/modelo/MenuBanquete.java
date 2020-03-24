/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.modelo;

/**
 *
 * @author Manuel
 */
public class MenuBanquete {
    private int idEvento;
    private Plato primero;
    private Plato segundo;

    public MenuBanquete(int idEvento, Plato primero, Plato segundo) {
        this.idEvento=idEvento;
        this.primero = primero;
        this.segundo = segundo;
    }

    public Plato getPrimero() {
        return primero;
    }

    public void setPrimero(Plato primero) {
        this.primero = primero;
    }

    public Plato getSegundo() {
        return segundo;
    }

    public void setSegundo(Plato segundo) {
        this.segundo = segundo;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
}

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
public class HabitacionCongreso {
    int idEvento;
    private int numeroHab;
    private TipoHabitaciones tipo;
    

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public TipoHabitaciones getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitaciones tipo) {
        this.tipo = tipo;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public HabitacionCongreso(int idEvento, int numeroHab, TipoHabitaciones tipo) {
        this.numeroHab = numeroHab;
        this.tipo=tipo;
        this.idEvento=idEvento;
    }
    
    
}

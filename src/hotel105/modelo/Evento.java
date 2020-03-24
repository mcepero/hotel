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
public class Evento {
    private int numeroDias;
    private int id;
    private String nombre;
    //private MenuBanquete menuBanquete;
    //private HabitacionCongreso habitacionCongreso;
    private TipoEvento tipoEvento;
    private int asistentes;
    public Evento(int id, int numeroDias, String nombre, /*MenuBanquete menuBanquete, HabitacionCongreso habitacionCongreso,*/ TipoEvento tipoEvento, int asistentes) {
        this.numeroDias = numeroDias;
        this.id = id;
        this.nombre = nombre;
       /* this.menuBanquete = menuBanquete;
        this.habitacionCongreso = habitacionCongreso;*/
        this.tipoEvento=tipoEvento;
        this.asistentes=asistentes;
    }
    
    public Evento(int id, String nombre, TipoEvento tipo, int asistentes, int numeroDias) {
        this.numeroDias = numeroDias;
        this.id = id;
        this.nombre = nombre;
        this.asistentes=asistentes;
        this.tipoEvento=tipo;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /* public MenuBanquete getMenuBanquete() {
        return menuBanquete;
    }

    public void setMenuBanquete(MenuBanquete menuBanquete) {
        this.menuBanquete = menuBanquete;
    }

    public HabitacionCongreso getHabitacionCongreso() {
        return habitacionCongreso;
    }

    public void setHabitacionCongreso(HabitacionCongreso habitacionCongreso) {
        this.habitacionCongreso = habitacionCongreso;
    }*/

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
    
    
    
}

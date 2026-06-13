/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elias
 */
public class Armadura {
    private int duracion;
    private List<PiezaArmadura> piezas;

    public Armadura(int duracion) {
        this.duracion = duracion;
        this.piezas = new ArrayList<>();
    }

    public void equiparPieza(PiezaArmadura p) {
        piezas.add(p);
        System.out.println("Pieza de tipo " + p.getTipo() + " equipada.");
    }

    public void sustituirPieza(PiezaArmadura p) {
        piezas.removeIf(pieza -> pieza.getTipo().equals(p.getTipo()));
        piezas.add(p);
        System.out.println("Pieza sustituida por: " + p.getTipo());
    }

    public void romperse() {
        this.duracion = 0;
        piezas.clear();
        System.out.println("La armadura se ha roto. Todas las piezas han sido destruidas.");
    }

    public List<PiezaArmadura> getPiezas() {
        return piezas;
    }
}

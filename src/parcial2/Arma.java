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
public class Arma extends ObjetoMovil {
    private int potencia;
    private int cadenciaDisparo;
    private int velocidadDisparo;
    private int factorPotenciador;
    private int disparosRealizados;
    
    private List<Proyectil> proyectilesEquipados;

    public Arma(int x, int y, String nombre, int potencia, int cadenciaDisparo, int velocidadDisparo, int factorPotenciador) {
        super(x, y, nombre);
        this.potencia = potencia;
        this.cadenciaDisparo = cadenciaDisparo;
        this.velocidadDisparo = velocidadDisparo;
        this.factorPotenciador = factorPotenciador;
        this.disparosRealizados = 0;
        this.proyectilesEquipados = new ArrayList<>();
    }

    public void disparar() {
        if (disparosRealizados < 30) {
            disparosRealizados++;
            System.out.println("Disparo realizado. Total: " + disparosRealizados);
            
            if (disparosRealizados == 30) {
                destruirse();
            }
        }
    }

    public void destruirse() {
        System.out.println("¡El arma se ha destruido!");
        desequiparProyectiles();
    }

    public void equiparProyectil(Proyectil p) {
        proyectilesEquipados.add(p);
        System.out.println("Proyectil de " + p.getTipo() + " equipado.");
    }

    public void desequiparProyectiles() {
        proyectilesEquipados.clear();
        System.out.println("Proyectiles desequipados y salvados.");
    }

    public int getDisparosRealizados(){
        return disparosRealizados; 
    }
    public List<Proyectil> getProyectilesEquipados(){
        return proyectilesEquipados; 
    }
}

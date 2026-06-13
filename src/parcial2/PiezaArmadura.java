/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class PiezaArmadura {
    private String tipo; // casco, bracero, cubre piernas
    private int resistencia;

    public PiezaArmadura(String tipo, int resistencia) {
        this.tipo = tipo;
        this.resistencia = resistencia;
    }

    public String getTipo(){ return tipo;
    }
    
    public int getResistencia(){
        return resistencia; 
    }
}
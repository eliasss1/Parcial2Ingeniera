/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Edificio extends ObjetoInmovil {
    private int vida;
    private int resistenciaDisparos;

    public Edificio(int x, int y, int vida, int resistenciaDisparos) {
        super(x, y);
        this.vida = vida;
        this.resistenciaDisparos = resistenciaDisparos;
    }

    public int getVida(){ 
        return vida; 
    }
    
    public void setVida(int vida){ 
        this.vida = vida; 
    }
    
    public int getResistenciaDisparos(){ 
        return resistenciaDisparos; 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public abstract class ObjetoMovil extends Objeto {
    protected String nombre;

    public ObjetoMovil(int x, int y, String nombre) {
        super(x, y);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

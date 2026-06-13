/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Comida extends ObjetoMovil {
    private int cantidadCuracion;
    private int usos;

    public Comida(int x, int y, String nombre, int cantidadCuracion, int usos) {
        super(x, y, nombre);
        this.cantidadCuracion = cantidadCuracion;
        this.usos = usos;
    }

    public boolean consumir() {
        if (usos > 0) {
            usos--;
            System.out.println("Consumiste " + this.nombre + ". Curacion: " + this.cantidadCuracion);
            return true;
        } else {
            System.out.println("La comida ya no tiene usos.");
            return false;
        }
    }

    public int getCantidadCuracion(){
        return cantidadCuracion;
    }

    public int getUsos(){
        return usos;
    }
}

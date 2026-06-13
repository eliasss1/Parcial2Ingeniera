/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Usuario {
    private String user;
    private int pass;

    public Usuario() {
    }

    public Usuario(String user, int pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean validarPassword(int contra) {
        return this.pass == contra;
    }

    public void cambioPassword(String newPass) {
        this.pass = Integer.parseInt(newPass);
        System.out.println("Nuevo Pass " + this.pass);
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean usuariosDiferentes(Usuario u2) {
        return !this.equals(u2);
    }

    public String getUser(){ 
        return user; 
    }
    
    public int getPass(){ 
        return pass; 
    }
}
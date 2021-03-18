/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.práctica.pkg1.sesión.pkg2;

/**
 *
 * @author Santiago Carbó García
 */
public abstract class Mascota {
    private String nombre;
    private int edad;
    
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}

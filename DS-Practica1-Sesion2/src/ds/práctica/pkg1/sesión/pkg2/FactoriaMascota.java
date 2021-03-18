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
public interface FactoriaMascota {
    public Perro nuevoPerro(String nombre, int edad);
    public Gato nuevoGato(String nombre, int edad);
    public Huron nuevoHuron(String nombre, int edad);
}

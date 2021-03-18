/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.práctica.pkg1.sesión.pkg2;

/**
 *
 * @author santi
 */
public class CreadorGato implements CreadorMascota{
    
    @Override
    public Mascota crearMascota(String nombre, int edad){
        return new Gato(nombre, edad);
    }
}

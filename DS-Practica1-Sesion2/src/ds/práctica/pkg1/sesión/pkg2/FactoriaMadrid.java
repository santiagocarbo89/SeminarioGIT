/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.práctica.pkg1.sesión.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Santiago Carbó García
 */
public class FactoriaMadrid implements FactoriaMascota{
    
    
    @Override
    public Perro nuevoPerro(String nombre, int edad){
        CreadorMascota cm = new CreadorPerro();
        return (Perro) cm.crearMascota(nombre, edad);
    }
    
    @Override
    public Gato nuevoGato(String nombre, int edad){
        CreadorMascota cm = new CreadorGato();
        return (Gato) cm.crearMascota(nombre, edad);
    }
    
    @Override
    public Huron nuevoHuron(String nombre, int edad){
        CreadorMascota cm = new CreadorHuron();
        return (Huron) cm.crearMascota(nombre, edad);
    }
}

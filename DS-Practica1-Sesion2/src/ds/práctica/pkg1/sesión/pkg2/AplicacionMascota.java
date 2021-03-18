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
public class AplicacionMascota {
    private FactoriaMadrid fm;
    private FactoriaAndalucia fa;
    private FactoriaValencia fv;
    private ArrayList<Mascota> animalesMadrid;
    private ArrayList<Mascota> animalesAndalucia;
    private ArrayList<Mascota> animalesValencia;
    
    public AplicacionMascota(){
        animalesMadrid = new ArrayList<>();
        animalesAndalucia = new ArrayList<>();
        animalesValencia = new ArrayList<>();
        fm = new FactoriaMadrid();
        fa = new FactoriaAndalucia();
        fv = new FactoriaValencia();
    }
    
    public void nuevoPerroMadrid(String nombre, int edad){
        animalesMadrid.add(fm.nuevoPerro(nombre, edad));
    }
    
    public void nuevoGatoMadrid(String nombre, int edad){
        animalesMadrid.add(fm.nuevoGato(nombre, edad));
    }
    
    public void nuevoHuronMadrid(String nombre, int edad){
        animalesMadrid.add(fm.nuevoHuron(nombre, edad));
    }
    
    public void nuevoPerroAndalucia(String nombre, int edad){
        animalesAndalucia.add(fa.nuevoPerro(nombre, edad));
    }
    
    public void nuevoGatoAndalucia(String nombre, int edad){
        animalesAndalucia.add(fa.nuevoGato(nombre, edad));
    }
    
    public void nuevoHuronAndalucia(String nombre, int edad){
        animalesAndalucia.add(fa.nuevoHuron(nombre, edad));
    }
    
    public void nuevoPerroValencia(String nombre, int edad){
        animalesValencia.add(fv.nuevoPerro(nombre, edad));
    }
    
    public void nuevoGatoValencia(String nombre, int edad){
        animalesValencia.add(fv.nuevoGato(nombre, edad));
    }
    
    public void nuevoHuronValencia(String nombre, int edad){
        animalesValencia.add(fv.nuevoHuron(nombre, edad));
    }
}

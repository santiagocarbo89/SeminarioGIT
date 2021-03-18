package ds.práctica.pkg1.sesión.pkg2;

/**
 *
 * @author Santiago Carbó García
 */
public class Controlador {
    private AplicacionMascota aplicacionModel;
    private VistaTextual vista;

    Controlador(AplicacionMascota aplicacionModel, VistaTextual vista){
        this.aplicacionModel = aplicacionModel;
        this.vista = vista;
    }

    void iniciar(){
        vista.setModelo(aplicacionModel);
        boolean continuar_aplicacion = true;
        
        while(continuar_aplicacion){
            vista.pausa();
            
            vista.setFabrica();
            vista.setMascota();
            vista.setNombreYEdad();
            String nombre = vista.getNombre();
            int edad = vista.getEdad();
            
            switch(vista.getFabrica()){
                case 0: //Madrid
                    
                    switch(vista.getMascota()){
                        case 0: //Perro
                            aplicacionModel.nuevoPerroMadrid(nombre, edad);
                            break;
                        case 1: //Gato
                            aplicacionModel.nuevoGatoMadrid(nombre, edad);
                            break;
                        case 2: //Huron
                            aplicacionModel.nuevoHuronMadrid(nombre, edad);
                    }
                    
                    break;
                case 1: //Andalucia
                    
                    switch(vista.getMascota()){
                        case 0: //Perro
                            aplicacionModel.nuevoPerroAndalucia(nombre, edad);
                            break;
                        case 1: //Gato
                            aplicacionModel.nuevoGatoAndalucia(nombre, edad);
                            break;
                        case 2: //Huron
                            aplicacionModel.nuevoHuronAndalucia(nombre, edad);
                    }
                    
                    break;
                case 2: //Valencia
                    
                    switch(vista.getMascota()){
                        case 0: //Perro
                            aplicacionModel.nuevoPerroValencia(nombre, edad);
                            break;
                        case 1: //Gato
                            aplicacionModel.nuevoGatoValencia(nombre, edad);
                            break;
                        case 2: //Huron
                            aplicacionModel.nuevoHuronValencia(nombre, edad);
                    }
            }
        } 

        
    }
}

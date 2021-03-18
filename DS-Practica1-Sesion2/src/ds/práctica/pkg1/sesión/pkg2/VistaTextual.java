package ds.práctica.pkg1.sesión.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class VistaTextual {
  
  AplicacionMascota aplicacionModel; 
  int iFabrica = -1;
  int iMascota = -1;
  String iNombre = "";
  int iEdad = -1;
  private static String separador = "=====================";
  private Scanner in;
  
  VistaTextual () {
    in = new Scanner (System.in);
  }

  void actualizarVista(){
    System.out.println ();
  }

  void setFabrica() {
    iFabrica = menu("¿En qué comunidad desea registrar su mascota?", new ArrayList<>(Arrays.asList("Madrid", "Andalucia", "Valencia")));
  }
  
  void setMascota() {
    iMascota = menu("¿Qué mascota desea registrar?", new ArrayList<>(Arrays.asList("Perro", "Gato", "Huron")));
  }
  
  void setNombreYEdad() {
    System.out.println("¿Cuál es el nombre del animal?: ");
    iNombre = in.nextLine();
    System.out.println("¿Cuál es la edad del animal?: ");
    iEdad = in.nextInt();
  }

  public int getFabrica(){
    return iFabrica;
  }
  
  public int getMascota(){
    return iMascota;
  }
  
  public String getNombre(){
    return iNombre;
  }
  
  public int getEdad(){
    return iEdad;
  }

  int leeEntero (int max, String msg1, String msg2) {
    Boolean ok;
    String cadena;
    int numero = -1;
    do {
      System.out.print (msg1);
      cadena = in.nextLine();
      try {  
        numero = Integer.parseInt(cadena);
        ok = true;
      } catch (NumberFormatException e) { // No se ha introducido un entero
        System.out.println (msg2);
        ok = false;  
      }
      if (ok && (numero < 0 || numero >= max)) {
        System.out.println (msg2);
        ok = false;
      }
    } while (!ok);

    return numero;
  }

  int menu (String titulo, ArrayList<String> lista) {
    String tab = "  ";
    int opcion;
    System.out.println (titulo);
    for (int i = 0; i < lista.size(); i++) {
      System.out.println (tab+i+"-"+lista.get(i));
    }

    opcion = leeEntero(lista.size(),
                          "\n"+tab+"Elige una opción: ",
                          tab+"Valor erróneo");
    return opcion;
  }
  
              
  void pausa() {
    System.out.print ("Pulsa una tecla");
    in.nextLine();
  }

  public void setModelo(AplicacionMascota aplicacionModel){ 
        this.aplicacionModel = aplicacionModel;
  } 
}

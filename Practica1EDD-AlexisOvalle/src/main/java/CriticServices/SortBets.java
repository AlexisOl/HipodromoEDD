/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CriticServices;

import javax.swing.JTextArea;
import objects.Apuesta;

/**
 *
 * @author alexis
 */
public class SortBets {
    
  
      public void ordenNombre(Apuesta[] apuestasOrden, JTextArea textArea){
        textArea.setText(null);
        //ordenamiento burbuja
        for (int i = 0; i < apuestasOrden.length; i++) {
            for (int j = 0; j < apuestasOrden.length - 1; j++) {
                //comparacion entre valor actual y siguiente
                if (apuestasOrden[j].getNombre().compareTo(apuestasOrden[j + 1].getNombre()) > 0) {
                    Apuesta apuestaAuxiliar;
                    
                    //ordenamiento burbuja
                    apuestaAuxiliar = apuestasOrden[j];
                    apuestasOrden[j] = apuestasOrden[j + 1];
                    apuestasOrden[j + 1] = apuestaAuxiliar;
                }
            }
        }
        
                //impresion
        for (int i = 0; i < apuestasOrden.length; i++) {
            if (apuestasOrden[i].getValida()== true) {
                String texto = "";
                texto = apuestasOrden[i].getNombre() + " Punteo: " + apuestasOrden[i].getPunteo();
                textArea.append(texto+"\n");
            }
        }
    }
      
      
    public void ordenamientoPunteo(Apuesta[] apuestasOrden, JTextArea textArea){
        textArea.setText(null);
        int posicion;
        //variables auxiliares
        Apuesta inicial = new Apuesta();
        Apuesta auxiliar = new Apuesta();

        for (int i = 0; i < apuestasOrden.length; i++) {
            inicial = apuestasOrden[i];
            posicion = i;
            for (int j = i + 1; j < apuestasOrden.length; j++) {
                if (apuestasOrden[j].getPunteo() < inicial.getPunteo()) {
                    inicial = apuestasOrden[j];
                    posicion = j;
                }
            }
            //ordenamiento burbuja
            if (posicion != i) {
                auxiliar = apuestasOrden[i];
                apuestasOrden[i] = apuestasOrden[posicion];
                apuestasOrden[posicion] = auxiliar;
            }
        }
        
        //impresion
        for (int i = apuestasOrden.length - 1; i >= 0; i--) {
            if (apuestasOrden[i].getValida()== true) {
                String texto = "";
                texto = apuestasOrden[i].getNombre() 
                        + " Valor total: "
                        + apuestasOrden[i].getPunteo();
                textArea.append(texto+"\n");
            }
        }
    }
}

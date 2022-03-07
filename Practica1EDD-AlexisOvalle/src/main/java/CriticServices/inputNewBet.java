/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CriticServices;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import objects.Apuesta;

/**
 *
 * @author alexis
 */
public class inputNewBet {
    // metodo para ingresar nuevas apuestas 
    
    
    
    public void ingresoApuesta(int[] orden, String nombre, double monto) {
        // creacion de una nueva apuesta
        //Apuesta crearApuesta = new Apuesta(monto, orden, nombre, true);
    }
    public void ingresoApuestaOrden(String texto, String textoNombre, String textoMonto, JTextArea textArea){
 
       try {
                 String[] datos = texto.split(",");
                 
       String textoGeneral = "";
                String nombre = textoNombre;
                                 // ingreso de nuevas apuestas en base al texto

                double monto = Double.parseDouble(textoMonto);
                    textoGeneral = textoGeneral + nombre + ",";
                  textoGeneral = textoGeneral + monto + ",";
                  textoGeneral = textoGeneral   + datos[0] + ",";
                  textoGeneral = textoGeneral   + datos[1] + ",";
                  textoGeneral = textoGeneral   + datos[2] + ",";
                  textoGeneral = textoGeneral   + datos[3] + ",";
                  textoGeneral = textoGeneral   + datos[4] + ",";
                  textoGeneral = textoGeneral   + datos[5] + ",";
                  textoGeneral = textoGeneral   + datos[6] + ",";
                  textoGeneral = textoGeneral   + datos[7] + ",";
                  textoGeneral = textoGeneral   + datos[8] + ",";
                  textoGeneral = textoGeneral   + datos[9] + ",";
                  textArea.append(textoGeneral+"\n");

       } catch(Exception e){
           JOptionPane.showConfirmDialog(null, e+"Error");
       }
    }
}

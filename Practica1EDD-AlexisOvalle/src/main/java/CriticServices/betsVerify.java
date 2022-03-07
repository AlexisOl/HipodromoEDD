/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CriticServices;

import Archive.WriteArchive;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import objects.Apuesta;

/**
 *
 * @author alexis
 */
public class betsVerify {

    private int CantidadErrores;
// verifica la cantidad de repetidos segun las apuestas y si hay tira error
    public void verificar( Apuesta[] apuestas) {
       
        for (int i = 0; i < apuestas.length; i++) {
            
             int[] numeros = apuestas[i].getApuestaCaballosOrden();
            if (repetidos(numeros) == true) {
                apuestas[i].setValida(false);
            } else {
                apuestas[i].setValida(true);
            }
        }

        setErrores(apuestas);

    }

  
// determina si hay repetidos

    public boolean repetidos(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    return true;
                }
            }
        }
        return false;
    }




    public void setErrores(Apuesta[] apuestasVerificar) {
        CantidadErrores = 0;
        String text = "";
        for (int i = 0; i < apuestasVerificar.length; i++) {
            if (apuestasVerificar[i].getValida() == false) {
                CantidadErrores++;
                text = "Error: " + i + 1 + apuestasVerificar[i].getNombre();

            }
        }
        
        // creacion de archivo
        if (CantidadErrores > 0) {
            int opcionExportar = JOptionPane.showConfirmDialog(null, "quiere exportar los errores");
            if (opcionExportar == JOptionPane.YES_OPTION) {
                try {
                    FileWriter escribir;
                    PrintWriter linea;
                    JFileChooser seleccionar = new JFileChooser();
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
                    seleccionar.setAcceptAllFileFilterUsed(false);
                    seleccionar.addChoosableFileFilter(filtro);
                    File fichero;
                    int Guardar = seleccionar.showDialog(null, "Guardar");
                    if (Guardar == JFileChooser.APPROVE_OPTION) {
                        fichero = seleccionar.getSelectedFile();
                        if (fichero.exists()) {
                            int opcion = JOptionPane.showConfirmDialog(null, "Deseas sobrescribir");
                            if (opcion == JOptionPane.YES_OPTION) {
                                fichero.createNewFile();
                                escribir = new FileWriter(fichero, false);
                                escribir.write(text);
                                escribir.close();
                                JOptionPane.showMessageDialog(null, "Reporte de errores Exportado");
                            } else {
                                JOptionPane.showMessageDialog(null, "No se guardo el archivo");
                            }
                        } else {
                            fichero.createNewFile();
                            escribir = new FileWriter(fichero, false);
                            escribir.write(text);
                            escribir.close();
                            JOptionPane.showMessageDialog(null, "Reporte de errores Exportado");
                        }
                    } 
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen errores");
        }

    }
}

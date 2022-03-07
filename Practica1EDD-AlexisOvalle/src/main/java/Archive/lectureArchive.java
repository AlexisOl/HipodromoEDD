/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JTextArea;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alexis
 */
public class lectureArchive {

    // Carga del archivo al jtextarea
    public void cargaArchivo(File file, JTextArea textArea) throws IOException, FileNotFoundException {
        FileReader reader = new FileReader(file);
        BufferedReader bf = new BufferedReader(reader);
        String line;

        while ((line = bf.readLine()) != null) {
            textArea.append(line + "\n");
        }

    }

    public String[] obtencionLineas(String textArea) {
        // del texto en cuestion, obtiene los textos, separados por lineas
        String[] datosLineas = textArea.split("\n");

        return datosLineas;
    }

    public String[] generacionDeDatos(String texto) {
        //Genera un split para partir el texto de entrada, cada vez que viene una coma
        String[] datosFinales;
        datosFinales = texto.split(",");
        // retorna el valor del metodo
        
        return datosFinales;
    }

    public void ingresoApuesta(int[] ordenApuesta) {

    }
}

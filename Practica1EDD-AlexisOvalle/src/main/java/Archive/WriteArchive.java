/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author alexis
 */
public class WriteArchive {
        public void WriteArchive(JTextArea textarea, File file) throws IOException {
       File files = file;
       
       if (files.createNewFile()) {
       } else {
           files.delete();
           files.createNewFile();
       }
       String data = textarea.getText();
       FileWriter writer = new FileWriter(files, false);
       writer.write(data);
       writer.close();
    }
        public void WriteArchiveError(String text, File file) throws IOException {
       File files = file;
       
       if (files.createNewFile()) {
       } else {
           files.delete();
           files.createNewFile();
       }
       String data = text;
       FileWriter writer = new FileWriter(files, false);
       writer.write(data);
       writer.close();
    }
}

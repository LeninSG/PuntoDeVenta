/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import personas.*;

/**
 *
 * @author Javier
 */
public class EscribirArchivo {
    public static void escribirUsuarios(ArrayList<Usuario> arr) {
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter("users.txt"));
            for (Usuario u: arr)
            {
                salida.println(u.toString());
            }
            /*salida.close();
            salida = new PrintWriter(new FileWriter("datos.txt",true));
            for(int i=0; i<10; i++) {
                salida.println( (int)(Math.random()*100)+1 );
            }*/
        }
        catch (IOException ex) {
            System.out.println("Error al escribir en el archivo" + ex);
        } finally {
            salida.close();
        }
    }
    public static boolean addUser(Usuario u)
    {
        ArrayList<Usuario> arr = AbrirArchivo.abrirArchivoUsuarios();
        arr.add(u);
        escribirUsuarios(arr);
        return true;
    }
    
}

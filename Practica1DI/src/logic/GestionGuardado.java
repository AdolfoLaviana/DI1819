/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.openide.util.Exceptions;

/**
 *
 * @author adolfolaviana
 */
public class GestionGuardado implements Serializable {

    private static final GestionGuardado INSTANCIA = new GestionGuardado();

    private GestionGuardado() {
    }

    public GestionGuardado getInstancia() {
        return INSTANCIA;
    }

    public static void salvarCambios() {
        ObjectOutputStream oos = null;
        try {
            File archivo = new File("LogicaAplicacion.dat");
            oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(LogicaAplicacion.getInstance());
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    public static LogicaAplicacion cargarInstancia() {
        File archivo = new File("LogicaAplicacion.dat");
        LogicaAplicacion la = null;
        if (archivo.exists())
        {
            try{
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));

              la =(LogicaAplicacion) ois.readObject();
            } catch (FileNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            } catch (ClassNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        else
            la = new LogicaAplicacion();
        
        return la;

    }

}

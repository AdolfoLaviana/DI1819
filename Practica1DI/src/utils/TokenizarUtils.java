package utils;

import beans.Carrera;
import beans.Corredor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import logic.LogicaAplicacion;


public class TokenizarUtils {

    BufferedReader bufferedReader = null;
    String line = null;
    logic.LogicaAplicacion la;

    //Variables corredor
    private String nombre;
    private String dni;
    private String direccion;
    private String tlfno;
    private String fechaNac;
    private Date fechaFinalCorredor;

    //Variables carrera
    private String nombreCarrera;
    private String lugarCarrera;
    private String fechaCarrera;
    private Date fechaFinalCarrera;
    private int numMaximoCorredores;
   
    
    
    
    
    public TokenizarUtils(logic.LogicaAplicacion la) {
        this.la = LogicaAplicacion.getInstance();
    }

    public void leerCSVcorredor() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("csvs/corredores.csv");
        bufferedReader = new BufferedReader(new InputStreamReader(is));

        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] trozos = line.split(",");
                nombre = trozos[0];
                dni = trozos[1];
                direccion = trozos[2];
                tlfno = trozos[3];
                fechaNac = trozos[4];
                fechaFinalCorredor = FechaUtils.pasarStringADate(fechaNac);
                Corredor corredor = new Corredor(nombre, dni, direccion, tlfno, fechaFinalCorredor);
                la.darAltaCorredor(corredor);
            }

        } catch (IOException ex) {
            System.err.println("Error");
        }
    }
    
    public void leerCSVCarrera(){
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("csvs/carreras.csv");
        bufferedReader = new BufferedReader(new InputStreamReader(is));
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] trozos = line.split(",");
                nombreCarrera = trozos[0];
                lugarCarrera = trozos[1];
                fechaCarrera = trozos[2];
                fechaFinalCarrera = FechaUtils.pasarStringADate(fechaCarrera);
                numMaximoCorredores = Integer.parseInt(trozos[3]);
                Carrera carrera = new Carrera(nombreCarrera,lugarCarrera,fechaFinalCarrera,numMaximoCorredores);
                la.darAltaCarrera(carrera);
            }

        } catch (IOException ex) {
            System.err.println("Error");
        }
    }
}

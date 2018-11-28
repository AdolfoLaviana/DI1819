package logic;

import beans.Carrera;
import beans.Corredor;
import beans.CorredoresYDorsal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class LogicaAplicacion implements Serializable {

    private List<Corredor> listaDeCorredores;
    private List<Carrera> listaDeCarreras;
    private List<Carrera> listaCarrerasFinalizadas;
    private List<CorredoresYDorsal> listaCorredoresDorsal;
    private CorredoresYDorsal corredorYdorsal;
    private static LogicaAplicacion INSTANCIA = GestionGuardado.cargarInstancia();
    private transient Timer timer;

    LogicaAplicacion() {
        listaDeCorredores = new ArrayList<>();
        listaDeCarreras = new ArrayList<>();
        listaCarrerasFinalizadas = new ArrayList<>();
        listaCorredoresDorsal = new ArrayList<>();
    }

    public static LogicaAplicacion getInstance() {

        if (INSTANCIA != null) {
            return INSTANCIA;
        }
        LogicaAplicacion la = new LogicaAplicacion();
        return la;
    }

    public List<Corredor> getListaDeCorredores() {
        return listaDeCorredores;
    }

    public void setListaDeCorredores(List<Corredor> listaDeCorredores) {
        this.listaDeCorredores = listaDeCorredores;
    }

    public List<Carrera> getListaDeCarreras() {
        return listaDeCarreras;
    }

    public void setListaDeCarreras(List<Carrera> listaDeCarreras) {
        this.listaDeCarreras = listaDeCarreras;
    }

    public void darAltaCorredor(Corredor corredor) {
        listaDeCorredores.add(corredor);
    }

    public List<Carrera> getListaCarrerasFinalizadas() {
        return listaCarrerasFinalizadas;
    }

    public void setListaCarrerasFinalizadas(List<Carrera> listaCarrerasFinalizadas) {
        this.listaCarrerasFinalizadas = listaCarrerasFinalizadas;
    }

    public List<CorredoresYDorsal> getListaCorredoresDorsal() {
        return listaCorredoresDorsal;
    }

    public void setListaCorredoresDorsal(List<CorredoresYDorsal> listaCorredoresDorsal) {
        this.listaCorredoresDorsal = listaCorredoresDorsal;
    }

    public void darBajaCorredor(String dni) {
        //Iterator iterator = listaDeCorredores.iterator();

        for (Iterator<Corredor> iterator = listaDeCorredores.iterator(); iterator.hasNext();) {
            Corredor next = iterator.next();
            if (next.getDni().equals(dni)) {
                iterator.remove();
            }
        }
    }

    public void modificarCorredor(String dni, Corredor corredor) {

        for (int i = 0; i < listaDeCorredores.size(); i++) {
            if (listaDeCorredores.get(i).getDni().equals(dni)) {
                listaDeCorredores.get(i).setNombre(corredor.getNombre());
                listaDeCorredores.get(i).setDni(corredor.getDni());
                listaDeCorredores.get(i).setDireccion(corredor.getDireccion());
                listaDeCorredores.get(i).setFechaNac(corredor.getFechaNac());
                listaDeCorredores.get(i).setTlfn(corredor.getTlfn());
            }
        }
    }

    public void darAltaCarrera(Carrera carrera) {
        listaDeCarreras.add(carrera);
    }

    public void darBajaCarrera(String nombre) {
        /*
        for(Iterator<Carrera> iterator = listaDeCarreras.iterator();iterator.hasNext();){
            Carrera next = iterator.next();
            if(next.getNombreCarrera().equals(nombre));
            listaDeCarreras.remove(next);
        }
         */

        Iterator<Carrera> iterator = listaDeCarreras.iterator();

        while (iterator.hasNext()) {
            Carrera carrera = (Carrera) iterator.next();
            if (carrera.getNombreCarrera().equals(nombre)) {
                iterator.remove();
            }

        }

    }

    public void modificarCarrera(String nombre, Carrera carrera) {
        for (int i = 0; i < listaDeCarreras.size(); i++) {
            if (listaDeCarreras.get(i).getNombreCarrera().equals(nombre)) {
                listaDeCarreras.get(i).setNombreCarrera(carrera.getNombreCarrera());
                listaDeCarreras.get(i).setFechaCarrera(carrera.getFechaCarrera());
                listaDeCarreras.get(i).setLugarCarrera(carrera.getLugarCarrera());
                listaDeCarreras.get(i).setNumMaxCorredores(carrera.getNumMaxCorredores());

            }
        }
    }

    public void darAltaCarreraFinalizada(Carrera carrera) {
        listaCarrerasFinalizadas.add(carrera);
    }

    public void finalizarCarrera(Carrera carrera) {
        listaCarrerasFinalizadas.add(carrera);
    }

    /**
     * alta Corredor y Dorsal
     *
     * @param carrera
     * @param corredor
     * @param dorsal
     */
    public void altaCorredorDorsal(Carrera carrera, Corredor corredor, int dorsal) {

        corredorYdorsal = new CorredoresYDorsal(corredor, dorsal);
        carrera.getListaCorredoresYDorsal().add(corredorYdorsal);
    }

    /**
     * recoger Datos Dar Alta Corredor Dorsal
     *
     * @param index
     * @param carrera
     */
    public boolean recogerDatosDarAltaCorredorDorsal(int index, Carrera carrera) {

        if (carrera.getNumMaxCorredores() > carrera.getListaCorredoresYDorsal().size()) {
            int contador;
            Corredor c = this.getListaDeCorredores().get(index);

            contador = carrera.getListaCorredoresYDorsal().size() + 1;
            this.altaCorredorDorsal(carrera, c, contador);
            return true;
        }
        return false;
    }

    public void iniciarGuardadoAutomatico(long tiempoActualizacionAutomatica) {

        if (timer == null) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    GestionGuardado.salvarCambios();
                    
                }
            }, tiempoActualizacionAutomatica);
            
        } else if (timer != null) {
            timer.cancel();
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    GestionGuardado.salvarCambios();
                }
            }, tiempoActualizacionAutomatica);

        }

    }

}

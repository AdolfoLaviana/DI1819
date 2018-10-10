package logic;

import beans.Carrera;
import beans.Corredor;
import beans.CorredoresYDorsal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogicaAplicacion {

    private List<Corredor> listaDeCorredores;
    private List<Carrera> listaDeCarreras;
    private List<Carrera> listaCarrerasFinalizadas;
    private List<CorredoresYDorsal> listaCorredoresDorsal;
    private CorredoresYDorsal corredorYdorsal;

    public LogicaAplicacion() {
        listaDeCorredores = new ArrayList<>();
        listaDeCarreras = new ArrayList<>();
        listaCarrerasFinalizadas = new ArrayList<>();
        listaCorredoresDorsal = new ArrayList<>();
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

    public void modificarCorredor(String nombre, Corredor corredor) {

        for (int i = 0; i < listaDeCorredores.size(); i++) {
            if (listaDeCorredores.get(i).getNombre().equals(nombre)) {
                listaDeCorredores.get(i).setNombre(corredor.getNombre());
                listaDeCorredores.get(i).setDni(corredor.getDni());
                listaDeCorredores.get(i).setDni(corredor.getDni());
                listaDeCorredores.get(i).setFechaNac(corredor.getFechaNac());
                listaDeCorredores.get(i).setTlfn(corredor.getTlfn());
            }
        }
    }

    public void darAltaCarrera(Carrera carrera) {
        listaDeCarreras.add(carrera);
    }

    public void darBajaCarrera(String nombre) {

        Iterator iterator = listaDeCarreras.iterator();

        while (iterator.hasNext()) {
            Carrera carrera = (Carrera) iterator.next();
            if (carrera.getNombreCarrera().equals(nombre)) {
                listaDeCarreras.remove(carrera);
            }b

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
    public void darAltaCarreraFinalizada(Carrera carrera){
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
    public void recogerDatosDarAltaCorredorDorsal(int index, Carrera carrera) {
        int contador;
        Corredor c = this.getListaDeCorredores().get(index);

        contador = carrera.getListaCorredoresYDorsal().size() + 1;
        this.altaCorredorDorsal(carrera, c, contador);
    }
}

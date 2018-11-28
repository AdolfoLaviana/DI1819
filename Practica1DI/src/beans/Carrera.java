package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dstarsln
 */
public class Carrera implements Serializable{

    private String nombreCarrera, lugarCarrera;
    private Date fechaCarrera;
    private int numMaxCorredores;
    private List<CorredoresYDorsal> listaCorredoresYDorsal;
    private List<CorredoresTiempos> listaTiempos;

    public Carrera(String nombreCarrera, String lugarCarrera, Date fechaCarrera, int numMaxCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.lugarCarrera = lugarCarrera;
        this.fechaCarrera = fechaCarrera;
        this.numMaxCorredores = numMaxCorredores;
        listaCorredoresYDorsal = new ArrayList<>();
        listaTiempos = new ArrayList<>();
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getLugarCarrera() {
        return lugarCarrera;
    }

    public void setLugarCarrera(String lugarCarrera) {
        this.lugarCarrera = lugarCarrera;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public int getNumMaxCorredores() {
        return numMaxCorredores;
    }

    public void setNumMaxCorredores(int numMaxCorredores) {
        this.numMaxCorredores = numMaxCorredores;
    }

    public List<CorredoresYDorsal> getListaCorredoresYDorsal() {
        return listaCorredoresYDorsal;
    }

    public void setListaCorredoresYDorsal(List<CorredoresYDorsal> listaCorredoresYDorsal) {
        this.listaCorredoresYDorsal = listaCorredoresYDorsal;
    }

    public List<CorredoresTiempos> getListaTiempos() {
        return listaTiempos;
    }

    public void setListaTiempos(List<CorredoresTiempos> listaTiempos) {
        this.listaTiempos = listaTiempos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", lugarCarrera=" + lugarCarrera + ", fechaCarrera=" + fechaCarrera + ", numMaxCorredores=" + numMaxCorredores + ", listaCorredoresYDorsal=" + listaCorredoresYDorsal + ", listaTiempos=" + listaTiempos + '}';
    }

   

}

package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dstarsln
 */
public class Carrera {

    private String nombreCarrera, lugarCarrera;
    private Date fechaCarrera;
    private int numMaxCorredores;
    private List<CorredoresYDorsal> listaCorredoresYDorsal;
    private List<String> listaCorredoresSegunLlegada;

    public Carrera(String nombreCarrera, String lugarCarrera, Date fechaCarrera, int numMaxCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.lugarCarrera = lugarCarrera;
        this.fechaCarrera = fechaCarrera;
        this.numMaxCorredores = numMaxCorredores;
        listaCorredoresSegunLlegada = new ArrayList<>();
        listaCorredoresYDorsal = new ArrayList<>();
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

    public List<String> getListaCorredoresSegunLlegada() {
        return listaCorredoresSegunLlegada;
    }

    public void setListaCorredoresSegunLlegada(List<String> listaCorredoresSegunLlegada) {
        this.listaCorredoresSegunLlegada = listaCorredoresSegunLlegada;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", lugarCarrera=" + lugarCarrera + ", fechaCarrera=" + fechaCarrera + ", numMaxCorredores=" + numMaxCorredores + ", listaCorredoresYDorsal=" + listaCorredoresYDorsal + ", listaCorredoresSegunLlegada=" + listaCorredoresSegunLlegada + '}';
    }

}

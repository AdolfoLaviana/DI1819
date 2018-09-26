/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dstarsln
 */
public class Corredor {
    
    private String nombre,dni,direccion,tlfn;
    private Date fechaNac;

    public Corredor(String nombre, String dni, String direccion, String tlfn, Date fechaNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.tlfn = tlfn;
        this.fechaNac = fechaNac;
    }
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", tlfn=" + tlfn + ", fechaNac=" + fechaNac + '}';
    }
    
    

    
}

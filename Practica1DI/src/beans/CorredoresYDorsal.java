/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Objects;

/**
 *
 * @author dstarsln
 */
public class CorredoresYDorsal {
    private Corredor corredor;
    private int dorsal;


    public CorredoresYDorsal(Corredor corredor, int dorsal) {
        this.corredor = corredor;
        this.dorsal = dorsal;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "CorredoresYDorsal{" + "corredor=" + corredor + ", dorsal=" + dorsal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CorredoresYDorsal other = (CorredoresYDorsal) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if (!Objects.equals(this.corredor, other.corredor)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author adolfolaviana
 */
public class CorredoresTiempos {
    
    private CorredoresYDorsal corredorYDorsal;
    private long tiempo;

    public CorredoresTiempos() {
    }

    public CorredoresYDorsal getCorredorYDorsal() {
        return corredorYDorsal;
    }

    public void setCorredorYDorsal(CorredoresYDorsal corredorYDorsal) {
        this.corredorYDorsal = corredorYDorsal;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "CorredoresTiempos{" + "corredorYDorsal=" + corredorYDorsal + ", tiempo=" + tiempo + '}';
    }
    
    
}

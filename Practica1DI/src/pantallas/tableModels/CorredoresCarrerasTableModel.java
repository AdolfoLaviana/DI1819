/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.tableModels;

import beans.Corredor;
import java.util.HashMap;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dstarsln
 */
public class CorredoresCarrerasTableModel extends AbstractTableModel {

    private HashMap<Corredor, Integer> corredoresDorsal = new HashMap<>();
    private String[] columnas = {"Dni", "Dorsal"};

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }
    
    

    public CorredoresCarrerasTableModel(HashMap<Corredor, Integer> corredoresDorsal) {
        this.corredoresDorsal = corredoresDorsal;
    }

    @Override
    public int getRowCount() {
        return corredoresDorsal.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                Corredor corredor = (Corredor) corredoresDorsal.keySet().toArray()[rowIndex];
                
                return corredor.getDni();
            case 1:
                int dorsal;
                dorsal = (int) corredoresDorsal.values().toArray()[rowIndex];
                return String.valueOf(dorsal);
        }
        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.tableModels;

import beans.Corredor;
import beans.CorredoresYDorsal;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dstarsln
 */
public class CorredoresCarrerasTableModel extends AbstractTableModel {

    private ArrayList<CorredoresYDorsal> listaCorredoresDorsal;
    private String[] columnas = {"Dni", "Dorsal"};

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }

    public CorredoresCarrerasTableModel(ArrayList<CorredoresYDorsal> listaCorredoresDorsal) {
        this.listaCorredoresDorsal = listaCorredoresDorsal;
    }

    @Override
    public int getRowCount() {
        return listaCorredoresDorsal.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCorredoresDorsal.get(rowIndex).getCorredor().getDni();

            case 1:
                return String.valueOf(listaCorredoresDorsal.get(rowIndex).getDorsal());
        }
        return null;
    }

}

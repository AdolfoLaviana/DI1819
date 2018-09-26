/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.tableModels;

import beans.Corredor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dstarsln
 */
public class CorredoresTableModel extends AbstractTableModel {

    private List<Corredor> listaCorredores = new ArrayList<>();
    private String[] columnas = {"Nombre", "DNI", "Direccion", "Telefono", "fecha nacimiento"};

    public CorredoresTableModel(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;

    }

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }
    

    @Override
    public int getRowCount() {
        return listaCorredores.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
            case 2:
                return listaCorredores.get(rowIndex).getDireccion();
            case 3:
                return listaCorredores.get(rowIndex).getTlfn();
            case 4:
                return utils.FechaUtils.pasarDateAString(listaCorredores.get(rowIndex).getFechaNac());
            
                
        }
        return null;
    }

}

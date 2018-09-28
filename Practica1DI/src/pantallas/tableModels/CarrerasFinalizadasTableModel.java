/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.tableModels;

import beans.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dstarsln
 */
public class CarrerasFinalizadasTableModel extends AbstractTableModel {

    private List<Carrera> listaCarreras = new ArrayList<>();
    private String[] columnas = {"Nombre", "Lugar","Fecha Inicio" ,"Maximo corredores"};

    public CarrerasFinalizadasTableModel(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCarreras.get(rowIndex).getNombreCarrera();
            case 1:
                return listaCarreras.get(rowIndex).getLugarCarrera();
            case 2:
                return utils.FechaUtils.pasarDateAString(listaCarreras.get(rowIndex).getFechaCarrera());
            case 3:
                return listaCarreras.get(rowIndex).getNumMaxCorredores();
        }
        return null;
    }

}

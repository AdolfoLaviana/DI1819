/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.tableModels;

import beans.Carrera;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dstarsln
 */
public class CarrerasFinalizadasTableModel extends AbstractTableModel {

    private ArrayList<Carrera> listaCarrerasFinalizadas;
    private String[] columnas = {"Nombre", "Lugar","Fecha"};

    public CarrerasFinalizadasTableModel(ArrayList<Carrera>listaCarrerasFinalizadas) {
        this.listaCarrerasFinalizadas = listaCarrerasFinalizadas;
    }

    @Override
    public String getColumnName(int i) {
        return columnas[i];
    }

    @Override
    public int getRowCount() {
        return listaCarrerasFinalizadas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCarrerasFinalizadas.get(rowIndex).getNombreCarrera();
            case 1:
                return listaCarrerasFinalizadas.get(rowIndex).getLugarCarrera();
            case 2:
                return utils.FechaUtils.pasarDateAString(listaCarrerasFinalizadas.get(rowIndex).getFechaCarrera());

        }
        return null;
    }

}

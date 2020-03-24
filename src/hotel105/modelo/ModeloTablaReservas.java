/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.modelo;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel
 */
public class ModeloTablaReservas extends AbstractTableModel{

    String[] columnNames = {"ID", "Fecha","Nombre", "Tipo", "Salón", "Duración"};

    private Object[][] data = {};


    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col) {
        if ((col>=0) && (col<columnNames.length)) {
            return columnNames[col];
        } else {
            return "";
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
      return false;
    } 
    
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    } 
    
    public void refreshTableModel(Hotel h) {
        if(h==null)
            return;
        if (!h.getReservas().isEmpty()) {
            int numCol=columnNames.length+1;
            int numFilas=h.getReservas().size();
            data = new Object[numFilas][numCol];
            for(int f=0; f<numFilas; f++){   
                for (int i = 0; i < h.getEventos().size(); i++) {
                    if (h.getReservas().get(f).getIdEvento()==h.getEventos().get(i).getId()) {
                        data[f][0]=h.getReservas().get(f).getId();
                        data[f][1]=h.getReservas().get(f).getFecha();
                        data[f][2]=h.getEventos().get(i).getNombre();
                        data[f][3]=h.getReservas().get(f).getTipo();
                        data[f][4]=h.getReservas().get(f).getSalon();
                        data[f][5]=h.getEventos().get(i).getNumeroDias();
                    }
                }
            }
        }
        else{
            data = new Object[0][0];
        }
        fireTableDataChanged();
    }
    
}

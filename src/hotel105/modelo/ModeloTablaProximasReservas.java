/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel105.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import hotel105.modelo.Reserva;
import hotel105.modelo.Evento;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Manuel
 */
public class ModeloTablaProximasReservas extends AbstractTableModel{
        String[] columnNames = {"Fecha", "Viernes", "Sábado", "Domingo"};

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
    
    public void refreshTableModel(Hotel h, int salon) {
        if(h==null)
            return;
        if (!h.getReservas().isEmpty()) {
            int numCol=columnNames.length+1;
            int numFilas=h.getReservas().size();
            data = new Object[8][numCol];
            
            ArrayList obtenidos = h.obtenerReservasFecha(salon);
            ArrayList<Reserva> reservas = (ArrayList<Reserva>) obtenidos.get(0);
            ArrayList<Evento> eventos = (ArrayList<Evento>) obtenidos.get(1);
            
            ArrayList dias = h.diasDisponibles();
            Date[] numeroDias = (Date[]) dias.get(4);
            
            int contadorEscribirFecha = 0;
            int contadorDias=0;
            
           
            int fila=0;
            int f=0;
            for(int g=0; g<8; g++){
                String texto = new SimpleDateFormat("yyyy-MM-dd").format(numeroDias[contadorEscribirFecha]) + " - " + new SimpleDateFormat("yyyy-MM-dd").format(numeroDias[contadorEscribirFecha+2]);
                data[g][0]=texto;
                
                for (int i = 0; i < reservas.size(); i++) {
                   
                    if(contadorDias<24){
                      
                        if (new SimpleDateFormat("yyyy-MM-dd").format(reservas.get(i).getFecha()).equals(new SimpleDateFormat("yyyy-MM-dd").format(numeroDias[contadorDias]))) {
                            for (int j = 0; j < eventos.size(); j++) {
                                if (reservas.get(i).getIdEvento()==eventos.get(j).getId()) {

                                   Calendar calendar = Calendar.getInstance();
                                   calendar.setTime(reservas.get(i).getFecha());
                                   int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

                                    if (eventos.get(j).getNumeroDias()==1) {
                                        if (diaSemana==1) {
                                            data[f][3]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        }else if(diaSemana==6){
                                            data[f][1]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        }else{
                                            data[f][2]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        }

                                    }else if(eventos.get(j).getNumeroDias()==2){
                                        if(diaSemana==6){
                                            data[f][1]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                            data[f][2]=reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        }else if(diaSemana==7){
                                            data[f][2]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                            data[f][3]=reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        }
                                    }else if(eventos.get(j).getNumeroDias()==3){
                                        data[f][1]= reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        data[f][2]=reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();
                                        data[f][3]=reservas.get(i).getTipo() + ": " + eventos.get(j).getNombre() + " Asistentes: " + eventos.get(j).getAsistentes();;
                                    }
                                }
                            }
                        }
                    
                    }
                    
                }
                fila++;
                if (fila%3==0) {
                     f++;
                }
                contadorDias++;
                contadorEscribirFecha+=3;
            }
            
            for (int i = 0; i < 8; i++) {
                for (int j = 1; j < 4; j++) {
                    if (data[i][j]==null) {
                        data[i][j]="Disponible";
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
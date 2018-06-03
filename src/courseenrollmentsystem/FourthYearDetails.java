/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sono
 */
public class FourthYearDetails extends AbstractTableModel{
    
    private static final String COLUMN_NAMES[] = {"Registration Number","GPA","Year of Study"};
    ArrayList<FourthYears> list;
    
    public FourthYearDetails(ArrayList<FourthYears> list){
        this.list = list;
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getRegNumber();
            case 1: return list.get(rowIndex).getGpa();
            case 2: return list.get(rowIndex).getYos();
            default : return "ERROR";
        }
    }
    
}

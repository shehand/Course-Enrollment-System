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
public class LabSessionDetails extends AbstractTableModel{
    
    private static final String COLUMN_NAMES[] = {"Subject Name","Lab Name","Time Slot","Teacher-In-Charge"};
    private static ArrayList<LabSession> list;
    
    public LabSessionDetails(ArrayList<LabSession> list){
        LabSessionDetails.list = list;
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
        switch (columnIndex){
            case 0: return list.get(rowIndex).getSubjectName();
            case 1: return list.get(rowIndex).getPlace();
            case 2: return list.get(rowIndex).getDate();
            case 3: return list.get(rowIndex).getPosterID();
            default : return "You didn't subscribe for this subject";
        }
    }
    
}

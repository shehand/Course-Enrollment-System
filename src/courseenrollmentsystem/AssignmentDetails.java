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
public class AssignmentDetails extends AbstractTableModel{
    
    private static ArrayList<Assignment> list;
    private static final String COLUMN_NAMES [] = {"Assignmnet ID","Subject Name","Taking Place","Time","Teacher In-Charge"};
    
    public AssignmentDetails(ArrayList<Assignment> list){
        AssignmentDetails.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return list.get(rowIndex).getAssignmentID();
            case 1: return list.get(rowIndex).getSubjetcName();
            case 2: return list.get(rowIndex).getPlace();
            case 3: return list.get(rowIndex).getDate();
            case 4: return list.get(rowIndex).getPosterID();
            default: return "You did't subscribe for this subject";
        }
    }
    
}

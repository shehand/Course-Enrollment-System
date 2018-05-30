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
public class SubjectDetails extends AbstractTableModel{
    
    private static final String COLUMN_NAMES[] = {"Subject Code","Subject Name","Semester","Number of Credits","Course Fee","Compulsory or Not"};
    private static ArrayList<Subject> list;
    
    public SubjectDetails(ArrayList<Subject> list){
        SubjectDetails.list = list;
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
            case 0: return list.get(rowIndex).getSubCode();
            case 1: return list.get(rowIndex).getName();
            case 2: return list.get(rowIndex).getSemester();
            case 3: return list.get(rowIndex).getCredits();
            case 4: return list.get(rowIndex).getCourseFee();
            case 5: return list.get(rowIndex).getCompulsoraTag();
            default: return "Error";
        }
    }
    
}

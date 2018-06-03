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
public class StudentSubjectDetails extends AbstractTableModel{
    
    private static final String COLUMN_NAMES[] = {"Student Number","Semester","Subject 1","Subject 2","Subject 3","Subject 4","Year of Study"};
    private static ArrayList<StudentSubjects> list;
    
    public StudentSubjectDetails(ArrayList<StudentSubjects> list){
        StudentSubjectDetails.list = list;
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
            case 0: return list.get(rowIndex).getRegNum();
            case 1: return list.get(rowIndex).getSemester();
            case 2: return list.get(rowIndex).getFirst();
            case 3: return list.get(rowIndex).getSecond();
            case 4: return list.get(rowIndex).getThird();
            case 5: return list.get(rowIndex).getFourth();
            case 6: return list.get(rowIndex).getYos();
            default: return "ERROR";
        }
    }
    
}

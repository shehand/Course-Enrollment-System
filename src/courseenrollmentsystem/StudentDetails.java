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
public class StudentDetails extends AbstractTableModel{
    
    private static final String COLUMN_NAMES[] = {"Register Number","Full Name","Home Address","Date Of Birth","Email","NIC Number","Phone Number"};
    private static ArrayList<Student> list;
    
    public StudentDetails(ArrayList<Student> list){
        StudentDetails.list = list;
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
            case 1: return list.get(rowIndex).getFullName();
            case 2: return list.get(rowIndex).getAddress();
            case 3: return list.get(rowIndex).getDob();
            case 4: return list.get(rowIndex).getEmail();
            case 5: return list.get(rowIndex).getNic();
            case 6: return list.get(rowIndex).getPhoneNumber();
            default: return "Error";
        }
    }
    
}

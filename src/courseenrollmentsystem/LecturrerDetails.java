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
public class LecturrerDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Lecturer ID", "Name", "Email", "Phone Number", "Position", "Faculty"};                  // column names
    private static ArrayList<Lecturers> list;                                                                                               // array list

    /**
     * constructor overloading
     *
     */
    public LecturrerDetails(ArrayList<Lecturers> list) {
        LecturrerDetails.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();                                                                                                                 // return row count
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getLecID();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getEmail();
            case 3:
                return list.get(rowIndex).getPhoneNumber();
            case 4:
                return list.get(rowIndex).getPosition();
            case 5:
                return list.get(rowIndex).getFaculty();
            default:
                return "ERROR";
        }
    }

}

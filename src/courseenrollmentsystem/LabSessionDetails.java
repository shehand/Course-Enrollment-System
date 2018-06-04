/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                                                                             // importing libraries
import javax.swing.table.AbstractTableModel;                                                                                            // importing libraries

/**
 *
 * @author Sono
 */
public class LabSessionDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Subject Name", "Lab Name", "Time Slot", "Teacher-In-Charge"};                           // column names
    private static ArrayList<LabSession> list;                                                                                          // array list to store lab session detail

    /**
     * constructor overloading
     *
     */
    public LabSessionDetails(ArrayList<LabSession> list) {
        LabSessionDetails.list = list;                                                                                                  // setting values
    }

    /**
     * method to get row count
     *
     */
    @Override
    public int getRowCount() {
        return list.size();
    }

    /**
     * method to get column count
     *
     */
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    /**
     * method to get column name
     *
     */
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    /**
     * method to get load the table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getSubjectName();
            case 1:
                return list.get(rowIndex).getPlace();
            case 2:
                return list.get(rowIndex).getDate();
            case 3:
                return list.get(rowIndex).getPosterID();
            default:
                return "You didn't subscribe for this subject";
        }
    }

}

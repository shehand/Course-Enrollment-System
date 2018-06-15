/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                                                     // imporitng java libraries
import javax.swing.table.AbstractTableModel;                                                                    // imporitng java libraries

/**
 *
 * @author Sono
 */
public class InstructorDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Registration Number,", "Name", "email"};                       // column names
    private static ArrayList<Instructor> list;                                                                  // array list to hold instructor details

    /**
     * constructor overloading
     *
     */
    public InstructorDetails(ArrayList<Instructor> list) {
        InstructorDetails.list = list; // assigning values
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
     * method to take column count
     *
     */
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    /**
     * method to take column name
     *
     */
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    /**
     * method that load the table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getInstructorID();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getEmail();
            default:
                return "ERROR";
        }
    }

}

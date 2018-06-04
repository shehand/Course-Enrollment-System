/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                                                                     // importing java libraries
import javax.swing.table.AbstractTableModel;                                                                                    // importing java libraries

/**
 *
 * @author Sono
 */
public class AssignmentDetails extends AbstractTableModel {                                                                      // extends abstract table model class to load table view

    private static ArrayList<Assignment> list;                                                                                   // array list to store assignments details
    private static final String COLUMN_NAMES[] = {"Assignmnet ID", "Subject Name", "Taking Place", "Time", "Teacher In-Charge"}; // column names

    /**
     * constructor overloaded and overriding
     *
     */
    public AssignmentDetails(ArrayList<Assignment> list) {
        AssignmentDetails.list = list;                                                                                           // assigning variables
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
     * method to get column names
     *
     */
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
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
     * method to load the table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getAssignmentID();
            case 1:
                return list.get(rowIndex).getSubjetcName();
            case 2:
                return list.get(rowIndex).getPlace();
            case 3:
                return list.get(rowIndex).getDate();
            case 4:
                return list.get(rowIndex).getPosterID();
            default:
                return "You did't subscribe for this subject";
        }
    }

}

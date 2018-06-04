/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                     // importing java libraries
import javax.swing.table.AbstractTableModel;                                    // importing java libraries

/**
 *
 * @author Sono
 */
public class ResultDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Subject Code", "File"};      // column names
    private static ArrayList<Results> list;                                     // array list to store result retails

    /**
     * constructor overloading
     *
     */
    public ResultDetails(ArrayList<Results> list) {
        ResultDetails.list = list;                                              // setting values
    }

    /**
     * method to return row count
     *
     */
    @Override
    public int getRowCount() {
        return list.size();
    }

    /**
     * method to return column count
     *
     */
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    /**
     * method to return column name
     *
     */
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    /**
     * method to load result details
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getSubjectName();
            case 1:
                return list.get(rowIndex).getName();
            default:
                return "ERROR";
        }
    }

}

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
public class FourthYearDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Registration Number", "GPA", "Year of Study"};                                 // array to store table column names
    ArrayList<FourthYears> list;                                                                                                // array list to store 

    /**
     * constructor overloading
     *
     */
    public FourthYearDetails(ArrayList<FourthYears> list) {
        this.list = list;                                                                                                       // assigning values
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
     * method to return column names
     *
     */
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    /**
     * method to load the table view
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getRegNumber();
            case 1:
                return list.get(rowIndex).getGpa();
            case 2:
                return list.get(rowIndex).getYos();
            default:
                return "ERROR";
        }
    }

}

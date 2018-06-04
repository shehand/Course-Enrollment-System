/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                                                                                                 // importing java libraries
import javax.swing.table.AbstractTableModel;                                                                                                                // importing java libraries

/**
 *
 * @author Sono
 */
public class SubjectDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Subject Code", "Subject Name", "Semester", "Number of Credits", "Course Fee", "Compulsory or Not"};      // column names
    private static ArrayList<Subject> list;                                                                                                                 // array list to store subject details

    /**
     * constructor overloading
     *
     */
    public SubjectDetails(ArrayList<Subject> list) {
        SubjectDetails.list = list;                                                                                                                         // setting values
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
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    /**
     * method to return column names
     *
     */
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    /**
     * method load the subject details table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getSubCode();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getSemester();
            case 3:
                return list.get(rowIndex).getCredits();
            case 4:
                return list.get(rowIndex).getCourseFee();
            case 5:
                return list.get(rowIndex).getCompulsoraTag();
            default:
                return "Error";
        }
    }

}

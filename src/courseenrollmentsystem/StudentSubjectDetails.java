/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.ArrayList;                                                                                                                                         // importing java libraries
import javax.swing.table.AbstractTableModel;                                                                                                                        // importing java libraries

/**
 *
 * @author Sono
 */
public class StudentSubjectDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Student Number", "Semester", "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Year of Study"};               // column names
    private static ArrayList<StudentSubjects> list;                                                                                                                 // array list to hols student choosen subject details

    /**
     * constructor overloading
     *
     */
    public StudentSubjectDetails(ArrayList<StudentSubjects> list) {
        StudentSubjectDetails.list = list;                                                                                                                          // setting values
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
     * method load subject details table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getRegNum();
            case 1:
                return list.get(rowIndex).getSemester();
            case 2:
                return list.get(rowIndex).getFirst();
            case 3:
                return list.get(rowIndex).getSecond();
            case 4:
                return list.get(rowIndex).getThird();
            case 5:
                return list.get(rowIndex).getFourth();
            case 6:
                return list.get(rowIndex).getYos();
            default:
                return "ERROR";
        }
    }

}

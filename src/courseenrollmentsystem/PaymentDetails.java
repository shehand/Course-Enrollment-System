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
public class PaymentDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Transaction ID", "Semester", "Amount", "Course Name", "Student ID"};         // column names
    private static ArrayList<Payment> list;                                                                                     // array list to store payment details

    /**
     * constructor overloading
     *
     */
    public PaymentDetails(ArrayList<Payment> list) {
        PaymentDetails.list = list;                                                                                             // setting values
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
     * method to load the payment table
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getPayID();
            case 1:
                return list.get(rowIndex).getSemester();
            case 2:
                return list.get(rowIndex).getAmount();
            case 3:
                return list.get(rowIndex).getCourse();
            case 4:
                return list.get(rowIndex).getRegNumber();
            default:
                return "ERROR";
        }
    }

}

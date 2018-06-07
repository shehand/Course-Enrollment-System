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
public class LecturerNotesDetails extends AbstractTableModel {

    private static final String COLUMN_NAMES[] = {"Note ID", "File Name", "Subject Code"};
    private static ArrayList<LecturerNotes> list;

    public LecturerNotesDetails(ArrayList<LecturerNotes> list) {
        LecturerNotesDetails.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNoteID();
            case 1:
                return list.get(rowIndex).getFileName();
            case 2:
                return list.get(rowIndex).getSubjectID();
            default:
                return "ERROR";
        }
    }

}

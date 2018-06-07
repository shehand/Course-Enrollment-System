/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sono
 */
public class LecturerDBOperations {

    String url = "jdbc:mysql://localhost:3306/nsbm_database";                   // url to access the data base
    String username = "root";                                                   // username for the data base
    String password = "";                                                       // password to the data base
    Connection con = null;                                                      // variable to get the connection
    PreparedStatement pst = null;                                               // variable to store prepared query
    ResultSet rs;                                                               // variable to store results set

    boolean uploadPDF(LecturerNotes ln, String faculty) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO lec_notes VALUES (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            FileInputStream fis = new FileInputStream(ln.getFile());                    // file variable to store pdf fiel
            int len = (int) ln.getFile().length();                                      // length of the file

            pst.setInt(1, 0);
            pst.setString(2, ln.getFile().getName());
            pst.setInt(3, len);
            pst.setBinaryStream(4, fis, len);
            pst.setString(5, faculty);
            pst.setString(6, ln.getSubjectID());

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    ArrayList<LecturerNotes> loadNotesTable() {

        ArrayList<LecturerNotes> lecNotes = new ArrayList<LecturerNotes>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lec_notes";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                LecturerNotes note = new LecturerNotes();

                note.setNoteID(rs.getInt(1));
                note.setFileName(rs.getString(2));
                note.setSubjectID(rs.getString(6));

                lecNotes.add(note);
            }
            return lecNotes;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    boolean deleteLectureNote(String id) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM lec_notes WHERE note_id = '" + id + "'";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    boolean authenticateLecturer(Lecturers lec) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT lec_id,password FROM lecturer";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            String tempPasswordHolder = "";                                     // string to hold temporory password value
            while (rs.next()) {
                if (rs.getString(1).equals(lec.getLecID())) {                   // checking username maching
                    tempPasswordHolder = rs.getString(2);                       // assigning values
                }
            }

            if (tempPasswordHolder.equals(lec.getPassword())) {                 // checking password matching
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    String getFacultyName(String lecID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT faculty FROM lecturer WHERE lec_id = '" + lecID + "'";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            String faculty = "";                                                // string to hold temporory facult name value
            while (rs.next()) {
                faculty = rs.getString(1);
            }
            return faculty;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    boolean addLecturer(Lecturers lec) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO lecturer VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, lec.getLecID());
            pst.setString(2, lec.getName());
            pst.setString(3, lec.getEmail());
            pst.setInt(4, lec.getPhoneNumber());
            pst.setString(5, lec.getPosition());
            pst.setString(6, lec.getPassword());
            pst.setString(7, lec.getFaculty());
            pst.setString(8, lec.getSubject());

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    boolean updateLecturer(Lecturers lec) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE lecturer SET name ='" + lec.getName() + "', email ='" + lec.getEmail() + "', phone_number ='" + lec.getPhoneNumber() + "', position = '" + lec.getPosition() + "', password = '" + lec.getPassword() + "', faculty = '" + lec.getFaculty() + "', subject = '" + lec.getSubject() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
}

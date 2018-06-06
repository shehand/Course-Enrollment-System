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
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

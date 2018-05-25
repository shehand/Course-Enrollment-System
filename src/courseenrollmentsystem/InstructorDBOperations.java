/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Sono
 */
public class InstructorDBOperations {
    
    String url = "jdbc:mysql://localhost:3306/nsbm_database";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    
    ArrayList<Assignment> loadAssigmnetDetails(){
        
        ArrayList<Assignment> asgList = new ArrayList<Assignment>();
        return  asgList;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    ResultSet rs;
    
    ArrayList<Assignment> loadAssigmnetDetails(){
        
        ArrayList<Assignment> asgList = new ArrayList<Assignment>();
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM assignments";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                Assignment asg = new Assignment();
                asg.setAssignmentID(rs.getInt(1));
                asg.setSubjetcName(rs.getString(2));
                asg.setDate(rs.getString(3));
                asg.setPosterID(rs.getString(4));
                asg.setPlace(rs.getString(5));
                
                asgList.add(asg);
            }
            return asgList;
        }catch(Exception e){
            return null;
        }finally{
            try{
                 if(con != null){
                    con.close();
                }
                
                if(pst != null){
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
    }
    
    ArrayList<LabSession> getLabSessionDetails(){
        
        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM lab_sessions";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                LabSession lbs = new LabSession();
                
                lbs.setSubjectName(rs.getString(1));
                lbs.setPlace(rs.getString(2));
                lbs.setDate(rs.getString(3));
                lbs.setPosterID(rs.getString(4));
                
                lbSessions.add(lbs);
            }
            
            return lbSessions;
            
        }catch(Exception e){
            return null;
        }finally{
            try{
                if(con != null){
                    con.close();
                }
                
                if(pst != null){
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
    }
}

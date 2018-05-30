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

    ArrayList<Assignment> loadAssigmnetDetails() {

        ArrayList<Assignment> asgList = new ArrayList<Assignment>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM assignments";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Assignment asg = new Assignment();
                asg.setAssignmentID(rs.getInt(1));
                asg.setSubjetcName(rs.getString(2));
                asg.setDate(rs.getString(3));
                asg.setPosterID(rs.getString(4));
                asg.setPlace(rs.getString(5));

                asgList.add(asg);
            }
            return asgList;
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

    ArrayList<LabSession> getLabSessionDetails() {

        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lab_sessions";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                LabSession lbs = new LabSession();

                lbs.setSubjectName(rs.getString(1));
                lbs.setPlace(rs.getString(2));
                lbs.setDate(rs.getString(3));
                lbs.setPosterID(rs.getString(4));

                lbSessions.add(lbs);
            }

            return lbSessions;

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

    boolean insertAssignment(Assignment asg) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO assignments VALUES (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.setInt(1, 0);
            pst.setString(2, asg.getSubjetcName());
            pst.setString(3, asg.getDate());
            pst.setString(4, asg.getPlace());
            pst.setString(5, asg.getPosterID());

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

    boolean updateAssignment(Assignment asg) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query;

            if (asg.getPlace().equals("")) {
                query = "UPDATE assignments SET date='" + asg.getDate() + "' WHERE assignment_id ='" + asg.getAssignmentID() + "'";
            } else {
                query = "UPDATE assignments SET place='" + asg.getPlace() + "' WHERE assignment_id ='" + asg.getAssignmentID() + "'";
            }

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

    boolean deleteAssignment(Assignment asg) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM assignments WHERE assignment_id ='" + asg.getAssignmentID() + "'";

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
    
    boolean insertNewLabSession(LabSession lbs){
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO lab_sessions VALUES (?,?,?,?)";

            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, lbs.getSubjectName());
            pst.setString(2, lbs.getPlace());
            pst.setString(3, lbs.getPlace());
            pst.setString(4, lbs.getPosterID());
            
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
    
    boolean instructorAuthentication(Instructor inst){
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "SELECT reg_number,password FROM login_sessions";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            String tempPasswordHolder = "";
            while(rs.next()){
                if(rs.getString(1).equals(inst.getInstructorID())){
                    tempPasswordHolder = rs.getString(2);
                }
            }
            
            if(tempPasswordHolder.equals(inst.getPassword())){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }finally{
            try{
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            }catch(Exception e){
            
            }
        }
    }

    boolean insertGPADetails(String regNum, String gpa, String year) {
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO ranking VALUES (?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.setString(1, regNum);
            pst.setString(2, gpa);
            pst.setString(3, year);
            
            pst.executeUpdate();
            
            return true;
        }catch(Exception e){
            return false;
        }finally{
            try{
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            }catch(Exception e){
            
            }
        }
    }
    
    
}

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
public class StudentDBOperations {
    
    String url = "jdbc:mysql://localhost:3306/nsbm_database";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    
    boolean addUndergraduate(Undergraduate und){
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password); // trying to connect with the database
            String query = "INSERT INTO undergraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; // sql query to access mydql
            pst = (PreparedStatement) con.prepareStatement(query); //make query as a statement
            
            pst.setString(1, und.getRegNum()); // configer frontend data with the query statement
            pst.setString(2, und.getFullName()); // configer frontend data with the query statement
            pst.setString(3, und.getNic()); // configer frontend data with the query statement
            pst.setString(4, und.getAddress()); // configer frontend data with the query statement
            pst.setInt(5, und.getPhoneNumber()); // configer frontend data with the query statement
            pst.setString(6, und.getDob()); // configer frontend data with the query statement
            pst.setString(7, und.getEmail()); // configer frontend data with the query statement
            pst.setString(8, und.getPassword()); // configer frontend data with the query statement
            pst.setInt(9, und.getIndexNumber()); // configer frontend data with the query statement
            pst.setString(10, und.getStream()); // configer frontend data with the query statement
            pst.setString(11, und.getStream()); // configer frontend data with the query statement
            pst.setInt(12, und.getIslandRank()); // configer frontend data with the query statement
            pst.setString(13, und.getFacultyName()); // configer frontend data with the query statement
            
            pst.executeUpdate();  //execute the query and insert the data into the database
        }catch(Exception e){ 
            System.out.println(e);
        }finally{
            
            try{
                if(pst != null){
                    pst.close();
                }
                
                if(con != null){
                    con.close();
                }
            } catch (Exception e){
                
            }
        }
        return true;
    }
    
    boolean addPostgrasuate(Postgraduate pgs){
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password); // trying to connect with the database
            String query = "INSERT INTO postgraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"; // sql query to access mydql
            pst = (PreparedStatement) con.prepareStatement(query); //make the query as a statement
            
            pst.setString(1, pgs.getRegNum()); // configer frontend data with the query statement
            pst.setString(2, pgs.getFullName()); // configer frontend data with the query statement
            pst.setString(3, pgs.getNic()); // configer frontend data with the query statement
            pst.setString(4, pgs.getAddress()); // configer frontend data with the query statement
            pst.setInt(5, pgs.getPhoneNumber()); // configer frontend data with the query statement
            pst.setString(6, pgs.getDob()); // configer frontend data with the query statement
            pst.setString(7, pgs.getEmail()); // configer frontend data with the query statement
            pst.setString(8, pgs.getPassword()); // configer frontend data with the query statement
            pst.setString(9, pgs.getInstitute()); // configer frontend data with the query statement
            pst.setInt(10, pgs.getYoc()); // configer frontend data with the query statement
            pst.setString(11, pgs.getQualification()); // configer frontend data with the query statement
            pst.setString(13, pgs.getFacultyName()); // configer frontend data with the query statement
            
            pst.executeUpdate();  // execute the query
            
        }catch(Exception e){
        }
    
        return true;
    }
    
    ArrayList<Assignment> getAssignmentList(String regNumber){
        
        ArrayList<Assignment> lst = new ArrayList<Assignment>();
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM assignments WHERE subject_name IN (SELECT first,secont,third,fourth FROM semester_1_subjects WHERE reg_number = '"+regNumber+"' AND SELECT first,second,third,fourth FROM semester_2_subjects WHERE reg_nymber='"+regNumber+"')";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Assignment asg = new Assignment();
                asg.setAssignmentID(rs.getInt(1));
                asg.setSubjetcName(rs.getString(2));
                asg.setDate(rs.getString(3));
                asg.setPosterID(rs.getString(4));
                asg.setPlace(rs.getString(5));
                
                lst.add(asg);
            }
            return lst;
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
    
    ArrayList<LabSession> getLabSessionDetails(String regNumber){
        
        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM lab_sessions WHERE subject_name IN (SELECT first,secont,third,fourth FROM semester_1_subjects WHERE reg_number = '"+regNumber+"' AND SELECT first,second,third,fourth FROM semester_2_subjects WHERE reg_nymber='"+regNumber+"')";
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
    
    boolean insertSemesterSubjects(String [] subjects, String regNumber){
        
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query1 = "INSERT INTO semester_1_subjects VALUES (?,?,?,?,?,?)";
            String query2 = "INSERT INTO semester_2_subjects VALUES (?,?,?,?,?,?)";
            
            PreparedStatement pst2 = (PreparedStatement)con.prepareStatement(query2);
            pst = (PreparedStatement) con.prepareStatement(query1);
            
            pst.setString(0, regNumber);
            pst.setInt(1, 1);
            pst.setString(2, subjects[0]);
            pst.setString(3, subjects[1]);
            pst.setString(4, subjects[2]);
            pst.setString(5, subjects[3]);
            
            pst2.setString(0, regNumber);
            pst2.setInt(1, 2);
            pst2.setString(2, subjects[4]);
            pst2.setString(3, subjects[5]);
            pst2.setString(4, subjects[6]);
            pst2.setString(5, subjects[7]);
            
            pst.executeUpdate();
            pst2.executeUpdate();
            
            return true;
        }catch(Exception e){
            return false;
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
    
    ArrayList<Subject> getSubjectDetails(){
        
        ArrayList<Subject> sbjList = new ArrayList<Subject>();
        try{
            con = (Connection) DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM subjects";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Subject sbj = new Subject();
                
                sbj.setSubCode(rs.getString(1));
                sbj.setName(rs.getString(2));
                sbj.setSemester(rs.getInt(3));
                sbj.setCredits(rs.getInt(4));
                
                sbjList.add(sbj);
            }
            return sbjList;
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

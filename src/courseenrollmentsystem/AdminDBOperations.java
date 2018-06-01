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
public class AdminDBOperations {

    String url = "jdbc:mysql://localhost:3306/nsbm_database";   // ur to cennect the database
    String username = "root";  // access crediantials fot the database
    String password = "";  // access crediantials fot the database
    Connection con = null;  // use to store the established connection with the database
    PreparedStatement pst = null;  // use to store the preapared sql query
    ResultSet rs = null; //  use to store the result set of the sql query
    
    /**
     * method to load student details to student profile
     **/
    Student loadStudentDetails(String regNumber) {

        Student st = new Student(); // instance of a student to store stdent details
        try {
            con = (Connection)DriverManager.getConnection(url, username, password); // establishing connection with the database
            String query = "";
            if (regNumber.charAt(1) == 'U') {
                query = "SELECT * FROM undergraduate_student WHERE reg_number ='" + regNumber + "'"; // query
            } else if (regNumber.charAt(1) == 'P') {
                query = "SELECT * FROM postgraduate_student WHERE reg_number ='" + regNumber + "'"; // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);  // preaparing the query to execute
            rs = pst.executeQuery(); // executing the query

            while (rs.next()) {
                st.setRegNum(rs.getString(1)); // setting student details
                st.setFullName(rs.getString(2));  // setting student details
                st.setNic(rs.getString(3));  // setting student details
                st.setAddress(rs.getString(4));  // setting student details
                st.setPhoneNumber(rs.getInt(5));  // setting student details
                st.setDob(rs.getString(6));  // setting student details
                st.setEmail(rs.getString(7));  // setting student details
                st.setPassword(rs.getString(8));  // setting student details
            }
            return st; // return student object
        } catch (Exception e) {                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();   // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();  // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }
    
    /**
     * method to update student details
     **/
    boolean updateStudent(Student st) {
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);  // establishing connection with the database
            String query = "";
            if (st.regNum.charAt(1) == 'U') {
                query = "UPDATE undergraduate_student SET full_name = '" + st.getFullName() + "', address = '" + st.getAddress() + "', phone_number = '" + st.getPhoneNumber() + "', dob = '" + st.getDob() + "', email = '" + st.getEmail() + "', password ='" + st.getPassword() + "' WHERE reg_number ='" + st.getRegNum() + "'";  // query
            } else if (st.regNum.charAt(1) == 'P') {
                query = "UPDATE postgraduate_student SET full_name = '" + st.getFullName() + "', address = '" + st.getAddress() + "', phone_number = '" + st.getPhoneNumber() + "', dob = '" + st.getDob() + "', email = '" + st.getEmail() + "', password ='" + st.getPassword() + "' WHERE reg_number ='" + st.getRegNum() + "'";   // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);  // preaparing the query to execute
            pst.executeUpdate();  // execute the query
            return true;
        } catch (Exception e) {                          // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();   // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();  // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }
    
    /**
     * method to delete student details
     **/
    boolean deleteStudent(String regNumber){
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);   // establishing connection with the database
            String query = "";
            if (regNumber.charAt(1) == 'U') {
                query = "DELETE FROM undergraduate_student WHERE reg_number ='" + regNumber + "';";  // query
            } else if (regNumber.charAt(1) == 'P') {
                query = "DELETE FROM postgraduate_student WHERE reg_number ='" + regNumber + "';";  // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);  // preaparing the query to execute
            pst.executeUpdate();  // execute the query
            
            return true;
        } catch (Exception e) {                         // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();   // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();   // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }
    
    /**
     * method to add a new instructor
     **/
    boolean addInstructor(Instructor inst){
        try{
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO instrucor_details VALUES (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.setString(1, inst.getInstructorID());
            pst.setString(2, inst.getName());
            pst.setString(3, inst.getDob());
            pst.setString(4, inst.getEmail());
            pst.setString(5, inst.getNic());
            pst.setString(6, inst.getPassword());
            
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }finally{
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
    
    public ArrayList<Instructor> getInstructorDetails(){
        ArrayList<Instructor> inst = new ArrayList<>();
        try{
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM instrucor_details";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Instructor tmpIns = new Instructor();
                
                tmpIns.setInstructorID(rs.getString(1));
                tmpIns.setName(rs.getString(2));
                tmpIns.setEmail(rs.getString(3));
                
                inst.add(tmpIns);
            }
            return inst;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }finally{
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
    
    boolean removeInstructor(String instID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM instrucor_details WHERE reg_number ='" + instID + "'";

            pst = (PreparedStatement) con.prepareStatement(query);
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
    
    ArrayList<Subject> getSubjectDetails() {

        ArrayList<Subject> sbjList = new ArrayList<Subject>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM subjects";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Subject sbj = new Subject();

                sbj.setSubCode(rs.getString(1));
                sbj.setName(rs.getString(2));
                sbj.setSemester(rs.getInt(3));
                sbj.setCredits(rs.getInt(4));
                sbj.setCourseFee(rs.getInt(6));

                sbjList.add(sbj);
            }
            return sbjList;
        } catch (Exception e) {
            System.out.println(e);
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
    
    boolean insetNewSubject(Subject sbj){
        
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO subjects VALUES (?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, sbj.getSubCode());
            pst.setString(2, sbj.getName());
            pst.setInt(3, sbj.getSemester());
            pst.setInt(4, sbj.getCredits());
            pst.setString(5, sbj.getCourse());
            pst.setInt(6, sbj.getCourseFee());
            pst.setString(7, sbj.getCompulsoraTag());

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
    
    boolean removeSubject(String sbjID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM subjects WHERE subject_code ='" + sbjID + "'";

            pst = (PreparedStatement) con.prepareStatement(query);
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
    
    ArrayList<Payment> getPaymentDetails() {

        ArrayList<Payment> plst = new ArrayList<>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM payments";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Payment pay = new Payment();

                pay.setPayID(rs.getInt(1));
                pay.setAmount(rs.getString(2));
                pay.setSemester(rs.getInt(3));
                pay.setCourse(rs.getString(4));
                pay.setRegNumber(rs.getString(5));

                plst.add(pay);
            }
            return plst;
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
    
    ArrayList<FourthYears> getFourthYears(){
        
        ArrayList<FourthYears> fyrs = new ArrayList<FourthYears>();
        
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM ranking WHERE yos='2 nd Year'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            int count=0;

            while (rs.next() && count<40) {
                FourthYears fyr = new FourthYears();

                fyr.setRegNumber(rs.getString(1));
                fyr.setGpa(rs.getString(2));
                fyr.setYos(rs.getString(3));
                
                fyrs.add(fyr);
                count++;
            }
            return fyrs;
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
}

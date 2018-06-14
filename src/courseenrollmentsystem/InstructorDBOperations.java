/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.io.File;                                                            // importing java libraries
import java.io.FileInputStream;                                                 // importing java libraries
import java.sql.Connection;                                                     // importing java libraries
import java.sql.DriverManager;                                                  // importing java libraries
import java.sql.PreparedStatement;                                              // importing java libraries
import java.sql.ResultSet;                                                      // importing java libraries
import java.util.ArrayList;                                                     // importing java libraries

/**
 *
 * @author Sono
 */
public class InstructorDBOperations {

    String url = "jdbc:mysql://localhost:3306/nsbm_database";                   // url to access the data base
    String username = "root";                                                   // username for the data base
    String password = "";                                                       // password to the data base
    Connection con = null;                                                      // variable to get the connection
    PreparedStatement pst = null;                                               // variable to store prepared query
    ResultSet rs;                                                               // variable to store results set

    /**
     * method to load assignment details
     *
     */
    ArrayList<Assignment> loadAssigmnetDetails(String facName) {

        ArrayList<Assignment> asgList = new ArrayList<Assignment>();            // array list to hold assignment detaila

        try {
            con = (Connection) DriverManager.getConnection(url, username, password); // extablishing the connection
            String query = "SELECT * FROM assignments WHERE subject_name IN (SELECT name FROM subjects WHERE course ='" + facName + "')"; // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            rs = pst.executeQuery();                                            // execute the query

            while (rs.next()) {
                Assignment asg = new Assignment();                              // instance to store assignment details
                asg.setAssignmentID(rs.getInt(1));                              // assigning values
                asg.setSubjetcName(rs.getString(2));                            // assigning values
                asg.setDate(rs.getString(3));                                   // assigning values
                asg.setPosterID(rs.getString(4));                               // assigning values
                asg.setPlace(rs.getString(5));                                  // assigning values

                asgList.add(asg);                                               // adding details to the array list
            }
            return asgList;                                                     // return the list
        } catch (Exception e) {                                                 // exception handleing
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to load lab session details
     *
     */
    ArrayList<LabSession> getLabSessionDetails(String facName) {

        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();         // array list to hold lab sessing detaila

        try {
            con = (Connection) DriverManager.getConnection(url, username, password); // extablishing the connection
            String query = "SELECT * FROM lab_sessions WHERE subject_name IN (SELECT name FROM subjects WHERE course ='" + facName + "')"; // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                LabSession lbs = new LabSession();                              // instance to store lab session details

                lbs.setSubjectName(rs.getString(1));                            // assigning values
                lbs.setPlace(rs.getString(2));                                  // assigning values
                lbs.setDate(rs.getString(3));                                   // assigning values
                lbs.setPosterID(rs.getString(4));                               // assigning values

                lbSessions.add(lbs);                                            //adding instance to the array list
            }

            return lbSessions;                                                  // return array list

        } catch (Exception e) {                                                 //execption handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to insert assignment details
     *
     */
    boolean insertAssignment(Assignment asg) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "INSERT INTO assignments VALUES (?,?,?,?,?)";        // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            pst.setInt(1, 0);                                                   // setting values
            pst.setString(2, asg.getSubjetcName());                             // setting values
            pst.setString(3, asg.getDate());                                    // setting values
            pst.setString(4, asg.getPlace());                                   // setting values
            pst.setString(5, asg.getPosterID());                                // setting values

            pst.executeUpdate();                                                // execute the query

            return true;
        } catch (Exception e) {                                                 //execption handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to update assignment details
     *
     */
    boolean updateAssignment(Assignment asg) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query;                                                       // string variable to store query

            if (asg.getPlace().equals("")) {
                query = "UPDATE assignments SET date='" + asg.getDate() + "' WHERE assignment_id ='" + asg.getAssignmentID() + "'"; // query
            } else {
                query = "UPDATE assignments SET place='" + asg.getPlace() + "' WHERE assignment_id ='" + asg.getAssignmentID() + "'"; // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query
            pst.executeUpdate();                                                // execute the query

            return true;

        } catch (Exception e) {                                                 //execption handling
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to delete assignment details
     *
     */
    boolean deleteAssignment(Assignment asg) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "DELETE FROM assignments WHERE assignment_id ='" + asg.getAssignmentID() + "'";// query

            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query
            pst.executeUpdate();                                                // execute the query

            return true;

        } catch (Exception e) {                                                 //execption handling
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to insert new lab session details
     *
     */
    boolean insertNewLabSession(LabSession lbs) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "INSERT INTO lab_sessions VALUES (?,?,?,?)";         // query

            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query
            pst.setString(1, lbs.getSubjectName());                             // setting the values
            pst.setString(2, lbs.getPlace());                                   // setting the values
            pst.setString(3, lbs.getPlace());                                   // setting the values
            pst.setString(4, lbs.getPosterID());                                // setting the values

            pst.executeUpdate();                                                // execute the query
            return true;

        } catch (Exception e) {                                                 //execption handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to authenticate the user
     *
     */
    boolean instructorAuthentication(Instructor inst) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT reg_number,password FROM instrucor_details"; // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            String tempPasswordHolder = "";                                     // string to hold temporory password value
            while (rs.next()) {
                if (rs.getString(1).equals(inst.getInstructorID())) {            // checking username maching
                    tempPasswordHolder = rs.getString(2);                       // assigning values
                }
            }

            if (tempPasswordHolder.equals(inst.getPassword())) {                // checking password matching
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {                                                 // execption handling 
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to insert exam results
     *
     */
    boolean insertExamResults(File file, String subCode) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "INSERT INTO results VALUES (?,?,?,?)";              // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            FileInputStream fis = new FileInputStream(file);                    // file variable to store pdf fiel
            int len = (int) file.length();                                      // length of the file

            pst.setString(1, subCode);                                          // setting values
            pst.setInt(2, len);                                                 // setting values
            pst.setBinaryStream(3, fis, len);                                   // setting values
            pst.setString(4, file.getName());                                   // setting values
            pst.executeUpdate();                                                // execute the query

            return true;
        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get result details
     *
     */
    ArrayList<Results> getResultDetails(String facName) {

        ArrayList<Results> res = new ArrayList<Results>();                      // array list to store result details

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT * FROM results WHERE subject_code IN (SELECT subject_code FROM subjects WHERE course ='" + facName + "')"; // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                Results r = new Results();                                      // instance to store result details
                r.setSubjectName(rs.getString(1));                              // setting values
                r.setName(rs.getString(4));                                     // setting values
                res.add(r);                                                     // add the instance to the array list
            }
            return res;                                                         // return the array list
        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get first semester subjects of a students
     *
     */
    ArrayList<StudentSubjects> getFirstSemesterSubjects(String yos) {

        ArrayList<StudentSubjects> sdSub = new ArrayList<>();                   // array list to store stuedent subject details

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT * FROM semester_1_subjects WHERE yos = '" + yos + "' AND reg_number NOT IN (SELECT reg_number FROM ranking WHERE yos = '" + yos + "' AND semester = '1')";                 // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                StudentSubjects ss = new StudentSubjects();                     // instance to store subject details

                ss.setRegNum(rs.getString(1));                                  // setting values
                ss.setSemester(rs.getString(2));                                // setting values
                ss.setFirst(rs.getString(3));                                   // setting values
                ss.setSecond(rs.getString(4));                                  // setting values
                ss.setThird(rs.getString(5));                                   // setting values
                ss.setFourth(rs.getString(6));                                  // setting values
                ss.setYos(rs.getString(7));                                     // setting values

                sdSub.add(ss);                                                  // add instance to the array list
            }

            return sdSub;                                                       // return array list

        } catch (Exception e) {                                                 // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get second semester subjects of a students
     *
     */
    ArrayList<StudentSubjects> getSecondSemesterSubjects(String yos) {

        ArrayList<StudentSubjects> sdSub = new ArrayList<>();                   // array list to store student subject details

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT * FROM semester_2_subjects WHERE yos = '" + yos + "' AND reg_number NOT IN (SELECT reg_number FROM ranking WHERE yos = '" + yos + "' AND semester = '2')";                 // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                StudentSubjects ss = new StudentSubjects();                     // instance to store subject details

                ss.setRegNum(rs.getString(1));                                  // setting values
                ss.setSemester(rs.getString(2));                                // setting values
                ss.setFirst(rs.getString(3));                                   // setting values
                ss.setSecond(rs.getString(4));                                  // setting values
                ss.setThird(rs.getString(5));                                   // setting values
                ss.setFourth(rs.getString(6));                                  // setting values
                ss.setYos(rs.getString(7));                                     // setting values

                sdSub.add(ss);                                                  // add instance to the array list
            }

            return sdSub;                                                       // return the array list

        } catch (Exception e) {                                                 // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get student's course details
     *
     */
    String getStudentCourse(String regNum) {
        try {
            String result = "";                                                 // string to hold results
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT course FROM payments WHERE reg_number ='" + regNum + "'"; // query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                result = rs.getString(1);                                       // setting values
            }

            return result;                                                      // return value

        } catch (Exception e) {                                                 // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get compulsory subject details
     *
     */
    String[] getCompulsorySubjectDetails(String courseName, String semester, String year) {

        String sub[] = new String[4];                                           // string to hold subject details
        try {
            int sem = 0;
            if(semester.equals("First Semester")){
                sem = 1;
            }else{
                sem = 2;
            }
            
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT name FROM subjects WHERE course ='" + courseName + "' AND compulsory ='C' AND semester = '"+sem+"' AND yos = '"+year+"'";// query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query
            int count = 0;
            while (rs.next()) {
                sub[count++] = rs.getString(1);                                 // setting values
            }
            return sub;                                                         // return value

        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to insert result details
     *
     */
    boolean insertResults(FourthYears f) {
        try {

            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "INSERT INTO ranking VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";// query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            pst.setString(1, f.getRegNumber());                                 // setting values
            pst.setString(2, f.getGpa());                                       // setting values
            pst.setString(3, f.getYos());                                       // setting values
            pst.setString(4, f.getSub1());                                      // setting values
            pst.setString(5, f.getRes1());                                      // setting values
            pst.setString(6, f.getSub2());                                      // setting values
            pst.setString(7, f.getRes2());                                      // setting values
            pst.setString(8, f.getSub3());                                      // setting values
            pst.setString(9, f.getRes3());                                      // setting values
            pst.setString(10, f.getSub4());                                     // setting values
            pst.setString(11, f.getRes4());                                     // setting values
            pst.setString(12, f.getSub5());                                     // setting values
            pst.setString(13, f.getRes5());                                     // setting values
            pst.setString(14, f.getSub6());                                     // setting values
            pst.setString(15, f.getRes6());                                     // setting values
            pst.setString(16, f.getSub7());                                     // setting values
            pst.setString(17, f.getRes7());                                     // setting values
            pst.setString(18, f.getSub8());                                     // setting values
            pst.setString(19, f.getRes8());                                     // setting values
            pst.setString(20, f.getSemester());                                 // setting values

            pst.executeUpdate();                                                // execute the query
            return true;

        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    String getFacultyName(String instID) {
        String name = "";
        try {

            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT faculty FROM instrucor_details WHERE reg_number ='" + instID + "'";// query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                name = rs.getString(1);                                         // setting values
            }
            return name;                                                        // return value

        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    String findCredit(String sub) {

        int credit = 0;
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT num_of_credits FROM subjects WHERE name ='" + sub + "'";// query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                credit = rs.getInt(1);                                          // setting values
            }
            return Integer.toString(credit);                                    // return value

        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

    String getStudentEmail(String regNumber) {
        String email = "";
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);// extablishing the connection
            String query = "SELECT email FROM students WHERE I  reg_number ='" + regNumber + "'";// query
            pst = (PreparedStatement) con.prepareStatement(query);              // preparing the query

            ResultSet rs = pst.executeQuery();                                  // execute the query

            while (rs.next()) {
                email = rs.getString(1);                                           // setting values
            }
            return email;                                                       // return value

        } catch (Exception e) {                                                 // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                // closing the connection
                }

                if (pst != null) {
                    pst.close();                                                // closing the prepared statement
                }
            } catch (Exception e) {

            }
        }
    }

}

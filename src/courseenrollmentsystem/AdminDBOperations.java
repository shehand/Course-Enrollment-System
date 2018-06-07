/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.sql.Connection;         // import java libraries
import java.sql.DriverManager;      // import java libraries
import java.sql.PreparedStatement;  // import java libraries
import java.sql.ResultSet;          // import java libraries
import java.util.ArrayList;         // import java libraries

/**
 *
 * @author Sono
 */
public class AdminDBOperations {

    String url = "jdbc:mysql://localhost:3306/nsbm_database";       // ur to cennect the database
    String username = "root";                                       // access crediantials fot the database
    String password = "";                                           // access crediantials fot the database
    Connection con = null;                                          // use to store the established connection with the database
    PreparedStatement pst = null;                                   // use to store the preapared sql query
    ResultSet rs = null;                                            //  use to store the result set of the sql query

    /**
     * method to load student details to student profile
     *
     */
    Student loadStudentDetails(String regNumber) {

        Student st = new Student();                                                                     // instance of a student to store stdent details
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                    // establishing connection with the database
            String query = "";                                                                          // String to store query
            if (regNumber.charAt(1) == 'U') {
                query = "SELECT * FROM undergraduate_student WHERE reg_number ='" + regNumber + "'";    // query
            } else if (regNumber.charAt(1) == 'P') {
                query = "SELECT * FROM postgraduate_student WHERE reg_number ='" + regNumber + "'";     // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);                                      // preaparing the query to execute
            rs = pst.executeQuery();                                                                    // executing the query

            while (rs.next()) {
                st.setRegNum(rs.getString(1));                                                          // setting student details
                st.setFullName(rs.getString(2));                                                        // setting student details
                st.setNic(rs.getString(3));                                                             // setting student details
                st.setAddress(rs.getString(4));                                                         // setting student details
                st.setPhoneNumber(rs.getInt(5));                                                        // setting student details
                st.setDob(rs.getString(6));                                                             // setting student details
                st.setEmail(rs.getString(7));                                                           // setting student details
                st.setPassword(rs.getString(8));                                                        // setting student details
            }
            return st;                                                                                  // return student object
        } catch (Exception e) {                                                                         // exception handling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                        // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                        // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to update student details
     *
     */
    boolean updateStudent(Student st) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                     // establishing connection with the database
            String query = "";      // string to store query
            if (st.regNum.charAt(1) == 'U') {
                query = "UPDATE undergraduate_student SET full_name = '" + st.getFullName() + "', address = '" + st.getAddress() + "', phone_number = '" + st.getPhoneNumber() + "', dob = '" + st.getDob() + "', email = '" + st.getEmail() + "', password ='" + st.getPassword() + "' WHERE reg_number ='" + st.getRegNum() + "'";  // query
            } else if (st.regNum.charAt(1) == 'P') {
                query = "UPDATE postgraduate_student SET full_name = '" + st.getFullName() + "', address = '" + st.getAddress() + "', phone_number = '" + st.getPhoneNumber() + "', dob = '" + st.getDob() + "', email = '" + st.getEmail() + "', password ='" + st.getPassword() + "' WHERE reg_number ='" + st.getRegNum() + "'";   // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);                                      // preaparing the query to execute
            pst.executeUpdate();                                                                        // execute the query
            return true;
        } catch (Exception e) {                                                                         // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                        // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                        // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to delete student details
     *
     */
    boolean deleteStudent(String regNumber) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                  // establishing connection with the database
            String query = "";                                                                        // string to store query
            if (regNumber.charAt(1) == 'U') {
                query = "DELETE FROM undergraduate_student WHERE reg_number ='" + regNumber + "';";   // query
            } else if (regNumber.charAt(1) == 'P') {
                query = "DELETE FROM postgraduate_student WHERE reg_number ='" + regNumber + "';";    // query
            }

            pst = (PreparedStatement) con.prepareStatement(query);                                    // preaparing the query to execute
            pst.executeUpdate();                                                                      // execute the query

            return true;
        } catch (Exception e) {                                                                       // exception handling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                      // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                      // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to add a new instructor
     *
     */
    boolean addInstructor(Instructor inst) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "INSERT INTO instrucor_details VALUES (?,?,?,?,?,?,?)";                    // query
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute

            pst.setString(1, inst.getInstructorID());                                               // setting instructor details
            pst.setString(2, inst.getName());                                                       // setting instructor details
            pst.setString(3, inst.getDob());                                                        // setting instructor details
            pst.setString(4, inst.getEmail());                                                      // setting instructor details
            pst.setString(5, inst.getNic());                                                        // setting instructor details
            pst.setString(6, inst.getPassword());                                                   // setting instructor details
            pst.setString(7, inst.getFacultyName());                                                // setting instructor details

            pst.executeUpdate();                                                                    // execute the query
            return true;
        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get instructor details
     *
     * @return
     */
    public ArrayList<Instructor> getInstructorDetails() {
        ArrayList<Instructor> inst = new ArrayList<>();                                             // Instructor type array list to store instructor details
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "SELECT * FROM instrucor_details";                                       // query
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute                                  
            rs = pst.executeQuery();                                                                // execute the query

            while (rs.next()) {
                Instructor tmpIns = new Instructor();                                               // Instructor instance to store instructor details

                tmpIns.setInstructorID(rs.getString(1));                                            // setting instructor details
                tmpIns.setName(rs.getString(2));                                                    // setting instructor details
                tmpIns.setEmail(rs.getString(3));                                                   // setting instructor details

                inst.add(tmpIns);                                                                   // add the created instance to the array lsit
            }
            return inst;
        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to delete instructor details
     *
     * @return
     */
    boolean removeInstructor(String instID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "DELETE FROM instrucor_details WHERE reg_number ='" + instID + "'";      // query
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute        
            pst.executeUpdate();                                                                    // execute the query

            return true;

        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get subject details
     *
     * @return
     */
    ArrayList<Subject> getSubjectDetails() {

        ArrayList<Subject> sbjList = new ArrayList<Subject>();                                      // Array list to store subject details
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "SELECT * FROM subjects";                                                // query
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute        

            ResultSet rs = pst.executeQuery();                                                      // execute the query

            while (rs.next()) {
                Subject sbj = new Subject();                                                        // instance to store subject details

                sbj.setSubCode(rs.getString(1));                                                    // setting subject details
                sbj.setName(rs.getString(2));                                                       // setting subject details
                sbj.setSemester(rs.getInt(3));                                                      // setting subject details
                sbj.setCredits(rs.getInt(4));                                                       // setting subject details
                sbj.setCourseFee(rs.getInt(6));                                                     // setting subject details

                sbjList.add(sbj);                                                                   // add subject details to the array list
            }
            return sbjList;
        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to insert new subject details
     *
     * @return
     */
    boolean insetNewSubject(Subject sbj) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "INSERT INTO subjects VALUES (?,?,?,?,?,?,?)";                           // query 
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute       

            pst.setString(1, sbj.getSubCode());                                                     //setting subject details
            pst.setString(2, sbj.getName());                                                        //setting subject details
            pst.setInt(3, sbj.getSemester());                                                       //setting subject details
            pst.setInt(4, sbj.getCredits());                                                        //setting subject details
            pst.setString(5, sbj.getCourse());                                                      //setting subject details
            pst.setInt(6, sbj.getCourseFee());                                                      //setting subject details
            pst.setString(7, sbj.getCompulsoraTag());                                               //setting subject details

            pst.executeUpdate();                                                                    // execute the query
            return true;
        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to remove subject details
     *
     * @return
     */
    boolean removeSubject(String sbjID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "DELETE FROM subjects WHERE subject_code ='" + sbjID + "'";              // query

            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute      
            pst.executeUpdate();                                                                    // execute the query

            return true;

        } catch (Exception e) {                                                                     // Exception habdling
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get payment details
     *
     * @return
     */
    ArrayList<Payment> getPaymentDetails() {

        ArrayList<Payment> plst = new ArrayList<>();                                                // Array list to store payment details
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                // establishing connection with the database
            String query = "SELECT * FROM payments";                                                // query
            pst = (PreparedStatement) con.prepareStatement(query);                                  // preaparing the query to execute     

            ResultSet rs = pst.executeQuery();                                                      // execute the query

            while (rs.next()) {
                Payment pay = new Payment();                                                        // instance to store payment details

                pay.setPayID(rs.getInt(1));                                                         // setting payment details
                pay.setAmount(rs.getString(2));                                                     // setting payment details
                pay.setSemester(rs.getInt(3));                                                      // setting payment details
                pay.setCourse(rs.getString(4));                                                     // setting payment details
                pay.setRegNumber(rs.getString(5));                                                  // setting payment details

                plst.add(pay);                                                                      // add the instance to the array list
            }
            return plst;
        } catch (Exception e) {                                                                     // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                    // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                    // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    /**
     * method to get student details with gpa details
     *
     * @return
     */
    ArrayList<FourthYears> getFourthYears(String facultyName, String yos) {

        ArrayList<FourthYears> fyrs = new ArrayList<FourthYears>();                                                                             // array list to store student details

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                                                            // establishing connection with the database
            String query = "SELECT * FROM ranking WHERE reg_number IN (SELECT reg_number FROM students WHERE faculty ='" + facultyName + "') AND yos = '" + yos + "'";  // query
            pst = (PreparedStatement) con.prepareStatement(query);                                                                              // preaparing the query to execute     

            ResultSet rs = pst.executeQuery();                                                                                                  // execute the query

            while (rs.next()) {
                FourthYears fyr = new FourthYears();                                                                                            // instance to store student details

                fyr.setRegNumber(rs.getString(1));                                                                                              // setting student details
                fyr.setGpa(rs.getString(2));                                                                                                    // setting student details
                fyr.setYos(rs.getString(3));                                                                                                    // setting student details

                fyrs.add(fyr);                                                                                                                  //adding instance to the array list
            }
            return fyrs;
        } catch (Exception e) {                                                                                                                 // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                                                                // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                                                                // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    ArrayList<Lecturers> getLecturerDetails() {

        ArrayList<Lecturers> lec = new ArrayList<Lecturers>();                                                                                  // array list to store student details

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                                                            // establishing connection with the database
            String query = "SELECT * FROM lecturer";                                                                                            // query
            pst = (PreparedStatement) con.prepareStatement(query);                                                                              // preaparing the query to execute     

            ResultSet rs = pst.executeQuery();                                                                                                  // execute the query

            while (rs.next()) {
                Lecturers l = new Lecturers();

                l.setLecID(rs.getString(1));
                l.setName(rs.getString(2));
                l.setEmail(rs.getString(3));
                l.setPhoneNumber(rs.getInt(4));
                l.setPosition(rs.getString(5));
                l.setFaculty(rs.getString(6));

                lec.add(l);
            }
            return lec;
        } catch (Exception e) {                                                                                                                 // exception handling
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                                                                // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                                                                // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }

    boolean deleteLecturer(String lecID) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                                                            // establishing connection with the database
            String query = "DELETE FROM lecturer WHERE lec_id = '" + lecID + "'";                                                                                            // query
            pst = (PreparedStatement) con.prepareStatement(query);                                                                              // preaparing the query to execute     

            pst.executeUpdate();
            return true;
        } catch (Exception e) {                                                                                                                 // exception handling
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();                                                                                                                // closing the connection with the database
                }

                if (pst != null) {
                    pst.close();                                                                                                                // closing the prepared statement for reusing
                }
            } catch (Exception e) {

            }
        }
    }
}

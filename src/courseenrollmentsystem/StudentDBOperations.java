/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.io.FileOutputStream;                                                                                // importing java libraries
import java.io.OutputStream;                                                                                    // importing java libraries
import java.sql.Connection;                                                                                     // importing java libraries
import java.sql.DriverManager;                                                                                  // importing java libraries
import java.sql.PreparedStatement;                                                                              // importing java libraries
import java.sql.ResultSet;                                                                                      // importing java libraries
import java.util.ArrayList;                                                                                     // importing java libraries
import java.util.Calendar;                                                                                      // importing java libraries

/**
 *
 * @author Sono
 */
public class StudentDBOperations {

    String url = "jdbc:mysql://localhost:3306/nsbm_database";                                                   // url to connect database
    String username = "root";                                                                                   // username to access database
    String password = "";                                                                                       // password to access database
    Connection con = null;                                                                                      // connection variable to create connection
    PreparedStatement pst = null;                                                                               // variable to store preapared query

    /**
     * method to add undergraduate student
     *
     */
    boolean addUndergraduate(Undergraduate und) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                            // trying to connect with the database
            String query = "INSERT INTO undergraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";              // sql query to access mydql
            String queryEx = "INSERT INTO students VALUES (?,?,?)";                                             // query two
            pst = (PreparedStatement) con.prepareStatement(query);                                              //make query as a statement
            PreparedStatement pstEx = con.prepareStatement(queryEx);

            pst.setString(1, und.getRegNum());                                                                  // configer frontend data with the query statement
            pst.setString(2, und.getFullName());                                                                // configer frontend data with the query statement
            pst.setString(3, und.getNic());                                                                     // configer frontend data with the query statement
            pst.setString(4, und.getAddress());                                                                 // configer frontend data with the query statement
            pst.setInt(5, und.getPhoneNumber());                                                                // configer frontend data with the query statement
            pst.setString(6, und.getDob());                                                                     // configer frontend data with the query statement
            pst.setString(7, und.getEmail());                                                                   // configer frontend data with the query statement
            pst.setString(8, und.getPassword());                                                                // configer frontend data with the query statement
            pst.setInt(9, und.getIndexNumber());                                                                // configer frontend data with the query statement
            pst.setString(10, und.getStream());                                                                 // configer frontend data with the query statement
            pst.setString(11, und.getStream());                                                                 // configer frontend data with the query statement
            pst.setInt(12, und.getIslandRank());                                                                // configer frontend data with the query statement
            pst.setString(13, und.getFacultyName());                                                            // configer frontend data with the query statement
            pstEx.setString(1, und.getRegNum());
            pstEx.setString(2, und.getFacultyName());
            pstEx.setString(3, und.getEmail());

            pst.executeUpdate();                                                                                //execute the query and insert the data into the database
            pstEx.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }
        }
        return true;
    }

    /**
     * method to add postgraduate student
     *
     */
    boolean addPostgrasuate(Postgraduate pgs) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);                            // trying to connect with the database
            String query = "INSERT INTO postgraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";               // sql query to access mydql
            String queryEx = "INSERT INTO students VALUES (?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);                                              //make the query as a statement
            PreparedStatement pstEx = con.prepareStatement(queryEx);

            pst.setString(1, pgs.getRegNum());                                                                  // configer frontend data with the query statement
            pst.setString(2, pgs.getFullName());                                                                // configer frontend data with the query statement
            pst.setString(3, pgs.getNic());                                                                     // configer frontend data with the query statement
            pst.setString(4, pgs.getAddress());                                                                 // configer frontend data with the query statement
            pst.setInt(5, pgs.getPhoneNumber());                                                                // configer frontend data with the query statement
            pst.setString(6, pgs.getDob());                                                                     // configer frontend data with the query statement
            pst.setString(7, pgs.getEmail());                                                                   // configer frontend data with the query statement
            pst.setString(8, pgs.getPassword());                                                                // configer frontend data with the query statement
            pst.setString(9, pgs.getInstitute());                                                               // configer frontend data with the query statement
            pst.setInt(10, pgs.getYoc());                                                                       // configer frontend data with the query statement
            pst.setString(11, pgs.getQualification());                                                          // configer frontend data with the query statement
            pst.setString(12, pgs.getFacultyName());                                                            // configer frontend data with the query statement
            pst.setString(13, pgs.getDegreeType());                                                             // configer frontend data with the query statement
            pstEx.setString(1, pgs.getRegNum());
            pstEx.setString(2, pgs.getFacultyName());
            pstEx.setString(3, pgs.getEmail());

            pst.executeUpdate();  // execute the query
            pstEx.executeUpdate();

        } catch (Exception e) {
        }

        return true;
    }

    /**
     * method to get assignment details
     *
     */
    ArrayList<Assignment> getAssignmentList(String facultyName, String year) {

        ArrayList<Assignment> lst = new ArrayList<Assignment>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM assignments WHERE subject_name IN (SELECT name FROM subjects WHERE course ='" + facultyName + "' AND yos = '" + year + "')";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Assignment asg = new Assignment();
                asg.setAssignmentID(rs.getInt(1));
                asg.setSubjetcName(rs.getString(2));
                asg.setDate(rs.getString(3));
                asg.setPosterID(rs.getString(4));
                asg.setPlace(rs.getString(5));

                lst.add(asg);
            }
            return lst;
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

    /**
     * method to get lab session details
     *
     */
    ArrayList<LabSession> getLabSessionDetails(String facultyName, String year) {

        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lab_sessions WHERE subject_name IN (SELECT name FROM subjects WHERE course ='" + facultyName + "' AND yos = '" + year + "')";
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

    /**
     * method to insert semester details
     *
     */
    boolean insertSemesterSubjects(String[] subjects, String regNumber, String yos) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query1 = "INSERT INTO semester_1_subjects VALUES (?,?,?,?,?,?,?)";
            String query2 = "INSERT INTO semester_2_subjects VALUES (?,?,?,?,?,?,?)";

            PreparedStatement pst2 = (PreparedStatement) con.prepareStatement(query2);
            pst = (PreparedStatement) con.prepareStatement(query1);

            pst.setString(1, regNumber);
            pst.setInt(2, 1);
            pst.setString(3, subjects[0]);
            pst.setString(4, subjects[1]);
            pst.setString(5, subjects[2]);
            pst.setString(6, subjects[3]);
            pst.setString(7, yos);

            pst2.setString(1, regNumber);
            pst2.setInt(2, 2);
            pst2.setString(3, subjects[4]);
            pst2.setString(4, subjects[5]);
            pst2.setString(5, subjects[6]);
            pst2.setString(6, subjects[7]);
            pst2.setString(7, yos);

            pst.executeUpdate();
            pst2.executeUpdate();

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

    /**
     * method to get subject details
     *
     */
    ArrayList<Subject> getSubjectDetails(String regNum, String facultyName, String year) {

        ArrayList<Subject> sbjList = new ArrayList<Subject>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "";
            if (regNum.charAt(1) == 'U') {
                query = "SELECT * FROM subjects WHERE course ='" + facultyName + "' AND yos = '" + year + "' AND degree_type='BSc'";
            } else {
                query = "SELECT * FROM subjects WHERE course ='" + facultyName + "' AND yos = '" + year + "' AND degree_type='Msc'";
            }

            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Subject sbj = new Subject();

                sbj.setSubCode(rs.getString(1));
                sbj.setName(rs.getString(2));
                sbj.setSemester(rs.getInt(3));
                sbj.setCredits(rs.getInt(4));
                sbj.setCourseFee(rs.getInt(6));
                sbj.setCompulsoraTag(rs.getString(7));
                sbj.setYear(rs.getString(8));

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

    /**
     * method to authenticate undergraduate login
     *
     */
    boolean undergraduateStudentVerification(Undergraduate und) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT reg_number,password FROM undergraduate_student";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            String tempPasswordHolder = "";
            while (rs.next()) {
                if (rs.getString(1).equals(und.getRegNum())) {
                    tempPasswordHolder = rs.getString(2);
                }
            }

            if (tempPasswordHolder.equals(und.getPassword())) {
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

    /**
     * method to authenticate postgraduate login
     *
     */
    boolean postgraduateStudentVerification(Postgraduate pgs) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT  reg_number,password FROM postgraduate_student";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            String tempPasswordHolder = "";
            while (rs.next()) {
                if (rs.getString(1).equals(pgs.getRegNum())) {
                    tempPasswordHolder = rs.getString(2);
                }
            }

            if (tempPasswordHolder.equals(pgs.getPassword())) {
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

    /**
     * method to get payment details
     *
     */
    ArrayList<Payment> getPaymentDetails(String regNumber) {

        ArrayList<Payment> plst = new ArrayList<>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM payments WHERE reg_number='" + regNumber + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Payment pay = new Payment();

                pay.setPayID(rs.getInt(1));
                pay.setAmount(rs.getString(2));
                pay.setSemester(rs.getInt(3));
                pay.setCourse(rs.getString(4));
                pay.setRegNumber(regNumber);

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

    /**
     * method to insert payment details
     *
     */
    boolean insertPayments(Payment pay) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO payments VALUES (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, pay.getPayID());
            pst.setString(2, pay.getAmount());
            pst.setInt(3, pay.getSemester());
            pst.setString(4, pay.getCourse());
            pst.setString(5, pay.getRegNumber());
            pst.setString(6, pay.getYear());

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

    /**
     * method to get first semester payment details
     *
     */
    int getFirstSemesterAmountToPay(String regNumber, String yos) {
        try {
            int total = 0;
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query1 = "SELECT course_fee FROM subjects WHERE name IN (SELECT first FROM semester_1_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='1')";
            String query2 = "SELECT course_fee FROM subjects WHERE name IN (SELECT second FROM semester_1_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='1')";
            String query3 = "SELECT course_fee FROM subjects WHERE name IN (SELECT third FROM semester_1_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='1')";
            String query4 = "SELECT course_fee FROM subjects WHERE name IN (SELECT fourth FROM semester_1_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='1')";
            
            pst = (PreparedStatement) con.prepareStatement(query1);
            PreparedStatement pst2 = (PreparedStatement) con.prepareStatement(query2);
            PreparedStatement pst3 = (PreparedStatement) con.prepareStatement(query3);
            PreparedStatement pst4 = (PreparedStatement) con.prepareStatement(query4);

            ResultSet rs1 = pst.executeQuery();
            rs1.next();
            ResultSet rs2 = pst2.executeQuery();
            rs2.next();
            ResultSet rs3 = pst3.executeQuery();
            rs3.next();
            ResultSet rs4 = pst4.executeQuery();
            rs4.next();
            
            total = rs1.getInt(1) + rs2.getInt(1) + rs3.getInt(1) + rs4.getInt(1);

            return total;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
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

    /**
     * method to get second semester payment details
     *
     */
    int getSecondSemesterAmountToPay(String regNumber, String yos) {
        try {
            int total = 0;
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query1 = "SELECT course_fee FROM subjects WHERE name IN (SELECT first FROM semester_2_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='2')";
            String query2 = "SELECT course_fee FROM subjects WHERE name IN (SELECT second FROM semester_2_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='2')";
            String query3 = "SELECT course_fee FROM subjects WHERE name IN (SELECT third FROM semester_2_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='2')";
            String query4 = "SELECT course_fee FROM subjects WHERE name IN (SELECT fourth FROM semester_2_subjects WHERE reg_number ='" + regNumber + "' AND yos = '" + yos + "' AND semester='2')";
            
            pst = (PreparedStatement) con.prepareStatement(query1);
            PreparedStatement pst2 = (PreparedStatement) con.prepareStatement(query2);
            PreparedStatement pst3 = (PreparedStatement) con.prepareStatement(query3);
            PreparedStatement pst4 = (PreparedStatement) con.prepareStatement(query4);

            ResultSet rs1 = pst.executeQuery();
            rs1.next();
            ResultSet rs2 = pst2.executeQuery();
            rs2.next();
            ResultSet rs3 = pst3.executeQuery();
            rs3.next();
            ResultSet rs4 = pst4.executeQuery();
            rs4.next();
            
            total = rs1.getInt(1) + rs2.getInt(1) + rs3.getInt(1) + rs4.getInt(1);

            return total;
        } catch (Exception e) {
            return 0;
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

    /**
     * method to get faculty details
     *
     */
    Student getFacultyName(String regNumber) {
        Student st = new Student();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "";
            if (regNumber.charAt(1) == 'U') {
                query = "SELECT faculty FROM undergraduate_student WHERE reg_number ='" + regNumber + "'";
            } else if (regNumber.charAt(1) == 'P') {
                query = "SELECT faculty FROM postgraduate_student WHERE reg_number ='" + regNumber + "'";
            }

            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                st.setFacultyName(rs.getString("faculty"));
            }
            return st;
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

    /**
     * method to get first semester subject details
     *
     */
    boolean updateFirstSemesterSubjects(String sjdet[], int sem, String yos) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "";
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

            if (month == 2) {
                query = "UPDATE semester_1_subjects SET first = '" + sjdet[1] + "', second ='" + sjdet[2] + "', third = '" + sjdet[3] + "', fourth = '" + sjdet[4] + "' WHERE reg_number ='" + sjdet[0] + "' AND semester ='" + sem + "' AND yos = '" + yos + "'";
            } else {
                return false;
            }

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

    /**
     * method to get second semester subject details
     *
     */
    boolean updateSecondSemesterSubjects(String sjdet[], int sem, String yos) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "";
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

            if (month == 7 || month == 2) {
                query = "UPDATE semester_2_subjects SET first = '" + sjdet[1] + "', second ='" + sjdet[2] + "', third = '" + sjdet[3] + "', fourth = '" + sjdet[4] + "' WHERE reg_number ='" + sjdet[0] + "' AND semester ='" + sem + "' AND yos = '" + yos + "'";
            } else {
                return false;
            }

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

    /**
     * method to get current gpa details
     *
     */
    FourthYears getSemesterGPA(String regNumber, int sem) {

        FourthYears f = new FourthYears();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM ranking WHERE reg_number='" + regNumber + "' AND semester ='" + sem + "'";

            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                f.setGpa(rs.getString(2));
                f.setSub1(rs.getString(4));
                f.setSub2(rs.getString(6));
                f.setSub3(rs.getString(8));
                f.setSub4(rs.getString(10));
                f.setSub5(rs.getString(12));
                f.setSub6(rs.getString(14));
                f.setSub7(rs.getString(16));
                f.setSub8(rs.getString(18));
                f.setRes1(rs.getString(5));
                f.setRes2(rs.getString(7));
                f.setRes3(rs.getString(9));
                f.setRes4(rs.getString(11));
                f.setRes5(rs.getString(13));
                f.setRes6(rs.getString(15));
                f.setRes7(rs.getString(17));
                f.setRes8(rs.getString(19));
            }

            return f;
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

    /**
     * method to get result details
     *
     */
    ArrayList<Results> getResultDetails() {

        ArrayList<Results> res = new ArrayList<Results>();
        byte[] fileBytes;

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM results";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Results r = new Results();
                r.setSubjectName(rs.getString(1));
//                fileBytes = rs.getBytes(4);
//                OutputStream targetFile = new FileOutputStream(rs.getString(4));
//                targetFile.write(fileBytes);
//                targetFile.close();
                r.setName(rs.getString(4));
                res.add(r);
            }
            return res;
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

    /**
     * method to download exam pdf files
     *
     */
    boolean donwloadFile(String fileName) {
        byte[] fileBytes;

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM results WHERE file_name='" + fileName + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                fileBytes = rs.getBytes(3);
                OutputStream targetFile = new FileOutputStream("C:\\Users\\Public\\Documents\\" + rs.getString(4));
                targetFile.write(fileBytes);
                targetFile.close();
            }
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

    ArrayList<LecturerNotes> getLecturerNotes() {
        ArrayList<LecturerNotes> lecNotes = new ArrayList<LecturerNotes>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lec_notes";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

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

    boolean downloadLecturerNotes(LecturerNotes ln) {
        byte[] fileBytes;

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lec_notes WHERE file_name='" + ln.getFileName() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                fileBytes = rs.getBytes(4);
                OutputStream targetFile = new FileOutputStream("C:\\Users\\Public\\Documents\\" + rs.getString(2));
                targetFile.write(fileBytes);
                targetFile.close();
            }
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

    String getCurrentGPA(String regNumber) {
        String gpa = "";
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT gpa FROM ranking WHERE reg_number='" + regNumber + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            double tmp = 0;
            int count = 1;

            while (rs.next()) {
                tmp += rs.getDouble(1);
                count++;
            }

            if (tmp > 0) {
                gpa = Double.toString(tmp / count);
            }
            return gpa;

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

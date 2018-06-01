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
import java.util.Calendar;

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

    boolean addUndergraduate(Undergraduate und) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password); // trying to connect with the database
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

    boolean addPostgrasuate(Postgraduate pgs) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password); // trying to connect with the database
            String query = "INSERT INTO postgraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; // sql query to access mydql
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
            pst.setString(12, pgs.getFacultyName()); // configer frontend data with the query statement
            pst.setString(13, pgs.getDegreeType()); // configer frontend data with the query statement

            pst.executeUpdate();  // execute the query

        } catch (Exception e) {
        }

        return true;
    }

    ArrayList<Assignment> getAssignmentList(String facultyName) {

        ArrayList<Assignment> lst = new ArrayList<Assignment>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM assignments WHERE subject_name IN (SELECT name FROM subjects WHERE course ='"+facultyName+"')";
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

    ArrayList<LabSession> getLabSessionDetails(String facultyName) {

        ArrayList<LabSession> lbSessions = new ArrayList<LabSession>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lab_sessions WHERE subject_name IN (SELECT name FROM subjects WHERE course ='"+facultyName+"')";
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

    ArrayList<Subject> getSubjectDetails(String facultyName) {

        ArrayList<Subject> sbjList = new ArrayList<Subject>();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM subjects WHERE course ='"+facultyName+"'";
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

                sbjList.add(sbj);
            }
            return sbjList;
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

    boolean insertPayments(Payment pay) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO payments VALUES (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, pay.getPayID());
            pst.setString(2, pay.getAmount());
            pst.setInt(3, pay.getSemester());
            pst.setString(4, pay.getCourse());
            pst.setString(5, pay.getRegNumber());

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

    int getFirstSemesterAmountToPay(String regNumber) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT SUM(course_fee) FROM subjects WHERE name IN (SELECT first,second,third,fourth FROM semester_1_subjects WHERE reg_number ='" + regNumber + "')";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            
            return rs.getInt(1);
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
    
    int getSecondSemesterAmountToPay(String regNumber) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT SUM(course_fee) FROM subjects WHERE name IN (SELECT first,second,third,fourth FROM semester_2_subjects WHERE reg_number ='" + regNumber + "')";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            
            return rs.getInt(1);
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
    
    Student getFacultyName(String regNumber){
        Student st = new Student();
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);
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
    
    boolean updateFirstSemesterSubjects(String sjdet[], int sem){
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "";
            int month = Calendar.getInstance().get(Calendar.MONTH)+1;
            
            if (month==2) {
                query = "UPDATE semester_1_subjects SET reg_number ='"+sjdet[0]+"', semester ='"+sem+"', first = '"+sjdet[1]+"', second ='"+sjdet[2]+"', third = '"+sjdet[3]+"', fourth = '"+sjdet[4]+"'";
            }else{
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
    
    boolean updateSecondSemesterSubjects(String sjdet[], int sem){
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "";
            int month = Calendar.getInstance().get(Calendar.MONTH)+1;
            
            if (month==7 || month==2) {
                query = "UPDATE semester_2_subjects SET reg_number ='"+sjdet[0]+"', semester ='"+sem+"', first = '"+sjdet[1]+"', second ='"+sjdet[2]+"', third = '"+sjdet[3]+"', fourth = '"+sjdet[4]+"'";
            }else{
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

    double getCurrentGPA(String regNumber) {
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT gpa FROM ranking WHERE reg_number='"+regNumber+"'";
            
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            int count = 1;
            double gpa = 0;
            
            while(rs.next()){
                gpa += Integer.parseInt(rs.getString(1));
                count++;
            }
            return (gpa/count);
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

   
}

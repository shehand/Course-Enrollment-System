/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.io.File;
import java.io.FileInputStream;
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

    boolean insertNewLabSession(LabSession lbs) {
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

    boolean instructorAuthentication(Instructor inst) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT reg_number,password FROM instrucor_details";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            String tempPasswordHolder = "";
            while (rs.next()) {
                if (rs.getString(1).equals(inst.getInstructorID())) {
                    tempPasswordHolder = rs.getString(2);
                }
            }

            if (tempPasswordHolder.equals(inst.getPassword())) {
                return true;
            } else {
                return false;
            }
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

    boolean insertExamResults(File file, String subCode) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO results VALUES (?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            FileInputStream fis = new FileInputStream(file);
            int len = (int) file.length();

            pst.setString(1, subCode);
            pst.setInt(2, len);
            pst.setBinaryStream(3, fis, len);
            pst.setString(4, file.getName());
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

    ArrayList<StudentSubjects> getFirstSemesterSubjects() {

        ArrayList<StudentSubjects> sdSub = new ArrayList<>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM semester_1_subjects";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                StudentSubjects ss = new StudentSubjects();

                ss.setRegNum(rs.getString(1));
                ss.setSemester(rs.getString(2));
                ss.setFirst(rs.getString(3));
                ss.setSecond(rs.getString(4));
                ss.setThird(rs.getString(5));
                ss.setFourth(rs.getString(6));
                ss.setYos(rs.getString(7));

                sdSub.add(ss);
            }

            return sdSub;

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

    ArrayList<StudentSubjects> getSecondSemesterSubjects() {

        ArrayList<StudentSubjects> sdSub = new ArrayList<>();

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM semester_2_subjects";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                StudentSubjects ss = new StudentSubjects();

                ss.setRegNum(rs.getString(1));
                ss.setSemester(rs.getString(2));
                ss.setFirst(rs.getString(3));
                ss.setSecond(rs.getString(4));
                ss.setThird(rs.getString(5));
                ss.setFourth(rs.getString(6));
                ss.setYos(rs.getString(7));

                sdSub.add(ss);
            }

            return sdSub;

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

    String getStudentCourse(String regNum) {
        try {
            String result = "";
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT course FROM payments WHERE reg_number ='" + regNum + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                result = rs.getString(1);
            }

            return result;

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

    String[] getCompulsorySubjectDetails(String courseName) {

        String sub[] = new String[4];
        try {

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT name FROM subjects WHERE course ='" + courseName + "' AND compulsory ='C'";
            pst = (PreparedStatement) con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                sub[count++] = rs.getString(1);
            }
            return sub;

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

    boolean insertResults(FourthYears f) {
        try {

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO ranking VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.setString(1, f.getRegNumber());
            pst.setString(2, f.getGpa());
            pst.setString(3, f.getYos());
            pst.setString(4, f.getSub1());
            pst.setString(5, f.getRes1());
            pst.setString(6, f.getSub2());
            pst.setString(7, f.getRes2());
            pst.setString(8, f.getSub3());
            pst.setString(9, f.getRes3());
            pst.setString(10, f.getSub4());
            pst.setString(11, f.getRes4());
            pst.setString(12, f.getSub5());
            pst.setString(13, f.getRes5());
            pst.setString(14, f.getSub6());
            pst.setString(15, f.getRes6());
            pst.setString(16, f.getSub7());
            pst.setString(17, f.getRes7());
            pst.setString(18, f.getSub8());
            pst.setString(19, f.getRes8());
            pst.setString(20, f.getSemester());
            
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

}

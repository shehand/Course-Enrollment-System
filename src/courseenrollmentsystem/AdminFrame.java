/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;         // importing libraries
import javax.swing.JOptionPane;     // importing libraries
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Sono
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        loadInstructorDetails();                // load table at the very first of profile loading
        loadSubjectDetails();                   // load table at the very first of profile loading
        loadTransactionDetails();               // load table at the very first of profile loading
        loadFourthYearStudents();               // load table at the very first of profile loading
        loadLecturerDetails();                  // load table at the very first of profile loading
        loadStudentDetails();                   // load table at the very first of profile loading
    }

    AdminDBOperations adminOps = new AdminDBOperations();               // instance for do back end operations belong to administrator
    ArrayList<Instructor> instDetails;                                  // array list for hosling instructor details when instructor details loading to the instructor details table
    ArrayList<Subject> sbjDetails;                                      // array list for holding subject details when subject details table loading
    ArrayList<Payment> payDetails;                                      // array list to store payment details for table details loading
    ArrayList<FourthYears> fourthYears;                                 // array list to store fourth year details for table fourth year details loading
    ArrayList<Lecturers> lecDetails;                                    // array list to store lecturer details for table lecturer details loading
    ArrayList<Student> stuDetails;                                      // array list to store student details for table student details loading

    /**
     * method to load the instructor details table
     *
     */
    void loadInstructorDetails() {
        instDetails = adminOps.getInstructorDetails();                          // retrieving the array list from the backend
        InstructorDetails instDetail = new InstructorDetails(instDetails);      // create an instance of table loading class
        tblInstructorDetails.setModel(instDetail);                              // loading the table
    }

    /**
     * method to load the subject details
     *
     */
    void loadSubjectDetails() {
        sbjDetails = adminOps.getSubjectDetails();                              // retrieving the array list from the backend
        SubjectDetails sbj = new SubjectDetails(sbjDetails);                    // create an instance of table loading class
        tblSubjectDetails.setModel(sbj);                                        // loading the table
    }

    /**
     * method to load the transaction details
     *
     */
    void loadTransactionDetails() {
        payDetails = adminOps.getPaymentDetails();                              // retrieving the array list from the backend
        PaymentDetails pay = new PaymentDetails(payDetails);                    // create an instance of table loading class
        tblTransactionDetails.setModel(pay);                                    // loading the table
    }

    /**
     * method to load fourth year selections details
     *
     */
    void loadFourthYearStudents() {
        fourthYears = adminOps.getFourthYears(cmboFacultyFourth.getSelectedItem().toString(), cmboYear.getSelectedItem().toString());  // retrieving the array list from the backend
        FourthYearDetails frDetails = new FourthYearDetails(fourthYears);                       // create an instance of table loading class
        tblFourthYears.setModel(frDetails);                                                     // loading the table
    }
    
    /**
     * method to load lecturer selections details
     *
     */
    void loadLecturerDetails() {
        lecDetails = adminOps.getLecturerDetails();
        LecturrerDetails lecDet = new LecturrerDetails(lecDetails);
        tblLecturerDetails.setModel(lecDet);
    }
    
    /**
     * method to load student selections details
     *
     */
    void loadStudentDetails() {
        stuDetails = adminOps.getStudentDetails(cmboUnderOrPost.getSelectedItem().toString(), cmboBscMsc.getSelectedItem().toString());
        StudentDetails std = new StudentDetails(stuDetails);
        tblUndPostStudentDetails.setModel(std);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStudentRegistrationNumber = new javax.swing.JTextField();
        btnCheckAvailability = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUpPhoneNumber = new javax.swing.JTextField();
        txtUpAddress = new javax.swing.JTextField();
        txtUpNIC = new javax.swing.JTextField();
        txtUpFullName = new javax.swing.JTextField();
        txtUpDoB = new javax.swing.JTextField();
        txtUpEmail = new javax.swing.JTextField();
        btnUpdateStudent = new javax.swing.JButton();
        txtUpPassword = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFourthYears = new javax.swing.JTable();
        cmboFacultyFourth = new javax.swing.JComboBox<>();
        btnFacultyFourthYears = new javax.swing.JButton();
        cmboYear = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDeleteRegNumber = new javax.swing.JTextField();
        btnDeleteStudent = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnRegisterStudent = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRemoveInstructor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInstructorDetails = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtInstRegNumber = new javax.swing.JTextField();
        txtInstName = new javax.swing.JTextField();
        txtInstNIC = new javax.swing.JTextField();
        txtInstEmail = new javax.swing.JTextField();
        btnAddInstructor = new javax.swing.JButton();
        txtInstDoB = new javax.swing.JTextField();
        txtInstPassword = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        cmboFacultName = new javax.swing.JComboBox<>();
        txtDeleteInstID = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSubjectDetails = new javax.swing.JTable();
        btnRemoveSubject = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        txtSubjectName = new javax.swing.JTextField();
        txtSubjectCode = new javax.swing.JTextField();
        btnInsertSubject = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cmboSourseName = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtCourseFee = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cmboCompusoryTag = new javax.swing.JComboBox<>();
        cmboSemesterNumber = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cmboYoS = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        cmboDegreeType = new javax.swing.JComboBox<>();
        txtDeleteSubjectCode = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTransactionDetails = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblLecturerDetails = new javax.swing.JTable();
        btnInsertLecturer = new javax.swing.JButton();
        btnUpdateLecturer = new javax.swing.JButton();
        btnDeleteLecturer = new javax.swing.JButton();
        btnRefreshLec = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        cmboUnderOrPost = new javax.swing.JComboBox<>();
        cmboBscMsc = new javax.swing.JComboBox<>();
        btnViewStudentDetails = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblUndPostStudentDetails = new javax.swing.JTable();
        btnAdminLogout = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 248, 232));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Registration Number :");

        btnCheckAvailability.setBackground(new java.awt.Color(0, 0, 153));
        btnCheckAvailability.setText("Check Availability");
        btnCheckAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAvailabilityActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(232, 248, 232));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Full Name :");

        jLabel3.setText("NIC Number :");

        jLabel4.setText("Address :");

        jLabel5.setText("Phone Number :");

        jLabel6.setText("Date of Birth :");

        jLabel7.setText("E-mail :");

        jLabel8.setText("Password :");

        txtUpNIC.setEditable(false);

        txtUpFullName.setEditable(false);

        btnUpdateStudent.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateStudent.setText("Update");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdateStudent)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(txtUpAddress)
                            .addComponent(txtUpNIC)
                            .addComponent(txtUpDoB)
                            .addComponent(txtUpEmail)
                            .addComponent(txtUpFullName)
                            .addComponent(txtUpPassword))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUpFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUpNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUpPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUpDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateStudent)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckAvailability)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckAvailability))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Student Results Details");

        tblFourthYears.setBackground(new java.awt.Color(232, 248, 232));
        tblFourthYears.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFourthYears);

        cmboFacultyFourth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        btnFacultyFourthYears.setBackground(new java.awt.Color(0, 0, 153));
        btnFacultyFourthYears.setText("Load");
        btnFacultyFourthYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyFourthYearsActionPerformed(evt);
            }
        });

        cmboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 st Year", "2 nd Year", "3 nd Year", "4 nd Year" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmboFacultyFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFacultyFourthYears)
                        .addGap(17, 17, 17))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboFacultyFourth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacultyFourthYears)
                            .addComponent(cmboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBackground(new java.awt.Color(232, 248, 232));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Delete Student");

        jLabel11.setText("Registration Number :");

        btnDeleteStudent.setBackground(new java.awt.Color(204, 0, 51));
        btnDeleteStudent.setForeground(new java.awt.Color(204, 0, 0));
        btnDeleteStudent.setText("Delete");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteRegNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteStudent)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteStudent)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(232, 248, 232));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Register New Student :");

        btnRegisterStudent.setBackground(new java.awt.Color(0, 0, 153));
        btnRegisterStudent.setText("Register");
        btnRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterStudent)
                .addGap(36, 36, 36))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(43, 43, 43)
                .addComponent(btnRegisterStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student Management", jPanel2);

        btnRemoveInstructor.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoveInstructor.setForeground(new java.awt.Color(204, 0, 0));
        btnRemoveInstructor.setText("Remove Instructor");
        btnRemoveInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInstructorActionPerformed(evt);
            }
        });

        tblInstructorDetails.setBackground(new java.awt.Color(232, 248, 232));
        tblInstructorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblInstructorDetails);

        jPanel11.setBackground(new java.awt.Color(232, 248, 232));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Add a new Instructor ");

        jLabel14.setText("Name :");

        jLabel15.setText("Registered Number :");

        jLabel16.setText("Date of Birth :");

        jLabel17.setText("NIC NUmber :");

        jLabel18.setText("Email :");

        jLabel19.setText("Password :");

        btnAddInstructor.setBackground(new java.awt.Color(0, 0, 153));
        btnAddInstructor.setText("Register");
        btnAddInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInstructorActionPerformed(evt);
            }
        });

        jLabel32.setText("Faculty :");

        cmboFacultName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddInstructor))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInstRegNumber)
                            .addComponent(txtInstName, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtInstNIC)
                            .addComponent(txtInstEmail)
                            .addComponent(txtInstDoB)
                            .addComponent(txtInstPassword)
                            .addComponent(cmboFacultName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtInstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtInstRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtInstDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtInstNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtInstEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtInstPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(cmboFacultName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAddInstructor)
                .addContainerGap())
        );

        txtDeleteInstID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteInstIDActionPerformed(evt);
            }
        });

        jLabel25.setText("Instructor ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteInstID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveInstructor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveInstructor)
                    .addComponent(txtDeleteInstID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Instructor Management", jPanel3);

        tblSubjectDetails.setBackground(new java.awt.Color(232, 248, 232));
        tblSubjectDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblSubjectDetails);

        btnRemoveSubject.setBackground(new java.awt.Color(204, 0, 51));
        btnRemoveSubject.setForeground(new java.awt.Color(204, 0, 51));
        btnRemoveSubject.setText("Remove Subject");
        btnRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSubjectActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(232, 248, 232));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Insert New Subject");

        jLabel21.setText("Subject Code :");

        jLabel22.setText("Subject Name :");

        jLabel23.setText("Amount of Credits :");

        jLabel24.setText("Semester Number");

        btnInsertSubject.setText("Insert");
        btnInsertSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertSubjectActionPerformed(evt);
            }
        });

        jLabel27.setText("Course Name :");

        cmboSourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        jLabel28.setText("Course Fee :");

        jLabel29.setText("Cmpulsory or Not:");

        cmboCompusoryTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "NC" }));

        cmboSemesterNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel34.setText("Year to teach");

        cmboYoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 st Year", "2 nd Year", "3 nd Year", "4 nd Year" }));

        jLabel35.setText("Degree Type:");

        cmboDegreeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc", "Msc" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertSubject))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCredit)
                            .addComponent(txtSubjectName)
                            .addComponent(txtSubjectCode)
                            .addComponent(cmboSourseName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCourseFee)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(cmboSemesterNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmboYoS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(cmboCompusoryTag, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmboDegreeType, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cmboSemesterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(cmboYoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cmboSourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtCourseFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cmboCompusoryTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(cmboDegreeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsertSubject)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel26.setText("Subject Code");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveSubject))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveSubject)
                    .addComponent(txtDeleteSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Subject Management", jPanel4);

        tblTransactionDetails.setBackground(new java.awt.Color(232, 248, 232));
        tblTransactionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblTransactionDetails);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Payment Details", jPanel13);

        tblLecturerDetails.setBackground(new java.awt.Color(232, 248, 232));
        tblLecturerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblLecturerDetails);

        btnInsertLecturer.setBackground(new java.awt.Color(0, 0, 153));
        btnInsertLecturer.setText("Insert New Lecturer");
        btnInsertLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertLecturerActionPerformed(evt);
            }
        });

        btnUpdateLecturer.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateLecturer.setText("Update Lecturer");
        btnUpdateLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLecturerActionPerformed(evt);
            }
        });

        btnDeleteLecturer.setBackground(new java.awt.Color(204, 0, 0));
        btnDeleteLecturer.setForeground(new java.awt.Color(204, 0, 51));
        btnDeleteLecturer.setText("Delete Lecturer");
        btnDeleteLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLecturerActionPerformed(evt);
            }
        });

        btnRefreshLec.setBackground(new java.awt.Color(0, 0, 153));
        btnRefreshLec.setText("Refresh Table");
        btnRefreshLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshLecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertLecturer)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateLecturer)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteLecturer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
                .addComponent(btnRefreshLec))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertLecturer)
                    .addComponent(btnUpdateLecturer)
                    .addComponent(btnDeleteLecturer)
                    .addComponent(btnRefreshLec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lecturer Management", jPanel14);

        cmboUnderOrPost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Undergraduate", "Postgraduate" }));

        cmboBscMsc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc", "MSc" }));

        btnViewStudentDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnViewStudentDetails.setText("View Table");
        btnViewStudentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentDetailsActionPerformed(evt);
            }
        });

        tblUndPostStudentDetails.setBackground(new java.awt.Color(232, 248, 232));
        tblUndPostStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblUndPostStudentDetails);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmboUnderOrPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmboBscMsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewStudentDetails)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboUnderOrPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboBscMsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudentDetails))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student Details", jPanel16);

        btnAdminLogout.setBackground(new java.awt.Color(0, 0, 153));
        btnAdminLogout.setForeground(new java.awt.Color(0, 51, 153));
        btnAdminLogout.setText("Logout");
        btnAdminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLogoutActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1472541558_nsbm-logo.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/admin_v01D_support__1528706276_40500__1528706276_50386.png"))); // NOI18N
        jLabel31.setText("Admin Profile");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 204, 0));
        jLabel33.setText("NSBM Green University");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdminLogout)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdminLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33)))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogoutActionPerformed
        this.dispose();                                                                         // loging out from the system
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mf.setResizable(false);
    }//GEN-LAST:event_btnAdminLogoutActionPerformed

    /**
     * method to view the details of an existing student for updating process
     *
     *
     */
    private void btnCheckAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAvailabilityActionPerformed
        String tempRegNumber = txtStudentRegistrationNumber.getText();                          // assignning values
        Student st = adminOps.loadStudentDetails(tempRegNumber);                                // student instance to store values

        txtStudentRegistrationNumber.setText(st.getRegNum());                                   // assignning values
        txtUpFullName.setText(st.getFullName());                                                // assignning values
        txtUpNIC.setText(st.getNic());                                                          // assignning values
        txtUpAddress.setText(st.getAddress());                                                  // assignning values
        txtUpPhoneNumber.setText(Integer.toString(st.getPhoneNumber()));                        // assignning values
        txtUpDoB.setText(st.getDob());                                                          // assignning values
        txtUpEmail.setText(st.getEmail());                                                      // assignning values
        txtUpPassword.setText(st.getPassword());                                                // assignning values

    }//GEN-LAST:event_btnCheckAvailabilityActionPerformed

    /**
     * method to update student details
     *
     */
    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        Student st = new Student();                                                             // create student instance and assign values to it

        st.setRegNum(txtStudentRegistrationNumber.getText());                                   // assignning values
        st.setFullName(txtUpFullName.getText());                                                // assignning values
        st.setAddress(txtUpAddress.getText());                                                  // assignning values
        st.setPhoneNumber(Integer.parseInt(txtUpPhoneNumber.getText()));                        // assignning values
        st.setDob(txtUpDoB.getText());                                                          // assignning values
        st.setEmail(txtUpEmail.getText());                                                      // assignning values
        st.setPassword(txtUpPassword.getText());                                                // assignning values

        if (adminOps.updateStudent(st)) {
            JOptionPane.showMessageDialog(this, "Updated successfully");                        // message box
            txtStudentRegistrationNumber.setText("");                                           // assignning values
            txtUpNIC.setText("");                                                               // assignning values
            txtUpFullName.setText("");                                                          // assignning values
            txtUpAddress.setText("");                                                           // assignning values
            txtUpPhoneNumber.setText("");                                                       // assignning values
            txtUpDoB.setText("");                                                               // assignning values
            txtUpEmail.setText("");                                                             // assignning values
            txtUpPassword.setText("");                                                          // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Ops ! Something went wront. Please try again."); // message box
        }
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    /**
     * method to add new instructor to the system
     *
     */
    private void btnAddInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInstructorActionPerformed
        Instructor inst = new Instructor();                                                     // create an instance of instructor and assign values by setters

        inst.setName(txtInstName.getText());                                                    // assignning values
        inst.setInstructorID(txtInstRegNumber.getText());                                       // assignning values
        inst.setPassword(txtInstPassword.getText());                                            // assignning values
        inst.setEmail(txtInstEmail.getText());                                                  // assignning values
        inst.setDob(txtInstDoB.getText());                                                      // assignning values
        inst.setNic(txtInstNIC.getText());                                                      // assignning values
        inst.setFacultyName(cmboFacultName.getSelectedItem().toString());                       // assignning values

        if (adminOps.addInstructor(inst)) {                                                       // pass to do backend queries
            loadInstructorDetails();                                                            // refresh table
            JOptionPane.showMessageDialog(this, "Instructor added successfully");               // message box
            txtInstDoB.setText("");                                                             // assignning values
            txtInstEmail.setText("");                                                           // assignning values
            txtInstNIC.setText("");                                                             // assignning values
            txtInstName.setText("");                                                            // assignning values
            txtInstPassword.setText("");                                                        // assignning values
            txtInstRegNumber.setText("");                                                       // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Ops ! Something went wront. Please try again."); // message box
        }

    }//GEN-LAST:event_btnAddInstructorActionPerformed

    /**
     * method to remove existing instructor from the system
     *
     */
    private void btnRemoveInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInstructorActionPerformed
        txtDeleteInstID.setText(instDetails.get(tblInstructorDetails.getSelectedRow()).getInstructorID());
        
        String tmpID = txtDeleteInstID.getText();                                               // assignning values

        if (adminOps.removeInstructor(tmpID)) {
            loadInstructorDetails();                                                            // refresh table
            JOptionPane.showMessageDialog(this, "Instructor removed successfully");             // message box
            txtDeleteInstID.setText("");                                                        // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Can not find the Instructor details");         // message box
        }

    }//GEN-LAST:event_btnRemoveInstructorActionPerformed

    /**
     * method to insert new subject to the course
     *
     */
    private void btnInsertSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertSubjectActionPerformed
        Subject sbj = new Subject();                                                            // create instance of subject to set values

        sbj.setSubCode(txtSubjectCode.getText());                                               // assignning values
        sbj.setName(txtSubjectName.getText());                                                  // assignning values
        sbj.setSemester(Integer.parseInt(cmboSemesterNumber.getSelectedItem().toString()));                         // assignning values
        sbj.setCredits(Integer.parseInt(txtCredit.getText()));                                  // assignning values
        sbj.setCourse(cmboSourseName.getSelectedItem().toString());                             // assignning values
        sbj.setCourseFee(Integer.parseInt(txtCourseFee.getText()));                             // assignning values
        sbj.setCompulsoraTag(cmboCompusoryTag.getSelectedItem().toString());                    // assignning values
        sbj.setYear(cmboYoS.getSelectedItem().toString());
        sbj.setDegreeType(cmboDegreeType.getSelectedItem().toString());

        if (adminOps.insetNewSubject(sbj)) {
            loadSubjectDetails();                                                               // refresh table
            JOptionPane.showMessageDialog(this, "Subject addedd successfully");                 // message box
            txtSubjectCode.setText("");                                                         // assignning values
            txtSubjectName.setText("");                                                         // assignning values
            txtCredit.setText("");                                                              // assignning values
            txtCourseFee.setText("");                                                           // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Ops ! Something went wront. Please try again."); // message box
        }

    }//GEN-LAST:event_btnInsertSubjectActionPerformed

    /**
     * method to remove a subject from the course
     *
     */
    private void btnRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSubjectActionPerformed
        txtDeleteSubjectCode.setText(sbjDetails.get(tblSubjectDetails.getSelectedRow()).getSubCode());
        
        String tempID = txtDeleteSubjectCode.getText();                                         // assignning values

        if (adminOps.removeSubject(tempID)) {
            loadSubjectDetails();                                                               // refresh table
            JOptionPane.showMessageDialog(this, "Subject removed successfully");                // message box
            txtDeleteSubjectCode.setText("");                                                   // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Can not find the subject details");            // message box
        }

    }//GEN-LAST:event_btnRemoveSubjectActionPerformed

    /**
     * method to delete a student from the system
     *
     */
    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        String regNum = txtDeleteRegNumber.getText();                                           // assignning values
        if (adminOps.deleteStudent(regNum)) {
            JOptionPane.showMessageDialog(this, "Student details deleted successfully");        // message box
            txtDeleteRegNumber.setText("");                                                     // assignning values
        } else {
            JOptionPane.showMessageDialog(this, "Can not find the student details");            // message box
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    /**
     * method to reload student details
     *
     */
    private void btnFacultyFourthYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyFourthYearsActionPerformed
        fourthYears = adminOps.getFourthYears(cmboFacultyFourth.getSelectedItem().toString(), cmboYear.getSelectedItem().toString());// retrieving the array list from the backend
        FourthYearDetails frDetails = new FourthYearDetails(fourthYears);                                               // create an instance of table loading class
        tblFourthYears.setModel(frDetails);                                                                             // loading the table
    }//GEN-LAST:event_btnFacultyFourthYearsActionPerformed

    /**
     * method to register student
     *
     */
    private void btnRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterStudentActionPerformed
        StudentRegistrationFrame strf = new StudentRegistrationFrame();                             // instance to preview registration frame
        strf.setVisible(true);                                                                      // set vsisble
        strf.setResizable(false);                                                                   // set resiazable false
    }//GEN-LAST:event_btnRegisterStudentActionPerformed

    /**
     * method to insert lecturer
     *
     */
    private void btnInsertLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertLecturerActionPerformed
        InsertLecturerFrame isnt = new InsertLecturerFrame();
        isnt.setVisible(true);
        isnt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        isnt.setResizable(false);

        // listner to update table
        isnt.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadLecturerDetails();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }//GEN-LAST:event_btnInsertLecturerActionPerformed

    /**
     * method to update lecturer
     *
     */
    private void btnUpdateLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLecturerActionPerformed
        UpdateLecturerFrame uplec = new UpdateLecturerFrame();
        uplec.setVisible(true);
        uplec.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        uplec.setResizable(false);
        uplec.setFields(lecDetails.get(tblLecturerDetails.getSelectedRow()));
        // listner to update table
        uplec.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadLecturerDetails();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }//GEN-LAST:event_btnUpdateLecturerActionPerformed
    /**
     * method to delete lecturer
     *
     */
    
    private void btnDeleteLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLecturerActionPerformed
        String id = lecDetails.get(tblLecturerDetails.getSelectedRow()).getLecID();

        if (adminOps.deleteLecturer(id)) {
            JOptionPane.showMessageDialog(this, "Row deleted successfully");
            loadLecturerDetails();
        } else {
            JOptionPane.showMessageDialog(this, "Oops, Something went wrong");
        }
    }//GEN-LAST:event_btnDeleteLecturerActionPerformed

    /**
     * method to refresh table
     *
     */
    private void btnRefreshLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshLecActionPerformed
        loadLecturerDetails();
    }//GEN-LAST:event_btnRefreshLecActionPerformed

    private void btnViewStudentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentDetailsActionPerformed
        loadStudentDetails();
    }//GEN-LAST:event_btnViewStudentDetailsActionPerformed

    private void txtDeleteInstIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteInstIDActionPerformed
        
    }//GEN-LAST:event_txtDeleteInstIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInstructor;
    private javax.swing.JButton btnAdminLogout;
    private javax.swing.JButton btnCheckAvailability;
    private javax.swing.JButton btnDeleteLecturer;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnFacultyFourthYears;
    private javax.swing.JButton btnInsertLecturer;
    private javax.swing.JButton btnInsertSubject;
    private javax.swing.JButton btnRefreshLec;
    private javax.swing.JButton btnRegisterStudent;
    private javax.swing.JButton btnRemoveInstructor;
    private javax.swing.JButton btnRemoveSubject;
    private javax.swing.JButton btnUpdateLecturer;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnViewStudentDetails;
    private javax.swing.JComboBox<String> cmboBscMsc;
    private javax.swing.JComboBox<String> cmboCompusoryTag;
    private javax.swing.JComboBox<String> cmboDegreeType;
    private javax.swing.JComboBox<String> cmboFacultName;
    private javax.swing.JComboBox<String> cmboFacultyFourth;
    private javax.swing.JComboBox<String> cmboSemesterNumber;
    private javax.swing.JComboBox<String> cmboSourseName;
    private javax.swing.JComboBox<String> cmboUnderOrPost;
    private javax.swing.JComboBox<String> cmboYear;
    private javax.swing.JComboBox<String> cmboYoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblFourthYears;
    private javax.swing.JTable tblInstructorDetails;
    private javax.swing.JTable tblLecturerDetails;
    private javax.swing.JTable tblSubjectDetails;
    private javax.swing.JTable tblTransactionDetails;
    private javax.swing.JTable tblUndPostStudentDetails;
    private javax.swing.JTextField txtCourseFee;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtDeleteInstID;
    private javax.swing.JTextField txtDeleteRegNumber;
    private javax.swing.JTextField txtDeleteSubjectCode;
    private javax.swing.JTextField txtInstDoB;
    private javax.swing.JTextField txtInstEmail;
    private javax.swing.JTextField txtInstNIC;
    private javax.swing.JTextField txtInstName;
    private javax.swing.JPasswordField txtInstPassword;
    private javax.swing.JTextField txtInstRegNumber;
    private javax.swing.JTextField txtStudentRegistrationNumber;
    private javax.swing.JTextField txtSubjectCode;
    private javax.swing.JTextField txtSubjectName;
    private javax.swing.JTextField txtUpAddress;
    private javax.swing.JTextField txtUpDoB;
    private javax.swing.JTextField txtUpEmail;
    private javax.swing.JTextField txtUpFullName;
    private javax.swing.JTextField txtUpNIC;
    private javax.swing.JPasswordField txtUpPassword;
    private javax.swing.JTextField txtUpPhoneNumber;
    // End of variables declaration//GEN-END:variables
}

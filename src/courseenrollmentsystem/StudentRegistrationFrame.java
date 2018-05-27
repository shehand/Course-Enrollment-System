/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Sono
 */
public class StudentRegistrationFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public StudentRegistrationFrame() {
        initComponents();
    }

    StudentDBOperations sdbOps = new StudentDBOperations();  // created an instance of student db operation class to connect backend with frontend
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbdRegistration = new javax.swing.JTabbedPane();
        jpnlUnergraduate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullNameUnd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNICUnd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddressUnd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumberUnd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmailUnd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPasswordUnd = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtDoBUnd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIndexNumberUnd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStreamUnd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtZScoreUnd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIslandRankUnd = new javax.swing.JTextField();
        btnCancelUnd = new javax.swing.JButton();
        btnRegisterUnd = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cmboUndergraduate = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtUndRegNumber = new javax.swing.JTextField();
        jpnlPostgaduate = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPhoneNumberPost = new javax.swing.JTextField();
        txtPasswordPost = new javax.swing.JPasswordField();
        txtEmailPost = new javax.swing.JTextField();
        txtdoBPost = new javax.swing.JTextField();
        txtFullNamePost = new javax.swing.JTextField();
        txtNICPost = new javax.swing.JTextField();
        txtAddressPost = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtYoCPost = new javax.swing.JTextField();
        txtInstitutePost = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtQualificationPost = new javax.swing.JTextField();
        btnCancelPost = new javax.swing.JButton();
        btnRegisterPost = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmboPostgraduate = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtPostRegNumber = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cmboDegreeType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmStudentReg"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Registration"));

        jLabel1.setText("Fill following details for Student registration process");

        jLabel2.setText("Full name :");

        txtFullNameUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameUndActionPerformed(evt);
            }
        });

        jLabel3.setText("NIC number :");

        txtNICUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICUndActionPerformed(evt);
            }
        });

        jLabel4.setText("Address :");

        txtAddressUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressUndActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone Number :");

        jLabel6.setText("Basic Informations");

        jLabel7.setText("A/L Results");

        jLabel8.setText("e-mail :");

        txtEmailUnd.setToolTipText("");

        jLabel9.setText("Password :");

        jLabel10.setText("Date of Birth :");

        jLabel11.setText("A/L Index Number :");

        jLabel12.setText("Stream :");

        jLabel13.setText("Z-Score :");

        jLabel14.setText("Island Rank");

        btnCancelUnd.setText("Cancel");
        btnCancelUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUndActionPerformed(evt);
            }
        });

        btnRegisterUnd.setText("Register");
        btnRegisterUnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUndActionPerformed(evt);
            }
        });

        jLabel28.setText("Choose your Faculty :");

        cmboUndergraduate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        jLabel30.setText("NSBM Registered Number :");

        javax.swing.GroupLayout jpnlUnergraduateLayout = new javax.swing.GroupLayout(jpnlUnergraduate);
        jpnlUnergraduate.setLayout(jpnlUnergraduateLayout);
        jpnlUnergraduateLayout.setHorizontalGroup(
            jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUnergraduateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterUnd)
                .addGap(18, 18, 18)
                .addComponent(btnCancelUnd)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUnergraduateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlUnergraduateLayout.createSequentialGroup()
                        .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNICUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddressUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullNameUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlUnergraduateLayout.createSequentialGroup()
                        .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhoneNumberUnd)
                            .addComponent(txtEmailUnd)
                            .addComponent(txtPasswordUnd)
                            .addComponent(txtDoBUnd, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUnergraduateLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(386, 386, 386))
                    .addGroup(jpnlUnergraduateLayout.createSequentialGroup()
                        .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlUnergraduateLayout.createSequentialGroup()
                                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIndexNumberUnd)
                                    .addComponent(txtStreamUnd)
                                    .addComponent(txtZScoreUnd)
                                    .addComponent(txtIslandRankUnd, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlUnergraduateLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(cmboUndergraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlUnergraduateLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(txtUndRegNumber)))
                        .addContainerGap())))
        );
        jpnlUnergraduateLayout.setVerticalGroup(
            jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUnergraduateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFullNameUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtIndexNumberUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNICUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtStreamUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtZScoreUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAddressUnd))
                .addGap(22, 22, 22)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumberUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtIslandRankUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoBUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel28)
                    .addComponent(cmboUndergraduate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPasswordUnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtUndRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jpnlUnergraduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelUnd)
                    .addComponent(btnRegisterUnd))
                .addContainerGap())
        );

        tbdRegistration.addTab("Undergraduate", jpnlUnergraduate);

        jLabel15.setText("Fill following details for Student registration process");

        jLabel16.setText("Basic Informations");

        jLabel17.setText("Advance Informations");

        jLabel18.setText("Full Name :");

        jLabel19.setText("NIC Number :");

        jLabel20.setText("Address :");

        jLabel21.setText("Phone Number :");

        jLabel22.setText("Date of Birth :");

        jLabel23.setText("e-mail");

        jLabel24.setText("Password :");

        txtEmailPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailPostActionPerformed(evt);
            }
        });

        jLabel25.setText("Institute :");

        jLabel26.setText("Year of Completion : ");

        jLabel27.setText("Qualification Type :");

        btnCancelPost.setText("Cancel");
        btnCancelPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPostActionPerformed(evt);
            }
        });

        btnRegisterPost.setText("Register");
        btnRegisterPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPostActionPerformed(evt);
            }
        });

        jLabel29.setText("Choose your Facilty :");

        cmboPostgraduate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        jLabel31.setText("NSBM Registered Number :");

        jLabel32.setText("Degree Type :");

        cmboDegreeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc", "Msc" }));

        javax.swing.GroupLayout jpnlPostgaduateLayout = new javax.swing.GroupLayout(jpnlPostgaduate);
        jpnlPostgaduate.setLayout(jpnlPostgaduateLayout);
        jpnlPostgaduateLayout.setHorizontalGroup(
            jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362))
                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasswordPost, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailPost, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdoBPost, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAddressPost, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFullNamePost, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNICPost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPhoneNumberPost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                                .addGap(203, 203, 203)
                                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel32))
                                            .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                                                .addComponent(jLabel29)
                                                .addGap(11, 11, 11)))
                                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtYoCPost)
                                            .addComponent(txtInstitutePost)
                                            .addComponent(txtQualificationPost, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                            .addComponent(cmboPostgraduate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmboDegreeType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPostRegNumber)))))
                        .addContainerGap(130, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPostgaduateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterPost)
                .addGap(18, 18, 18)
                .addComponent(btnCancelPost)
                .addContainerGap())
        );
        jpnlPostgaduateLayout.setVerticalGroup(
            jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInstitutePost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFullNamePost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNICPost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26)
                    .addComponent(txtYoCPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtQualificationPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddressPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumberPost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtdoBPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlPostgaduateLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(cmboDegreeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel23)
                    .addComponent(cmboPostgraduate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtPasswordPost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtPostRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jpnlPostgaduateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelPost)
                    .addComponent(btnRegisterPost))
                .addContainerGap())
        );

        tbdRegistration.addTab("Postgraduate", jpnlPostgaduate);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbdRegistration)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbdRegistration)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameUndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameUndActionPerformed

    private void txtAddressUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressUndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressUndActionPerformed

    private void txtNICUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICUndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICUndActionPerformed

    private void txtEmailPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailPostActionPerformed

    private void btnRegisterUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUndActionPerformed
        Undergraduate und = new Undergraduate(); // created undergraduate instance to take user input data on registration
        
        und.setRegNum(txtUndRegNumber.getText());  // take data from text fields
        und.setFullName(txtFullNameUnd.getText()); // take data from text fields
        und.setNic(txtNICUnd.getText());  // take data from text fields
        und.setAddress(txtAddressUnd.getText());  // take data from text fields
        und.setDob(txtDoBUnd.getText());  // take data from text fields
        und.setFacultyName(cmboUndergraduate.getSelectedItem().toString());  // take data from text fields
        und.setEmail(txtEmailUnd.getText()); // take data from text fields
        und.setPassword(txtPasswordUnd.getText()); // take data from text fields
        und.setPhoneNumber(Integer.parseInt(txtPhoneNumberUnd.getText())); // take data from text fields
        und.setIndexNumber(Integer.parseInt(txtIndexNumberUnd.getText())); // take data from text fields
        und.setStream(txtStreamUnd.getText()); // take data from text fields
        und.setIslandRank(Integer.parseInt(txtIslandRankUnd.getText())); // take data from text fields
        und.setzScore(txtZScoreUnd.getText()); // take data from text fields
        
        if(sdbOps.addUndergraduate(und)){ //pass the data to student db operation class to handle backend queries
            JOptionPane.showMessageDialog(this, "Inserted");
        }else{
            JOptionPane.showMessageDialog(this, "Error");
        } 
    }//GEN-LAST:event_btnRegisterUndActionPerformed

    private void btnRegisterPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPostActionPerformed
        Postgraduate pst = new Postgraduate(); // created postgraduate instance to take user input data registration
        
        pst.setRegNum(txtPostRegNumber.getText());
        pst.setFullName(txtFullNamePost.getText());
        pst.setAddress(txtAddressPost.getText());
        pst.setDob(txtdoBPost.getText());
        pst.setEmail(txtEmailPost.getText());
        pst.setFacultyName(cmboPostgraduate.getSelectedItem().toString());
        pst.setInstitute(txtInstitutePost.getText());
        pst.setQualification(txtQualificationPost.getText());
        pst.setPhoneNumber(Integer.parseInt(txtPhoneNumberPost.getText()));
        pst.setPassword(txtPasswordPost.getText());
        pst.setNic(txtNICPost.getText());
        pst.setYoc(Integer.parseInt(txtYoCPost.getText()));
        pst.setDegreeType(cmboDegreeType.getSelectedItem().toString());
        
        sdbOps.addPostgrasuate(pst);
    }//GEN-LAST:event_btnRegisterPostActionPerformed

    private void btnCancelUndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUndActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelUndActionPerformed

    private void btnCancelPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPostActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelPostActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelPost;
    private javax.swing.JButton btnCancelUnd;
    private javax.swing.JButton btnRegisterPost;
    private javax.swing.JButton btnRegisterUnd;
    private javax.swing.JComboBox<String> cmboDegreeType;
    private javax.swing.JComboBox<String> cmboPostgraduate;
    private javax.swing.JComboBox<String> cmboUndergraduate;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnlPostgaduate;
    private javax.swing.JPanel jpnlUnergraduate;
    private javax.swing.JTabbedPane tbdRegistration;
    private javax.swing.JTextField txtAddressPost;
    private javax.swing.JTextField txtAddressUnd;
    private javax.swing.JTextField txtDoBUnd;
    private javax.swing.JTextField txtEmailPost;
    private javax.swing.JTextField txtEmailUnd;
    private javax.swing.JTextField txtFullNamePost;
    private javax.swing.JTextField txtFullNameUnd;
    private javax.swing.JTextField txtIndexNumberUnd;
    private javax.swing.JTextField txtInstitutePost;
    private javax.swing.JTextField txtIslandRankUnd;
    private javax.swing.JTextField txtNICPost;
    private javax.swing.JTextField txtNICUnd;
    private javax.swing.JPasswordField txtPasswordPost;
    private javax.swing.JPasswordField txtPasswordUnd;
    private javax.swing.JTextField txtPhoneNumberPost;
    private javax.swing.JTextField txtPhoneNumberUnd;
    private javax.swing.JTextField txtPostRegNumber;
    private javax.swing.JTextField txtQualificationPost;
    private javax.swing.JTextField txtStreamUnd;
    private javax.swing.JTextField txtUndRegNumber;
    private javax.swing.JTextField txtYoCPost;
    private javax.swing.JTextField txtZScoreUnd;
    private javax.swing.JTextField txtdoBPost;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Sono
 */
public class AddResults extends javax.swing.JFrame {

    /**
     * Creates new form AddResults
     */
    public AddResults() {
        initComponents();
    }

    InstructorDBOperations inst = new InstructorDBOperations();                 // instance to access instructor db operation class

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtCom1 = new javax.swing.JTextField();
        txtCom2 = new javax.swing.JTextField();
        txtCom3 = new javax.swing.JTextField();
        txtChoose1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCom4 = new javax.swing.JTextField();
        txtChoose2 = new javax.swing.JTextField();
        txtChoose3 = new javax.swing.JTextField();
        txtChoose4 = new javax.swing.JTextField();
        txtRe1 = new javax.swing.JTextField();
        txtCr2 = new javax.swing.JTextField();
        txtCr3 = new javax.swing.JTextField();
        txtCr4 = new javax.swing.JTextField();
        txtCr5 = new javax.swing.JTextField();
        txtCr6 = new javax.swing.JTextField();
        txtCr8 = new javax.swing.JTextField();
        txtCr7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCr1 = new javax.swing.JTextField();
        txtRe2 = new javax.swing.JTextField();
        txtRe3 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        txtRe4 = new javax.swing.JTextField();
        txtRe5 = new javax.swing.JTextField();
        txtRe6 = new javax.swing.JTextField();
        txtRe7 = new javax.swing.JTextField();
        txtRe8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtYos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCom1.setEditable(false);

        txtCom2.setEditable(false);

        txtCom3.setEditable(false);

        txtChoose1.setEditable(false);

        jLabel4.setText("Choosed Subjects :");

        txtCom4.setEditable(false);

        txtChoose2.setEditable(false);

        txtChoose3.setEditable(false);

        txtChoose4.setEditable(false);

        jLabel1.setText("Add Student Results");

        jLabel2.setText("Compulsory Subjects :");

        jLabel3.setText("Registration Number :");

        txtRegNumber.setEditable(false);

        jLabel5.setText("Result");

        jLabel6.setText("Credits For the Subject");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel7.setText("Year of Study :");

        txtYos.setEditable(false);

        jLabel8.setText("Semester :");

        txtSemester.setEditable(false);

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("?");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("?");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("?");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(txtChoose1)
                        .addComponent(txtChoose2)
                        .addComponent(txtChoose3)
                        .addComponent(txtChoose4)
                        .addComponent(txtCom4)
                        .addComponent(txtCom3)
                        .addComponent(txtCom2)
                        .addComponent(txtCom1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel5)
                            .addGap(91, 91, 91))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRe2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRe1)
                                .addComponent(txtRe3)
                                .addComponent(txtRe4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRe5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRe6)
                                .addComponent(txtRe7)
                                .addComponent(txtRe8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(68, 68, 68)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCr8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCr6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCr5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCr4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCr3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCr1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCr2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtYos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(89, 89, 89)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtChoose3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtChoose4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRe8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCr8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * method to set the values and insert data to the database
     *
     */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        FourthYears f = new FourthYears();  // instance to store exam details

        f.setSub1(txtCom1.getText());       // setting values
        f.setSub2(txtCom2.getText());       // setting values
        f.setSub3(txtCom3.getText());       // setting values
        f.setSub4(txtCom4.getText());       // setting values
        f.setSub5(txtChoose1.getText());    // setting values
        f.setSub6(txtChoose2.getText());    // setting values
        f.setSub7(txtChoose3.getText());    // setting values
        f.setSub8(txtChoose4.getText());    // setting values
        f.setRes1(txtRe1.getText());        // setting values
        f.setRes2(txtRe2.getText());        // setting values
        f.setRes3(txtRe3.getText());        // setting values
        f.setRes4(txtRe4.getText());        // setting values
        f.setRes5(txtRe5.getText());        // setting values
        f.setRes6(txtRe6.getText());        // setting values
        f.setRes7(txtRe7.getText());        // setting values
        f.setRes8(txtRe8.getText());        // setting values
        f.setRegNumber(txtRegNumber.getText()); // setting values
        f.setYos(txtYos.getText());         // setting values
        f.setGpa(Double.toString(calculateGPA())); // setting values
        f.setSemester(txtSemester.getText());   // setting values

        // create a instructor db operation instance to handle backend 
        if (inst.insertResults(f)) {
            JOptionPane.showMessageDialog(this, "Submission successfull. Email will be sent shortly.");                      // message box
            
            // sending email to student mail
            String to = inst.getStudentEmail(f.getRegNumber());                             // email address to send
            
            final String email = "nsbmresultcenter@gmail.com";                              // mail for sending mails
            final String password = "nsbm@123";                                             // password for the email

            // configuring properties with the smtp server
            Properties prop = System.getProperties();
            prop.put("mail.smtp.starttls.enable", true);
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", true);

            // authenticate given email
            Session ses = Session.getInstance(prop, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, password);
                }
            });

            // semdng email
            try {
                Message msg = new MimeMessage(ses);                                                                 // creating email message

                msg.setFrom(new InternetAddress(email));                                                            // from
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));                             // to

                msg.setSubject("Examination Results for " + f.getRegNumber() + " - NSBM Result Center");            // mail subject
                msg.setText("Dear Student, \n"
                        + "These are the results for your past examination. Please note that these results are calculated with your Assignmnet marks.\n" // body
                        + f.getSub1() + " ->\t" + f.getRes1() + "\n"
                        + f.getSub2() + " ->\t" + f.getRes2() + "\n"
                        + f.getSub3() + " ->\t" + f.getRes3() + "\n"
                        + f.getSub4() + " ->\t" + f.getRes4() + "\n"
                        + f.getSub5() + " ->\t" + f.getRes5() + "\n"
                        + f.getSub6() + " ->\t" + f.getRes6() + "\n"
                        + f.getSub7() + " ->\t" + f.getRes7() + "\n"
                        + f.getSub8() + " ->\t" + f.getRes8() + "\n"
                        + "Your GPA Value for this semster : " + f.getGpa() + ""
                        + "\n\n NSBM Result Center");
                Transport.send(msg);                                                            // sending mail
            } catch (Exception e) {
                System.out.println(e);
            }
            
            this.dispose();                                                                     // closing frame
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again");      // message box
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sub = txtCom1.getText();
        txtCr1.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sub = txtCom2.getText();
        txtCr2.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sub = txtCom3.getText();
        txtCr3.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sub = txtCom4.getText();
        txtCr4.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sub = txtChoose1.getText();
        txtCr5.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String sub = txtChoose2.getText();
        txtCr6.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String sub = txtChoose3.getText();
        txtCr7.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String sub = txtChoose4.getText();
        txtCr8.setText(inst.findCredit(sub));
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * method to set values to text fields
     *
     */
    void setCompulsory(String sub[]) {
        txtCom1.setText(sub[0]);        // setting values
        txtCom2.setText(sub[1]);        // setting values
        txtCom3.setText(sub[2]);        // setting values
        txtCom4.setText(sub[3]);        // setting values
    }

    /**
     * method to set values to text fields
     *
     */
    void setChoosed(StudentSubjects sbj) {
        txtRegNumber.setText(sbj.getRegNum());  // setting values
        txtChoose1.setText(sbj.getFirst());     // setting values
        txtChoose2.setText(sbj.getSecond());    // setting values
        txtChoose3.setText(sbj.getThird());     // setting values
        txtChoose4.setText(sbj.getFourth());    // setting values
        txtYos.setText(sbj.getYos());           // setting values
        txtSemester.setText(sbj.getSemester()); // setting values
    }

    /**
     * method to calculate student's gpa
     *
     */
    double calculateGPA() {
        double gpa = 0;
        gpa = getGPV(txtRe1.getText()) * Integer.parseInt(txtCr1.getText()) + getGPV(txtRe2.getText()) * Integer.parseInt(txtCr2.getText()) + getGPV(txtRe3.getText()) * Integer.parseInt(txtCr3.getText()) + getGPV(txtRe4.getText()) * Integer.parseInt(txtCr4.getText()) + getGPV(txtRe5.getText()) * Integer.parseInt(txtCr5.getText()) + getGPV(txtRe6.getText()) * Integer.parseInt(txtCr6.getText()) + getGPV(txtRe7.getText()) * Integer.parseInt(txtCr7.getText()) + getGPV(txtRe8.getText()) * Integer.parseInt(txtCr8.getText());
        int tot = Integer.parseInt(txtCr1.getText()) + Integer.parseInt(txtCr2.getText()) + Integer.parseInt(txtCr3.getText()) + Integer.parseInt(txtCr4.getText()) + Integer.parseInt(txtCr5.getText()) + Integer.parseInt(txtCr6.getText()) + Integer.parseInt(txtCr7.getText()) + Integer.parseInt(txtCr8.getText());
        return (gpa / tot);
    }

    /**
     * method to find gpv
     *
     */
    double getGPV(String grade) {
        switch (grade) {
            case "A+":
                return 4.25;
            case "A":
                return 4.00;
            case "A-":
                return 3.75;
            case "B+":
                return 3.50;
            case "B":
                return 3.25;
            case "B-":
                return 3.00;
            case "C+":
                return 2.75;
            case "C":
                return 2.50;
            case "C-":
                return 2.25;
            case "D+":
                return 2.00;
            case "D":
                return 1.75;
            case "D-":
                return 1.50;
            default:
                return 0;
        }
    }

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
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtChoose1;
    private javax.swing.JTextField txtChoose2;
    private javax.swing.JTextField txtChoose3;
    private javax.swing.JTextField txtChoose4;
    private javax.swing.JTextField txtCom1;
    private javax.swing.JTextField txtCom2;
    private javax.swing.JTextField txtCom3;
    private javax.swing.JTextField txtCom4;
    private javax.swing.JTextField txtCr1;
    private javax.swing.JTextField txtCr2;
    private javax.swing.JTextField txtCr3;
    private javax.swing.JTextField txtCr4;
    private javax.swing.JTextField txtCr5;
    private javax.swing.JTextField txtCr6;
    private javax.swing.JTextField txtCr7;
    private javax.swing.JTextField txtCr8;
    private javax.swing.JTextField txtRe1;
    private javax.swing.JTextField txtRe2;
    private javax.swing.JTextField txtRe3;
    private javax.swing.JTextField txtRe4;
    private javax.swing.JTextField txtRe5;
    private javax.swing.JTextField txtRe6;
    private javax.swing.JTextField txtRe7;
    private javax.swing.JTextField txtRe8;
    private javax.swing.JTextField txtRegNumber;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtYos;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Model.User;
import Repositories.DBConnection;
import Repositories.DBQuery;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.swing.JOptionPane;

/**
 *
 * @author Hyun
 */
public class HelpForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    DBConnection bConnection = new DBConnection();
    DBQuery bQuery = new DBQuery(bConnection);
    ArrayList<User> al = bQuery.getList();
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public HelpForm() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnfacebook = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txttoemail = new javax.swing.JTextField();
        txtusermail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtusercontent = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        jLabel6.setText("jLabel4");

        jTextField3.setText("jTextField1");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 70, 950, 10);

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(210, 0, 20, 600);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sm-logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 50, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("POLYSCHOOL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 150, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("STUDENTS MANAGEMENT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 20, 350, 33);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn-logout-white.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 290, 200, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn-students-white.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 80, 200, 70);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn-help.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 150, 200, 70);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn-account-white.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(10, 220, 200, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeimg.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(840, 10, 110, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 380, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("The system has problem, ask a question here or contact us");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-tl.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 60, 50));

        btnfacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-fb.png"))); // NOI18N
        btnfacebook.setBorder(null);
        btnfacebook.setContentAreaFilled(false);
        btnfacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnfacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfacebookMouseClicked(evt);
            }
        });
        btnfacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacebookActionPerformed(evt);
            }
        });
        jPanel2.add(btnfacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 60, 50));

        btnx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-x.png"))); // NOI18N
        btnx.setBorder(null);
        btnx.setContentAreaFilled(false);
        btnx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });
        jPanel2.add(btnx, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 60, 50));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("OR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        txttoemail.setBackground(new java.awt.Color(255, 255, 255));
        txttoemail.setForeground(new java.awt.Color(0, 0, 0));
        txttoemail.setBorder(null);
        txttoemail.setSelectionColor(new java.awt.Color(255, 255, 255));
        txttoemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttoemailActionPerformed(evt);
            }
        });
        jPanel2.add(txttoemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 480, 30));

        txtusermail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email-field.png"))); // NOI18N
        jPanel2.add(txtusermail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        txtusercontent.setBackground(new java.awt.Color(255, 255, 255));
        txtusercontent.setColumns(20);
        txtusercontent.setForeground(new java.awt.Color(0, 0, 0));
        txtusercontent.setLineWrap(true);
        txtusercontent.setRows(5);
        txtusercontent.setText("Go ahead, we're listening...");
        txtusercontent.setToolTipText("");
        txtusercontent.setBorder(null);
        txtusercontent.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtusercontent.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtusercontent);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 460, 200));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/content-field.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn-submit.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(210, 70, 720, 520);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HomeForm form = new HomeForm();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txttoemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttoemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoemailActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AccountFrame accountFrame = new AccountFrame();
        accountFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String toEmail = txttoemail.getText();
        String fromEmail = "hungndth04416@fpt.edu.vn";
        String appPassword = "bcgj wrsn jnna byql";
        String subjects = "User reports about software issues";

        Properties p = new Properties();
        p.put("mail.smtp.auth", "true"); // authentication
        p.put("mail.smtp.starttls.enable", "true"); // TLS to hash and security
        p.put("mail.smtp.host", "smtp.gmail.com"); // SMTP server
        p.put("mail.smtp.port", "587"); // SMTP port for TLS protocol
        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, appPassword);
            }
        });
        try {
            MimeMessage message = new MimeMessage(s);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipients(Message.RecipientType.TO, new InternetAddress(toEmail).toString());
            message.setSubject(subjects);
            message.setText(txtusercontent.getText());
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "The email has been sent to " + toEmail);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "The email has not been sent to " + toEmail);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnfacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfacebookMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnfacebookMouseClicked

    private void btnfacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacebookActionPerformed
        // TODO add your handling code here:
        btnfacebook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String facebookUrl = "https://www.facebook.com/unicon4on/";
                try {
                    Desktop.getDesktop().browse(new URI(facebookUrl));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Failed to open URL!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
    }//GEN-LAST:event_btnfacebookActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        // TODO add your handling code here:
        btnx.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String xUrl = "https://x.com/testingxw354";
                try {
                    Desktop.getDesktop().browse(new URI(xUrl));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
            
        });
    }//GEN-LAST:event_btnxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "I don't have telegram man :))");
    }//GEN-LAST:event_jButton2ActionPerformed
    private String selectedImagePath; // Đường dẫn ảnh được chọn

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
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfacebook;
    private javax.swing.JButton btnx;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txttoemail;
    private javax.swing.JTextArea txtusercontent;
    private javax.swing.JLabel txtusermail;
    // End of variables declaration//GEN-END:variables
}

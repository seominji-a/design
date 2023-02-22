/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import FILE.A;
import USER.LogInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hun24
 */
public class login extends javax.swing.JFrame {

    ArrayList<LogInfo> logNum = new ArrayList<>();
    Boolean check;
    public static String a;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        log_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton log_Enter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        log_PW = new javax.swing.JPasswordField();
        user = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        log_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_IDActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("PW");

        log_Enter.setText("확인");
        log_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_EnterActionPerformed(evt);
            }
        });

        jLabel3.setText("ㅁㅁ항공");

        user.setText("회원 가입");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(user)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(log_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(log_PW)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(log_Enter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(user))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(log_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(log_Enter)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        log_Enter.getAccessibleContext().setAccessibleName("log_Enter");
        log_PW.getAccessibleContext().setAccessibleName("log_PW");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_EnterActionPerformed

        A sr = new A();
        sr.DB();
        sr.Split();
        String id;
        String pw;

        try {
            logNum = sr.returnLogInfo();
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        id = log_ID.getText();
        pw = log_PW.getText();

        check = false;

        for (int i = 0; i < logNum.size(); i++) {
            if (logNum.get(i).getId().equals(id) && logNum.get(i).getPw().equals(pw)) {
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "관리자 로그인 성공!!");
                    admain next = new admain();
                    next.setVisible(true);
                    dispose();
                    check = true;
                    break;

                } else {
                    JOptionPane.showMessageDialog(null, "사용자 로그인 성공!!");
                    a = logNum.get(i).getId();
                    usermain next = new usermain();
                    next.setVisible(true);
                    dispose();
                    check = true;
                    break;
                }
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(null, "계정 정보를 다시 확인하세요!!");
        }

    }//GEN-LAST:event_log_EnterActionPerformed

    private void log_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_IDActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        User us = new User();
        us.setVisible(true);
        dispose();
    }//GEN-LAST:event_userActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField log_ID;
    private javax.swing.JPasswordField log_PW;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}

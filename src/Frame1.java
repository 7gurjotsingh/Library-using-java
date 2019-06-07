/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Frame;


/**
 *
 * @author Windows
 */
public class Frame1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adminUserLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        adminLoginPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        adminLoginBtn = new javax.swing.JButton();
        adminLoginClear = new javax.swing.JButton();

        setClosable(true);
        setTitle("Admin Login");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Enter Username and Password");

        adminLoginBtn.setText("Login");
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });

        adminLoginClear.setText("Clear");
        adminLoginClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminLoginClear)
                    .addComponent(adminLoginBtn))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminUserLogin)
                            .addComponent(adminLoginPass, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adminUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adminLoginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(adminLoginBtn)
                .addGap(18, 18, 18)
                .addComponent(adminLoginClear)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed
        // TODO add your handling code here:
        String usrnm = adminUserLogin.getText();
        String pass = adminLoginPass.getText();
        
        
        
        if(usrnm.equals("root")&&pass.equals("123456")){
            jLabel3.setText("Sucessful Login!!!!!");
            adminLoginBtn.setVisible(false);
            status = true;
           
        }
        else{
            jLabel3.setText("Invalid Try Again");
            status = false;
        }
        
          
    }//GEN-LAST:event_adminLoginBtnActionPerformed

    private void adminLoginClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginClearActionPerformed
        // TODO add your handling code here:
        adminUserLogin.setText("");
        adminLoginPass.setText("");
        adminLoginBtn.setVisible(true);

        
    }//GEN-LAST:event_adminLoginClearActionPerformed
     public boolean getStatus(){
        return status;
    }
    public  boolean status ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JButton adminLoginClear;
    private javax.swing.JPasswordField adminLoginPass;
    private javax.swing.JTextField adminUserLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

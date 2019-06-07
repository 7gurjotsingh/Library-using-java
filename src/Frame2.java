/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Windows
 */
public class Frame2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
        initComponents();
        
        
    }
        
    
    public void Btn(){
        Frame1 f1 = new Frame1();
        boolean st = f1.getStatus();
            System.out.println(st);

        if(st){
            rolltxt.setEditable(true);
        }
        else{
            rolltxt.setEditable(true);
        }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rolltxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        book1txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        book2txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        book3txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        book4txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        book5txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bookissue = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        add = new javax.swing.JRadioButton();
        Update = new javax.swing.JRadioButton();
        go = new javax.swing.JButton();
        getData = new javax.swing.JButton();
        update = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setClosable(true);
        setTitle("Add to Database");

        jLabel1.setText("Enter the Values to Database ");

        jLabel2.setText("Roll Number");

        rolltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolltxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Book 1");

        book1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book1txtActionPerformed(evt);
            }
        });

        jLabel5.setText("Book 2");

        jLabel6.setText("Book 3");

        jLabel7.setText("Book 4");

        jLabel8.setText("Book 5");

        jLabel9.setText("Issue Date");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        buttonGroup1.add(add);
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        buttonGroup1.add(Update);
        Update.setText("Update");

        go.setText("GO");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        getData.setText("Get Data");
        getData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clear)
                    .addComponent(getData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitBtn)
                    .addComponent(update))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rolltxt)
                            .addComponent(nametxt)
                            .addComponent(book1txt)
                            .addComponent(book2txt)
                            .addComponent(book3txt)
                            .addComponent(book4txt)
                            .addComponent(book5txt)
                            .addComponent(bookissue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(add)
                        .addGap(33, 33, 33)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(go, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(Update)
                    .addComponent(go))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rolltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(book1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(book2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(book3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(book4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(book5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bookissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitBtn)
                    .addComponent(Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getData)
                    .addComponent(update))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rolltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolltxtActionPerformed

    private void book1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book1txtActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        studentRollNo=Integer.parseInt(rolltxt.getText());
        studentName = nametxt.getText();
        studentBook1 = book1txt.getText();
        studentBook2 = book2txt.getText();
        studentBook3 = book3txt.getText();
        studentBook4 = book4txt.getText();
        studentBook5 = book5txt.getText();
        issueDate = bookissue.getText();

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            System.out.println("True");
            Statement St = cn.createStatement() ;
            String my ="INSERT INTO studentdata"+"(RollNo,Name,Book1,Book2,Book3,Book4,Book5,Issue)"
                    +"VALUES('"+studentRollNo+"','"+studentName+"','"+studentBook1+"','"+studentBook2+"','"+studentBook3+"'"
                    + ",'"+studentBook4+"','"+studentBook5+"','"+issueDate+"');";
            St.execute(my);        
        }
        catch(Exception e){
            System.out.println(e);
        }
       /* rolltxt.setEditable(false);
        nametxt.setEditable(false);
        book1txt.setEditable(false);
        book2txt.setEditable(false);
        book3txt.setEditable(false);
        book4txt.setEditable(false);
        book5txt.setEditable(false);
        bookissue.setEditable(false);
        */jLabel1.setText("Added Successfully ");


    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        rolltxt.setText("");
        nametxt.setText("");
        book1txt.setText("");
        book2txt.setText("");
        book3txt.setText("");
        book4txt.setText("");
        book5txt.setText("");
        bookissue.setText("");
        jLabel1.setText("Enter the details ...");

    }//GEN-LAST:event_ClearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        if(add.isSelected()){
            Clear.setVisible(true);
            SubmitBtn.setVisible(true);
            getData.setVisible(false);
            update.setVisible(false);
        }
        else if (Update.isSelected()){
            
        Clear.setVisible(false);
        SubmitBtn.setVisible(false);
        getData.setVisible(true);
        update.setVisible(true);
        }
        else{
        
        Clear.setVisible(false);
        SubmitBtn.setVisible(false);
        getData.setVisible(false);
        update.setVisible(false);
            
        }

    }//GEN-LAST:event_goActionPerformed

    private void getDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataActionPerformed
        // TODO add your handling code here:
        RollNo = rolltxt.getText();
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            System.out.println("True");
            Statement St = cn.createStatement() ;
            String my ="SELECT * FROM studentdata WHERE RollNo = '"+RollNo+"';";
            ResultSet rs = St.executeQuery(my);
            while(rs.next()){
                nametxt.setText(rs.getString(2));
                book1txt.setText(rs.getString(3));
                book2txt.setText(rs.getString(4));
                book3txt.setText(rs.getString(5));
                book4txt.setText(rs.getString(6));
                book5txt.setText(rs.getString(7));
                bookissue.setText(rs.getString(8));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_getDataActionPerformed
        
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        RollNo = rolltxt.getText();
        
        BoOk1=book1txt.getText();
        BoOk2=book2txt.getText();
        BoOk3=book3txt.getText();
        BoOk4=book4txt.getText();
        BoOk5=book5txt.getText();
        String date= bookissue.getText();
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            System.out.println("True");
            Statement St = cn.createStatement() ;
            String my ="UPDATE studentdata SET Book1 = '"+BoOk1+"',Book2 = '"+BoOk2+"',Book3 = '"+BoOk3+"',"
                    + "Book4 = '"+BoOk4+"',Book5 = '"+BoOk5+"' ,Issue = '"+date+"' WHERE RollNo = '"+RollNo+"';";
            St.executeUpdate(my);        
        }
        catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_updateActionPerformed
    private String issueDate;
        String roll;
    String BoOk1;
    String BoOk2;
    String BoOk3;
    String BoOk4;
    String BoOk5;

    private String RollNo;
    private int studentRollNo;
    private String studentName;
    private String studentBook1;
    private String studentBook2;
    private String studentBook3;
    private String studentBook4;
    private String studentBook5;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JRadioButton Update;
    private javax.swing.JRadioButton add;
    private javax.swing.JTextField book1txt;
    private javax.swing.JTextField book2txt;
    private javax.swing.JTextField book3txt;
    private javax.swing.JTextField book4txt;
    private javax.swing.JTextField book5txt;
    private javax.swing.JTextField bookissue;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton getData;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField rolltxt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

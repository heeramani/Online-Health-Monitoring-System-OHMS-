/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohms;

import com.csvreader.CsvReader;
import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author heeramani
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        registerComboBox.removeAllItems();
        registerComboBox.addItem("Patient");
        registerComboBox.addItem("Doctor");
    }
    public void reset(){
        text_username.setText("");
        text_email.setText("");
        password_pass.setText("");
        calender_dob.setCalendar(null);
        
    }
    private void registerComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {                                                              
        switch (registerComboBox.getSelectedItem().toString()) {
            case "Patient":
                text_username.setVisible(true);
                text_email.setVisible(true);
                password_pass.setVisible(true);
                calender_dob.setVisible(true);

                break;
            case "Doctor" :
                text_username.setVisible(true);
                text_email.setVisible(true);
                password_pass.setVisible(true);
                calender_dob.setVisible(false);
                break;
            default:
                
        }
    }
    
    boolean checkIfUserNameExists(String username){
        try {
		boolean check =false;
                //String email = null;
        	CsvReader user = new CsvReader("users.csv");
		user.readHeaders();
                while (user.readRecord())
			{       
				String username_get = user.get("Username");
				
                                
                                if(username.equalsIgnoreCase(username_get) ) {
                                   check =true;
                                    
                                    
                                    
                                    break;
                                                                                                                }
      			}
	
			user.close();
			/*if(check) {
                            JOptionPane.showMessageDialog(null,"Sorry!Username already taken." , "Please try again. "
                                  , JOptionPane.INFORMATION_MESSAGE);
                                    
                                
                            Registration registration=new Registration();
                            registration.setVisible(true);
                             dispose();   
                                
                        }
                        else {
                        JOptionPane.showMessageDialog(null,"Username or password "
                              + "entered wrong.\n"+ "Try again.", "LogIn Fail", JOptionPane.ERROR_MESSAGE);
                                //dispose();

                        }*/
                        return check;
                       
                        } catch (FileNotFoundException e) {
                                               } catch (IOException e){
                                                  
                                                   
                                               }
                        
                        return false;
        
        
    }
    
    

    
    
    
    public void registration(){
        String username = text_username.getText();
        boolean check=checkIfUserNameExists(username);
        if(check){
            JOptionPane.showMessageDialog(null, "Username already exists please try again\n","Try again with valid user. ",JOptionPane.ERROR_MESSAGE);
            
            return;
            
        }
        String email = text_email.getText();
        
        boolean validEmailAddress = isValidEmailAddress(email);
        if(!validEmailAddress){
            JOptionPane.showMessageDialog(null,"Invalid Email.\n"+ "Try again with valid email.", "Registration Fail", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        String password;
        password = Arrays.toString(password_pass.getPassword());
        
        
        /*
        
        
        String user = registerComboBox.getSelectedItem().toString();
        switch(user) {
            case "Patient" :
                dob = calender_dob.getDate().toString();
                break;
            case "Doctor" :
                dob = null;
                break;
            default:
        */
        
        Date dob;
        dob = calender_dob.getDate();
        long l = dob.getTime();
        Date current = new Date();
        long l1 = current.getTime();
        
        long date1 = l1 - l;
                
        if (date1 <= 0) {
            JOptionPane.showMessageDialog(null, "Select right date of birth");
            return;
        }
                
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Enter your username,Can't be blank\n","Try again with valid user. ",JOptionPane.ERROR_MESSAGE);
            
            return;
           // button_register.setEnabled(false);
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Enter your password,Can't be blank\n","Try again. ",JOptionPane.ERROR_MESSAGE);
            
            return;

//button_register.setEnabled(false);
        } 
        
        if(dob.toString().equals("")){
            JOptionPane.showMessageDialog(null, "Select Date of birth,Can't be blank\n","Try again. ",JOptionPane.ERROR_MESSAGE);
            
            return;

            //button_register.setEnabled(false);
        }
        /*
        if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Enter your email address,Can't be blank\n","Try again. ",JOptionPane.ERROR_MESSAGE);
            
            return;

            //button_register.setEnabled(false);
        }
        
        
        */
        double temperature = ThreadLocalRandom.current().nextDouble(98.0, 104.0);
        int heartrate = ThreadLocalRandom.current().nextInt(60, 100);
        int bloodpressure = ThreadLocalRandom.current().nextInt(70, 190);
        
        
        
        String outputFile = "users.csv";
		
		// before we open the file check to see if it already exists
	boolean alreadyExists;
        alreadyExists = new File(outputFile).exists();
        
        //boolean useralreadyExists;
        
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
			
			// if the file didn't already exist then we need to write out the header line
			if (!alreadyExists)
			{
				csvOutput.write("Username");
				csvOutput.write("Email");
                                csvOutput.write("Password");
                                csvOutput.write("DOB");

				csvOutput.write("Temperature");
                                csvOutput.write("HeartRate");
                                csvOutput.write("BloodPressure");
                                
                                
				csvOutput.endRecord();
                                
                                
			}
			// else assume that the file already has the correct header line
			
			// write out a few records
                        //String username_get = outputFile.getText("Username");
                        //if(username.equalsIgnoreCase(username_get))
                        
			csvOutput.write(username);
                        
                        
			csvOutput.write(email);
                        csvOutput.write(password);
                        csvOutput.write(String.valueOf(l));
                        

			csvOutput.write((Double.toString(temperature)));
                        csvOutput.write(Integer.toString(heartrate));
                        csvOutput.write(Integer.toString(bloodpressure)); 

                        
			csvOutput.endRecord();
			
			
			
			csvOutput.close();
		} catch (IOException e) {
		}
                JOptionPane.showMessageDialog(button_register, "Data Saved Successfully");
		
	
}
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        password_pass = new javax.swing.JPasswordField();
        text_email = new javax.swing.JTextField();
        calender_dob = new com.toedter.calendar.JDateChooser();
        button_register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        registerComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(java.awt.Color.black);
        setForeground(new java.awt.Color(41, 114, 219));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setText("Online Health Monitor System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DateOfBirth:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password:");

        text_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });

        password_pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        text_email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_email.setName(""); // NOI18N

        button_register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        registerComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        registerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Register As:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calender_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(registerComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 400, Short.MAX_VALUE)
                            .addComponent(text_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_pass, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calender_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("User Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        // TODO add your handling code here:
        registration();
        dispose();
        LogIn login = new LogIn();
        
        login.setVisible(true);
        //dispose();
    }//GEN-LAST:event_button_registerActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FrontEnd frontend = new FrontEnd();
        frontend.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void registerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_register;
    private com.toedter.calendar.JDateChooser calender_dob;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password_pass;
    private javax.swing.JComboBox<String> registerComboBox;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}

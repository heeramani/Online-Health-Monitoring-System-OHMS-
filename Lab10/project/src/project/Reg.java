/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Heeramani
 */

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Reg extends javax.swing.JFrame {

    /**
     * Creates new form Reg
     */
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
    
    
    boolean ref(String Ref){
        try {
		boolean check =false;
                //String email = null;
        	CsvReader user = new CsvReader("users.csv");
		user.readHeaders();
                while (user.readRecord())
			{       
				String username_get = user.get("REF");
				if(Ref.equalsIgnoreCase(username_get) ) {
                                   check =true;
                                   break;
                                                                                                                }
      			}
	
			user.close();
			return check;
                       
                        } catch (FileNotFoundException e) {
                                               } catch (IOException e){
                                               }
                        return false;
    }
    
    boolean otp(String Otp){
        try {
		boolean check =false;
                //String email = null;
        	CsvReader user = new CsvReader("users.csv");
		user.readHeaders();
                while (user.readRecord())
			{       
				String username_get = user.get("OTP");
				if(Otp.equalsIgnoreCase(username_get) ) {
                                   check =true;
                                   break;
                                                                                                                }
      			}
	
			user.close();
			
                        return check;
                       
                        } catch (FileNotFoundException e) {
                                               } catch (IOException e){
                                               }
                        return false;
    }
    
    
    
    public Reg() {
        initComponents();
    }
    
    public void registration(){
        String username = text_username.getText();
        String name =text_name.getText();
        String Otp = text_otp.getText();
        String Ref = text_ref.getText();
        
        
        boolean check=checkIfUserNameExists(username);
        if(check){
            JOptionPane.showMessageDialog(null, "Username already exists please try again\n","Try again with valid user. ",JOptionPane.ERROR_MESSAGE);
            
            return;
            
        }
        boolean o=otp(Otp);
        boolean r =ref(Ref);
        if(o){
            if(r){
                
                
                
                
                return;
            }
            return;
            
        }
        
        
        
        
        
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
        
        if(dob.toString().equals("")){
            JOptionPane.showMessageDialog(null, "Select Date of birth,Can't be blank\n","Try again. ",JOptionPane.ERROR_MESSAGE);
            
            return;

            //button_register.setEnabled(false);
        }
        
        
        
        //double temperature = ThreadLocalRandom.current().nextDouble(98.0, 104.0);
        int otp = ThreadLocalRandom.current().nextInt(1000, 9999);
        int refrence = ThreadLocalRandom.current().nextInt(100000000, 999999999);
        
         //2,147,483,647
        
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
				csvOutput.write("Name");
				csvOutput.write("DOB");

				csvOutput.write("OTP");
                                csvOutput.write("REF");
                                csvOutput.endRecord();
                                
                                
			}
			//if(username.equalsIgnoreCase(username_get))
                        csvOutput.write(name);
                        
			csvOutput.write(username);
                        
                        
			//csvOutput.write(String.valueOf(l));
                        

			
                        csvOutput.write(Integer.toString(otp));
                        csvOutput.write(Integer.toString(refrence)); 

                        
			csvOutput.endRecord();
			
			
			
			csvOutput.close();
		} catch (IOException e) {
		}
                JOptionPane.showMessageDialog(button_register, "Data Saved Successfully");
		
	
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_register = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        calender_dob = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_ref = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text_otp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("DateOfbirth");

        jLabel3.setText("User Registration");

        jLabel4.setText("Name");

        jLabel5.setText("REF");

        jLabel6.setText("OTP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(button_register))
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calender_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit)
                    .addComponent(text_name, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(text_username)
                    .addComponent(text_ref)
                    .addComponent(text_otp))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calender_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_otp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_register)
                    .addComponent(exit))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        registration();
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_register;
    private com.toedter.calendar.JDateChooser calender_dob;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_otp;
    private javax.swing.JTextField text_ref;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}

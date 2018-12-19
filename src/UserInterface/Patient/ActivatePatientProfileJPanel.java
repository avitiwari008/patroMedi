/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Buisness.EcoSystem;
import Buisness.Role.PatientRole;
import Buisness.UserInfo.PatientInfo;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sarthakgoel
 */
public class ActivatePatientProfileJPanel extends javax.swing.JPanel 
{
    private PatientInfo patient;
    private JPanel  displayJPanel;
    private Integer code;
    private EcoSystem system;
    /**
     * Creates new form ActivatePatientProfileJPanel
     */
    public ActivatePatientProfileJPanel(JPanel displayJPanel,Integer code, PatientInfo patient, EcoSystem system) {
        initComponents();
        
        this.displayJPanel = displayJPanel;
        this.system = system;
        this.patient = patient;
        this.code = code;
        
        lblUserName.setVisible(false);
        lblPwd.setVisible(false);
        txtUserName.setVisible(false);
        txtPassword.setVisible(false);
        btnCreate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Activate Profile"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("ACTIVATE PATIENT PROFILE");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, 232, -1));

        lblCode.setText("Enter the Code");
        add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, -1, -1));
        add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 93, 165, -1));

        btnValidate.setText("Validate>>");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 137, -1, -1));

        lblUserName.setText("UserName");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 205, -1, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 200, 181, -1));

        lblPwd.setText("Password");
        add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 245, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 240, 181, -1));

        btnCreate.setText("Create>>");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 284, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        
        String num = code.toString();
        if(num.equalsIgnoreCase(txtCode.getText()))
        {
        JOptionPane.showMessageDialog(null, "Patient Account has been activated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        lblUserName.setVisible(true);
        lblPwd.setVisible(true);
        txtUserName.setVisible(true);
        txtPassword.setVisible(true);
        btnCreate.setVisible(true);
        
        lblCode.setVisible(false);
        txtCode.setVisible(false);
        btnValidate.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Code does not match", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnValidateActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        boolean result = system.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        
        if(result == true)
        {
            patient.setUsername(userName);
            system.getUserAccountDirectory().createPatientAccount(userName, password, patient, new PatientRole()); 
            JOptionPane.showMessageDialog(null, "Successfully recorded the Patient Details.\nPlease Login ","Success", JOptionPane.INFORMATION_MESSAGE);
            
            btnCreate.setEnabled(false);
            txtUserName.setEditable(false);
            txtPassword.setEditable(false);
            txtUserName.setText("");
            txtPassword.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "UserName already exist.\nPlease Select a different one.","Error", JOptionPane.ERROR_MESSAGE);
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    public void backAction()
    {
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

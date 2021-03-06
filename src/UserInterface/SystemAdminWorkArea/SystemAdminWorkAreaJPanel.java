/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Buisness.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author avitiwari
 */

public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
JPanel displayJPanel;
    EcoSystem ecosystem;
    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel displayJPanel,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.displayJPanel=displayJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageLocjButton = new javax.swing.JButton();
        ManagePatjButton = new javax.swing.JButton();
        ManageDonorjButton = new javax.swing.JButton();
        ManageEnterjButton = new javax.swing.JButton();
        btnTitle = new javax.swing.JLabel();
        ManageEnterAdminjButton = new javax.swing.JButton();
        btnAnalytics = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Admin Work Area"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageLocjButton.setText("Manage Location");
        ManageLocjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageLocjButtonActionPerformed(evt);
            }
        });
        add(ManageLocjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 112, 202, -1));

        ManagePatjButton.setText("Manage Patient");
        ManagePatjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagePatjButtonActionPerformed(evt);
            }
        });
        add(ManagePatjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 159, 202, -1));

        ManageDonorjButton.setText("Manage Donor");
        ManageDonorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDonorjButtonActionPerformed(evt);
            }
        });
        add(ManageDonorjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 206, 202, -1));

        ManageEnterjButton.setText("Manage Enterprise");
        ManageEnterjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterjButtonActionPerformed(evt);
            }
        });
        add(ManageEnterjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 253, 202, -1));

        btnTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnTitle.setText("SYSTEM ADMIN WORK AREA");
        add(btnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, -1, -1));

        ManageEnterAdminjButton.setText("Manage Enterprise admin");
        ManageEnterAdminjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterAdminjButtonActionPerformed(evt);
            }
        });
        add(ManageEnterAdminjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 300, -1, -1));

        btnAnalytics.setText("Application Analysis");
        btnAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyticsActionPerformed(evt);
            }
        });
        add(btnAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 347, 202, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageLocjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageLocjButtonActionPerformed
        // TODO add your handling code here:
        ManageLocationJPanel manageLocationPanel=new  ManageLocationJPanel(displayJPanel, ecosystem);
        displayJPanel.add("manageLocationPanel",manageLocationPanel);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
        
    }//GEN-LAST:event_ManageLocjButtonActionPerformed

    private void ManagePatjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagePatjButtonActionPerformed
        // TODO add your handling code here:
        
        ManagePatientJPanel managePatientPanel=new  ManagePatientJPanel(displayJPanel, ecosystem);
        displayJPanel.add("managePatientPanel",managePatientPanel);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_ManagePatjButtonActionPerformed

    private void ManageDonorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDonorjButtonActionPerformed
        // TODO add your handling code here:
        
        ManageDonorJPanel manageDonorPanel=new  ManageDonorJPanel(displayJPanel, ecosystem);
        displayJPanel.add("manageDonorPanel",manageDonorPanel);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_ManageDonorjButtonActionPerformed

    private void ManageEnterjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterjButtonActionPerformed
        // TODO add your handling code here:
        
        ManageEnterprisesJPanel manageEnterprisePanel=new  ManageEnterprisesJPanel(displayJPanel, ecosystem);
        displayJPanel.add("manageEnterprisePanel",manageEnterprisePanel);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_ManageEnterjButtonActionPerformed

    private void ManageEnterAdminjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterAdminjButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel meap = new ManageEnterpriseAdminJPanel(displayJPanel,ecosystem);
        displayJPanel.add("manageEnterprisePanel",meap);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_ManageEnterAdminjButtonActionPerformed

    private void btnAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyticsActionPerformed
        SystemAdminAnalyticsJPanel saa = new SystemAdminAnalyticsJPanel(displayJPanel,ecosystem);
        displayJPanel.add("systemAdminAnalyticsJPanel",saa);
        CardLayout layout=(CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnAnalyticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageDonorjButton;
    private javax.swing.JButton ManageEnterAdminjButton;
    private javax.swing.JButton ManageEnterjButton;
    private javax.swing.JButton ManageLocjButton;
    private javax.swing.JButton ManagePatjButton;
    private javax.swing.JButton btnAnalytics;
    private javax.swing.JLabel btnTitle;
    // End of variables declaration//GEN-END:variables
}

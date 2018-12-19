/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Buisness.EcoSystem;
import Buisness.UserInfo.DonorDirectory;
import Buisness.UserInfo.DonorInfo;
import Buisness.UserInfo.PatientInfo;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aviti
 */
public class ManageDonorJPanel extends javax.swing.JPanel {
JPanel displayJPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageDonorJPanel
     */
    public ManageDonorJPanel(JPanel displayJPanel, EcoSystem ecosystem) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.ecosystem=ecosystem;
        populateDonorTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackjButton = new javax.swing.JButton();
        ViewjButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Donor"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE DONOR INFO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, -1, 34));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 404, 145));

        BackjButton.setText("<<Back");
        BackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButtonActionPerformed(evt);
            }
        });
        add(BackjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 339, -1, -1));

        ViewjButton.setText("View");
        ViewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewjButtonActionPerformed(evt);
            }
        });
        add(ViewjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 276, 84, -1));

        DeletejButton.setText("Delete");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });
        add(DeletejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 339, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void populateDonorTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (DonorInfo test : ecosystem.getDonorDir().getDonorDirectory()) {
            Object[] row = new Object[1];
            row[0] = test;
            model.addRow(row);
        }
    }
    private void ViewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0){
        
        DonorInfo donor = (DonorInfo)jTable1.getValueAt(selectedRow,0);
       // ViewFlight vf = new ViewFlight(csj, mts,airplane);
        ViewDonorJpanel vpj = new ViewDonorJpanel(displayJPanel,donor);
        displayJPanel.add("ViewFlight",vpj);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select a row");
        }
    }//GEN-LAST:event_ViewjButtonActionPerformed

    private void BackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButtonActionPerformed
        // TODO add your handling code here:
        
        
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_BackjButtonActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0){
        
        DonorInfo donor = (DonorInfo)jTable1.getValueAt(selectedRow,0);
        ecosystem.getUserAccountDirectory().deleteUser(donor.getUsername());
        ecosystem.getDonorDir().deleteDonor(donor);
        populateDonorTable();
    }//GEN-LAST:event_DeletejButtonActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton ViewjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
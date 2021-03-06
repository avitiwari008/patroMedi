/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Buisness.EcoSystem;
import Buisness.UserAccount.UserAccount;
import Business.Charity.Donation.DonationDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarthakgoel
 */
public class DonorDonationHistoryJPanel extends javax.swing.JPanel 
{
    private JPanel displayJPanel;
    private EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form DonorDonationHistoryJPanel
     */
    public DonorDonationHistoryJPanel(JPanel displayJPanel, EcoSystem system, UserAccount ua) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.system = system;
        this.account = ua;
        
        populateJtable();
    }
    
    public void populateJtable()
    {
        DefaultTableModel model = (DefaultTableModel) donationJTable.getModel();
        
        model.setRowCount(0);
        
        for(DonationDetails dd : system.getDonationDirectory().getDonationDirectory())
        {
            if(account.getUsername().equalsIgnoreCase(dd.getDonor().getUsername()))
            {
                Object[] row = new Object[6];
                row[0] = dd.getDonor().getName();
                row[1] = dd.getDonationDate();
                row[2] = dd.getDonationAmount();
                row[3] = dd.getCharityName();
                row[4] = dd.getCharityCity();
            
                model.addRow(row);
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        donationJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Donor Donations"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("DONATION HISTORY");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        donationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donor Name", "Donation Date", "Amount", "Charity Name", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationJTable);
        if (donationJTable.getColumnModel().getColumnCount() > 0) {
            donationJTable.getColumnModel().getColumn(0).setResizable(false);
            donationJTable.getColumnModel().getColumn(1).setResizable(false);
            donationJTable.getColumnModel().getColumn(2).setResizable(false);
            donationJTable.getColumnModel().getColumn(3).setResizable(false);
            donationJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 59, 632, 164));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable donationJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

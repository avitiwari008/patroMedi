/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodBank;

import Buisness.Bloodbank.Inventory.BloodBankInventory;
import Buisness.Bloodbank.Inventory.BloodBankInventory.Type1;
import Buisness.Bloodbank.Inventory.BloodBankInventoryDirectory;
import Buisness.Bloodbank.Organisation.InchargeOrganisation;
import Buisness.EcoSystem;
import Buisness.Enterprise.BloodbankEnterprise;
import Buisness.Network.Network;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aviti
 */
public class BloodBankInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankInventoryJPanel
     */
     
    private JPanel displayJPanel;
    private UserAccount userAccount;
    private InchargeOrganisation organisation;
   
    private EcoSystem system;
    private Network net;
    private BloodbankEnterprise enterprise;
    private UserAccount acc;
    private BloodBankInventoryDirectory bbid;
   
    public BloodBankInventoryJPanel(JPanel displayJPanel, UserAccount userAccount, InchargeOrganisation inchargeOrganisation, BloodbankEnterprise enterprise, Network net, EcoSystem system) 
    {
        initComponents();
        
        this.displayJPanel=displayJPanel;
        this.organisation = inchargeOrganisation;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        this.net=net;
        this.bbid=organisation.getBbinventoryDirectory();
        populatecomboBox();
    }

    private void populatecomboBox()
    {
        BloodTypeComboBox.removeAllItems();
        
        for(Type1 t:Type1.values())
        {
            if(t.getValue().equals(Type1.getBloodTypeOn().getValue()) ||t.getValue().equals(Type1.getBloodTypeOp().getValue()) ||t.getValue().equals(Type1.getBloodTypeBp().getValue())||t.getValue().equals(Type1.getBloodTypeBn().getValue()) ||t.getValue().equals(Type1.getBloodTypeAp().getValue())||t.getValue().equals(Type1.getBloodTypeAn().getValue())||t.getValue().equals(Type1.getBloodTypeABp().getValue())||t.getValue().equals(Type1.getBloodTypeABn().getValue()))
            {
                BloodTypeComboBox.addItem(t);   
            }                  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BloodInventoryjTable = new javax.swing.JTable();
        lblBloodType = new javax.swing.JLabel();
        BloodTypeComboBox = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        lblBloodQuantity = new javax.swing.JLabel();
        QuantityjTextField = new javax.swing.JTextField();
        btnAddBlood = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Bank"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("BLOOD BANK INVENTORY");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, 34));

        BloodInventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "Blood Quantity"
            }
        ));
        jScrollPane1.setViewportView(BloodInventoryjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, 404, 85));

        lblBloodType.setText("Blood Type");
        add(lblBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, -1, -1));

        BloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeComboBoxActionPerformed(evt);
            }
        });
        add(BloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 103, -1, -1));

        BackButton.setText("<<Back ");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 331, -1, -1));

        lblBloodQuantity.setText("Quantity");
        add(lblBloodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, 69, -1));
        add(QuantityjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 148, 52, -1));

        btnAddBlood.setText("Add Blood");
        btnAddBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBloodActionPerformed(evt);
            }
        });
        add(btnAddBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 331, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BloodTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodTypeComboBoxActionPerformed
        Type1 typ = (Type1) BloodTypeComboBox.getSelectedItem();
        if(typ != null)
        {
            populateTable(typ);
        }
    }//GEN-LAST:event_BloodTypeComboBoxActionPerformed

    private void btnAddBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBloodActionPerformed
        try
        {
            Integer quantity= (Integer.parseInt(QuantityjTextField.getText()));                          
            Type1 typ = (Type1) BloodTypeComboBox.getSelectedItem();
           
            BloodBankInventory bb=  bbid.SearchBloodGroup(typ);
        
            if(bb.getBloodType() == null || bb.getBloodType() == "")
            {
                bb.setBloodType(typ.getValue());
            }
        
            int bloodquan = bb.getBloodQuantity();
            bloodquan = bloodquan + quantity;
        
            bb.setBloodQuantity(bloodquan);
        
            populateTable(typ);
            QuantityjTextField.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Entered value", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddBloodActionPerformed
       
   private void populateTable(Type1 typ)
   {
        DefaultTableModel model = (DefaultTableModel)BloodInventoryjTable.getModel();
        
        model.setRowCount(0);
        
        for(BloodBankInventory b :bbid.getInventory())
        {
            if(b.getBloodType()!= null && b.getBloodType().equals(typ.getValue()))
            {
                Object[] row = new Object[2];
                row[0] = b.getBloodType();
                row[1]=b.getBloodQuantity();
                model.addRow(row);
            }
        }
    }
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable BloodInventoryjTable;
    private javax.swing.JComboBox<Object> BloodTypeComboBox;
    private javax.swing.JTextField QuantityjTextField;
    private javax.swing.JButton btnAddBlood;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodQuantity;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

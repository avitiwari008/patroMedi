/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Buisness.EcoSystem;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.UserAccount;
import Business.Hospital.Appointment.AppointmentDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarthakgoel
 */
public class PatientAppointmentHistoryJPanel extends javax.swing.JPanel 
{
    private JPanel displayJPanel;
    private EcoSystem system;
    private UserAccount account;
    private Organisation organisation;
    
    /**
     * Creates new form PatientAppointmentHistoryJPanel
     */
    public PatientAppointmentHistoryJPanel(JPanel displayJPanel,UserAccount account, Organisation organisation,EcoSystem ecosystem) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.account = account;
        this.organisation = organisation;
        this.system = ecosystem;
        
        populateJtable();
    }
    
    public void populateJtable()
    {
        DefaultTableModel model = (DefaultTableModel) appointmentDetailsJTable.getModel();
        
        model.setRowCount(0);
        
        for(AppointmentDetails appDetails : system.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(account.getUsername().equalsIgnoreCase(appDetails.getPatient().getUsername()))
            {
                Object[] row = new Object[6];
                row[0] = appDetails.getPatient().getName();
                row[1] = appDetails.getDate();
                row[2] = appDetails.getDoctorName();
                row[3] = appDetails.getHospitalName();
                row[4] = appDetails.getCityTreated();
                row[5] = appDetails.getIllness();
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentDetailsJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Appointment History"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("APPOINTMENT HISTORY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        appointmentDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Appointment Date", "Doctor", "Hospital", "City", "Illness"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentDetailsJTable);
        if (appointmentDetailsJTable.getColumnModel().getColumnCount() > 0) {
            appointmentDetailsJTable.getColumnModel().getColumn(0).setResizable(false);
            appointmentDetailsJTable.getColumnModel().getColumn(1).setResizable(false);
            appointmentDetailsJTable.getColumnModel().getColumn(2).setResizable(false);
            appointmentDetailsJTable.getColumnModel().getColumn(3).setResizable(false);
            appointmentDetailsJTable.getColumnModel().getColumn(4).setResizable(false);
            appointmentDetailsJTable.getColumnModel().getColumn(5).setResizable(false);
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
    private javax.swing.JTable appointmentDetailsJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

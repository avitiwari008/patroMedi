/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receptionist;


import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.PatientBookedWorkQueue;
import Buisness.WorkQueue.WorkRequest;
import Business.Hospital.Appointment.AppointmentDetails;
import Business.Hospital.Organisation.ReceptionistOrganisation;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aviti
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * 
     * Creates new form ReceptionistWorkAreaJPanel
     */
    private JPanel disp;
    private UserAccount acc;
    private ReceptionistOrganisation organisation;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    
    public ReceptionistWorkAreaJPanel(JPanel dispJPanel, UserAccount account, ReceptionistOrganisation organisation, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.disp = dispJPanel;
        this.acc = account;
        this.organisation = organisation;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblValue.setText(userAccount.getUsername());
        populateTable();
    }
    
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) appointmentjTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organisation.getIncomingPatients().getWorkRequestList())
        {
            PatientBookedWorkQueue t = new PatientBookedWorkQueue();
            t = (PatientBookedWorkQueue)request;
            Object[] row = new Object[5];
            row[0] = t;
            row[1] = t.getPatient().getId();
            row[2] = t.getMessage();
            row[3] = t.getSender();
            row[4] = request.getStatus();
            
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AcceptjButton = new javax.swing.JButton();
        RejectjButton = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Receptionist Work Area"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "Time of Appointment", "Type Of Consultation", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentjTable);
        if (appointmentjTable.getColumnModel().getColumnCount() > 0) {
            appointmentjTable.getColumnModel().getColumn(0).setResizable(false);
            appointmentjTable.getColumnModel().getColumn(1).setResizable(false);
            appointmentjTable.getColumnModel().getColumn(2).setResizable(false);
            appointmentjTable.getColumnModel().getColumn(3).setResizable(false);
            appointmentjTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, 690, 155));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Receptionist Work Area");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 32, -1, 34));

        AcceptjButton.setText("Accept");
        AcceptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AcceptjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 359, 98, -1));

        RejectjButton.setText("Reject");
        RejectjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RejectjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 421, 98, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Receptionist");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 84, -1, 30));
        jPanel1.add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 84, 74, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptjButtonActionPerformed
        
        //RejectjButton.setEnabled(false);
        
        int selectedRow = appointmentjTable.getSelectedRow();
            if(selectedRow<0)
            {
                JOptionPane.showMessageDialog(null, "Please Select any Patient appointment to proceed","Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                PatientBookedWorkQueue patient12 = (PatientBookedWorkQueue)appointmentjTable.getValueAt(selectedRow, 0);
                
                if(patient12.getStatus().equals("Approved"))
                {
                    JOptionPane.showMessageDialog(null,"Patient Request already approved.","Warning",JOptionPane.WARNING_MESSAGE);
                }
                else if(patient12.getStatus().equals("Rejected"))
                {
                    JOptionPane.showMessageDialog(null,"Patient has already been Rejected.","Warning",JOptionPane.WARNING_MESSAGE);
                }
                
                else
                {
                    patient12.setStatus("Approved");
                    populateTable();
                    AppointmentDetails appointment = system.getAppointmentDirectory().addAppointment();
                    appointment.setCityTreated(patient12.getCity());
                    appointment.setDoctorName(patient12.getDoctor());
                    appointment.setHospitalName(patient12.getHospitalName());
                    appointment.setPatient(patient12.getPatient());
                    appointment.setDate(new Date());
                
                    JOptionPane.showMessageDialog(null, "Appointment Approved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_AcceptjButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        disp.remove(this);
        CardLayout layout = (CardLayout) disp.getLayout();
        layout.previous(disp);
    }//GEN-LAST:event_btnBackActionPerformed

    private void RejectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectjButtonActionPerformed
        int selectedRow = appointmentjTable.getSelectedRow();
         if(selectedRow<0)
            {
                JOptionPane.showMessageDialog(null, "Please Select any Patient appointment to proceed","Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                PatientBookedWorkQueue patient13 = (PatientBookedWorkQueue)appointmentjTable.getValueAt(selectedRow, 0);
                
                if(patient13.getStatus().equals("Rejected"))
                {
                    JOptionPane.showMessageDialog(null,"Patient Request already Rejected.","Warning",JOptionPane.WARNING_MESSAGE);
                }
                else if(patient13.getStatus().equals("Approved"))
                {
                    JOptionPane.showMessageDialog(null,"Patient Request already approved.","Warning",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    patient13.setStatus("Rejected");
                    populateTable();
                    JOptionPane.showMessageDialog(null, "Appointment Approved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_RejectjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptjButton;
    private javax.swing.JButton RejectjButton;
    private javax.swing.JTable appointmentjTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}

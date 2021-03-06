/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorNurseWorkQueue;
import Buisness.WorkQueue.DoctorReceptionistFinancialWorkQueue;
import Business.Hospital.Appointment.AppointmentDetails;
import Business.Hospital.Organisation.DoctorOrganisation;
import Business.Hospital.Organisation.NurseOrganisation;
import Business.Hospital.Organisation.ReceptionistOrganisation;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.text.html.HTML.Tag.HEAD;

/**
 *
 * @author aviti
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel 
{
    private EcoSystem system;
    private JPanel displayJPanel;
    private Enterprise enterprise;
    private DoctorOrganisation organisation;
    private AppointmentDetails apd;
    private UserAccount account;
    

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel displayJPanel,UserAccount account ,DoctorOrganisation organisation, Enterprise enterprise, EcoSystem system) 
    {
        initComponents();
        this.system = system;
        this.enterprise = enterprise;
        this.organisation = organisation;
        this.displayJPanel = displayJPanel;
        this.account = account;
        valueLabel.setText(account.getUsername());
        populateField();
    }
    
    public void popLabel(){
        int x = -1;
        for(AppointmentDetails ap : system.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(ap.isAppointmentTake() == false)
            {
                x++;
            }
        }
        value2label.setText(String.valueOf(x));
    }
    public void populateField()
    {
        for(AppointmentDetails app : system.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(app.isAppointmentTake() != true)
            {
                this.apd = app;
                PatientNamejTextField.setText(app.getPatient().getName());
                dobJTextField.setText(String.valueOf(app.getPatient().getDob()));
                bloodGroupjTextField.setText(app.getPatient().getBloodGroup());
                popLabel();
                break;
                
            }
        }
    }
    
    public boolean getBloodRequirement()
    {
        if(yesBloodRadioButton.isSelected())
        {
            return true;
        }
        else if(noBloodRadioButton.isSelected())
        {
            return false;
        }
        
        return false;
    }
    
    public boolean getDonationRequirement()
    {
        if(yesDonationRadioButton.isSelected())
        {
            return true;
        }
        else if(noDonationRadioButton.isSelected())
        {
            return false;
        }
        
        return false;
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
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        RefreshjButton = new javax.swing.JButton();
        UpdatejButton = new javax.swing.JButton();
        PatientNamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dobJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IllnessjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PrescriptionProvidedjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        yesBloodRadioButton = new javax.swing.JRadioButton();
        noBloodRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        yesDonationRadioButton = new javax.swing.JRadioButton();
        noDonationRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        bloodGroupjTextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        value2label = new java.awt.Label();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("My Organization "));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Doctor Work Area");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 34));

        enterpriseLabel.setText("Welcome:");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 79, -1, 30));

        valueLabel.setText("value");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 74, 20));

        RefreshjButton.setText("Refresh");
        jPanel1.add(RefreshjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        UpdatejButton.setText("Update Prescription");
        UpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatejButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        PatientNamejTextField.setEditable(false);
        jPanel1.add(PatientNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 175, 190, -1));

        jLabel3.setText("Patient Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 178, -1, -1));

        jLabel4.setText("DOB");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 221, 72, -1));

        dobJTextField.setEditable(false);
        jPanel1.add(dobJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 218, 190, -1));

        jLabel5.setText("Illness");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 72, -1));
        jPanel1.add(IllnessjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 190, -1));

        jLabel6.setText("Prescription");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 72, -1));
        jPanel1.add(PrescriptionProvidedjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, -1));

        jLabel7.setText("Blood Required");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        yesBloodRadioButton.setText("Yes");
        yesBloodRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBloodRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesBloodRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        noBloodRadioButton.setText("No");
        noBloodRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBloodRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noBloodRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel8.setText("Donation  Required");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 280, -1));

        yesDonationRadioButton.setText("Yes");
        yesDonationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesDonationRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesDonationRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        noDonationRadioButton.setText("No");
        noDonationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noDonationRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noDonationRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabel1.setText("Blood Group");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        jPanel1.add(bloodGroupjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 190, -1));

        label1.setText("Patients in queue");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));
        label1.getAccessibleContext().setAccessibleName("a");

        value2label.setText("label2");
        jPanel1.add(value2label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));
        value2label.getAccessibleContext().setAccessibleName("value2label");
        value2label.getAccessibleContext().setAccessibleDescription("");

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatejButtonActionPerformed
                apd.setIllness(IllnessjTextField.getText());
                apd.setPrescription(PrescriptionProvidedjTextField.getText());
                boolean bloodRequired = getBloodRequirement();
                boolean donationRequired = getDonationRequirement();
                apd.setIsBloodRequired(bloodRequired);
                apd.setIsFinAHelpReqd(donationRequired);
                apd.setAppointmentTake(true);
                
                DoctorNurseWorkQueue dnwq = new DoctorNurseWorkQueue();
                DoctorReceptionistFinancialWorkQueue drfwq = new DoctorReceptionistFinancialWorkQueue();
                
                dnwq.setAppointmentDetails(apd);
                dnwq.setSender(account);
                dnwq.setMessage("Prescribed");
                drfwq.setApd(apd);
                drfwq.setFundingRequired(donationRequired);
                drfwq.setFundingApproved(false);
                drfwq.setPrescribed(PrescriptionProvidedjTextField.getText());
                NurseOrganisation org = null;
                JOptionPane.showMessageDialog(null, "Successfully updated Prescription ","Success", JOptionPane.INFORMATION_MESSAGE);
        for (Organisation organisation : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organisation instanceof NurseOrganisation){
                org = (NurseOrganisation)organisation;
                break;
            }
        }
        if (org!=null && apd.isIsBloodRequired() == true){
            org.getDoctorNurseWQ().getWorkRequestList().add(dnwq);
            account.getWorkQueue().getWorkRequestList().add(dnwq);
        }
        ReceptionistOrganisation or = null;
        for (Organisation organisation : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organisation instanceof ReceptionistOrganisation){
                or = (ReceptionistOrganisation)organisation;
                break;
            }
        }
        if (or!=null && apd.isIsFinAHelpReqd() == true){
            or.getFundingQueue().getWorkRequestList().add(drfwq);
            account.getWorkQueue().getWorkRequestList().add(drfwq);
        }
                PatientNamejTextField.setText("");
                dobJTextField.setText("");
                IllnessjTextField.setText("");
                PrescriptionProvidedjTextField.setText("");
                bloodGroupjTextField.setText("");
                populateField();
                

    }//GEN-LAST:event_UpdatejButtonActionPerformed

    private void yesBloodRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBloodRadioButtonActionPerformed
        noBloodRadioButton.setSelected(false);
    }//GEN-LAST:event_yesBloodRadioButtonActionPerformed

    private void noBloodRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBloodRadioButtonActionPerformed
        yesBloodRadioButton.setSelected(false);
    }//GEN-LAST:event_noBloodRadioButtonActionPerformed

    private void yesDonationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesDonationRadioButtonActionPerformed
        noDonationRadioButton.setSelected(false);
    }//GEN-LAST:event_yesDonationRadioButtonActionPerformed

    private void noDonationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noDonationRadioButtonActionPerformed
        yesDonationRadioButton.setSelected(false);
    }//GEN-LAST:event_noDonationRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IllnessjTextField;
    private javax.swing.JTextField PatientNamejTextField;
    private javax.swing.JTextField PrescriptionProvidedjTextField;
    private javax.swing.JButton RefreshjButton;
    private javax.swing.JButton UpdatejButton;
    private javax.swing.JTextField bloodGroupjTextField;
    private javax.swing.JTextField dobJTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JRadioButton noBloodRadioButton;
    private javax.swing.JRadioButton noDonationRadioButton;
    private java.awt.Label value2label;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JRadioButton yesBloodRadioButton;
    private javax.swing.JRadioButton yesDonationRadioButton;
    // End of variables declaration//GEN-END:variables
}

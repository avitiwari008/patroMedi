/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CharityVolunteer;

import Buisness.Charity.Organisation.VolunteerOrganisation;
import Buisness.EcoSystem;
import Buisness.Enterprise.CharityEnterprise;
import Buisness.Network.Network;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.HospitalCharityRequestWorkQueue;
import Buisness.WorkQueue.WorkRequest;
import Business.Charity.Donation.DonationDetails;
import Business.Utilities.SendEmailUtility;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarthakgoel
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel 
{
    private JPanel displayJPanel;
    private CharityEnterprise enterprise;
    private Network network;
    private UserAccount ua;
    private EcoSystem system;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel displayJPanel,UserAccount account, VolunteerOrganisation organisation ,CharityEnterprise enterprise, Network network, EcoSystem ecosystem) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.enterprise = enterprise;
        this.network = network;
        this.ua = account;
        this.system = ecosystem;
        
        
        lblValCharityName.setText(this.enterprise.getName());
        lblValCharityCity.setText(network.getName());
        lblValVolunteer.setText(ua.getUsername());
        
        populateJTable();
    }
    
    public void populateJTable()
    {
        DefaultTableModel model = (DefaultTableModel) charityCases.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : network.getCharityRequests().getWorkRequestList())
        {
            HospitalCharityRequestWorkQueue hcrwq = (HospitalCharityRequestWorkQueue)request;
                
            if(hcrwq.getMessage().equalsIgnoreCase("Acknowledged") && hcrwq.getCharityName().equalsIgnoreCase(enterprise.getName()))
            {
                Object[] row = new Object[5];
                row[0] = hcrwq;
                row[1] = hcrwq.getAmount();
                row[2] = hcrwq.getHospitalName();
                row[3] = hcrwq.getAmount();
                row[4] = hcrwq.getStatus();
                
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
        lblCharity = new javax.swing.JLabel();
        lblCharityCity = new javax.swing.JLabel();
        lblUserAccount = new javax.swing.JLabel();
        lblValCharityName = new javax.swing.JLabel();
        lblValCharityCity = new javax.swing.JLabel();
        lblValVolunteer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        charityCases = new javax.swing.JTable();
        btnSendMailer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Charity Volunteer"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("VOLUNTEER WORK AREA");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        lblCharity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCharity.setText("Charity Name");
        add(lblCharity, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, -1, -1));

        lblCharityCity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCharityCity.setText("Charity City");
        add(lblCharityCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, -1, -1));

        lblUserAccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblUserAccount.setText("Volunteer");
        add(lblUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, -1, -1));

        lblValCharityName.setText("value");
        add(lblValCharityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 59, -1, -1));

        lblValCharityCity.setText("value");
        add(lblValCharityCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 87, -1, -1));

        lblValVolunteer.setText("value");
        add(lblValVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 115, -1, -1));

        charityCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PatientName", "Address", "Hospital", "Funds Required", "Newsletter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(charityCases);
        if (charityCases.getColumnModel().getColumnCount() > 0) {
            charityCases.getColumnModel().getColumn(0).setResizable(false);
            charityCases.getColumnModel().getColumn(1).setResizable(false);
            charityCases.getColumnModel().getColumn(2).setResizable(false);
            charityCases.getColumnModel().getColumn(3).setResizable(false);
            charityCases.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 630, 181));

        btnSendMailer.setText("Publish>>");
        btnSendMailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMailerActionPerformed(evt);
            }
        });
        add(btnSendMailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 364, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMailerActionPerformed
        DefaultTableModel model = (DefaultTableModel) charityCases.getModel();
        int selectedRow = charityCases.getSelectedRow();
        
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Select a case to publish", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            HospitalCharityRequestWorkQueue request = (HospitalCharityRequestWorkQueue)charityCases.getValueAt(selectedRow,0);
            
            if(request.getStatus().equalsIgnoreCase("Published"))
            {
                JOptionPane.showMessageDialog(null, "Newsletter Already Published for this case.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                request.setStatus("Published");
                populateJTable();
                int count =0;
                for(DonationDetails dd : system.getDonationDirectory().getDonationDirectory())
                {
                    if(dd.getCharityName().equalsIgnoreCase(enterprise.getName()))
                    {
                        count++;
                    }
                }
        
                String[] recepients = new String[count];
        
                int index =0;
                for(DonationDetails dd : system.getDonationDirectory().getDonationDirectory())
                {
                    if(dd.getCharityName().equalsIgnoreCase(enterprise.getName()))
                    {
                        recepients[index++] = dd.getDonor().getEmail();
                    }
                }
        
                String from = "patromedi.workspace@gmail.com";
                String pwd = "mavericks3";
        
                String message = "Dear Donors" +",\n\nGreeting from patroMedi!" + "\nWe have sponsored the treatment of the patient whose details you can find below:\n" +"\n"+"Patient Name: "+request.getPatientName()+"\nDonation Used: "+request.getAmount()+"\nHospital Name: " + request.getHospitalName()+"\nHospital City: " + request.getCity() +"\n\nThanks,\nTeam patroMedi";
                String subject ="patroMedi | Newsletter";
                SendEmailUtility.sendEmail(subject,from, pwd, message, recepients);
        
                JOptionPane.showMessageDialog(null, "Newsletter published over mail", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSendMailerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendMailer;
    private javax.swing.JTable charityCases;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCharity;
    private javax.swing.JLabel lblCharityCity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserAccount;
    private javax.swing.JLabel lblValCharityCity;
    private javax.swing.JLabel lblValCharityName;
    private javax.swing.JLabel lblValVolunteer;
    // End of variables declaration//GEN-END:variables
}

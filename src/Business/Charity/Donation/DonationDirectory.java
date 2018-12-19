/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Charity.Donation;

import java.util.ArrayList;

/**
 *
 * @author sarthakgoel
 */
public class DonationDirectory 
{
    private ArrayList<DonationDetails> donationDirectory;
    
    public DonationDirectory()
    {
        this.donationDirectory = new ArrayList<DonationDetails>();
    }

    public ArrayList<DonationDetails> getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(ArrayList<DonationDetails> donationDirectory) {
        this.donationDirectory = donationDirectory;
    }
    
    public DonationDetails addDonation()
    {
        DonationDetails donation = new DonationDetails();
        donationDirectory.add(donation);
        return donation;
    }
}

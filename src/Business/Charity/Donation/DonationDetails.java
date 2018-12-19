/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Charity.Donation;

import Buisness.UserInfo.DonorInfo;
import java.util.Date;

/**
 *
 * @author sarthakgoel
 */
public class DonationDetails 
{
    private DonorInfo donor;
    private String donationAmount;
    private Date donationDate;
    private String charityName;
    private String charityCity;

    public DonorInfo getDonor() {
        return donor;
    }

    public void setDonor(DonorInfo donor) {
        this.donor = donor;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }

    public String getCharityCity() {
        return charityCity;
    }

    public void setCharityCity(String charityCity) {
        this.charityCity = charityCity;
    }
}

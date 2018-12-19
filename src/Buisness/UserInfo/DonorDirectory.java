/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserInfo;

import java.util.ArrayList;

/**
 *
 * @author sarthakgoel
 */
public class DonorDirectory 
{
    private ArrayList<DonorInfo> donorDirectory;
    
    public DonorDirectory(){
        
        this.donorDirectory = new ArrayList<DonorInfo>();
    }

    public ArrayList<DonorInfo> getDonorDirectory() 
    {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<DonorInfo> donorDirectory) 
    {
        this.donorDirectory = donorDirectory;
    }
    public void deleteDonor(DonorInfo donor){
        donorDirectory.remove(donor);
    }
    public DonorInfo addDonor()
    {
        DonorInfo donor = new DonorInfo();
        donorDirectory.add(donor);
        return donor;
    }
}

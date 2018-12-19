/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Bloodbank){
            enterprise = new BloodbankEnterprise(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseType.Charity){
            enterprise = new CharityEnterprise(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseType.User){
            enterprise = new UserEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    } 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import Buisness.Organisation.*;

/**
 *
 * @author manor
 */
public abstract class Enterprise extends Organisation{
    
    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDirectory;
    
    public enum EnterpriseType 
    {
        Hospital("Hospital"),Bloodbank("BloodBank"),Charity("Charity"),User("User") ;
       
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value=value;
        }
        
        public String getValue() 
        {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
  public OrganisationDirectory getOrganizationDirectory() {
        return organisationDirectory;
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organisationDirectory= new OrganisationDirectory();
    }
}
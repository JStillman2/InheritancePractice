/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Nicole
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String jobTitle;
    private boolean benefits;
    
    
    public abstract double getAnnualWages();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isBenefits() {
        return benefits;
    }

    public void setBenefits(boolean benefits) {
        this.benefits = benefits;
    }



          
}

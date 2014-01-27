/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Jay Stillman
 */
import java.util.Scanner;
public class Employee {
    
    private String name;
    private String jobTitle;
    private boolean benefits;
    
        public Employee(String name, String jobTitle, boolean benefits) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.benefits = benefits;
        
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", jobTitle=" + jobTitle + ", benefits=" + benefits + '}';
    }
    

}


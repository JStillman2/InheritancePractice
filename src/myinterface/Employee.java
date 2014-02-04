/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Nicole
 */
public interface Employee {
    
    public static final int MAX_HOURS_PER_WEEK = 50;
    
    
    public abstract double getAnnualWages();
    
    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getSsn();

    public abstract void setSsn(String ssn);
    
}

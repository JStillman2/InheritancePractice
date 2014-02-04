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
public class HourlyEmployee implements Employee {
    
    private String lastName;
    private String firstName;
    private String ssn;
    
        private double hourlyRate;
    private double hoursPerWeek;
    private double overtimeHoursPerWeek;
    private static final double OVERTIME_MULTIPLIER = 1.5;
    

    @Override
    public double getAnnualWages() {
        return (hourlyRate * hoursPerWeek
                + overtimeHoursPerWeek * OVERTIME_MULTIPLIER)
                * 52;
    }
    
    
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getOvertimeHoursPerWeek() {
        return overtimeHoursPerWeek;
    }

    public void setOvertimeHoursPerWeek(double overtimeHoursPerWeek) {
        this.overtimeHoursPerWeek = overtimeHoursPerWeek;
    }
    
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }   
    
}

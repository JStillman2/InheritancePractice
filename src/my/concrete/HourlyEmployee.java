/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Nicole
 */
public class HourlyEmployee extends Employee {
    
    private int hourlyWage;
    private int hours;

    public HourlyEmployee(int hourlyWage, int hours, String name, String jobTitle, boolean benefits) {
        super(name, jobTitle, benefits);
        this.hourlyWage = hourlyWage;
        this.hours = hours;
    }
    
   

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourlyWage=" + hourlyWage + ", hours=" + hours + '}';
    }


    
    
    
}

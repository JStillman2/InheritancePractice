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
    
    private int hourlyRate;
    private int hoursWeek;
    private int otHours;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    @Override
    public double getAnnualWages() {
        return (hourlyRate * hoursWeek
                + otHours* OVERTIME_MULTIPLIER)
                * 52; 
    }
    
    
    

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public int getOtHours() {
        return otHours;
    }

    public void setOtHours(int otHours) {
        this.otHours = otHours;
    }

    
    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourlyRate=" + hourlyRate + ", hoursWeek=" + hoursWeek + ", otHours=" + otHours + '}';
    }

    
    
   




}

    
    
    


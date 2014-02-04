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
public class SalariedEmployee extends Employee {
    
    private double monthlySalary;
    private double annualBonus;
    
    
    @Override
    public double getAnnualWages() {
        return monthlySalary * 12 + annualBonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "monthlySalary=" + monthlySalary + ", annualBonus=" + annualBonus + '}';
    }
    
    
}

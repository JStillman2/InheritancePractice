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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double monthlyCommission;
    
    @Override
    public double getAnnualWages() {
       
        return this.getMonthlySalary() * 12 
                + this.getAnnualBonus() + monthlyCommission;
    }

    public double getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(double monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }
    
    
}

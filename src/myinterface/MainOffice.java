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
public class MainOffice {
     public static void main(String[] args) {
    
    SalariedEmployee emp1 = new SalariedEmployee();
        emp1.setFirstName("Bob");
        emp1.setLastName("Smith");
        emp1.setMonthlySalary(2500);
        emp1.setAnnualBonus(1000);
        double annualWages = emp1.getAnnualWages();
        System.out.println("Annual wages for " + emp1.getFirstName() + " "
            + emp1.getLastName() + ": " + annualWages);
        
        HourlyEmployee emp2 = new HourlyEmployee();
        emp2.setFirstName("Sally");
        emp2.setLastName("Jones");
        emp2.setHourlyRate(9.50);
        emp2.setHoursPerWeek(40);
        emp2.setOvertimeHoursPerWeek(0);
        // no need to declare again, this was already done on line #22
        annualWages = emp2.getAnnualWages();
        System.out.println("Annual wages for " + emp2.getFirstName() + " "
            + emp2.getLastName() + ": " + annualWages);
        
        SalaryPlusCommissionEmployee emp3 = new SalaryPlusCommissionEmployee();
        emp3.setFirstName("Peter");
        emp3.setLastName("Piper");
        emp3.setMonthlySalary(3000);
        emp3.setMonthlyCommission(500);
        emp3.setAnnualBonus(0);
        annualWages = emp3.getAnnualWages();
        System.out.println("Annual wages for " + emp3.getFirstName() + " "
            + emp3.getLastName() + ": " + annualWages);
        
    }
    
}

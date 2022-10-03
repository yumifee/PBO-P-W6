package com.mycompany.employeetest;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yumi Febriana
 */
class Manager extends Employee {
    private String secretaryName;
    
    public Manager (String n, double s, int d, int m, int y){
        super(n,s,d,m,y);
        secretaryName = "";
    }
    @Override
    public void raiseSalary(double byPercent){
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName(){
        return secretaryName;
    }

}

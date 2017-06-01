package chapter4.section3;

import java.util.*;

public class Employee
{
    private static int nextId = 1;
    private String name;
    private double salary;
    private Date hireDay;
    private int id;
    
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar d = new GregorianCalendar(year,month-1,day);
        hireDay = d.getTime();
        id = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public Date getHireDay(){
        return hireDay;
    }
    
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId()
    {
        id = nextId;
        nextId++;
    }
    
    public static int getNextId()
    {
        return nextId;
    }
}

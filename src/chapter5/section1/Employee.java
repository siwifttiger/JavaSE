package chapter5.section1;

import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
	private String name;
	private double salary;
	protected Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar d = new GregorianCalendar(year, month, day);
		hireDay = d.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	
}

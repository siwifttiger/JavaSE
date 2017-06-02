package chapter5.section1.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {

	private double salary;
	Date hireDay;
	
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		super(name);
		this.salary = salary;
		GregorianCalendar d = new GregorianCalendar(year,month,day);
		hireDay = d.getTime();
	}


	public double getSalary() {
		return salary;
	}


	public Date getHireDay() {
		return hireDay;
	}
	
	public String getDescription()
	{
		return String.format("an employee with a salary of $%.2f",salary);
	}
	
	public void raiseSalary(double percent)
	{
		salary += salary * percent / 100;
	}
	
}

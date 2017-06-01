package chapter4.section6;
import java.util.*;

public class ConstructorTest {
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry",40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//print out information about all Employee objects;
		
		for(Employee e : staff)
		{
			System.out.println("name=" + e.getName() + " ,id=" + e.getId()
			+ " ,salary=" + e.getSalary());
		}
	}
}


class Employee
{
	private static int nextId;
	
	private int id;
	private String name="";  // instance field initialization
	private double salary;
	
	// static  initialization block
	static 
	{
		Random generator = new Random();
		//set nextId to a random number between 0 ~ 9999
		nextId = generator.nextInt(100000);
	}
	
	//object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	//three overloaded constructors
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double salary)
	{
		//call Employee(name, salary) constructor
		this("Employee #" + nextId, salary);
	}
	
	public Employee()
	{
		//name initialized to "";
		//salary not explicitly set-- initialized to 0
		//id initialized in initialization block
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}
	
	
}
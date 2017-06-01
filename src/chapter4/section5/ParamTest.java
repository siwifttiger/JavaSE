package chapter4.section5;
import chapter4.section3.*;


public class ParamTest {

	
	public static void main(String[] args)
	{
		/*
		 * Test1 methods can't modify numeric parameters
		 */
		double percent = 10;
		tripleValue(percent);
		System.out.println("End of method percent= " + percent);
		
		/*
		 * Test2 method can change the state of object parameters
		 */
		
		Employee carl = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		System.out.println("Before: salary= " + carl.getSalary());
		tripleValue(carl);
		System.out.println("After: salary= " + carl.getSalary() + "\n");
		
		/*
		 * Test3 method can't attath new objects to object parameters
		 */
		
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Employee tony = new Employee("Tony Tester", 40000, 1990, 3, 15);
        System.out.println("Before a=" + harry.getName());
        System.out.println("Before b= " + tony.getName());
        swap(harry,tony);
        System.out.println("After a= " + harry.getName());
        System.out.println("After b= " + tony.getName());
	}
	
	public static void tripleValue(double x)
	{
		x = 3 * x;
		System.out.println("End of method x=" + x);
	}

	public static void tripleValue(Employee x)
	{
		x.raiseSalary(200);
		System.out.println("End of method salary=" + x.getSalary());
	}
	
	public static void swap(Employee a, Employee b)
	{
		Employee temp = a;
		a = b;
		b = temp;
		
		System.out.println("End of method: a=" + a.getName());
		System.out.println("End of method: b=" + b.getName());
	}
}



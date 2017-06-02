package chapter5.section1;

public class ManagerTest {
	
	public static void main(String[] args)
	{
		
		Manager boss = new Manager("Carl Craker", 80000, 2007, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker",50000,2008,10,1);
		staff[2] = new Employee("Tommy Tester",40000,2009,11,22);
		
		for(Employee e : staff)
			System.out.println("name="+e.getName() + " ,salary=" + e.getSalary());
	}
	
}

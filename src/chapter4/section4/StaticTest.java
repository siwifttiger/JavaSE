package chapter4.section4;
import chapter4.section3.*;
public class StaticTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for(Employee e: staff)
        {
            e.setId();
            System.out.println("name= " + e.getName() + " ,id= " + e.getId() + " ,salary= " + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("next avalible Id= " + n);
    }
}

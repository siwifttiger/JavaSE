package chapter5.section1.abstractclasses;

public abstract class Person {
	public abstract String getDescription();
	private String name;
	
	public Person(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
}


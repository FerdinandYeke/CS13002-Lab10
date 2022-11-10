package Lab10;

public class Person {

	private String name;
	private int age;
	
	
	public Person(String initialName) 
	{
		this.name = "";
		this.age = 0;
	}
	
	//Getters
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	//Getters end here
	
	//Setters
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setAge (int age)
	{
		this.age = age;
	}
	
	//Setters end here
	
	public void printPerson()
	{
		System.out.println(name);
		System.out.println(age);

	}
	
}

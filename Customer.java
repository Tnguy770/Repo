//programmer: Timothy Nguyen
public class Customer {

	private String name;
	private int age;
	
	public Customer(String name, int age) {

	this.name = name;
	this.age = age;
		
	}
	
	public Customer(Customer newcustomer)
	{
		this.name = newcustomer.name;
		this.age = newcustomer.age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		String nc = getName() + "," + getAge();
		
		return nc;
	}
}

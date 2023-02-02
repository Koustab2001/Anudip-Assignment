package Labtest1;

public class Person {
	//instance variable
	String name;
	int age;
	String address;
	String mobilenumber;
	
	//default constructor
	Person()
	{
		super();
	}
	//parameterized constructor
	Person(String name,int age,String address,String mobilenumber)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		this.mobilenumber=mobilenumber;
		
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Mobile Number:"+mobilenumber);
		
	}

}

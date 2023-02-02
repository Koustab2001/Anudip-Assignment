package Labtest1;
//Inheritence - Employee is child class and Person is a parent class
public class Employee extends Person {
	
	//instance variable
	 int eid;
	 String department;
	 int salary;
	 
	//default constructor
	 Employee()
	 {
		 System.out.println("Default Constructor of Employee");
	 }
	 
	//parameterized constructor
	 Employee(int eid,String department,int salary)
	 {
		
		 this.eid=eid;
		 this.department=department;
		 this.salary=salary;
		 
	 }
	 
	 public void displayEmployee()
	 {
		
		 System.out.println("Epmloyee Id: "+eid);
		 System.out.println("Department: "+department);
		 System.out.println("Salary: "+salary);
	 }
	 
	 
	 
	

}

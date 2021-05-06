package ListConcept;

public class Employee {
	
	String name;
	int age;
	String department;
	

	

	int d;

	
	Employee(String name, int age, String department)
	{
		this.name=name;// it means global name is local name here as we are initiallizing global variables
		this.age=age;
		this.department=department;
	}
	

}

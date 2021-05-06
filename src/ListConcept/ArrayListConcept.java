package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
	//int ar[]=new int[3]; this is static array and I cannot store variable in index 3, 4,etc
		
		// to resolve issue, we use Collections(ArrayList)
		
		ArrayList ar=new ArrayList();
		//it can contain duplicate values
		//it inserts the value in order, we can say insertion order
		//it is not synchronized
		//allows random access to fetch any element, because it stores the value on the basis of indexes
		
		
		ar.add(200);
		ar.add(30);
		ar.add(400);
		System.out.println(ar.size());// length of arraylist
		
		ar.add(40);
		ar.add(20);
		ar.add(12.44);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.get(4));// to get the value
		
		// to print all the value we use for loop
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("***********************");
		// we can use Iterator also
		
		Iterator ir= ar.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		// non generic vs generic
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		
		ar1.add(3000);
	//	ar1.add("AJ"); this is not allowed because we have made our ArrayList generic
		
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Ajay Bhardwaj");
		
		ar2.add("Test Selenium");
		
		ArrayList<E> ar3= new ArrayList<E>();
		
		
		Employee e1=new Employee("Ajay", 28, "SE");
		Employee e2=new Employee("Monica", 29, "QA");
		Employee e3=new Employee("Suma", 30, "QA");
		
		//create arraylist
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();// here we are making the arraylist Employee type
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee> itr1=ar4.iterator();
		while(itr1.hasNext())
		{
			Employee emp=itr1.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}
		System.out.println("*************************** /n");
		
		//****************************************************
		
		
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("Ajay Bhardwaj");
		
		ar5.add("Test Selenium");
		
		ar5.add("QTP");
		
		ArrayList<String> ar6= new ArrayList<String>();
		
		ar6.add("Java");
		
		ar6.add("DEV");
		ar6.add("Python");
		
		
		ar5.addAll(ar6);//we are adding elements of ar6 in ar5
		
		for(int p=0; p<ar5.size(); p++)
		{
			System.out.println(ar5.get(p));
		}
		
		System.out.println("after removal******************");
		ar5.removeAll(ar6);
		
		for(int p=0; p<ar5.size(); p++)
		{
			System.out.println(ar5.get(p));
		}
		
		
		// to check the intersection part
		
		System.out.println("to check intersection part");
		
		
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("Ajay Bhardwaj");
		
		ar7.add("Test Selenium");
		
		ar7.add("QTP");
		
		ArrayList<String> ar8= new ArrayList<String>();
		
		ar8.add("Ajay Bhardwaj");
		
		ar8.add("DEV");
		ar8.add("Python");
		
		ar7.retainAll(ar8);

		for(int p=0; p<ar7.size(); p++)
		{
			System.out.println(ar7.get(p)); // on Ajay Bhardwaj is common in both the arraylist
		}

	}

}

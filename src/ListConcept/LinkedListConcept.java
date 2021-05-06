package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("contect of linkedlist"+ll);
		
		ll.addFirst("Java");
		ll.addLast("Automation");
		
		System.out.println("contect of linkedlist"+ll);
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		ll.set(0, "Ajay Bhardwaj");
		System.out.println("contect of linkedlist"+ll);
		System.out.println(ll.get(0));
		ll.removeFirst();
		System.out.println("contect of linkedlist"+ll);
		
		ll.removeLast();
		System.out.println("contect of linkedlist"+ll);
		ll.remove(0);
		System.out.println("contect of linkedlist"+ll);
		
		// how to print all the value of linkedlist
		
		
		System.out.println("Using Iterator 8888888888888888888888888888888888");
		Iterator ar=ll.iterator();
		while(ar.hasNext())
		{
			System.out.println(ar.next());
		}
		
		System.out.println("Using for loop");
		
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("Using advance for loop");
		
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		System.out.println(" using While loop");
		
		int num=0;
		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;
			
		}
		
	}

}

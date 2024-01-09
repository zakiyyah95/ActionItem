package introToJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//array declaration 
		String[] student = new String[5]; // number mentioned inside [] is the size of the 
											// array
		
		//assigning values to the array 
		student[0] = "ProSmart";
		student[1] = "Selenium";
		student[2] = "Java";
		student[3] = "Automation";
		student[4] = "Maven";
		
		for(String s : student) {
			System.out.println(s);
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("ProSmart");
		a.add("Selenium");
		a.add("Java");
		a.add("Automation");
		a.add("Maven");
		
		System.out.println("now using Array List");
		
		for(String al :a) {
			System.out.println(al);
		} 
		
		a.add("Zakiyyah");
		
		System.out.println("*****second iteration*******");
		for(String xy :a) {
			System.out.println(xy);
		} 
		
	}

}

package CW;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Employee1 {
	
	String name;
	double salary;
	 Employee1(	String name,double salary)
	 {
		 this.name=name;
		 this.salary=salary;
	 }
	 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
	LinkedList k=new LinkedList();
		
		Employee1 e1=new Employee1("xyz", 60000);
		Employee1 e2=new Employee1("pqr", 20000);
		Employee1 e3=new Employee1("fgh", 30000);
		k.add(e1);
		k.add(e2);
		k.add(e3);
//		Object o=k.get(0);
//		Employee1 e11=(Employee1)o;
//		e11.getSalary();
		
		LinkedList m=new LinkedList();
		for(int i=0;i<k.size();i++)
		{
			Object o=k.get(i);
			Employee1 e11=(Employee1)o;
			m.add(e11.getSalary());	
		}
		
		
	System.out.println("before sort :\n"+m);
		Collections.sort(m);
	System.out.println("After sort :\n"+m);
	Collections.reverse(m);
	System.out.println("Salary in descending order : \n"+m);
		
	}


}

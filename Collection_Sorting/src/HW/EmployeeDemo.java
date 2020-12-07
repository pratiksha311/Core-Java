package HW;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import CW.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee1> l1=new LinkedList();
		Employee1 e1=new Employee1("lmn", 1, 20000);
		Employee1 e2=new Employee1("abc", 2, 55000);
		Employee1 e3=new Employee1("pqr", 3, 10000);
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println("Before sorting");
		System.out.println(l1);
		
		System.out.println("after  sort using name :\n");
		Collections.sort(l1,new NameComparator());
		System.out.println(l1);
	
		System.out.println("after sort using salary:\n");
		Collections.sort(l1,new Salary1());
		System.out.println(l1);
	}
}

package CW;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee> l1=new LinkedList();
		Employee e1=new Employee("abc", 8, 20000);
		Employee e2=new Employee("xyz", 2, 55000);
		Employee e3=new Employee("pqr", 1, 10000);
		Employee e4=new Employee("lmn", 6, 10000);
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		
		System.out.println("before sorting : \n"+l1);
		
		Collections.sort(l1, new ID11());
		System.out.println("Sorting by Id :\n"+l1);
		
		Collections.sort(l1, new Salary11());
		System.out.println("sorting by salary :\n"+l1);
		
		Collections.sort(l1, new Name1());
		System.out.println("sorting by name :\n"+l1);
		
	}

}

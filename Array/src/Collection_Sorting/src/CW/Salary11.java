package CW;

import java.util.Comparator;

import HW.Employee1;

public class Salary11 implements Comparator<Employee>{


	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		if(e1.getSalary()<e2.getSalary())
		{
			return -1;
		}
		else
		
			return 0;
	}
}
	



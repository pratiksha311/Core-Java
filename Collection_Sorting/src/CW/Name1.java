package CW;

import java.util.Comparator;

public class Name1 implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return arg0.getName().compareTo(arg1.getName());
	}

	
}

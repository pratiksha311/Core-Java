package HW;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 arg0, Employee1 arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}}

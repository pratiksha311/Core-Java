package HW;

import java.util.Comparator;

public class Comp implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);	
	}
}

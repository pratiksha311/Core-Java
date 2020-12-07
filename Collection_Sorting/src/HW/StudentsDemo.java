package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class StudentsDemo {

	public static void main(String[] args) {
		
		ArrayList<Students> l1=new ArrayList();
		Students s1=new Students("xyz", 12, 70);
		Students s2=new Students("wert", 13, 90);
		Students s3=new Students("qwww", 8, 30);
		
	   l1.add(s1);
	   l1.add(s2);
	   l1.add(s3);
	   
	   System.out.println("befor sorting :\n"+l1);
	   Collections.sort(l1);
	   System.out.println("after sorting :\n"+l1);
	}

}

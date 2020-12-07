package CW;

public class ContainmentDemo {

	public static void main(String[] args) {
		
		Person p1=new Person("xyz", "teacher", "pune", 12345, 121);
		p1.displayPersonDetails();
		Address a1=new Address(20, "satara", "UP", "India");
		College c1=new College("wit",a1);
		c1.displayCollegeDetails();
		Staff s1=new Staff("piyush", a1);
		s1.displayStaffDisplay();
     
	}

}

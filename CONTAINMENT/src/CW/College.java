package CW;

public class College {

	String collegeName;
	
	Address collegeaddress;
	
	College(String collegeName,Address collegeAddress)
	{
		this.collegeName=collegeName;
		this.collegeaddress=collegeAddress;
		
	}
	
	
	void displayCollegeDetails()
	{
		System.out.println("college name="+collegeName);	
		collegeaddress.displayAddress();
		
	}
}
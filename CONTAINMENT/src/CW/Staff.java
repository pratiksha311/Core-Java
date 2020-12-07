package CW;

public class Staff {
	
	String employeeName;
	Address address;
	Staff(String employeeName, Address address)
	{
		this.employeeName=employeeName;
		this.address=address;
		
		
	}
	void displayStaffDisplay()
	{
		System.out.println("employee name="+employeeName);
		address.displayAddress();
		
	}

}

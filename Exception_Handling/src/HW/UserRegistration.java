package HW;

import java.util.Scanner;

public class UserRegistration {
	
	
	String userName;
	int age;
	String country;
	void registerProfile(String userName,int age,String country) 
	{
		
	  if(country.equals("india"))
	  {
		  System.out.println(" country is india");
	  }
	  else
	  {
		  try
		  {
		         throw new InvalidCountryException("enter valid country");
		  }
		  catch(InvalidCountryException e)
		  {
			  System.out.println(e);
		  }
	  }
	 
	  if(age<18)
	  {
		  try
		  {
		         throw new InvalidAgeException("User is Minor");
		  }
		  catch(InvalidAgeException d)
		  {
			  System.out.println(d);
		  }
	  }
	  else
	  {
		  System.out.println("age is greater than 18");
	  }
    }


	public static void main(String[] args) {
		UserRegistration u1=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username ,age,country");
		String userName=sc.next();
		int age=sc.nextInt();
		String country=sc.next();
		u1.registerProfile(userName,age,country);
	
	}

}

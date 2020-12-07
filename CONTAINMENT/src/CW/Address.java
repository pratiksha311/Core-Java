package CW;

public class Address {
	
	int streetno;
	String city,state,country;
	
	Address(int streetno,String city,String state,String country)
	{
		this.streetno=streetno;
		this.city=city;
		this.state=state;
		this.country=country;
	}
	void displayAddress()
	{
		System.out.println("strretno="+streetno+" city="+city+" state="+state+" country="+country);
	}
	

}

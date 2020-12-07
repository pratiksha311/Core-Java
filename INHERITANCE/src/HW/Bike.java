package HW;

public class Bike extends Vehicle{
	
	
	double discountRate;
	Bike(String name,String serviceStationName,int vModelNo,int vPrice,double discountRate)
	{
		super(name, serviceStationName, vModelNo, vPrice);
		this.discountRate=discountRate;
	}
	void Display()
	{
		System.out.println("discountRate=" + discountRate);
		super.Display();
	}
	void Discount()
	{
		double discount=vPrice-(vPrice*discountRate/100);
		System.out.println("discount="+discount);
	}
}

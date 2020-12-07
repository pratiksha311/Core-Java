package HW;

public class Vehicle {
	
	String name,serviceStationName;
	int vModelNo,vPrice;
	public Vehicle(String name,String serviceStationName,int vModelNo,int vPrice) 
	{
		this.name=name;
		this.serviceStationName=serviceStationName;
		this.vModelNo=vModelNo;
		this.vPrice=vPrice;
	}
	void Display()
	{
		System.out.println("name="+name+" serviceStationName="+serviceStationName+" vModelNo="+vModelNo+" vModelNo="+vModelNo+" price="+vPrice);
		
	}

}

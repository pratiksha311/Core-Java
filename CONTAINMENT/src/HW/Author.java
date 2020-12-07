package HW;

public class Author {
	
	String authorname,place;
	int age;
	Author(String authorname,String place,int age)
	{
		this.place=place;
		this.authorname=authorname;
		this.age=age;
	}
	public String getPlace() {
		return place;
	}
	
	public String getAuthorname() {
		return authorname;
	}
	public int getAge() {
		return age;
	}
	

}

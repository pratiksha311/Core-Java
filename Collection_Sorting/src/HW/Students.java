package HW;

public class Students implements Comparable<Students>{
	
	String name;
	int age;
	int marks;
	public Students(String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", marks=" + marks + "]\n";
	}
	@Override
	public int compareTo(Students s1) {
		if(this.marks>s1.marks)
		{
			return 1;
		}
		if(this.marks<s1.marks)
		{
			return -1;
		}
		return 0;
	}
	
	

}

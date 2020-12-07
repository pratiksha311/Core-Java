package HW;

public class Employee extends Worker{

	String work_spetialization;
	 Employee(String sname,String saddress,int sage,int sphoneno,int salary,String work_spetialization)
	 {
		super(sname,saddress,sage,sphoneno,salary);
		this.work_spetialization=work_spetialization;
	
	 }
	@Override
	public String toString() {
		return "Employee [work_spetialization=" + work_spetialization + ", sname=" + sname + ", saddress=" + saddress
				+ ", sage=" + sage + ", sphoneno=" + sphoneno + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	//@Override
//	public String toString() {
//		return "Employee [work_spetialization=" + work_spetialization + ", sname=" + sname + ", saddress=" + saddress
//				+ ", sage=" + sage + ", sphoneno=" + sphoneno + ", salary=" + salary + "]";
//	}
	
	
	 
	 
	 

	
	
	

}

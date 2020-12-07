package HW;

public class StaffMember extends Department{
	
	String memberName,MemberQualification;
	
	StaffMember(String departmentName,String HODname,String memberName,String MemberQualification)
	{
		super(departmentName, HODname);
		this.memberName=memberName;
		this.MemberQualification=MemberQualification;
	}
	void showStaffMemberDetails()
	{
		System.out.println("departmentName="+departmentName+" HODname="+HODname+" memberName="+memberName+" MemberQualification="+MemberQualification);
	}
}

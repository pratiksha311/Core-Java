package HW;

public class Max_length_substring {

	public static void main(String[] args) {
		String s="ababcb";
		System.out.println("hii");
				char c[]=s.toCharArray();
				int maxlength=0;
				
				System.out.println(s);
				
				
				
				
				for(int i=0;i<c.length;i++)
				{
					int length=1;
					String str=String.valueOf(c[i]);
					for(int j=i+1;j<c.length;j++)
					{
						while(c[i]!=c[j])
						{
							str=str+String.valueOf(c[j]);
							length++;
							System.out.println("str="+str+" length="+length);
							if(j<c.length||c[i]==c[j])
							{
								break;
							}
						}
						
						if(maxlength<length)
						maxlength=length;
						if(c[i]==c[j])
						{
							break;
						}
					}
				}
				System.out.println("maxlength="+maxlength);


	}

}

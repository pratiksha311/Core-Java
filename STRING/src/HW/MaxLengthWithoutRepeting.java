package HW;


public class MaxLengthWithoutRepeting {
int maxchars=256;


int longestSubstring(String str)
{
	int n=str.length();
	int cur_length=1;
	int max_length=1;
	int prev_index;int i;
	
	int visited[]=new int[maxchars];
	//System.out.println("visited[b]="+visited[99]);
	
	for(i=0;i<visited.length;i++)
	{
		visited[i]=-1;
	}
	prev_index=visited[str.charAt(0)];
	for(i=1;i<n;i++)
		{
		//System.out.println("str.charAt"+i+"="+str.charAt(i)+"visited[str.charAt"+i+"="+visited[str.charAt(i)]);
		prev_index=visited[str.charAt(i)];
	//System.out.println("Prev_index="+prev_index);
	if(prev_index==-1||i-cur_length>prev_index)
		cur_length++;
	else
	{
		if(cur_length>max_length)
			max_length=cur_length;
		
		cur_length=i-prev_index;
	}
	visited[str.charAt(i)]=i;
	
}

if(cur_length>max_length)
	max_length=cur_length;
return max_length;
}
	public static void main(String[] args) {
	String s="ababc";
	MaxLengthWithoutRepeting m=new MaxLengthWithoutRepeting();
	int l=m.longestSubstring(s);
	System.out.println(l);

	}

}

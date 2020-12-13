package HW;

public class Mindstick {

     void interleaved(char[] s1,char[] s2,char[] s3,int s1_len,int s2_len)
     {
    	 int si=0;
    	 for(int i=0;i<s1_len;i++)
    	 {
    		s3[i]=s1[i];
    		s3[i]=s2[i];
    	 }
    	 for(int i=0;i<s1_len;i++)
    	 {
    		System.out.print(s1[i]+" ");
    		System.out.print(s2[i]+" ");
    	 }    	 
    }
 	public static void main(String[] args) {
 		
 		Mindstick m1=new Mindstick();
 		//String s1="hello";
 		
 		char s1[]= {'a','b','c','d'};
 		char s2[]= {'w','x','y','z'};
 		char s3[]=new char[s1.length+s2.length];
 		m1.interleaved(s1, s2, s3, 4, 4);
 	}
 	
}

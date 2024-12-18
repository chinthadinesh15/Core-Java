package multi_Threading;

public class Code 
{
	public static void main(String[] args) 
	{
		String a="12345aa";
		
		int res=findsum(a);
		
		System.out.println(res);
		
	}

	public static int findsum(String a) 
	{
		int sum=0;
		
		for(int i=0;i<a.length();i++)
		{
			sum=sum+Character.getNumericValue(a.charAt(i));
		}
		return sum;
	}
	

}
 
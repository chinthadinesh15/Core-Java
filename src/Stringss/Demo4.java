package Stringss;

public class Demo4
{
	public static void main(String[] args) {
		String s=new String("RajaRamMohanRoy");
		//System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(4));
		System.out.println(s.codePointAt(0));
		
		System.out.println(s.startsWith("yy"));
		System.out.println(s.endsWith("Roy"));
		
		System.out.println(s.lastIndexOf('R'));
		
		System.out.println(s.substring(0,5));
		
		char []arr=s.toCharArray();
		System.out.println(arr);
		System.out.println(arr[9]);
		
	}

}

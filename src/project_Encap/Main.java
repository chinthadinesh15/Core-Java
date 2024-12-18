package project_Encap;
import java.util.Scanner;



public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice\r\n"+"Cricket\r\n"+"Football");
		String choice=sc.next();
		
		Player item =Factory.getPlayer(choice);
		item.displayInfo();
		sc.close();
	}

}

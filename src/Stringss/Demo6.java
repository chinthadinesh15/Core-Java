package Stringss;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the College name");
		//sc.nextLine();
		String clg=sc.nextLine();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(clg);

	}

}

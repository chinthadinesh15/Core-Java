

import java.util.Scanner;

public class Jagged_array
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	int [][]ar=new int[2][];
	ar[0]=new int[3];
	ar[1]=new int[4];
	
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar[i].length;j++)
		{
			System.out.println("class of "+i+"student of "+j);
			ar[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar[i].length;j++)
		{
			System.out.println(ar[i][j]);
		}
	}
}
}
	
	

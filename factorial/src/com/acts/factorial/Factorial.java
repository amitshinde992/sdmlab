package com.acts.factorial;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int result=num;
		int temp=result;
		
		while(temp != 1)
		{
			temp = (temp - 1);
			result = result * temp;
		}
		System.out.println("factorial is: "+result);
		
		sc.close();
	}

}

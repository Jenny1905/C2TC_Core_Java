package com.tns.assignment1;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//Program to print Left-Right-angled triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
			
		}

	}

}

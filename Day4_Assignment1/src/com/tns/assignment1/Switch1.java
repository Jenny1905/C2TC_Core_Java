package com.tns.assignment1;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		switch(str)
		{
			case "shiv":
				System.out.println("Hi Shivani");
				break;
			case "Neha":
				System.out.println("Hi Neha");
				break;
			default:
				System.out.println("Invalid string");
				s.close();
		}
	}
}
				
		

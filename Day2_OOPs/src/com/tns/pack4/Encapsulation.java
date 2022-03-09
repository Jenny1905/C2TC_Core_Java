package com.tns.pack4;
//2.Another way to import a package using import package_name.class_name
import com.tns.pack3.SBI;

public class Encapsulation 
{

	public static void main(String[] args)
	{
		SBI s = new SBI();

		s.setBalance(32500);
		System.out.println("Your SB A/c Balance : " + s.getBalance());
	


	}

}

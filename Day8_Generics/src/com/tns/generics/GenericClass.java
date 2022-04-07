package com.tns.generics;

public class GenericClass<T>
{
	T value;
	public void show()
	{
		System.out.println(value.getClass().getName());
	}

	public static void main(String[] args) 
	{
		GenericClass<Integer>obj=new GenericClass<>();
		obj.value=10;
		//obj.value="10";//compilation error as its type safety
		obj.show();
		
		

	}

}

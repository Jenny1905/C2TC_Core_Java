package com.tns.annotations;


class Animal 
{
	void eatSomething()
	{
		System.out.println("eating something");
	}  
}  
  
class Dog extends Animal
{  

	@Override  
	void eatsomething()
	{
		System.out.println("eating foods");
		}//should be eatSomething  
}  
class Example1
{  
public static void main(String args[])
{  
Animal a=new Dog();
a.eatSomething();

}
}  
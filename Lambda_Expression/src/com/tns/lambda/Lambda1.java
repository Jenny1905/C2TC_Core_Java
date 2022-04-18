package com.tns.lambda;

interface A
{
	void show(int i);
}
/*class Xyz implements A
{
	public void show()
	{
		System.out.println("Hello");
	}
}*/
public class Lambda1 {

	public static void main(String[] args) {
		//A obj= new Xyz();
		/*A obj1= new A();
		{
		public void show()
		{
			System.out.println("Hello");
		}
		};*/
		//Lambda Expression
		A obj1 = (int i) ->
		{
			System.out.println("Hello"+ i);
		};
		//Lambda Expression
		A obj2 =(int i)->System.out.println("Shiwani"+i);
		
		
		obj1.show(5);
		obj2.show(10);

	}

}

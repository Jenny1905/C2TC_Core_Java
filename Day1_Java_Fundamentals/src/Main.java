import java.util.Scanner;

public class Main 
{


		public  int josephus(int n, int k)
		{
			if (n == 1)
				return 1;
			else
				
				return (josephus(n - 1, k) + k - 1) % n + 1;
		}
		public static void main(String args[])
		{
			Main m=new Main();
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(m.josephus(n,k));
			sc.close();	

			
		}
			
	




	}



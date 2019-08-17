import java.util.Scanner;

public class Proj {

	public int add(int x,int y) {
		
		return x+y;
	}
	
	public itsme() {
		System.out.println("ITS ME PUMPY");
		System.out.println(" THE BOYS CAN'T KEEP UP. ");
	}
	
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter the 1st operand: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the 2nd operand: ");

		b = sc.nextInt();
		
		itsme();
		System.out.println("The sum is "+add(a,b));

		
	}
}                                                                                                                                                                                                                                                                                        

		b = sc.nextInt;
		subtract(a,b);
	}

	void subtract(int a,int b)
	{
		int res;
		res=a-b;
		System.out.println("Nganba says the result is "+res+" after subtraction");
	}
      void multipy(int a,int b)
	{
		int res;
		res=a*b;
		System.out.println("Rahul says the product is "+res+" after multiplication");
		System.out.println("nganba");
	}
	void sathu()
	{
	System.out.println("move on");

	}
	
}
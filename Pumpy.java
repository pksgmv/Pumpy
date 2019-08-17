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
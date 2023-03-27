package basic;
import java.util.Scanner;
public class Factorial_Number {
			public static void main(String[] args) {
				// Factorial number of a given number n
				Scanner sc = new Scanner(System.in);
				int n;
				int i;
				int fact=1;
				System.out.println("enter number for factorial");
				n = sc.nextInt();
				
				for(i=1;i<=n;i++) {
					fact = fact*i;
					
				}
				System.out.println("factorial of "+n+": "+fact);
			}
}

package basic;
import java.util.Scanner;
public class Multiplication_table {
			public static void main(String[] args) {
				//java program to print multiplication table of n number
				
				int n;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter number");
				n = sc.nextInt();
				int sum =0;
				for(int i=1;i<=10;i++) {
					sum=n*i;
					
					System.out.println(n+" X " + i+"="+ sum );
				}
			
			}
}

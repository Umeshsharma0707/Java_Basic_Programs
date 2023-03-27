package basic;
import java.util.Scanner;
public class PracticeSet {
		
			public static void main(String[] args) {
				//sum of n even numbers
				// 2*n se even no generate hote h
				// (2*n)+1 se odd no generate hote h 
				Scanner sc = new Scanner(System.in);
				System.out.println("enter number");
				int n = sc.nextInt();
				
				int sum=0;
				int i=0;
				for(i=0; i<n;i++) {
					sum = sum + (2*i);
				}
				System.out.println("sum of first "+i+" even numbers: "+sum);
				sum=0;
				System.out.println("enter number");
				 n = sc.nextInt();
				for(i=0;i<n;i++) {
					sum = sum+(2*i+1);
				}
				System.out.println("sum of first "+i+" odd numbers:"+sum);
			}
}

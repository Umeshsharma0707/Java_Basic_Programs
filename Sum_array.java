package basic;
import java.util.Scanner;
public class Sum_array {
		public static void main(String[] args) {
			
			//create an array of 5 floats and calculate their sums
			Scanner sc = new Scanner(System.in);
			float []n = new float[5];
			float sum =0;
			
			for(int i =0;i<5;i++) {    //for loop for get multiple input
				System.out.println("enter value "+ i);
				n[i]= sc.nextFloat();
				sum = sum + n[i];				// for add all input together
				
			}
				System.out.println("sum : "+sum);  // to print output
			
		}
}

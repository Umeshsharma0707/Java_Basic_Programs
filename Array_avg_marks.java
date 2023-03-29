package basic;

public class Array_avg_marks {
			public static void main(String[] args) {
				// calculate average marks from a array containing marks of all students in physics using for-each loop 
				
				float []phymarks = {50.5f,49,71.4f,91.9f,99.99f};
				float sum = 0;
				float avg = 0;
				for(int i = 0; i<5;i++) {
					sum = sum+phymarks[i];
					avg = sum/phymarks.length;
				}
				System.out.println("total :"+sum);
				System.out.println("Average :"+ avg);
			}
}

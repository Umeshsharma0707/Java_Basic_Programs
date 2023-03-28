package basic;

public class ForEach_loop {
	
	public static void main(String[] args) {
					// for each loop
			
		//	float [] marks1 = {12.4f,45.4f,45.4f,566.5f,78.5f};
		//	System.out.println(5);
		//	System.out.println(marks.length);
		//	String [] students = {"umesh","rohan","rakesh","abhay","sumit"};
		//	System.out.println(students.length);
		
		int [] marks = {5,10,20,30,40,50};
		
		// displaying the array
		
		// array using for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
			
	/*	System.out.println("array in reverse order");
		for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}  */
		System.out.println("using for-each loop");
		
		for(int element: marks) {
			System.out.println(element);
		}
		
	}
	
			
}

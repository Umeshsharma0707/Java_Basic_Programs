package basic;

public class Max_element_inArray {
		public static void main(String[] args) {
			// find maximum element in an array
			
			int [] n = {12,45,15,-200,21};
			
		//	int max = n[0];
		
			int  max = 0;			
			for(int element : n) {
				if(element>max) {
					max= element;
				}
				
			}
			System.out.println("maximum element of an array: "+max);
			
		}
}

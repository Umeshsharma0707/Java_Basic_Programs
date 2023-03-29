package basic;

public class Array_Integer_present_or_not {
				   public static void main(String[] args) {
					   
					// check a number is present  in array or not
					   
					   float []marks = {12.5f,50.2f,35.5f,12.4f};  // initialization
					   float num = 35.5f;   // initialize for check
					   boolean present = false;      //us boolean
					   for(float element: marks) {     // for-each loop
						   if(num==element) {                   // check condition
							  System.out.println(element+" yes it is present ");  // print element
							  present = true;
							   break;      // it yes break 
						   }
						   
						   
					   }
					/*   if(present) {   // get ans using boolean 
						   System.out.println(num+" yes it is present");
					   }else {
						   System.out.println(num+" No it is not present");
					   }
					  */ 
					   
				}
	
}

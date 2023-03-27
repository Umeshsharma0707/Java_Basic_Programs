package basic;

public class Break_Continue {
				public static void main(String[] args) {
					
					//continue statement
					
					for(int i=1;i<=5;i++) {
						if(i==2) {
							System.out.println(i);
							System.out.println("ending loop");
							continue;
						}
						System.out.println(i);
						System.out.println("java is great");
					}
					
					int j=0;;
					do {
						j++;
						if(j==2) {
							continue;
						}
						System.out.println(j);
					}while(j<5);
					
					// Break and Continue using Loops
					
//					
//					for(int i=1;i<=5;i++) {
//						System.out.println(i);
//						System.out.println("java is great");
//						if(i==2) {
//							System.out.println("Ending the loop");
//							break;
//						}
//					}
//					
//					System.out.println("ending the loop");
//					
//					int j=1;
//					while(j<=5) {
//						System.out.println(j);
//						j++;
//						if(j==3) {
//							break;
//						}
//					}
//					System.out.println("java is great");
//					j=1;
//					do {
//						System.out.println(j);
//						j++;
//						if(j==3) {
//							break;
//						}
//					}while(j<=5);
					
				}
}

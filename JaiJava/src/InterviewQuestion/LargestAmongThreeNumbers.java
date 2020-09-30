package InterviewQuestion;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int x = 600;
		int y = 600;
		int z = 600;
		
		if( x>y && x>z) {
			System.out.println("x is the greatest");
		}else if(y>z){
          System.out.println("y is the greatest");			
		}else {
			System.out.println("z is the greatest");
		}

		
		   if(x>=y) {
			   if(x>=z) {
				   System.out.println("x is the greatest");
			   }
			   else {
				   System.out.println("z is the greatest");
			   }
		   }
			   else {
				   if(y>=z) {
					   System.out.println("y is the greatest");
				   }
		   }
		
	}

}


package InterviewQuestion;

public class FactorialNumber {

	public static void main(String[] args) {


		//!5 = 5x4x3x2x1 = 120
		//!4 = 24
		//!0 = 1
		
		int num = 0;
		getFac(num);
		
		
		
		

	}
	
	public static void getFac(int num) {
		
        int fact = 1;
		
		for (int i = 1; i<=num; i++) {
			fact = fact* i;
			
		}
		System.out.println("factorial of "+num+ " is :" + fact);
		
	}

}

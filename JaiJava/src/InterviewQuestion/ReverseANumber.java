package InterviewQuestion;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 4321; //4321
		int rev = 0;
		
		while (num !=0) {
			
			int n = num % 10;
			rev = rev * 10 + n; //4
			num = num/10;
				}
		
		System.out.println("reverse number is : " + rev);

	}

}

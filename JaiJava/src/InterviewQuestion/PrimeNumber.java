package InterviewQuestion;

public class PrimeNumber {

	public static void main(String[] args) {
		// Number that is divisible by 1 or itself  ---> 13, 17, 29
		
		int  num = 1;
		boolean flag = false;
		
		for(int i= 2; i<=num/2; i++) {
			
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + "is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}

	}

}

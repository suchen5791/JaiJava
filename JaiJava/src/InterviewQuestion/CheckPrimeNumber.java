package InterviewQuestion;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		//java prpgram to check whether a number can be expressed as sum of two prime numbers
		//34 = 3 +31  5+29  11+23 17+17
		//11
		
		//System.out.println(CheckPrimeNumber(34));
		int num = 34;
		boolean flag = false;
		
		for(int i =2; i<=num/2; i++) {
			
			if(CheckPrimeNumber(i)) {
				
				if(CheckPrimeNumber(num-i)) {
					System.out.println(num + " = "+ i + " + " + (num-i));
					flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println(num + " can not be expressed as the Sum of two Prime Numbers");
		}

	}
	
	//create Method
	 public static boolean CheckPrimeNumber(int num) {
		 
		 boolean isPrime = true;
		 for(int i =2; i<=num/2; i++) {
			 if(num % i ==0) {
				 isPrime = false;
				 break;
			 }
		 }
		 
		 return isPrime;
		 
	 }

}

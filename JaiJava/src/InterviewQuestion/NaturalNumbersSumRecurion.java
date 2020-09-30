package InterviewQuestion;

public class NaturalNumbersSumRecurion {

	public static void main(String[] args) {
		// method calling itself
		//natural numbers are positive numbers (zero not natural number)
		
		int num = 5; //5+4+3+2+1 = 15
		int sum  = addNum(num);
		System.out.println("sum is : " + sum);
		

	}
	
	public static int addNum(int  num) {
		if(num!=0) {
			return num + addNum(num-1);
		}else {
			return num;
		}
	}

}

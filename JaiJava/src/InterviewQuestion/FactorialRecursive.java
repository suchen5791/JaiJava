package InterviewQuestion;

public class FactorialRecursive {

	public static void main(String[] args) {
		
		System.out.println(multiplyNum(5));//5*4*3*2*1 =120
		System.out.println(multiplyNum(0));
		

	}
	
	public static int multiplyNum(int num) {
		
		if(num>=1){
			return num * multiplyNum(num-1);
		}
		else {
			return 1;
		}
	}

}

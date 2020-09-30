package InterviewQuestion;

public class PowerConcept {

	public static void main(String[] args) {
		
		//3 to the power 4 = 81
		int base = 2;
        int exponent = 40;
        
        long result = 1;
        
        while(exponent != 0) {
        	result *= base; //result*base;
        	--exponent;
        }
        System.out.println(result);
        
        //System.out.println(Math.pow(base, exponent));
        		
		
		
		

	}

}

package JaiPack1;

public class LoopsConcept {

	public static void main(String[] args) {
	
		//1.while loop:
		//dis-advantage of while loop: it will generate infinite loop 
		//if you dont give incremental/decremental part
		
		int i =1;//initialization
		
		while(i<=10) {//conditional
			System.out.println(i);
			i=i+1;//incremental/decremental
		}
		
		System.out.println("*****");
		
		
		//2. for loop:
		//j++ means j = j+1
		//print 1 to 10
		for(int j=1; j<=5; j++) {//initialization, Conditional part, Incremental part 
			System.out.println(j);
			
		}
		
		//k-- means k = k-1
		//print 10 to -10
		for(int k=10; k>=-10; k-- ) {//initialization, Conditional part, Decremental part
			System.out.println(k);
		}
	}

}

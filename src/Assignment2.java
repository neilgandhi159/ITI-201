
public class Assignment2 {
	public static void main(String[] args) {
		int[] myInts = new int [10];

		for(int i = 0; i < myInts.length; i++){
			myInts[i] = i*2+1;
		}
		for(int i = myInts.length-1; i >= 0; i--){
			System.out.print(myInts[i] + " ");
		}

		System.out.println(" ");
		
		for(int i = 0; i < myInts.length; i++) {
			if(myInts[i]%3 == 0) {
				System.out.print(myInts[i] +  " ");
			}
		}
		System.out.println(" ");
		
		int counter = 1;
		int result = 1;
		while(counter <= 10) {
			result = counter*5;
			System.out.print(result + " ");
			counter++;
		}
		System.out.println(" ");
		
		String firstName = "Neil";
		System.out.println(firstName);
		
		char[] firstNameChar = firstName.toCharArray(); // ".toCharArray" formatting from https://www.geeksforgeeks.org/reverse-a-string-in-java-5-different-ways
		
		for(int i = firstNameChar.length-1; i >= 0; i--){ 
			System.out.print(firstNameChar[i]);
		}
		
		System.out.println(" ");
		
		int[] myIntsFlipped = new int [10];
		
		myIntsFlipped = myInts; 
		
		for(int i = myIntsFlipped.length-1; i >= 0; i-- ) {
			System.out.print(myIntsFlipped[i] + " ");
		}
		
		
		
	}//end of main method
}//end of Assignment2

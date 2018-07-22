
public class Assignment2 {
	public static void main(String[] args) {
		int[] myInts = new int [10];

		for(int i = 0; i < myInts.length; i++){
			//System.out.print((i*2+1) + " ");
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
		
		for(int i = 1; i <= myInts.length ; i++) {
			myInts[i] = i*5;
			System.out.print((i*5) + " ");
		
		}
		
		
		
	}//end of main method
}//end of assignment2

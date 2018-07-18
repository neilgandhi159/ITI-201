
public class JavaLecture2 {
	public static void main(String[] args) {
		int[] myInts = new int [6]; //this array can hold up to 6 integers indexed 0-5

		// when you know exactly when you will start and stop
		// the first part tells Java where to start
		// the second part is telling Java where to stop
		// the third part tells Java how to iterate
		// i ++ means add 1 to i --> it is the same as saying:
		// i = i + 1 or i += 1
		
		for(int i = 0; i < myInts.length; i++){
			System.out.println("We are at index: " + i + " and we are setting it to " + (i^2));
			myInts[i] = i;
		}//end of for loop
		
		
		for(int i = myInts.length-1; i >= 0; i--){
			System.out.print(myInts[i] + " ");
			
		} //end of for loop
		// When using the .print rather than .println, you never go to the next line
		// ... so add .println after to "add space"
		
		System.out.println(" ");
		System.out.println("Hello World");
		
		for(int i = 1; i < 9; i += 2) {
			for(int j = 1; j < 7; j += 2 ){
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		int counter = 0;
		int result = 0;
		while(counter <= 10) {//as long as this condition is true the loop continues
			// "while" the condition continues to be true keep doing these steps
			result += counter;
			System.out.println("Our result is: " + result + " and our counter is: " + counter);
			counter++;
		}//end of while loop
		
		result = 0;
		//this loop essentially does the same thing
		for(int i = 0; i <= 5; i++) {
			result += i;
			System.out.println("Our result is: " + result + "and our i is: " + i);
		}//end of for loop
		int x,y,z;  //can declare the same type on the same line separated by commas
		x = 2;
		y = 11;
		z = 100;
		System.out.println("x " + evenOrNah(x));
		System.out.println("y " + evenOrNah(y));
		System.out.println("z " + evenOrNah(z));
		// these operators are intuitive
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("y / x = " + (x/y));
		// What about remainders?
		System.out.println("The remainder of 2/10 = " + (x%y));
		System.out.println("y/x = " + (y/x) + " with a remainder of " + (y%x));
		
		//if, else if, else
		if(y%2 == 0) {
			System.out.println("y is even!");
		}
		else {
			System.out.println("y is odd!");
		}
		
		for(int i= 0; i < 20; i++) {
			if(evenOrNah(i).equals("is even!")) {
				System.out.print(i + " ");
			}//end of if
		}//end of loop
		
		if(x == 1) {
			System.out.println("x is 1");
		}//end of if
		else if(x == 10) {// ONLY reached if the if statement is false
			System.out.println("x is 10");
		}
		else if(x == 100) {//when you find the "true" one you'll stop
			System.out.println("x is 100");
		}
		else {// if you never find a true statement, defualt to else
			System.out.println("x is not 1, 10, or 100");
		}
	
		int n = 0;
		String someString = "test";
		boolean myBool;
		boolean myOtherBool;
		myBool = (someString.equals("test"));
		myOtherBool = (n == 1);
		if(myBool || myOtherBool) {
			System.out.println("At least one of my booleans is true");
		}
		else {
			System.out.println("Both of my booleans are false");
		}
				
		
	}//end of main method
	private static String evenOrNah(int number) {
		if(number%2 == 0) { //two equal signs compares two integers
			return "is even!";
		}
		else {
			return "is odd!";
		}
	}//end of evenOrNah Static belongs to the class, its not an instance of the class, does not need anything to be created
} //end of JavaLecture2
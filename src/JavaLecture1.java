public class JavaLecture1 {

	public static void main(String[] args) {
		// This is comment
		/* This
		 * <-- these stars are not necessary
		 *  Is
		 *  a 
		 multi line comment */

		// Java Naming Convention
		// Class names should begin with a capital letter
		// Constants, should be all capital --> PI
		// methods, packages, variables, and almost everything else in Java
		//should be in lower case
		// When you are stringing words together to name something 
		// such as the file name for this class, use CamelCase
		//example variable --> firstName
		// example class --> MyFistClass
		// example constant --> SALESTAX

		/* 8 Primitive Types
		 * 4 integer types are:  byte, short, int, long
		 *  */
		byte myByte = 127; //this variable is initialized
		short myShort = 32000;
		int myInt = 1000;
		long myLong = 1000000;
		byte myByte2; //this is declared, but not initialized
		myByte2 = myByte; //it was not initialized
		myByte2 = 120; //it is now reassigned

		/* 2 decimal types of primitives: float and double */
		float myFloat = 1.0f;
		double myDouble = 2.3;

		/* non-numerical primitives */ 
		// boolean takes one of two values, either true or false
		boolean myBoolean = true;
		boolean myBoolean1 = false;

		// char is EXACTLY one character
		char myChar = 'n';

		//print what we have
		System.out.println("This prints on one line then goes to the next");
		System.out.print("This prints on one line then stays here");
		System.out.println("...See what I mean?");
		System.out.println("My character is: " + myChar);
		System.out.println("My int is: " + myInt);

		// Strings --> sequence of characters (or they can also be a single character)
		String myString = "Neil";
		//				   0123
		System.out.println("My String is: " + myString);

		String myString2 = "Another String";
		System.out.println(myString + myString2);
		System.out.println("This was my first string: " + myString + " and this was my second: " + myString2); //IMPORTANT

		int x = 10;
		int y = 11; 
		System.out.println("The sum of x and y is " + (x + y));
		System.out.println(myString.charAt(3)); //call the charAt method on the String myString
		System.out.println(myString.substring(0));//call the substring method on myString --> get the second character on...
		
		//Escape characters
		System.out.println("Printing special characters \' \" or \\");
		System.out.println("This is one line\nThis is the next");
		System.out.println("This is one line\rThis is the next");
		System.out.println("\tThis line is tabbed in!");
		
		//Constants
		final double TAXRATE = 6.25;
		//TAXRATE = 10; //Cannot reassign a constant
		
		System.out.println("pi = " + Math.PI);
		
		//Arrays
		int [] intsA = {1,2};
		int [] intsB = new int[2];
		
		System.out.println(intsB[0]);
		System.out.println(intsB[1]);
		System.out.println(intsA[0]);
		System.out.println(intsA[1]);
		
		intsB[0] = 1;
		intsB[1] = 2;
		System.out.println(intsB[0]);
		System.out.println(intsB[1]);
		

	}// end of main method
}// end of JavaLecture1 class
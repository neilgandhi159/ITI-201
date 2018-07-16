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
		// such as the file name for this classs, use CamelCase
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
		boolean myBoolean = false;
		
		// char is EXACTLY one character
		char myChar = 'a';
	}// end of main method
}// end of JavaLecture1 class
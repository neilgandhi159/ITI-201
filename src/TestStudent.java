import java.util.Scanner; // import things that aren't included by default when needed

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creating a new instance of the Scanner class
		Student[] myStudents = new Student[2]; // creating an array of Students
		
		// this for loop fills our array
		for(int i = 0; i < myStudents.length; i++){
			System.out.print("Give me a name: "); // prompt for a name
			String name = scan.nextLine(); // store the name temporarily so we can use it later
			//System.out.print("Give me a GPA: "); // prompt for a GPA
			//double gpa = scan.nextDouble(); // store the GPA temporarily so we can use it later
			//scan.nextLine(); // clean Scanner out --> not always needed, if you find you don't take it out
			// Student tempStudent = new Student(name, gpa);
			// by taking the previous line out we save a step
			myStudents[i] = new Student(name /*, gpa*/, name, i); // because each index represents a student we can do this
			// we have called the constructor for creating a Student that requires a name and GPA
			// we provided both from the user input
		}//end of for loop
		// the following line doesn't work, the scope of name is ONLY within the loop
		// name = "";
		
		// the next for loop is calling the getName and getGpa methods to print the values
		for(int i = 0; i < myStudents.length; i++){
			System.out.println(myStudents[i].getName() /* + " " + myStudents[i].getGpa()*/);
		}//end of for loop
		
		// this loop is prompting us to provide a name to change to
		for(int i = 0; i < myStudents.length; i++){
			System.out.print("Give me a name: ");
			String name = scan.nextLine();
			myStudents[i].setName(name);
		}//end of for loop
		
		// then we are printing again --> you should do this to ensure the changes "stick"
		for(int i = 0; i < myStudents.length; i++){
			System.out.println(myStudents[i].getName()  /*+ " " + myStudents[i].getGpa()*/);
		}//end of for loop
		
		// this doesn't have to be done for the assignment, just an FYI on how we can do data validation
		// we can even do something like this within the setRuid method to ensure we only assign proper 
		// values for RUIDs. This is why we make instance variables private, to control them better
		for(int i = 0; i < myStudents.length; i++){
			System.out.print("Give me an RUID: ");
			String ruid = scan.nextLine();
			if(ruid.length() != 9){
				System.out.println("invalid RUID, please try again");
				i--;
			}//end of if
		}//end of for loop
		scan.close(); // always close your scanner
	}//end of main method
}// end of TestStudent
/*
Student stud1 = new Student("Arcadio Matos", 2.5); // seperate arguments provided to constructor with comma
System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
stud1.setGpa(2.4); // we are calling the method ON the Student called stud1
// this is why the method is not static
stud1.setName("Arcadio Matos, Jr.");
System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
System.out.print("Give me the new name: ");
stud1.setName(scan.nextLine());
System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
*/
/*
Student myStudent = new Student(); 
Student myOtherStudent = new Student();
// we created 2 instances of the Student class
// or we instantiated 2 Students
System.out.println("myStudent's name is: " + myStudent.getName());
System.out.println("myOtherStudent's name is: " + myOtherStudent.getName());
myStudent.setName("Arcadio Matos");
myOtherStudent.setName("Diane Mueller");
System.out.println("myStudent's name is: " + myStudent.getName());
System.out.println("myOtherStudent's name is: " + myOtherStudent.getName());
Student myThirdStudent = new Student("Javier", 4.0);
Student myFourthStudent = new Student("Hosea", 3.9);
System.out.println("myThirdStudent's name is: " + myThirdStudent.getName());
System.out.println("myFourthStudent's name is: " + myFourthStudent.getName());
myThirdStudent.setName("Javier la Rosa");
myFourthStudent.setName("Hosea Lee");
System.out.println("myThirdStudent's name is: " + myThirdStudent.getName());
System.out.println("myFourthStudent's name is: " + myFourthStudent.getName());
String storeName = myThirdStudent.getName();
System.out.println("Stored name is: " + storeName);
*/
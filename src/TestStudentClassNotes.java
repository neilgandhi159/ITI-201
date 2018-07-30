import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// creating a new instance of Scanner class
		Student myStudent = new Student();
		Student myOtherStudent = new Student();
		//We created 2 instances of the Student class
		//or we instantiated 2 students
		System.out.println("myStudent's name is: " + myStudent.getName()); //call the getName method on myStudent
		System.out.println("myOtherStudent's name is: " + myOtherStudent.getName());
		myStudent.setName("Neil Gandhi");
		myOtherStudent.setName("Arcadio Matos");
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
		Student stud1 = new Student("Arcadio Matos", 2.5); //Separate arguments provided to constructor
		System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
		stud1.setGpa(2.4); //we are calling the method ON the student called stud1
		// this is why the method is not static
		stud1.setName("Arcadio Matos, Jr.");
		System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
		System.out.println("Give me the new name: ");
		stud1.setName(scan.nextLine());
		System.out.println("My student is: " + stud1.getName() + " with a GPA of: " + stud1.getGpa());
		Student [] myStudents = new Student[2]; //creating an array of Students
		//this for loop fills our array
		for(int i = 0; i < myStudents.length; i++) {
			System.out.print("Give me a name: "); // prompt for a name
			String name = scan.nextLine(); // store the name temporarily so we can use it later
			System.out.print("\nGive me a GPA: ");
			double gpa = scan.nextDouble();
			scan.nextLine(); //clean scanner out --> not always needed, if you find you dont take it out 
			//Student tempStudent = new Student(name, gpa);
			// by taking this line out we save a step
			myStudents[i] = new Student(name, gpa);
		}//end of for loop
		//the following line doesn't work, the scope of the name is ONLY within the loop
		// name = "";
		for(int i = 0; i < myStudents.length; i++) {
			System.out.println(myStudents[i].getName() + " " + myStudents[i].getGpa());
		}
		
		for(int i = 0; i < myStudents.length; i++) {
			System.out.println("Give me a name: ");
		}
		
		
	}//end of main method
	
}//end of TestStudent

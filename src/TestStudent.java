
public class TestStudent {
	public static void main(String[] args) {
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
		
	}//end of main method
	
}//end of TestStudent

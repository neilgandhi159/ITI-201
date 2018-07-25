public class Student {
	//field variables or instance variables
	// set instance variables to private --> why?
	// Encapsulation!! Is one of the 4 principles of OOP
	//Inheritance, Poloymorphism, and Abstraction are the other 3
	// Giving the minimal public interface needed
	private String name;
	private double gpa;
	/* Creating a new instance variable
	 * 1) Create the variable
	 * 2) Added it to the constructor making sure we assigned the value
	 * 3) Create a getter
	 * 4) Create a setter
	 */
	
	// constructors
	// constructor is used to instantiate a new Object
	public Student() {
		name = "John Doe";
		this.gpa = 2.4;
		
	}//end of public Student() constructor
	
	//construcors should assign values to instance variables
	public Student(String newName, double newGpa) {
		name = newName;
		gpa = newGpa;
	}//end of public Student(String name) constructor

	// Setters and getters
	// getters first --> usually need a return type!
	public String getName() {
		return name;
	}//end of getName()
	
	//getGpa method
	public double getGpa() {
		return gpa;
	}//end of getGpa()
	
	// setters next --> usually return nothing but need an argument
	public void setName(String name) { // a lot of ppl set this to name of the instance variable
		this.name = name; // this differentiates between the instance variable and the argument
		// one alternative is to call the argument something else like newName and use this code:
		// name = newName;
	}//end of setName()
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}//end of setGpa()
}//End of Student class

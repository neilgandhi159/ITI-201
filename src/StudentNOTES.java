
public class StudentNOTES{
	//field variables or instance variables
	// set instance variables to private --> why?
	// Encapsulation!!! Is one of the 4 principles of OOP
	// Inheritance, Polymorphism, and Abstraction are the other 3
	// Giving the minimal public interface needed
	private String name;
	//private double gpa;
	/* Creating a new instance variable 
	 * 1) Create the variable
	 * 2) Added it to the constructor making sure we assigned the value
	 * 3) Create a getter
	 * 4) Create a setter
	 */
	private String ruid;
	private int graduationYear;
	
	// constructors
	// constructor is used to instantiate a new Object
	public Student(){
		name = "Neil Gandhi";
		this.ruid = "166005555";
		this.graduationYear = 2019;
		//this.gpa = 2.4;
	}//end of public Student() constructor
	
	// constructors should assign values to instance variables
	public Student(String newName , String newRuid , int newGraduationYear /*, double newGpa */){
		name = newName;
		ruid = newRuid;
		graduationYear = newGraduationYear;
		
		//gpa = newGpa;
	}//end of public Student(String name) constructor
	
	
	// setters and getters
	// getters first --> usually need a return type!
	public String getName(){
		return name;
		//could also say return this.name;
	}//end of getName()
	
	public String getRuid() {
		return ruid;
	}
	
	public int getGraduationYear() {
		return graduationYear;
	}
	
	//getGpa method
	/*
	public double getGpa(){
		return gpa;
	}//end of getGpa()
	*/
	// setters next --> usually return nothing but need an argument
	public void setName(String name){
		this.name = name; // this differentiates between the instance variable and the argument
		//one alternative is to call the argument something else like newName and use this code:
		// name = newName;
	}//end of setName()
	
	public void setRuid(String ruid) {
		this.ruid = ruid; 
	}
	
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	
	/*
	public void setGpa(double gpa){
		this.gpa = gpa;
	}//end of setGpa()
	*/
}//end of Student class

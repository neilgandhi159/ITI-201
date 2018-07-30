public class Student {
	private String name;
	private String ruid;
	private int graduationYear;

	// constructors

	public Student(){
		name = "John Doe";
		this.ruid = "123456789";
		this.graduationYear = 2019;

	}//end of no argument constructor


	public Student(String newName , String newRuid , int newGraduationYear){
		name = newName;
		ruid = newRuid;
		graduationYear = newGraduationYear;

	}//end of public Student(String newName , String newRuid , int newGraduationYear) constructor

	// setters 
	public void setName(String name){
		this.name = name; 
	}//end of setName()

	public void setRuid(String ruid) {
		this.ruid = ruid; 
	}//end of setRuid

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}//end of setGraduationYear

	// getters 
	public String getName(){
		return name;
		//could also say return this.name;
	}//end of getName()

	public String getRuid() {
		return ruid;
	}//end of getRuid

	public int getGraduationYear() {
		return graduationYear;
	}//end of getGraduationYear

}//end of Student class
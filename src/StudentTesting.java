import java.util.Scanner;

public class StudentTesting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] myStudents = new Student[5];
		for(int i = 0; i < myStudents.length; i++){
			myStudents[i] = new Student();
		}
	
	Student stud1 = new Student();
	Student stud2 = new Student("Neil Gandhi", "166005555", 2019);
	System.out.println("Student 1 is: " + stud1.getName() + " with a RUID of: " + stud1.getRuid() + " and with a Grad. Year of: " + stud1.getGraduationYear());
	System.out.print("My name is: " + stud2.getName() + " My RUID is: " + stud2.getRuid() +  " My Graduation Year is: " + stud2.getGraduationYear());
	}
}

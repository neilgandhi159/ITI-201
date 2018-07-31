import java.util.Scanner;

public class StudentTesting {
	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student("Neil Gandhi", "166005555", 2019);
		System.out.println("Student 1 is: " + stud1.getName() + " with a RUID of: " + stud1.getRuid() + " and with a Grad. Year of: " + stud1.getGraduationYear());
		System.out.println("My name is: " + stud2.getName() + " My RUID is: " + stud2.getRuid() +  " My Graduation Year is: " + stud2.getGraduationYear());
		Scanner scan = new Scanner(System.in);
		Student[] myStudents = new Student[5];
		for(int i = 0; i < myStudents.length; i++){
			myStudents[i] = new Student();
		}//end of fill array for loop
		for(int i = 0; i < myStudents.length; i++){
			System.out.println(myStudents[i].getName() + " " + myStudents[i].getRuid() + " " + myStudents[i].getGraduationYear());
		}//end of print for loop
		for(int i = 0; i < myStudents.length; i++){
			System.out.print("Give me a name: ");
			String name = scan.nextLine();
			myStudents[i].setName(name);
			scan.nextLine();
			System.out.print("Give me an RUID: ");
			String ruid = scan.nextLine();
			myStudents[i].setRuid(ruid);
			scan.nextLine();
			System.out.print("Give me a Graduation Year: ");
			int graduationYear  = scan.nextInt();
			myStudents[i].setGraduationYear(graduationYear);
			scan.nextLine();
			
		}//end of scan for loop
		for(int i = 0; i < myStudents.length; i++){
			System.out.println(myStudents[i].getName() + " " + myStudents[i].getRuid() + " " + myStudents[i].getGraduationYear());
		}//end of print change for loop
		scan.close();
	}//end of main method
}//end of StudentTesting

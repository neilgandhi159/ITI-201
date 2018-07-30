import java.util.Scanner;

public class TestRutgersPerson {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		RutgersPerson[] polyArray = new RutgersPerson[3];
		polyArray[0] = new RutgersProfessor();
		polyArray[1] = new RutgersStudent();
		polyArray[2] = new RutgersStudent(); //Polymorphism: OOP's way of 
		
		//print the values in the array
		for(int i = 0; i < polyArray.length; i++) {
			System.out.println(polyArray[i]);
		}//end of for
		scan.close();
	}//end of main method
}//end of TestRutgersPerson

public class Triangle extends Shape {
	//instance variables
	private double height;
	private double base;
	
	//constructors
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}//end of constructor
	
	//setters
	public void setHeight(double height) {
		this.height = height;
	}//end of setHeight(double height)
	public void setBase(double base) {
		this.base = base;
	}
	
	//getters
	public double getHeight() {
		return this.height;
	}
	public double getBase() {
		return this.base;
	}
//implement abstract methods
	public double area() {
		return 0.5 * base * height;
	}//end of area()
}

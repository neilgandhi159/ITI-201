public class RutgersStudent extends RutgersPerson{
	// instance variables
	private String[] schedule;
	// constructors
	public RutgersStudent() {
		super.setName("John Doe");
		super.setNetId("jd123");
		this.schedule = new String[2];
		schedule[0] = "201";
		schedule[1] = "Calculus";
	}//end of no argument constructor
	
	public RutgersStudent(String name, String netId, String[] schedule) {
		super.setName(name);
		super.setNetId(netId);
		this.schedule = schedule;
	}// end of RutgersStudent(String name, String netId, String[] schedule)
	// setter
	public void setSchedule(String[] schedule) {
		this.schedule = schedule;
	} //end of setter
	// getter
	public String[] getSchedule() {
		return this.schedule;
	}//end of getter
	//override methods!
	public String toString() {
		String result = "";
		for(int i = 0; i < this.schedule.length; i++) {
			result = result + schedule[i] + " ";
		}//end of for loop
		return "Student " + this.getName() + "'s schedule: " + result;
	}
}//end of RutgersStudent


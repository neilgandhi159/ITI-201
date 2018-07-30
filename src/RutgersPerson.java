public class RutgersPerson {
//instance variables
	private String name;
	private String netId;
	
	//constructors
	public RutgersPerson() {
		this.name = "John Doe";
		this.netId = "jd123";
	}//no argument constructor
	public RutgersPerson(String name, String netId) {
		this.name = name;
		this.netId = netId;
	}//end of constructor
	
	//setters
	public void setName(String name) {
		this.name = name;
	}//end of setter
	public void setNetId(String netId) {
		this.netId = netId;
	}//END OF SETNETID
	//getters
	public String getName() {
		return this.name;
	}//end of getName
	public String getNetId() {
		return this.netId;
	}
}


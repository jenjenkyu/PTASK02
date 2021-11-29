
public class Student {
	//name variable declaration
	String name;
	
	//Student construct
	public String Student () {
		//return String Unknown
		return "Unknown";
	}
	
	//Student Construct 
	//only 1 parameter
	public void  Student (String n) {
		//sets the given value on the parameter to name
		this.name = n;
	}
	
	//getnaname method 
	//this will return the value of the name
	public String getname() {
		return name;
	}
}

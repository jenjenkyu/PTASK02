
public class Rectangle {
	//TWO VARIABLE DECLARATION
double length;
double width;


//CONSTRUCTOR OVERLOAD
public void Rectangle() {
	
	//SETS LENGTH AND WIDTH TO 0
	this.length = 0;
	this.width = 0;
}

//GETS ONLY 1 PARAMETER REQUIREMENT
public void Rectangle(double d) {
	
	//SETS THE GIVEN VALUE AS ITS LENGHT AND WIDTH
	this.length = d;
	this.width = d;
}

//GETS 2 PARAMETER REQUIREMENT
public void Rectangle(double d,double b) {
	
	//SETS THE FIRST VALUE(d) TO length AND THE SECOND VALUE(b) TO width
	this.length=d;
	this.width=b;	
}

//METHOD TO COMPUTE AREA
//RETURN DOUBLE VALUE
public double GetArea() {
	
	//AREA COMPUTATION A = L * W
	return this.length*this.width;
}
}

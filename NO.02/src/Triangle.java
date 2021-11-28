
public class Triangle {

//private declaration of sides	
private double S1; //SIDE 1
private double S2; //SIDE 2
private double S3; //SIDE 3

//SETTERS
public void setS1(double s) {
	this.S1 = s; //SET s TO S1
}

public void setS2(double s) {
	this.S2 = s; //SET s TO S2
}

public void setS3(double s) {
	this.S3 = s; //SET s TO S3
}

//GETTERS

public void getAREA() {
	
	//ADDS ALL THE SUM OF THE TRIANGLE, USUALY CALLED SEMI-PERIMETER
	//SEMI - PERIMETER = SUM OF THREE SIDE
	double s = this.S1+this.S2+this.S3;	//S1+S2+S3
	
	//THIS PRINTS THE AREA OF THE TRIANGLE 
	//USING THE FORMLA OF HERON'S FORMULA
	//sqrt OF s(s-a)(s-b)(s-c),which s represent the "SEMI -PERIMETER"
	// AND a b c, REPRESENTS ITS SIDES
	
	//math.sqrt();  returns the correctly rounded positive square root of a double value given by the user
	System.out.println("The area of the TRIANGLE IS:\n" +
				Math.sqrt(s*(s-this.S1)*(s-this.S2)*(s-this.S3))
	);
}

}

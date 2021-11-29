import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		//SCANNER METHOD 
	Scanner Sc = new Scanner(System.in);
		//3 OBJECT DECLARATION
		//NP = NO PARAM
		//SP = SINGLE PARAM
		//DP = DOUBLE(2) PARAM
	Rectangle NP = new Rectangle();
	Rectangle SP = new Rectangle();
	Rectangle DP = new Rectangle();
	
	//PROMPT TO ENTER LENGHT
	System.out.println("Enter length: ");
	
	//CALLING THE CONSTRUCTOR THAT'S ON SP OBJECT 
	//USES THE SINGLE PARAM IN THE Rectangle CLASS
	//USING THE SCANNER METHOD INSIDE THE PARAMETER TO GET INPUT FROM THE USER DIRECTLY
	SP.Rectangle(Sc.nextDouble());
	
	//PROMPT TO ENTER length and width
	System.out.println("Enter length: ");
	System.out.println("Enter Width: ");
	
	//CALLING THE CONSTRUCTOR THAT'S ON DP OBJECT 
	//USES 2 PARAM IN THE Rectangle CLASS
	//USING THE SCANNER METHOD INSIDE THE PARAMETER TO GET INPUT FROM THE USER DIRECTLY	
	DP.Rectangle(Sc.nextDouble(),Sc.nextDouble());
	
	//PRINTS THE RETURN VALUE USING THE System.out.println
	System.out.println("NO PARAMETER: "+ NP.GetArea());
	System.out.println("SINGLE PARAMETER: " + SP.GetArea());
	System.out.println("TWO PARAMETER: " + DP.GetArea());
	
	}

}

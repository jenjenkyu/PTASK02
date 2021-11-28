import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		//SCANNER OBJECT DECLARATION
		Scanner sc = new Scanner(System.in);
		//TRIANGLE OBJECT DECLARATION
		Triangle t = new Triangle();
		
		//PROMPT USER TO ENTER FIRST NUM
		System.out.println("ENTER FIRST SIDE: ");
		//SETTING THE VALUE THAT THE USER GIVE INSIDE THE PARAMETER
		
		//t.set1(parameter)
		t.setS1(sc.nextDouble());
		
		//PROMPT
		System.out.println("ENTER SECOND  SIDE: ");
		//SET
		t.setS2(sc.nextDouble());
		//PROMPT
		System.out.println("ENTER THIRD SIDE: ");
		//SET
		t.setS3(sc.nextDouble());

		//CALLING THE getAREA METHOD
		t.getAREA();
	}

}

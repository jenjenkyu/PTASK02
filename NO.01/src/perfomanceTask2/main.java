
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//SCANNER TO MAKE THE USER ENTER WHAT EVER HE/SHE WANTS
		Scanner sc = new Scanner(System.in);
		//INSTALATION OF THE OBJECT
		Student st = new Student();
		
		//PROMPT THE USER TO ENTER THE DESIRABLE NAME 
		System.out.println("Enter a name");
		//CALLING THE METHOD Setname AND USING THE SCANNER AS ITS ARGUMENT
		st.Setname(sc.nextLine());
		//PROMPT THE USER TO ENTER THE roll_no
		System.out.println("Enter the roll num");
		//CALLING THE METHOD Setroll_no AND USING THE SCANNER AS ITS ARGUMENT
		st.Setroll_no(sc.nextInt());
		
		//THIS SHOWS THE NAME AND ROLL NUM BY CALLING THE METHOD INSIDE THE println ARGUMENT
		//THIS IS ALSO CALLED GETTERS
		System.out.println("NAME: "+st.Getname()+"\nROLL NO: "+st.Getroll_no());

	}

}

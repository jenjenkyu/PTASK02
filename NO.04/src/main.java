import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//Scanner method
		Scanner sc = new Scanner (System.in);
		
		Student NP = new Student(); //this object is for no param
		Student OP = new Student(); //this object is for 1 param
		
		//PROMPT THE USER TO ENTER A NAME
		System.out.println("Enter your name: ");
		
		//USE THE OBJECT OP AND GET THE CONSTRUCTOR METHOD TO PUT THE USER INPUTED VALUE
		OP.Student(sc.nextLine());
		
		//SHOW THE OUTPUT BY GETTING ITS RETURN
		System.out.println("Hello: " +NP.Student());	//GET THE RETURN VALUE OF STUDENT
		System.out.println("Hello: " +OP.getname());	//GET THE RETURN VALUE OF getname
	}

}

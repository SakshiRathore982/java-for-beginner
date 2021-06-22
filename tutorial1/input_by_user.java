package tutorial1;
import java.util.Scanner;
// for user input include class Scanner
public class input_by_user {
public static void main(String[] args) {
	// know let's learn how can we take user input
	// scanner class is use for input 
	//create the obj
	Scanner  sc= new Scanner(System.in);
	
	System.out.println("enter the line of text :");
	//call the nextline by obj wait for user to enter the text 
	String line=sc.nextLine();
	int num=sc.nextInt();
	double num2=sc.nextDouble();
	//print what user entered
	System.out.println("your name :"+line);
	System.out.println("your age  :"+num);
	System.out.println("you weight :"+num2);
	
	
}
}

package tutorial1;
import java.util.Scanner;
public class swtichcasepratice {
	public static void main(String[] args) {
		//switch is 
		Scanner scan=new Scanner(System.in);
		String txt=scan.nextLine();
		switch(txt)
		{
		case "start":
				System.out.println("Machine started");
		case "stop":
			System.out.println("machine stop");
		default :
			System.out.println("command not recognized");
		}
	}
	

}

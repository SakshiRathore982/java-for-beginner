
package tutorial1;
import java.util.Scanner;
public class do_while {
public static void main(String[] args) {
	// this java program about do while 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number: ");
	int value=sc.nextInt();
	while(value!=5)
	{System.out.println("enter the number: ");
		value=sc.nextInt();
	}
	int num=0;	do {
		System.out.println(  "enter the code of 5 digit"  );
		num=sc.nextInt();
	}while(num!=5);
}
}

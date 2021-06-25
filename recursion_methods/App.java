package recursion_methods;

public class App {
public static void main(String[] args) {
	
	System.out.println("HeLLo");
	
	int value =6;
	
	cal(value);
	// System.out.println(value);
	
	// factorial value of 5
       int fac=fact(5);
       System.out.println("factorial of 5 is "+fac);
}
private static void cal(int val)
{  
	System.out.println(val);
	if(val!=0)
	cal(val-1);
	else
	   return;
}//decrement of number 
// use recursion at small calculation please else system stick at stack over flow error
private static int fact(int val)
{
	if(val!=1)
       return val*fact(val-1);
	else
		return 1;
}
}

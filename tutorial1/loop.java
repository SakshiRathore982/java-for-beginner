package tutorial1;

public class loop {
public static void main(String[] args) {
	// boolean can expression in this term !!
	boolean loop=4<5 && 8>2;
	boolean l1=30>10;
	int num=2;
	boolean loop1=true; 
	boolean l2=num>10;
	System.out.println(loop);
	System.out.println(loop1);
	System.out.println(l2);
	System.out.println(l1);
 // look at loop
	while(num<10)
	{
		System.out.println(num);
		
		if(num==5)
		{
			break;
		}
		num++;
		// break keyword is use for broken the loop !!
	
		// you can iterate anything in this box !! try at yourself
	}
	// let's print 2 table
	int table=1;
	while(table<11)
	{
		System.out.println("2 X "+table+" = "+table*2);
	table++; 
	}
}
}

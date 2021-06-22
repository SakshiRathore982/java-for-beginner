package tutorial1;

public class ifcondition {
public static void main(String[] args) {
	// let's play with if condition block 
	// condition statement is use here
	boolean con=1<6;
	boolean con1= 2%4==1;
	// this is without if keyword
	System.out.println(con+" "+con1);;
	if(con)// if contain true then it run else complier skip this statement inside it 
	{
		System.out.println("hii i am sakshi");
	}else 
	{   // if IF is false then compiler check whether it contain else or not if yes it goes to this statement 
		System.out.println("oops it's wrong answer");
	}
}
}

package Enum_type;

public class App {
	
	public static final int dog=0;
	public static final int cat =1;
	public static final int mouse =2;
public static void main(String[] args) {
	animal Animal= animal.cat;
	switch(Animal)
	{
	case cat:
		System.out.println("cat");
		break;
	case dog:
		System.out.println("dog");
		break;
	case mouse:
		System.out.println("mouse");
		break;
	default:System.out.println("wrong choice ");
		break;
	
	}
	System.out.println(Animal.dog);
	System.out.println(Animal.dog.getClass());
	System.out.println(Animal.cat instanceof Enum);
	
	animal a2=Animal.valueOf("cat");
	
	System.out.println(a2);
	
	
}
}

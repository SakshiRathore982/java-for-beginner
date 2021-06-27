package passByValueAndByReference;

public class App {
public static void main(String[] args) {
	App app = new App();
	//=======================================
	int num =10;
	// this is call by value or pass by value
	//when we send copy of original variable 
	// in calling method any change not effect original one 

	System.out.println("1.value is "+num);
	app.show(num);
	System.out.println("1.value is "+num+"\n");

	//=====================================
	Person person = new Person("bob");
	System.out.println("1. person is "+person);
	app.show(person);
	System.out.println("4. person is "+person);
}
public void show(int val)
{  val=val+12;
	System.out.println("2.value is "+val);
}
public void show(Person person)
{
	System.out.println("2. person is "+person);
 person= new Person("mike");
	System.out.println("3. person is "+person );
}
}

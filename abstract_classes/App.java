package abstract_classes;

public class App {
public static void main(String[] args) {
	camera cam= new camera();
	cam.setId(5);
	
	car car1 = new car();
	 car1.setId(4);
	 car1.run();
	// machine mach1= new machine();
	 // above line is not work because machine is abstract class 
	/*
	 * note 
	 * parent class gave identity to child class
	 * in this example 
	 * machine is parent 
	 * child are car camera
	 * so car and camera both are machine
	 *interface say what class does but does not implementation 
	 */
	
}
}

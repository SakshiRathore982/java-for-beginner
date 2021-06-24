package inner_class;

public class App {
public static void main(String[] args) {
	Robot robot = new Robot(5);
	robot.start();
	
	Robot.Brain robo=robot.new Brain();
	robo.think();
	
	Robot.Battery battery = new Robot.Battery();
	battery.charge();
}
}

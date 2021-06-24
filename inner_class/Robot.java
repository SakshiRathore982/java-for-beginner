package inner_class;
public class Robot {
   private int id;
   
 public  class Brain{
	  public void think()
	   {
		   System.out.println("robot "+ id +" is thinking !!");
	   }
  }
   static class Battery{
	   public void charge()
	   {
		   System.out.println("Battery charging !!");
	   }
   }
	  
   
   public Robot(int id)
   {
	   this.id=id;
   }
   public void start()
   {
	   System.out.println("starting robot "+ id);
	   Brain brain=new Brain();
	   brain.think();
	   final String name = new  String();
	   class Temp{
		   public void doSomething()
		   {
			   System.out.println("id is : "+id);
			   System.out.println("my name is : "+ name);
		   }
	   }
		 Temp t = new Temp();
		 t.doSomething();
	   }
   }


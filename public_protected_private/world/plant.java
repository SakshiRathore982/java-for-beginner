package world;

public class plant {
	   // this is bad practice because you can access it anywhere
       public String name;
       // it's is constant variable
       // it's is acceptable practice 
       public static int id=10;
       
       protected String size;
       
       private String type;
       
       int height;
       public plant ()
       {
    	   System.out.println("this is empty");
       }
       public plant(String name)
       {
    	   this.size="larger";
    	   this.name=name;
    	   this.type="tree";
    	   this.height=8;
       }
       
}

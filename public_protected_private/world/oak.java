package world;

public class oak extends plant{
     public oak()
     {
    	 //this is not work because it is private
    	/* type="tree";
    	 * */
    	 // this accessible 
    	 this.size="small";
    	 // height has no access specifier
    	 this.height=10;
    	 System.out.println(this.size);
     }
}

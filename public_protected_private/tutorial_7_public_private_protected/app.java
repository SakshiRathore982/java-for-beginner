package tutorial_7_public_private_protected;

import world.plant;

/* private ---only within the class
 * public -----from any where
 * protected -----same class , subclass,same package
 * no access specifier ---- same package
 */
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     plant p1=new plant("Mango");
     
     System.out.println(p1.name);
     
     System.out.println(p1.id);
     //this class is not in same package as plant has 
    // System.out.println(p1.size);
     
     /* if we not create any access specifier then it is package visibility only 
         System.out.println(p1.height);
         */
	}
	

}

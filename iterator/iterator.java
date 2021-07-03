package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class iterator {
public static void main(String[] args) {
	LinkedList<String > animal = new LinkedList<String>();
	animal.add("elephant");
	animal.add("cow");
	animal.add("beer");
	animal.add("rateee");
	animal.add("dogg");
	
  Iterator<String> it =	animal.iterator();
  while(it.hasNext())
  {
  String ani = it.next();
  System.out.println(ani);
  
  if(ani.equals("dogg"))
  {
	  it.remove();
  }
		  
  }
	System.out.println();
	// modern iteration 
	
	for(String an : animal)
	{
		System.out.println(an);
		// remove is not allow in for instead of this use iterator
	}
}
}

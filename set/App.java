package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
public static void main(String[] args) {
	// hashset does not retain order
  // Set<String> set1= new HashSet<String>();

	// if you want to order the set in same as you input then  use Linked hashset 
	//Set<String> set1= new LinkedHashSet<String>();
	
	// treeset sort in natural order 
	Set<String> set1= new TreeSet<String>();
	if(set1.isEmpty())
	{
		System.out.println("set is empty ");
	}
	set1.add("dog");
	set1.add("cat");
	set1.add("dcow");
	set1.add("horse");
	set1.add("man");
	
	
	// if you want to order the set in same as you input then  use Linked hashset 
	// Add duplicate items does nothing because they not contain duplicate
	set1.add("dog");
  System.out.println(set1);
  
  // iteration 
  for(String ele: set1)
  {
	  System.out.println(ele);
  }
  // does set contain a given item 
  if(set1.contains("adark "))
  {
	  System.out.println("yes it is adark there");
  }
  if(set1.contains("cat"))
  {
	  System.out.println("yes cat is there ");
  }
  Set<String> set2= new TreeSet<String>();
	if(set1.isEmpty())
	{
		System.out.println("set is empty ");
	}
	set2.add("dog");
	set2.add("cat");
	set2.add("giraffe");
	set2.add("horse");
	set2.add("elephant");
	
	// found which ele is common 
	// cpoy the set1 in intersection 
	Set<String>intersection = new HashSet<String>(set1);
	System.out.println(intersection);
	intersection.retainAll(set2);
	System.out.println(intersection);
	
	// difference ///////////
	Set<String>difference = new HashSet<String>(set2);
	difference.removeAll(set1);
	System.out.println(difference);
	
	
	
	
  ///////////////////itersection /////////////////
  
  
}
}

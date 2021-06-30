package natural_order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person>{

	private String name;
	
	public Person( String name)
	{

		this.name=name;
	}
	public String toString()
	{
		return " name is  : " + name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person person) {
	               int len1= name.length();
	               int len2=person.name.length();
	               if(len1>len2)
	            	   return 1;
	               else if(len1<len2)
	            	   return -1;
	               return name.compareTo(person.name);}
}
public class naturalorder {
	public static void main(String[] args) {
		
	List<String> man = new ArrayList<String>();
	// tree set automatically store in natural order
	Set<String> set = new TreeSet<String>();
	addele(man);
	addele(set);
	Collections.sort(man);
	showele(man);
	System.out.println();
	showele(set);
	List<Person> p1 = new ArrayList<Person>();
	// tree set automatically store in natural order
	Set<Person> p2 = new TreeSet<Person>();
	addobj(p1);
	addobj(p2);
	Collections.sort(p1);
	showobj(p1);
	System.out.println();
	// in sorting of set if ele is same length then it delete anyone
	showobj(p2);
	}
	
	private static void addele(Collection<String> col)
	{
		col.add("marry");
		col.add("yarm");
		col.add("marry");
		col.add("juletite");
		col.add("bob");
	}
	private static void showele(Collection<String>col)
	{
		for(String ele:col)
		{
			System.out.println(ele);
		}
	}
	private static void addobj(Collection<Person> col)
	{
		col.add(new Person("marry"));
		col.add(new Person("yarm"));
		col.add(new Person("maic"));
		col.add(new Person("juletite"));
		col.add(new Person("bob"));
	}
	private static void showobj(Collection<Person>col)
	{
		for(Person ele:col)
		{
			System.out.println(ele);
		}
	}
}

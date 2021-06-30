package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	public Person(int id , String name)
	{
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Id is : "+ id + "; name is  : " + name;
	}
	}

 class StringLengthComparator implements Comparator<String>
 {

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		
		 if(len1>len2)
		 {
			 return 1;
		 }
		 else if(len1<len2)
		 {
			 return -1;
		 }
		 return 0;
	}
	 
 }
 class AlphaComparator implements Comparator<String>
 {

	@Override
	public int compare(String o1, String o2) {
		
		 return o1.compareTo(o2);
	}
	 
 }
 class ReverseAlphaComparator implements Comparator<String>
 {

	@Override
	public int compare(String o1, String o2) {
		
		 return -o1.compareTo(o2);
	}
	 
 }
 
public class sort {
public static void main(String[] args) {
	/////////////// Sorting String //////////////////////////////////////////////
	List<String> animal = new ArrayList<String>();
	animal.add("elephant");
	animal.add("cow");
	animal.add("beer");
	animal.add("rateee");
	animal.add("dogg");
	// sort the list by string length 
	System.out.println(" \n order according to String Length :");
	Collections.sort(animal,new StringLengthComparator());
	for(String ani:animal)
	{
		System.out.println(ani);
	}
	// sort the list by alphabetical order 
	System.out.println(" \n alpha betical order :");
	Collections.sort(animal,new AlphaComparator());
	for(String ani:animal)
	{
		System.out.println(ani);
	}
	System.out.println(" \n reverse alpha betical order :");
	Collections.sort(animal,new ReverseAlphaComparator());
	for(String ani:animal)
	{
		System.out.println(ani);
	}
	////////////////Sorting Number //////////////////////////////
	List<Integer> num = new ArrayList<Integer>();
	num.add(30);
	num.add(14);
	num.add(5);
	num.add(45);
	
	Collections.sort(num, new Comparator<Integer>(){
		public int compare(Integer num1, Integer num2)
		{
			return -num1.compareTo(num2);
		}
	});
	for(Integer ani:num)
	{
		System.out.println(ani);
	}
	//////////////////////////SOrting Object/////////////////////////////////
	List<Person> p1= new ArrayList<Person>();
	p1.add(new Person(11,"boe"));
	p1.add(new Person(3,"john"));
	p1.add(new Person(9,"honny"));
	p1.add(new Person(4,"bee"));
	p1.add(new Person(1,"wewoe"));
	
	///////////////////////sort according to id ////////////////////
	System.out.println("\nsort according to id ");
	Collections.sort(p1, new Comparator<Person>() {
		public int compare(Person p1, Person p2)
		{
			if(p1.getId()>p2.getId())
				return 1;
			else 
				if(p1.getId()<p2.getId())
					return -1;
			return 0;
		}
	});
	for(Person p : p1)
	{
		System.out.println(p);
	}
/////////////////////sort according to name ////////////////////
	Collections.sort(p1, new Comparator<Person>() {
		public int compare(Person p1, Person p2)
		{
			return p1.getName().compareTo(p2.getName());
		}
	});
	System.out.println("\nsort according to name");
	for(Person p : p1)
	{
		System.out.println(p);
	}
	
}
}

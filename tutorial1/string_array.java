package tutorial1;

public class string_array {
public static void main(String[] args) {
	//arrays of string 
	String[] words= new String[3];
	words[0]="sakshi";
			words[1]="singh";
					words[2]="rathore";
   String[] fri= {"sam","john","radha"};
   for(String f:fri)
   {
	   System.out.println(f);
   }
   String txt=null;
   System.out.println(txt);
   //if not initialize the string it give null because 
   //String is class or non primitive data type
}
}

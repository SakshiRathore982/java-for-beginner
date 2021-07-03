package iterator;

public class implement {
	public static void main(String[] args) {
		
	
   URLLib lib = new URLLib();
   for(String html:lib)
   {
	   System.out.println(html.length());
	   System.out.println(html);
	   
   }
	}
}

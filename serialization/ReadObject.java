package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
public static void main(String[] args) {
	System.out.println("Reading objects ....");
	
	try {
		FileInputStream fi = new FileInputStream("people.bin");
		ObjectInputStream os = new ObjectInputStream(fi);
		Person p1= (Person)os.readObject();
		Person p2= (Person)os.readObject();
		os.close();
		System.out.println(p1);
		System.out.println(p2);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
{
	
}
}
}

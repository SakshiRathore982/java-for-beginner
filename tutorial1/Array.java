package tutorial1;

public class Array {
public static void main(String[] args) {
	int val=7;
	int[] values;
	values = new int[3];
	
    values[0]=10;
    values[1]=val;
	System.out.println(values[0]);
	//for getting all value we use loop
	for(int i=0;i<values.length;i++)
	{
		System.out.println(values[i]);
	}
	int num[]= {2,4,6};
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
}

}

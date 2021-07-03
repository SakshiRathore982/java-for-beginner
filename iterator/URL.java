package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class URL implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();
    
    private class urlIterator implements Iterator<String>{

    	private int index =0;
		@Override
		public boolean hasNext() {
		return index<urls.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			URL url= new URL(urls.get(index));
			index++;
			
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			Iterator.super.remove();
		}
    	
    }
    public URL()
    {
    	urls.add("https://www.sakshi.com");
    	urls.add("https://www.sakshirathore.com");
    	urls.add("https://www.98222sakshi.com");
    	urls.add("https://www.1234rathoresakshi.com");
    }
    /*
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
		}*/
    public Iterator<String> iterator()
    {
    	
    }
}

package iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class URLLib implements Iterable<String> {
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
			StringBuilder sb = new StringBuilder();
			try {
				URL url= new URL(urls.get(index));
				
				BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream()));
				
				
				String line = null;
				while((line = br.readLine())!=null)
				{
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
			
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			Iterator.super.remove();
		}
    	
    }
    public URLLib()
    {
    	urls.add("https://www.caveofprogramming.com");
    	urls.add("https://www.facebook.com/caveofprogramming");
    	urls.add("https://news.bbc.co.uk");
    //	urls.add("https://www.1234rathoresakshi.com");
    }
    /*
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
		}*/
    public Iterator<String> iterator()
    {
    	return new urlIterator();
    }
}

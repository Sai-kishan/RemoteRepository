package myPack;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class A
{
	public static void main(String[] args) throws IOException
	{
		List<String> Coll=new ArrayList<String>();
		Coll.add("Hari");
		Coll.add("Kishan");
		Coll.add("Yadav");
		Coll.add("Kuruva");
		Coll.add("hi");
		
		Iterator<String> itr=Coll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}

	}
	
}


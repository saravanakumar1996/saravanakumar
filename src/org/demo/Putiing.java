package org.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Putiing {
	public static void main(String[] arg) {
		Map<Integer,String>i=new HashMap();
		i.put(10, "java");
		i.put(20, "sql");
		i.put(30, "oops");
		i.put(40, "orcale");
		i.put(50, "DB");
		i.put(60, "selinium");
		//using entry set
		Set<Entry<Integer,String>>u1=i.entrySet();
		for (Entry<Integer, String> en : u1) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			
			
		}
		
		
		
		
	}

}

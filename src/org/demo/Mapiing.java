package org.demo;


import java.util.Map.Entry;
import java.util.*;
public class Mapiing {
	public static void main(String[] args) {
	//method
		Map<Integer,String>p=new LinkedHashMap();
		p.put(10, "saravana");
		p.put(20, "sarava");
		p.put(30, "kumar");
		p.put(56, "iyya");
		p.put(80, "durai");
		System.out.println(p);
		//keyset
		Set<Integer>u=p.keySet();
		System.out.println(u);
		//values
		Collection<String>y=p.values();
		System.out.println(y);
		//contains values
		boolean r=p.containsValue("iyya");
		System.out.println(r);
		boolean u1=p.containsValue("duri");
         System.out.println(u1);
         //contains key
         boolean g=p.containsKey(10);
         System.out.println(g);
         //get
         String o=p.get(30);
         System.out.println(o);
         //remove
         String o1=p.remove(80);
         System.out.print(o1);
         //entrySet
         Set<Entry<Integer,String>> e=p.entrySet();
        for (Entry<Integer, String> en : e) {
			System.out.println(en);
			System.out.println("key:"+en.getKey());
			System.out.println("value:"+en.getValue());
		}	
		
		
		
		
		
		
		
		
		
	}}
	
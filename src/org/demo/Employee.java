package org.demo;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	public static void main(String[] args) {
	Set<String>s=new TreeSet<String>();
	Set<String>s2=new LinkedHashSet<String>();
	s.add("kumar");
	s.add("iyya");
	s.add("58");
	s.add("89");
	s.add("90");
	
	s2.add("sarava");
	s2.add("kumar");
	s2.add("iyya");
	s2.add("durai");
	s2.addAll(s);
	System.out.println(s2);
	//equals
	boolean e=s.equals(s2);
	System.out.println(s);
	
	// size
	int s1=s.size();
	System.out.println(s1);
	//is empty
	boolean i=s.isEmpty();
	System.out.println(i);
	// contain()
	boolean i1=s.contains("10");
	System.out.println(i1);
	//remove()
      s.remove("10");
      System.out.println(s);
      //enhanced loop
      for (String st : s2) {
    	  System.out.println(st);
		
	}
      
		
		
		
	
	

}}

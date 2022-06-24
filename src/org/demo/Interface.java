package org.demo;
import java.util.*;

public class Interface {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		Set<Integer>s1=new LinkedHashSet<Integer>();
		Set<Integer>s2=new TreeSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println(s);
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(20);
		System.out.println(s1);
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		System.out.println(s2);
		
		
	}

}

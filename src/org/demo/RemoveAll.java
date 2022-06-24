package org.demo;
import java.util.*;

public class RemoveAll {
	public static void main(String[] args) {
		Set<Integer>s1=new HashSet();
		Set<Integer>s2=new HashSet();
		Set<Integer>s3=new LinkedHashSet();
		Set<Integer>s4=new LinkedHashSet();
		Set<Integer>s5=new TreeSet();
		Set<Integer>s6=new TreeSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		s2.removeAll(s1);
		System.out.println(s2);
		s3.add(10);
		s3.add(20);
		s3.add(30);
		s3.add(90);
		s3.add(10);
		s3.add(10);
		s3.add(40);
		s3.add(50);
		s4.add(10);
		s4.add(20);
		s4.add(60);
		s4.add(50);
		s4.add(40);
		s4.add(70);
		s4.add(80);
		s4.add(90);
		s4.removeAll(s3);
		System.out.println(s4);
		s5.add(10);
		s5.add(20);
		s5.add(30);
		s5.add(40);
		s5.add(50);
		s5.add(60);
		s5.add(70);
		s5.add(80);
		s6.add(100);
		s6.add(200);
		s6.add(300);
		s6.add(400);
		s6.add(500);
		s6.add(600);
		s6.add(700);
		s6.add(8000);
		s6.removeAll(s5);
		System.out.println(s6);
		
		
		
	}

}

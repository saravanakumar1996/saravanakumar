package org.demo;
import java.util.*;

public class Loop {
	public static void main(String[] args) {
		List<Integer>s=new ArrayList();
		Set<Integer>s1=new TreeSet();
		List<Integer>s2=new ArrayList();
		Set<Integer>s3=new TreeSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(50);
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(50);
		s.addAll(s1);
		System.out.println(s);
		s2.add(105);
		s2.add(205);
		s2.add(305);
		s2.add(405);
		s2.add(505);
		s2.add(605);
		s2.add(705);
		s2.add(805);
		s2.add(505);
		s2.add(605);
		s3.add(105);
		s3.add(205);
		s3.add(305);
		s3.add(405);
		s3.add(505);
		s3.add(605);
		s3.add(705);
		s3.add(805);
		s3.add(605);
		s3.add(505);
		s3.addAll(s2);
		System.out.println(s3);
		
		
	}

}

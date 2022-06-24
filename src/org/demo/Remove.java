package org.demo;
import java.util.*;

public class Remove {
	public static void main(String[] args) {
	List<Integer>r=new LinkedList();
	List<Integer>r1=new ArrayList();
	List<Integer>r2=new LinkedList();
	List<Integer>r3=new ArrayList();
	r.add(10);
	r.add(20);
	r.add(30);
	r.add(90);
	r.add(90);
	r.add(10);
	r.add(10);
	r.add(40);
	r.add(50);
	r1.add(30);
	r1.add(40);
	r1.add(50);
	r1.add(60);
	r1.add(80);
	r.removeAll(r1);
	System.out.println(r);
	r2.add(10);
	r2.add(20);
	r2.add(30);
	r2.add(60);
	r2.add(50);
	r2.add(40);
	r2.add(70);
	r2.add(80);
	r2.add(90);
	r3.add(10);
	r3.add(20);
	r3.add(30);
	r3.add(90);
	r3.add(10);
	r3.add(10);
	r3.add(40);
	r3.add(50);
	r3.add(50);
	r2.removeAll(r3);
	System.out.println(r2);

	
}}

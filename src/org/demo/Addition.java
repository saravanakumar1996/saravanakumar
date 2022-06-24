package org.demo;
import java.util.*;
public class Addition {
	public static void main(String[] args) {
	List<Integer>a=new ArrayList();
	List<Integer>b=new LinkedList();
	List<Integer>c=new LinkedList();
	List<Integer>d=new LinkedList();
	
	
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(90);
	a.add(10);
	a.add(10);
	a.add(40);
	a.add(50);
	a.add(2, 50);
	System.out.println(a);
	b.add(10);
	b.add(20);
	b.add(30);
	b.add(90);
	b.add(10);
	b.add(10);
	b.add(50);
	b.add(50);
	b.add(8, 80);
	System.out.println(b);
	c.add(100);
	c.add(200);
	c.add(300);
	c.add(400);
	c.add(500);
	c.add(600);
	c.add(700);
	c.set(2, 350);
	System.out.println(c);
	d.add(10);
	d.add(20);
	d.add(30);
	d.add(90);
	d.add(10);
	d.add(10);
	d.add(40);
	d.add(50);
	d.add(30);
	d.set(7, 90);
	System.out.println(d);
	
	
	

	
}}

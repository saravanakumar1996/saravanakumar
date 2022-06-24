package org.demo;
import java.util.*;
public class Enchance {
public static void main(String[] args) {
	Set<Integer>li=new TreeSet();
	Set<Integer>li1=new HashSet();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(60);
	li.add(70);
	li.add(80);
	li.add(90);
	li.add(10);
	li.add(20);
	for(Integer l:li) {
		System.out.println(l);
	}
	li1.add(10);
	li1.add(20);
	li1.add(30);
	li1.add(40);
	li1.add(50);
	li1.add(60);
	li1.add(70);
	li1.add(80);
	li1.add(90);
	li1.add(10);
	li1.add(20);
	for(Integer li2:li1) {
		System.out.print(li2);
	}
	
}
}

package com.rays.InterfaceCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public interface ListInterface {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("Khushali");
		list.add("Paras");
		list.add("Sanjay");
		list.add("Paras");
		list.add("Amisha");

		System.out.println("ArraysList method");

		System.out.println("get method " + " = " + list.get(0));
		System.out.println(list.size());
		System.out.println("remove method " + " = " + list.remove(4));
		System.out.println("set method " + " = " + list.set(3, "Paras mahajan"));
		System.out.println(list);
		System.out.println("sublist method " + " = " + list.subList(1, 4));
		System.out.println("indext method " + " = " + list.indexOf(2));
		System.out.println("lastIndexOf method " + " = " + list.lastIndexOf(3));

		System.out.println("--------------");

		LinkedList list1 = new LinkedList();

		list1.add("khushali");
		list1.add("rathore");
		list1.add("paras");
		list1.add("naman");
		list1.add("Amisha");

		System.out.println("list1.getFirst() : " + list1.getFirst());
		System.out.println("list1.getLast() : " + list1.getLast());
		System.out.println("list1.offer(1) : " + list1.offer(4));
		System.out.println(list1);
		System.out.println("list1.offerFirst(123) : " + list1.offerFirst(123));
		System.out.println(list1);
		System.out.println("list1.offerLast(124) : " + list1.offerLast(124));
		System.out.println(list1);
		System.out.println("list1.peek() : " + list1.peek());
		System.out.println(list1);
		System.out.println("list1.peekFirst() : " + list1.peekFirst());
		System.out.println(list1);
		System.out.println("list1.peekLast() : " + list1.peekLast());
		System.out.println(list1);
		System.out.println("list1.poll() : " + list1.poll());
		System.out.println(list1);
		System.out.println("list1.pollFirst() : " + list1.pollFirst());
		System.out.println(list1);
		System.out.println("list1.pollLast() : " + list1.pollLast());
		System.out.println(list1);
		System.out.println("list1.pop() : " + list1.pop());
		System.out.println(list1);
		list1.remove(1);

		list1.addFirst(1223); 
		list1.addLast(4567);

		System.out.println("----------->");

		Stack stack = new Stack();

		stack.push(111);
		stack.push(112);
		stack.push(113);
		stack.push(114);

		System.out.println("Stack Methods");

		System.out.println(stack);
		System.out.println("stack.empty() : " + stack.empty());
		System.out.println("stack.peek() : " + stack.peek());
		System.out.println(stack);
		System.out.println("stack.search(114) : " + stack.search(114));// search from backward
		System.out.println(stack);
		System.out.println("stack.pop() : " + stack.pop());
		System.out.println(stack);
		System.out.println("-----------");

		Vector vector = new Vector();

		vector.add(121);
		vector.add(122);
		vector.add(123);
		vector.add(124);
		vector.add(125);

		System.out.println("Vector Methods");

		System.out.println("vector.elementAt(3) : " + vector.elementAt(3));
		System.out.println(vector);
		System.out.println("vector.hashCode() : " + vector.hashCode());
		System.out.println(vector);
		System.out.println("vector.subList(1, 3) : " + vector.subList(1, 3));
		System.out.println(vector);

	}

}

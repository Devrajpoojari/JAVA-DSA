package com.linkedList;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(3);
		list.append(20);
		list.append(30);

		list.printList();
//		System.out.println("Removed Last Node : " +list.removeLast().value);
		System.out.println();
		list.prePend(900);
		list.printList();
//		System.out.println("Removed Last Node : " +list.removeLast().value);
		System.out.println();
		System.out.println("Remove First : " + list.removeFirst().value);
		list.printList();
		System.out.println();
		System.out.println("Get value at index 2 : " + list.get(2).value);
		list.printList();
		System.out.println();
		System.out.println("Setting some value at node 2: " + list.set(2, 100));

		list.printList();
		System.out.println();

		System.out.println("Inserting new Node at perticular index : " + list.insert(1, 400));

		list.printList();
		System.out.println();
		System.out.println("Removed Node from Index 2 : " + list.remove(2).value);
		list.printList();
		System.out.println();

		list.reverse();

		list.printList();

		HashSet<Integer> list4 = new HashSet<>();
		
		list4.add(30);
		list4.add(30);
		list4.add(30);
		list4.add(30);
		list4.add(30);
		list4.add(30);
		
		System.out.println("Hashing values : "+list4);
	}

}

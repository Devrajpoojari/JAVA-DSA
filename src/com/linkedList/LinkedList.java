package com.linkedList;

public class LinkedList {

	private Node tail;

	private Node head;

	private int length;

	class Node {

		Node next;

		int value;

		Node(int value) {

			this.value = value;

		}

	}

	public LinkedList(int value) {
		Node n = new Node(value);
		this.head = n;
		this.tail = n;
		this.length = 1;

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void prePend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
//		return newNode;
	}

	public Node removeFirst() {

		if (length == 0)
			return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;

	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		} else {
			Node temp = head;
			Node pre = head;
			while (temp.next != null) {
				pre = temp;
				temp = temp.next;
			}
			tail = pre;
			tail.next = null;
			length--;
			if (length == 0) {
				head = null;
				tail = null;
			}
			return temp;
		}

	}

	public void getHead() {
		System.out.println("Head : " + head.value);
	}

	public void getTal() {
		System.out.println("Tail : " + tail.value);
	}

	public void getLength() {
		System.out.println("Length : " + this.length);
	}

	public Node get(int index) {
		Node temp = head;
		if (index < 0 || index >= length) {
			return null;
		}
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		if (index < 0 || index >= length) {
			throw new RuntimeException("Index Out of Range");
		}
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		} else {
			return false;
		}

	}

	public boolean insert(int index, int value) {
		if (index < 0 || index >= length) {
			throw new RuntimeException("Index Out of Range");
		}
		if (index == 0) {
			prePend(value);
		}
		if (index == length) {
			append(value);
		}
		Node newNode = new Node(value);

		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index == 0) {
			removeFirst();
		}
		if (length - 1 == index) {
			removeLast();
		}

		Node pre = get(index - 1);

		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}

}

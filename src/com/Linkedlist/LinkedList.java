package com.Linkedlist;

public class LinkedList {

	class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	}
	
	public Node head = null;
	public Node tail = null;
	
	private void add(int i) {
		
		Node newNode = new Node(i);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			
		}
	}
	int count = 0;
	int len = 0;
	public void display() {
		Node current = head;
	   while(current != null) {
		System.out.println(current.data + "");
		current = current.next;
		count = count+1;
	}
		
	   System.out.println(count);
	    len = count/2 + 1;
	   System.out.println(len);
	}
	
	
	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		linklist.add(1);
		linklist.add(2);
		linklist.add(3);
		linklist.display();
	}
}

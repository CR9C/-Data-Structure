package com._520it.linked;

public class MyLinkedListDemo {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addLast("A");
		list.addLast("B");
		list.addLast("C");
		list.addLast("D");
		System.out.println(list);
		list.remove("D");
		System.out.println(list);
	}
}

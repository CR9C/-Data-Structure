package com._520it.linked;

//基于双向链表集合
public class MyLinkedList {
	private Node first;//链表的第一个节点
	private Node last;//链表的最后一个节点
	private int size = 0;//节点的数量
	
	//链表中的每一个节点(内部类)
	class Node {
		Node prev;//上一个节点对象
		Node next;//下一个节点对象
		Object ele;//当前节点中存储的数据
		
		public Node(Object ele){
			this.ele = ele;
		}
	}
	
	public Node search(Object ele) {
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return null;
				}
				current = current.next;
			}
		}
		return current;
	}
	
	public void remove(Object ele) {
		//找到要删除的节点
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		//删除节点:
		if (current == first) {
			this.first = current.next;
			this.first.prev = null;
		}else if (current == last) {
			this.last = current.prev;
			this.last.next = null;
		}else {
			//把删除当前节点的下一个节点作为删除节点上一个节点的next
			current.prev.next = current.next;
			//把删除节点的上一个节点作为删除节点下一个节点的prev
			current.next.prev = current.prev;
		}
		size--;
	}
	
	public void addFirst(Object ele) {
		Node node = new Node(ele);//需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把之前第一个作为新增节点的下一个节点
			node.next = this.first;
			//把新增节点作为之前第一个节点的上一个节点
			this.first.prev = node;
			//把新增节点作为第一个节点
			this.first = node;
		}
		size++;
	}
	public void addLast(Object ele) {
		Node node = new Node(ele);//需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把新增节点作为之前最后一个的下一个节点
			this.last.next = node;
			//把之前最后一个节点作为新增节点的上一个节点
			node.prev = this.last;
			//把新增节点作为最后一个节点
			this.last = node;
		}
		size++;
	}
	
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		Node current = this.first;//第一个节点
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(".");		
			} else {
				sb.append("]");
			}
			current = current.next;//获取自己的下一个节点
		}
		return sb.toString();
		
	}
	

}

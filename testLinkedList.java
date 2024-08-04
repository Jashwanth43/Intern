package test;

import java.util.Collections;
import java.util.LinkedList;

public class testLinkedList {

	public static void main(String[] args) {
		// Creating a LinkedList of integers
		LinkedList<Integer> list = new LinkedList<>();
		// Inserting elements in linked lists
		list.add(25);
		list.add(1, 10);
		list.add(2, 20);
		list.add(3, 50);

		// Displaying the linked list
		System.out.println(list);

		// Deleting element
		list.remove(2);
		System.out.println(list);
		System.out.println("Size of Linked List: " + list.size());

		// Traversing Linked List
		for (int a : list)
			System.out.println(a);
		Collections.reverse(list);
		System.out.println("Reversing a  Linked List:" + list);

	}
}

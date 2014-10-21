/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
*  pulls together each data structure and threads information through 
*  queue, hashtable, Binary Search Tree 
*/

import java.io.*;
import java.util.Scanner;

public class Main {
	public Stud_Hash hash;
	public Idea_Wait waiting;
	public Idea_Heap heap;
	public Stud_BST bst;
	
	public Main() {
		hash = null;
		waiting = null;
		heap = null;
		bst = null;
	}
	
	public void startUp() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1: New System");
		System.out.println("2: Load Current System");
		System.out.println();
		System.out.print("Enter choice: ");
		int x = scan.nextInt();
		if (x == 1) {
			hash = new Stud_Hash();
			waiting = new Idea_Wait();
			heap = new Idea_Heap();
			bst = new Stud_BST();
		}
		else if (x == 2) {
			hash = (Stud_Hash) loadHash("hash.ser");
			waiting = (Idea_Wait) loadWait("waiting.ser");
			heap = (Idea_Heap) loadHeap("heap.ser");
			bst = (Stud_BST) loadBST("bst.ser");
		}
	}

	public void newSystem() {
		hash = new Stud_Hash();
		waiting = new Idea_Wait();
		heap = new Idea_Heap();
		bst = new Stud_BST();
	}
	
	public void loadSystem() {
		hash = (Stud_Hash) loadHash("hash.ser");
		waiting = (Idea_Wait) loadWait("waiting.ser");
		heap = (Idea_Heap) loadHeap("heap.ser");
		bst = (Stud_BST) loadBST("bst.ser");
	}
	
	public void closeDown() {
		System.out.println("Closing down");
		saveHash();
		saveWait();
		saveHeap();
		saveBST();
	}
	
	/*
	public static void studentOrAdmin() {
		System.out.println("1: Student");
		System.out.println("2: Administrator");
		System.out.println();
		System.out.print("Enter choice: ");
		int x = scan.nextInt();
		if (x == 1) {
			studentInterface();
		}
		else if (x == 2) {
			adminInterface();
		}
	}*/

	public void printData() {
		System.out.println("Student hash table");
		hash.printHash();
		System.out.println("Idea waiting queue");
		waiting.printQueue();
		System.out.println("Ranked idea heap");
		heap.printHeap();
		System.out.println("Student binary search tree");
		bst.printTree();
	}
		
	public void saveHash() {
		try {
			FileOutputStream fileOut = new FileOutputStream("hash.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(hash);
			out.close();
			fileOut.close();
			System.out.println("Serialized hash is saved in hash.ser");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveWait() {
		try {
			FileOutputStream fileOut = new FileOutputStream("waiting.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(waiting);
			out.close();
			fileOut.close();
			System.out.println("Serialized waiting list is saved in waiting.ser");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveHeap() {
		try {
			FileOutputStream fileOut = new FileOutputStream("heap.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(heap);
			out.close();
			fileOut.close();
			System.out.println("Serialized heap is saved in heap.ser");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveBST() {
		try {
			FileOutputStream fileOut = new FileOutputStream("bst.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(bst);
			out.close();
			fileOut.close();
			System.out.println("Serialized binary search tree is saved in bst.ser");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Stud_Hash loadHash(String data_file) {
		Stud_Hash hash = null;
		try {
			FileInputStream fileIn = new FileInputStream("hash.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			hash = (Stud_Hash) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized hash has been returned");
			return hash;
		}
		catch (IOException i) {
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
			return null;
		}
	}
	
	public Idea_Wait loadWait(String data_file) {
		Idea_Wait waiting = null;
		try {
			FileInputStream fileIn = new FileInputStream("waiting.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			waiting = (Idea_Wait) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized waiting list has been returned");
			return waiting;
		}
		catch (IOException i) {
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
			return null;
		}
	}
	
	public Idea_Heap loadHeap(String data_file) {
		Idea_Heap heap = null;
		try {
			FileInputStream fileIn = new FileInputStream("heap.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			heap = (Idea_Heap) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized heap has been returned");
			return heap;
		}
		catch (IOException i) {
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
			return null;
		}
	}
	
	public Stud_BST loadBST(String data_file) {
		Stud_BST bst = null;
		try {
			FileInputStream fileIn = new FileInputStream("bst.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			bst = (Stud_BST) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized binary search tree has been returned");
			return bst;
		}
		catch (IOException i) {
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
			return null;
		}
	}
	
	public Student newStudent(String last_name, String login, int ssn, int student_num, Stud_Hash hash, Stud_BST bst) {
		Student x = new Student(last_name, login, ssn, student_num);
		hash.insert(x);
		bst.insert(x);
		return x;
	}

}

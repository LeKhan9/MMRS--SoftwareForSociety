/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
* Another queue where Idea objects "wait" to be rated by the admin
*/

import java.util.Scanner;
import java.io.Serializable;

public class Idea_Wait implements Serializable {
	
	private Idea head;
	private Idea tail;
	private int n;
	
	public Idea_Wait() {
		n = 0;
		head = null;
		tail = null;
	}
	public Idea front(){
		return head;
	}
	
	public void enqueue(Idea x) {
		if (n==0) {
			head = x;
			tail = head;
		}
		else {
			Idea temp = tail;
			tail = x;
			temp.setNext(tail);
		
		}
		n++;
	}
	
	public Idea dequeue() {
		n--;
		Idea temp = head;
		head = head.getNext();
		temp.setNext(null);
		return temp;
	}
	
	public boolean isEmpty() {
		return (n==0);
	}
	
	public void printQueue() {
		System.out.println(n);
		Idea temp = head;
		while (temp != null) {
			System.out.println(temp.getId());
			temp = temp.getNext();
		}
	}
	
	public void rateIdea(Stud_Hash hash,  Stud_BST bst,  Idea_Heap heap, int rating) {
		n--;
		Idea temp = head;
		head = head.getNext();
		temp.setNext(null);
		int ssn = temp.getSSN();
		Student s = hash.lookUp(ssn);
		Student a = bst.search(s.getStudentNum());
		if (s == null || a == null){
			heap.insert(temp);
		}
		else{
			temp.setRating(rating);
			if (s == a){
				s.insertQ(temp);
				s.updateAverage();
			}
			else {
				s.insertQ(temp);
				a.updateAverage();
				a.insertQ(temp);
				s.updateAverage();
			}
			heap.insert(temp);
		}
	}
}
			
			
			

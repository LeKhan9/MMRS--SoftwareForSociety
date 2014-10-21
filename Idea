/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
* Ideas are made up of an idea number, the submitter's SSN, description of the idea , and the idea rating
*/

import java.io.Serializable;

public class Idea implements Serializable {
	private static int id = 1;
	private int id_number;
	private int ssn;
	private String text;
	private int rating;
	private Idea next;
	private Idea previous;
	private Idea heap_next;
	private Idea heap_prev;
	
	public Idea(int ssn, String text, int rating) {
		this.ssn = ssn;
		this.text = text;
		this.rating = rating;
		id_number = id;
		next = null;
		previous = null;
		heap_next = null;
		heap_prev = null;
		id++;
	}
	
	public void setNext(Idea idea) {
		next = idea;
	}
	
	public Idea getNext() {
		return next;
	}
	
	public void setPrevious(Idea idea) {
		previous = idea;
	}
	
	public Idea getPrevious() {
		return previous;
	}
	
	public int getRating() {
		return rating;
	}
	
	public int getSSN() {
		return ssn;
	}
	
	public String getText() {
		return text;
	}
	public int getId(){
		return id_number;
		
	}
	
	public void setRating(int x) {
		rating = x;
	}
	
	public void set_heap_next(Idea x) {
		heap_next = x;
	}
	
	public Idea heap_next() {
		return heap_next;
	}
	
	public void set_heap_prev(Idea x) {
		heap_prev = x;
	}
	
	public Idea heap_prev() {
		return heap_prev;
	}
	
}

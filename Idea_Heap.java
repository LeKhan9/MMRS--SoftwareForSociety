/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
* Heap that inserts Idea objects into list in regards to ordering by rating
* The minimum can be deleted and the front can be retrieved
*/
import java.io.Serializable;

public class Idea_Heap implements Serializable {
	private Idea head;
	private Idea tail;
	private int n;
	
	public Idea_Heap() {
		head = null;
		tail = null;
		n = 0;
	}
	
	public void insert(Idea x) {
		if (n == 0) {
			head = x;
			tail = x;
			n++;
		}
		else {
			Idea temp = head;
			while (temp != null && x.getRating() >= temp.getRating()) {
				temp = temp.heap_next();	
			}
			if (temp == null) {
				tail.set_heap_next(x);
				x.set_heap_prev(tail);
				tail = x;
				n++;
			}
			else if (temp == head) {
				x.set_heap_next(head);
				head.set_heap_prev(x);
				n++;
				head = x;
			}
			else {
				temp.heap_prev().set_heap_next(x);
				x.set_heap_prev(temp.heap_prev());
				x.set_heap_next(temp);
				temp.set_heap_prev(x);
				n++;
			}
		}
	}
	
	public Idea deleteMin() {
		if (n != 0){
			n--;
			Idea temp = tail;
			if (n == 1) {
				System.out.println(1);
				head = null;
				tail = null;
				return temp;
			}
			else {
				tail = temp.heap_prev();
				tail.set_heap_next(null);
				return temp;
			}
		}
		else{
			return null;
		}
	}
	public Idea front(){
		return tail;
	}
	
	public void printHeap() {
		Idea temp = head;
		while (temp != null) {
			System.out.println(temp.getRating());
			temp = temp.heap_next();
		}
	}
}

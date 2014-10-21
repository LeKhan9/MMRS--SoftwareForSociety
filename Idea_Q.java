/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
* Queue that is made up of Idea objects, and can take the average of Idea ratings
*/

import java.io.Serializable;

public class Idea_Q implements Serializable {
	private int n;
	private int head;
	private int tail;
	private Idea queue[];
	
	public Idea_Q() {
		head = 0;
		tail = 0;
		n = 0;
		queue = new Idea[10];
	}
	
	public void enqueue(Idea idea) {
        if (n == 10) {
			head++;
			queue[tail] = idea;
			tail++;
		}
        else if (tail == 9) {
            queue[tail] = idea;
            tail = 0;
            n++;
        }
        else {
            queue[tail] = idea;
            tail++;
            n++;
        }
    }

    public Idea dequeue() {
        if (n == 0) {
            return null;
        }
        else if (head == 9) {
            head = 0;
            n--;
            Idea temp = queue[9];
            queue[9] = null;
            return temp;
        }
        else {
            head++;
            n--;
            Idea temp = queue[head-1];
            queue[head-1] = null;
            return temp;
        }
    }
        
    //return if queue is empty or not
    public boolean isEmpty() {
        return n == 0;
    }
    
    public int averageScore() {
		if (isEmpty()==true)
			return -1;
		int total = 0;
		for (int x = 0; x < n; x++) {
			if (queue[x] != null)
				total += queue[x].getRating();
		}
		int average = total / n;
		return average;
	}
	
	public void printQ() {
		for (int i = 0; i < 10; i++) {
			if (queue[i] == null) {
				System.out.println(i+1 + ": ");
			}
			else {
				System.out.println(i+1 + ": " + queue[i].getText())+ " " + queue[i].getRating());
			}
		}
	}
}

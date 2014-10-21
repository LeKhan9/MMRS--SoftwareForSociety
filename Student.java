/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*  Each student object contains: 
*  last name, email login name,four digit ssn,four digit student number,the student's last 10 ideas
*  the average of the ratings of the student's last 10 ideas
*/

import java.io.Serializable;

public class Student implements Serializable {
	private String last_name;
	private String login;
	private int ssn;
	private int student_num;
	private int average_score;
	private Idea_Q queue;
	private Student left;
	private Student right;
	private Student parent;


	public Student(String last_name, String login, int ssn, int student_num) {
		this.last_name = last_name;
		this.login = login;
		this.ssn = ssn;
		this.student_num = student_num;
		average_score = -1;
		queue = new Idea_Q();
		right = null;
		left = null;
		parent = null;
	}
	
	public int getAverage() {
		return average_score;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getLogin() {
		return login;
	}
	
	public int getSSN() {
		return ssn;
	}
	public int getStudentNum() {
		return student_num;
	}
	
	public void setLastName(String name) {
		last_name = name;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setRight(Student x) {
		right = x;
	}
	
	public void setLeft(Student x) {
		left = x;
	}
	
	public void setParent(Student x) {
		parent = x;
	}
	
	public Student getRight() {
		return right;
	}
	
	public Student getLeft() {
		return left;
	}
	
	public Student getParent() {
		return parent;
	}
	
	public void insertQ(Idea x) {
		queue.enqueue(x);
	}
	
	public void returnIdeas() {
		queue.printQ();
	}
	
	public void updateAverage() {

			average_score = queue.averageScore();
		

	}
	
	public void newIdea(String text, Idea_Wait waiting) {
		Idea idea = new Idea(ssn, text, -1);
		waiting.enqueue(idea);
	}
	
	public void printStudent() {
		System.out.println("Last name: " + last_name);
		System.out.println("Login: " + login);
		System.out.println("SSN: " + ssn);
		System.out.println("Student number: " + student_num);
		System.out.println("Average score: " + average_score);
	}
	
}

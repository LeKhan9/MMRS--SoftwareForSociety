
/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
* Gui that animates and makes visible using toolkit and swing imports to control 
* flow of user input and output to the screen. 
*/
import java.awt.Color;

import java.awt.Dimension;
import java.awt.color.*;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.event.*;
@SuppressWarnings("serial")
public class gui1 extends JFrame {
	private JButton studbutton;
	private JButton userbutton;
	private JButton enter;
	private JButton newstud;
	private JButton oldstud;
	private JButton back;
	private JPanel panel;
	private JLabel label;
	private JLabel namelabel;
	private JLabel emaillabel;
	private JLabel ssnlabel;
	private JLabel studnumlabel;
	private JLabel averageidea;
	private JLabel studentlabel;
	private JTextField password;
	private JTextField lname;
	private JTextField elogin;
	private JTextField ssn;
	private JTextField studnum;
	private JTextField idearate;
	private JButton go; 
	private JButton next;
	private JButton bstsearch;
	private JButton hashsearch;
	private JButton createideas;
	private JButton printideas;
	private JTextArea ideatext;
	private JButton menu;
	private JButton studlookup;
	private JButton rateidea;
	private JButton updaterate;
	private JButton menu1;
	private JButton exit;
	private JButton bestidea;
	private JButton newsystem;
	private JButton oldsystem;
	private Idea idea;
	private Student student;
	private Main main;
	private JButton traverse;
	private ImageIcon image1;
	private JLabel label2;
	private JButton menu2;
	private JButton menu3;
	private JButton menu4;
	private JButton delete;
	private JButton modify;
	private JButton modify1;
	private JButton modify2;
	private JButton sellidea;

	public static void main(String[] args){

		gui1 a = new gui1();
	}

	public gui1() { 


		
		main = new Main();
		this.setSize(600,600);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width/2) - (this.getWidth()/2);
		int yPos = (dim.height/2)- (this.getHeight()/2);
		
		this.setLocation(xPos,yPos);
		this.setTitle("MMRS Data Systems");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//the next 50 lines of code were implemented to prevent any errors
		//that occured with loading the prevoius info. Because the buttons had 
		//very specific uses, when the info was loaded, some of the buttons would 
		//fail unless all of the variables were initialized in the code.
		panel = new JPanel();
		panel.setLayout(null);

		panel.setBackground(new Color(199,206,214));

		studbutton = new JButton();
		panel.add(studbutton);

		userbutton = new JButton();
		panel.add(userbutton);

		enter = new JButton();
		panel.add(enter);

		newstud = new JButton();
		panel.add(newstud);

		oldstud = new JButton();
		panel.add(oldstud);

		back = new JButton();
		panel.add(back);
	
	
		namelabel = new JLabel();
		panel.add(namelabel);

		emaillabel = new JLabel();
		panel.add(emaillabel);

		ssnlabel = new JLabel();
		panel.add(ssnlabel);

		studnumlabel = new JLabel();
		panel.add(studnumlabel);

		averageidea = new JLabel();
		panel.add(averageidea);

		studentlabel = new JLabel();
		panel.add(studentlabel);

		password = new JTextField();
		panel.add(password);

		lname = new JTextField();
		panel.add(lname);

		elogin = new JTextField();
		panel.add(elogin);

		ssn = new JTextField();
		panel.add(ssn);

		studnum = new JTextField();
		panel.add(studnum);

		idearate = new JTextField();
		panel.add(idearate);

		go = new JButton();
		panel.add(go);

		next = new JButton();
		panel.add(next);

		bstsearch = new JButton();

		hashsearch = new JButton();
		panel.add(hashsearch);

		createideas = new JButton();
		panel.add(createideas);

		printideas = new JButton();
		panel.add(printideas);

		ideatext = new JTextArea();
		panel.add(ideatext);

		menu = new JButton();
		panel.add(menu);

		studlookup = new JButton();
		panel.add(studlookup);

		rateidea = new JButton();
		panel.add(rateidea);

		updaterate = new JButton();
		panel.add(updaterate);

		menu1 = new JButton();
		panel.add(menu1);

		exit = new JButton();
		panel.add(exit);

		bestidea = new JButton();
		panel.add(bestidea);

		newsystem = new JButton();
		panel.add(newsystem);

		oldsystem = new JButton();
		panel.add(oldsystem);

		traverse = new JButton();
		panel.add(traverse);

		menu2 = new JButton();
		panel.add(menu2);
		menu3 = new JButton();
		panel.add(menu3);
		menu4 = new JButton();
		panel.add(menu4);

		image1 = new ImageIcon(getClass().getResource("MMRS.jpg"));
		label2 = new JLabel(image1);
		label2.setSize(262, 117);
		label2.setLocation(160,10);
		panel.add(label2);
		
		newsystem = new JButton("New System");
		newsystem.setSize(100,50);
		newsystem.setLocation(150,300);
		event15 e15 = new event15();
		newsystem.addActionListener(e15);
		panel.add(newsystem);
		oldsystem = new JButton("Load System");
		oldsystem.setSize(100,50);
		oldsystem.setLocation(350,300);
		event16 e16 = new event16();
		oldsystem.addActionListener(e16);
		panel.add(oldsystem);
	
		this.add(panel);
		label = new JLabel("Com 212 Final Project GUI");
		label.setSize(200,50);
		label.setLocation(222,250);
		panel.add(label);
		traverse = new JButton();
		panel.add(traverse);
		studentlabel = new JLabel();
		panel.add(studentlabel);

		updaterate = new JButton();
		panel.add(updaterate);

		idearate = new JTextField();
		panel.add(idearate);

		printideas = new JButton();
		panel.add(printideas);

		createideas = new JButton();
		panel.add(createideas);

		delete = new JButton();
		panel.add(delete);

		modify = new JButton();
		panel.add(modify);

		modify1 = new JButton();
		panel.add(modify1);

		modify2 = new JButton();
		panel.add(modify2);

		sellidea = new JButton();
		panel.add(sellidea);


				
		
		this.setVisible(true);
		this.setResizable(false);
		
		
	}
	@SuppressWarnings("unused")

	//student button #1. Opens an interface for the user to choose 
	//either a new student or an existing student.
	public class ListenForButton implements ActionListener {
		public void actionPerformed(ActionEvent lforbutton){
			panel.remove(studbutton);
			panel.remove(userbutton);
			panel.repaint();
			panel.revalidate();
			
			label.setText("");
			panel.repaint();
			panel.revalidate();
			newstud = new JButton("New Student");
			oldstud = new JButton("Existing Student");
			event3 e3 = new event3();
			newstud.addActionListener(e3);
			event9 e9 = new event9();
			oldstud.addActionListener(e9);
			newstud.setSize(100,50);
			oldstud.setSize(150,50);
			newstud.setLocation(350,400);
			oldstud.setLocation(150,400);
			menu2 = new JButton("Menu");
			menu2.setLocation(250,500);
			menu2.setSize(100,50);
			event24 e24 = new event24();
			menu2.addActionListener(e24);
			panel.add(menu2);
			panel.add(newstud);
			panel.add(oldstud);
			
		}
	}

	//Administrator button number #1. This opens to a warning screen.
	public class ListenForButton1 implements ActionListener {
		public void actionPerformed(ActionEvent lforbutton1){
			panel.remove(studbutton);
			panel.remove(userbutton);
			label.setText("If you are not an Administrator, do not hit enter");
			label.setLocation(150,200);
			label.setSize(400,30);
			panel.add(label);
			panel.repaint();
			panel.revalidate();
		
			enter = new JButton("enter");
			enter.setSize(100,50);
			enter.setLocation(150,400);
			event1 e1 = new event1();
			enter.addActionListener(e1);
			panel.add(enter);
			back = new JButton("back");
			back.setSize(100,50);
			back.setLocation(350,400);
			event e = new event();
			back.addActionListener(e);
			panel.add(back);


			
			
			
			
		}
	}
	///This button brings us back to the main menu from a few different screens.
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e){
			label.setText("");
			
			panel.remove(back);
			panel.remove(enter);
			if (password !=null){
				panel.remove(password);
			}
			panel.repaint();
			panel.revalidate();
			
			panel.add(userbutton);
			panel.add(studbutton);
			label = new JLabel("Com 212 Final Project GUI");
			label.setSize(200,50);
			label.setLocation(222,250);
			panel.add(label);
			
		}
			
	}
	
	//Administrator button #2. This button allows the administrator to 
	//access certain function in the code, IE rating an idea, viewing all the students,
	//or looking up a specific student.
	public class event1 implements ActionListener {
		public void actionPerformed(ActionEvent e1){
			label.setText("Welcome Adminstrator. What would you like to do?");
			label.setLocation(150,200);
			panel.remove(password);
			panel.remove(back);
			panel.remove(enter);
			panel.repaint();
			panel.revalidate();
			traverse = new JButton("Print all students");
			traverse.setLocation(240,300);
			traverse.setSize(150,50);
			event22 e22 = new event22();
			traverse.addActionListener(e22);
			panel.add(traverse);
			rateidea = new JButton("Rate next idea");
			rateidea.setLocation(60,300);
			rateidea.setSize(150,50);
			event18 e18 = new event18();
			rateidea.addActionListener(e18);
			panel.add(rateidea);
			studlookup = new JButton("Look up students");
			studlookup.setLocation(430,300);
			studlookup.setSize(150,50);
			event12 e12 = new event12();
			studlookup.addActionListener(e12);
			panel.add(studlookup);

			menu4 = new JButton("Main Menu");
			menu4.setSize(100,50);
			menu4.setLocation(250,500);
			event26 e26 = new event26();
			menu4.addActionListener(e26);
			panel.add(menu4);
			sellidea = new JButton("Sell Idea");
			sellidea.setSize(150,50);
			sellidea.setLocation(60,350);
			event31 e31 = new event31();
			sellidea.addActionListener(e31);
			panel.add(sellidea);
			bestidea = new JButton("Best idea");
			bestidea.setSize(150,50);
			bestidea.setLocation(430,350);
			event32 e32 = new event32();
			bestidea.addActionListener(e32);
			panel.add(bestidea);

		}
	}

			

	//This is the new student interface, where the 
	//new student will input the proper answers to the text boxes.
	public class event3 implements ActionListener {
		public void actionPerformed(ActionEvent e3){
			panel.remove(newstud);
			panel.remove(oldstud);
			panel.remove(menu2);
			panel.repaint();
			panel.revalidate();

			namelabel = new JLabel("Last Name: ");
			namelabel.setSize(90,30);
			namelabel.setLocation(100,200);
			emaillabel = new JLabel("Email Login: ");
			emaillabel.setSize(90,30);
			emaillabel.setLocation(100,230);
			ssnlabel = new JLabel("SSN: ");
			ssnlabel.setLocation(100,260);
			ssnlabel.setSize(90,30);
			
			studnumlabel = new JLabel("Student Number: ");
			studnumlabel.setSize(110,30);
			studnumlabel.setLocation(100,290);

			lname = new JTextField("",10);
			lname.setLocation(209,206);
			lname.setSize(110,19);
			elogin = new JTextField("",10);
			elogin.setLocation(209,236);
			elogin.setSize(110,19);
			ssn = new JTextField("",10);
			ssn.setLocation(209,266);
			ssn.setSize(110,19);
			studnum = new JTextField("",10);
			studnum.setLocation(209,296);
			studnum.setSize(110,19);
			menu3 = new JButton("Main Menu");
			menu3.setSize(100,50);
			menu3.setLocation(250,500);
			event25 e25 = new event25();
			menu3.addActionListener(e25);
			panel.add(menu3);
			panel.add(namelabel);
			panel.add(lname);
			panel.add(emaillabel);
			panel.add(elogin);
			panel.add(ssnlabel);
			panel.add(ssn);
			panel.add(studnumlabel);
			panel.add(studnum);
			go = new JButton("Continue");
			event5 e5 = new event5();
			go.addActionListener(e5);
			go.setLocation(290,320);
			go.setSize(100,35);
			panel.add(go);
			
			
		}
	}
	//main student interface #1. Allows student to create ideas, or return to main menu. 
	public class event4 implements ActionListener {
		public void actionPerformed(ActionEvent e4){
			label.setText("");
			panel.remove(next);
			panel.remove(menu3);

			panel.repaint();
			panel.revalidate();

			
			createideas = new JButton("Create Ideas");
			createideas.setSize(100,50);
			createideas.setLocation(150,400);
			event7 e7 = new event7();
			createideas.addActionListener(e7);
			panel.add(createideas);


			menu = new JButton("Main Menu");
			menu.setSize(100,50);
			menu.setLocation(250,500);
			event6 e6 = new event6();
			menu.addActionListener(e6);
			panel.add(menu);

			printideas = new JButton("Print Ideas");
			printideas.setSize(100,50);
			printideas.setLocation(350,400);
			event23 e23 = new event23();
			printideas.addActionListener(e23);
			panel.add(printideas);
			

			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			studentlabel = new JLabel("Student");
			studentlabel.setLocation(100,180);
			studentlabel.setSize(400,30);
			panel.add(studentlabel);
			
			
			
			
		}
	}
	//This button creates the new student and is responsible for inputing the student into the 
	//BST and HASH table
	public class event5 implements ActionListener {
		public void actionPerformed(ActionEvent e5){
			
			String last_name = lname.getText();
			String login = elogin.getText();
			int ssnInt = Integer.parseInt(ssn.getText());
			int student_num = Integer.parseInt(studnum.getText());
			student = main.newStudent(last_name, login, ssnInt, student_num, main.hash, main.bst);
			/*if (lastname == "" || emaillogin == "" || stringssn == "" || stringstudnum == ""){
				label.setText("One of the boxes has not been filled out!");
				label.setSize(300,20);
				label.setLocation(200,100);
			}
			else {*/
				panel.remove(namelabel);
				panel.remove(lname);
				panel.remove(emaillabel);
				panel.remove(elogin);
				panel.remove(ssnlabel);
				panel.remove(ssn);
				panel.remove(studnumlabel);
				panel.remove(studnum);
				panel.remove(go);

				panel.repaint();
				panel.revalidate();
				label.setText("Welcome new student " + last_name+". Click Next to continue!");
				label.setSize(500,20);
				label.setLocation(140,200);
				next = new JButton("Next");
				event4 e4 = new event4();
				next.addActionListener(e4);
				next.setSize(120,30);
				next.setLocation(240,335);
				panel.add(next);
				
			
			
		}
	}
	//idea creation interface. Displays a text box for the student to input an idea
	public class event7 implements ActionListener {
		public void actionPerformed(ActionEvent e7){
			panel.remove(namelabel);
			panel.remove(printideas);
			panel.remove(studnumlabel);
			panel.remove(averageidea);
			panel.remove(emaillabel);
			panel.remove(ssnlabel);
			panel.remove(studentlabel);
			panel.repaint();
			panel.revalidate();
			panel.remove(createideas);
			panel.remove(menu);
			panel.remove(printideas);
			panel.repaint();
			panel.revalidate();
			label.setText("This is where you can create ideas for us to make some Money!");
			label.setLocation(100,200);
			ideatext = new JTextArea("Input new ideas here!");
			ideatext.setSize(400,200);
			ideatext.setLocation(100,240);
			
			panel.add(ideatext);
			enter = new JButton("enter");
			enter.setLocation(450,450);
			enter.setSize(100,30);
			event17 e17 = new event17();
			enter.addActionListener(e17);
			panel.add(enter);
			back = new JButton("back");
			back.setSize(100,30);
			back.setLocation(75,450);
			event8 e8 = new event8();
			back.addActionListener(e8);
			panel.add(back);
			
		
		}
		
	}
	//return to main menu
	public class event6 implements ActionListener {
		public void actionPerformed(ActionEvent e6){
			panel.remove(namelabel);
			panel.remove(printideas);
			panel.remove(studnumlabel);
			panel.remove(averageidea);
			panel.remove(emaillabel);
			panel.remove(ssnlabel);
			panel.remove(traverse);
			panel.remove(studentlabel);
			panel.remove(delete);
			panel.remove(bestidea);
			panel.remove(modify);
			panel.remove(modify1);
			panel.remove(modify2);
			label.setText("");
			panel.remove(elogin);
			panel.remove(password);
			panel.remove(rateidea);
			panel.remove(studlookup);
			panel.repaint();
			panel.revalidate();
			panel.remove(createideas);
			panel.remove(menu);
			panel.remove(printideas);
			panel.repaint();
			panel.revalidate();
			label.setText("Com212 Final Project Gui");
			label.setLocation(222,250);
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	//back button, during create ideas phase
	//brings back to the original student interface
	public class event8 implements ActionListener {
		public void actionPerformed(ActionEvent e8){
			label.setText("");
			panel.remove(ideatext);
			panel.remove(back);
			panel.remove(enter);
			panel.repaint();
			panel.revalidate();

			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			studentlabel = new JLabel("Student");
			studentlabel.setLocation(100,180);
			studentlabel.setSize(400,30);
			panel.add(studentlabel);
			panel.add(createideas);
			panel.add(menu);
			panel.add(printideas);
			
		}
	}
	//existing user interface
	//this is responsible for the student inputing their ssn or studentnumber to bring
	//up thier profile
	public class event9 implements ActionListener {
		public void actionPerformed(ActionEvent e9){
			label.setText("Enter either student number or SSN and press the correct button.");
			label.setLocation(100,200);
			label.setSize(500,30);
			panel.remove(oldstud);
			panel.remove(newstud);
			panel.repaint();
			panel.revalidate();
			panel.remove(menu2);
			
			bstsearch = new JButton("Go");
			bstsearch.setSize(100,30);
			bstsearch.setLocation(430,280);
			event10 e10 = new event10();
			bstsearch.addActionListener(e10);
			panel.add(bstsearch);
			hashsearch = new JButton("Go");
			hashsearch.setSize(100,30);
			hashsearch.setLocation(430,250);
			event11 e11 = new event11();
			hashsearch.addActionListener(e11);
			panel.add(hashsearch);
			ssn = new JTextField("Enter ssn.");
			ssn.setSize(250,30);
			ssn.setLocation(180,250);
			panel.add(ssn);
			studnum = new JTextField("Enter student number.");
			studnum.setSize(250,30);
			studnum.setLocation(180,280);
			panel.add(studnum);
			event13 e13 = new event13();
			menu1 = new JButton("Menu");
			menu1.setSize(100,50);
			menu1.setLocation(250,500);
			menu1.addActionListener(e13);
			panel.add(menu1);


			
			
		}
	}
	//Binary search tree look up for student
	//searches the binary search tree and returns the desired student profile
	public class event10 implements ActionListener {
		public void actionPerformed(ActionEvent e11){
			label.setText("");
			System.out.println(1);
			System.out.println(studnum.getText());
			System.out.println(1);
			int student_num = Integer.parseInt(studnum.getText());
			student = main.bst.search(student_num);
			String name = student.getLastName();
			

			
			panel.remove(bstsearch);
			panel.remove(hashsearch);
			panel.remove(ssn);
			panel.remove(studnum);
			panel.remove(menu1);
			panel.repaint();
			panel.revalidate();


			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			studentlabel = new JLabel("Student");
			studentlabel.setLocation(100,180);
			studentlabel.setSize(400,30);
			
						
			createideas = new JButton("Create Ideas");
			createideas.setSize(100,50);
			createideas.setLocation(100,400);
			event7 e7 = new event7();
			createideas.addActionListener(e7);
			panel.add(createideas);

			menu = new JButton("Main Menu");
			menu.setSize(100,50);
			menu.setLocation(250,500);
			event6 e6 = new event6();
			menu.addActionListener(e6);
			panel.add(menu);

			printideas = new JButton("Print Ideas");
			printideas.setSize(100,50);
			printideas.setLocation(350,400);
			event23 e23 = new event23();
			printideas.addActionListener(e23);
			panel.add(printideas);
			
		}
	}
	//Hash search for student
	//searches the hash for the desired student
	public class event11 implements ActionListener {
		public void actionPerformed(ActionEvent e11){
			label.setText("");
			int ssnInt = Integer.parseInt(ssn.getText());
			student = main.hash.lookUp(ssnInt);
			panel.remove(bstsearch);
			panel.remove(hashsearch);
			panel.remove(ssn);
			panel.remove(studnum);
			panel.remove(menu1);
			panel.repaint();
			panel.revalidate();

			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			studentlabel = new JLabel("Student");
			studentlabel.setLocation(100,180);
			studentlabel.setSize(400,30);
			
						
			createideas = new JButton("Create Ideas");
			createideas.setSize(100,50);
			createideas.setLocation(150,400);
			event7 e7 = new event7();
			createideas.addActionListener(e7);
			panel.add(createideas);

			menu = new JButton("Main Menu");
			menu.setSize(100,50);
			menu.setLocation(250,500);
			event6 e6 = new event6();
			menu.addActionListener(e6);
			panel.add(menu);


			printideas = new JButton("Print Ideas");
			printideas.setSize(100,50);
			printideas.setLocation(350,400);
			event23 e23 = new event23();
			printideas.addActionListener(e23);
			panel.add(printideas);
		}
		
	}
	//administrator student look up
	//same as the student side, just through the administrator side.
	public class event12 implements ActionListener {
		public void actionPerformed(ActionEvent e12){
			label.setText("Enter either student number or SSN and press the correct button.");
			label.setLocation(100,200);
			label.setSize(500,30);
			panel.remove(rateidea);
			panel.remove(studlookup);
			panel.remove(menu4);
			panel.remove(bestidea);
			panel.remove(sellidea);
			panel.repaint();
			panel.remove(traverse);
			panel.revalidate();
			
			bstsearch = new JButton("Go");
			bstsearch.setSize(100,30);
			bstsearch.setLocation(430,280);
			event20 e20 = new event20();
			bstsearch.addActionListener(e20);
			panel.add(bstsearch);
			hashsearch = new JButton("Go");
			hashsearch.setSize(100,30);
			hashsearch.setLocation(430,250);
			event21 e21 = new event21();
			hashsearch.addActionListener(e21);
			panel.add(hashsearch);
			ssn = new JTextField("Enter ssn.");
			ssn.setSize(250,30);
			ssn.setLocation(180,250);
			panel.add(ssn);
			studnum = new JTextField("Enter student number.");
			studnum.setSize(250,30);
			studnum.setLocation(180,280);
			panel.add(studnum);
			event13 e13 = new event13();
			menu1 = new JButton("Menu");
			menu1.setSize(100,50);
			menu1.setLocation(250,500);
			menu1.addActionListener(e13);

			panel.add(menu1);
			
		}
	}
	//reverts back to the main menu from student look up
	public class event13 implements ActionListener {
		public void actionPerformed(ActionEvent e13){
			label.setText("Com 212 Final Project GUI");
			label.setSize(200,50);
			label.setLocation(222,250);
			panel.remove(bstsearch);
			panel.remove(studnum);
			panel.remove(ssn);
			panel.remove(menu1);
			panel.remove(hashsearch);
			panel.remove(modify2);
			panel.remove(elogin);
			panel.remove(modify1);
			panel.remove(password);
			panel.remove(menu1);
			panel.remove(ssn);
			panel.remove(studnum);
			panel.repaint();
			panel.revalidate();
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	//exit button, closes window and saves all changes in information
	public class event14 implements ActionListener {
		public void actionPerformed(ActionEvent e14){
			main.closeDown();

			System.exit(0);
			
		}
	}
	//implements an entirely new system and starts up the main interface.
	public class event15 implements ActionListener {
		public void actionPerformed(ActionEvent e15){
			main.newSystem();
			System.out.println("NEW SYSTEM");
			panel.remove(newsystem);
			panel.remove(oldsystem);
			panel.repaint();
			panel.revalidate();
			studbutton = new JButton("Student");
			userbutton = new JButton("Administrator");
			studbutton.setLocation(150,350);
			userbutton.setLocation(350,350);
			studbutton.setSize(100,50);
			userbutton.setSize(100,50);
			exit = new JButton("Exit");
			exit.setLocation(520,0);
			exit.setSize(80,30);
			event14 e14 = new event14();
			exit.addActionListener(e14);
			panel.add(exit);
			ListenForButton lforbutton = new ListenForButton();
			studbutton.addActionListener(lforbutton);
			ListenForButton1 lforbutton1 = new ListenForButton1();
			userbutton.addActionListener(lforbutton1);
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	//implements an old system with all of the stored information and starts up main interface.
	public class event16 implements ActionListener {
		public void actionPerformed(ActionEvent e16){
			main.loadSystem();
			System.out.println("LOADED SYSTEM");
			panel.remove(newsystem);
			panel.remove(oldsystem);
			panel.repaint();
			panel.revalidate();
			studbutton = new JButton("Student");
			userbutton = new JButton("Administrator");
			studbutton.setLocation(150,350);
			userbutton.setLocation(350,350);
			studbutton.setSize(100,50);
			userbutton.setSize(100,50);
			exit = new JButton("Exit");
			exit.setLocation(520,0);
			exit.setSize(80,30);
			event14 e14 = new event14();
			exit.addActionListener(e14);
			panel.add(exit);
			ListenForButton lforbutton = new ListenForButton();
			studbutton.addActionListener(lforbutton);
			ListenForButton1 lforbutton1 = new ListenForButton1();
			userbutton.addActionListener(lforbutton1);
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	
	//takes in idea string and adds it to the waiting list, then brings student back to menu
	public class event17 implements ActionListener {
		public void actionPerformed(ActionEvent e17){
			student.newIdea(ideatext.getText(),main.waiting);
			main.waiting.printQueue();
			label.setText("");
			panel.remove(ideatext);
			panel.remove(back);
			panel.remove(enter);
			panel.repaint();
			panel.revalidate();
			panel.add(menu);
			panel.add(createideas);
			panel.add(printideas);

			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			studentlabel = new JLabel("Student");
			studentlabel.setLocation(100,180);
			studentlabel.setSize(400,30);

			
		}
	}
	//rate ideas interface: does not change anything within code
	public class event18 implements ActionListener {
		public void actionPerformed(ActionEvent e18){
			if (main.waiting.isEmpty() == true){
				System.out.println("There is nothing to rate");
			}

			else {
				panel.remove(studlookup);
				panel.remove(rateidea);
				panel.remove(sellidea);
				panel.remove(bestidea);
				panel.remove(traverse);
				label.setText("");
				panel.repaint();
				panel.revalidate();

				Idea idea = main.waiting.front();
				String textidea = idea.getText();
				label.setText(textidea);
				label.setSize(400,30);
				label.setLocation(250,200);
				panel.add(label);
				idearate = new JTextField("Rate idea 1-100",15);
				idearate.setSize(150,30);
				idearate.setLocation(250,300);
				panel.add(idearate);
				updaterate = new JButton("Rate");
				updaterate.setSize(100,30);
				updaterate.setLocation(350,330);
				event19 e19 = new event19();
				updaterate.addActionListener(e19);
				panel.add(updaterate);
			}
			
			
			
			
			
		}
	}
	//updates the ideas, moves the idea from the idea waiting queue and inputs it into
	//the students profile
	public class event19 implements ActionListener {
		public void actionPerformed(ActionEvent e19){	

			int rating = Integer.parseInt(idearate.getText());
			main.waiting.rateIdea(main.hash,  main.bst,  main.heap,  rating);
			label.setText("Welcome Administrator. What would you like to do?");
			label.setLocation(150,200);
			panel.remove(idearate);
			panel.remove(updaterate);
			panel.repaint();
			panel.revalidate();
			panel.add(bestidea);
			panel.add(sellidea);
			panel.add(traverse);
			panel.add(studlookup);
			panel.add(rateidea);
		}
	}
	// administrator student look up via SSN + BST
	//main administrator interface
	public class event20 implements ActionListener {
		public void actionPerformed(ActionEvent e20){	
			label.setText("");
			int student_num = Integer.parseInt(studnum.getText());
			student = main.bst.search(student_num);
			
			panel.remove(bstsearch);
			panel.remove(hashsearch);
			panel.remove(ssn);
			panel.remove(studnum);
			panel.remove(menu1);
			panel.remove(menu4);
			panel.repaint();
			panel.revalidate();

			label.setText("Administrator");
			studentlabel = new JLabel("Student");
			studentlabel.setSize(400,30);
			studentlabel.setLocation(50,200);
			panel.add(studentlabel);
			label.setLocation(500,50);
			namelabel = new JLabel();
			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,220);
			panel.add(namelabel);
			studnumlabel = new JLabel();
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,310);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel = new JLabel();
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,280);
			panel.add(ssnlabel);
			emaillabel = new JLabel();
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,250);
			panel.add(emaillabel);
			student.updateAverage();
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());


			averageidea.setLocation(100,340);
			averageidea.setSize(400,30);
			panel.add(averageidea);


			traverse = new JButton("traverse");
			traverse.setToolTipText("Prints the list of students by student number");
			traverse.setSize(100,50);
			traverse.setLocation(250,400);
			event22 e22 = new event22();
			traverse.addActionListener(e22);
			panel.add(traverse);

			delete = new JButton("Delete");
			delete.setSize(100,50);
			delete.setLocation(350,400);
			event27 e27 = new event27();
			delete.addActionListener(e27);
			panel.add(delete);

			modify = new JButton("Modify");
			modify.setSize(100,50);
			modify.setLocation(150,400);
			event28 e28 = new event28();
			modify.addActionListener(e28);
			panel.add(modify);
			
						
			menu = new JButton("Main Menu");
			menu.setSize(100,50);
			menu.setLocation(250,500);
			
			event6 e6 = new event6();
			menu.addActionListener(e6);
			panel.add(menu);

		}
	}
	//Administrator Student lookup via Hash table + Student Number
	//allows the administrator to access and manipulate student's profiles
	public class event21 implements ActionListener {
		public void actionPerformed(ActionEvent e21){	
			label.setText("");
			int ssnInt = Integer.parseInt(ssn.getText());
			student = main.hash.lookUp(ssnInt);

			panel.remove(bstsearch);
			panel.remove(hashsearch);
			panel.remove(ssn);
			panel.remove(studnum);
			panel.remove(menu1);
			panel.remove(menu4);
			panel.repaint();
			panel.revalidate();


			//the code below determines and prints the info of the student in the GUI
			label.setText("Administrator");
			studentlabel = new JLabel("Student");
			studentlabel.setSize(400,30);
			studentlabel.setLocation(50,100);
			panel.add(studentlabel);
			label.setLocation(500,50);
			namelabel = new JLabel();
			namelabel.setText("Last Name: " + student.getLastName());
			namelabel.setSize(400,30);
			namelabel.setLocation(100,120);
			panel.add(namelabel);
			studnumlabel = new JLabel();
			studnumlabel.setText("Student Number: " + student.getStudentNum());
			studnumlabel.setLocation(100,210);
			studnumlabel.setSize(400,30);
			panel.add(studnumlabel);
			ssnlabel = new JLabel();
			ssnlabel.setText("SSN: " + student.getSSN());
			ssnlabel.setSize(400,30);
			ssnlabel.setLocation(100,180);
			panel.add(ssnlabel);
			emaillabel = new JLabel();
			emaillabel.setText("Email: " + student.getLogin());
			emaillabel.setSize(400,30);
			emaillabel.setLocation(100,150);
			panel.add(emaillabel);
			averageidea = new JLabel("Average Idea rating: " + student.getAverage());
			averageidea.setLocation(100,240);
			averageidea.setSize(400,30);
			panel.add(averageidea);
			
			traverse = new JButton("Traverse");
			traverse.setToolTipText("Prints the list of students by student number");
			traverse.setSize(100,50);
			traverse.setLocation(250,400);
			event22 e22 = new event22();
			traverse.addActionListener(e22);
			panel.add(traverse);

			delete = new JButton("Delete");
			delete.setSize(100,50);
			delete.setLocation(350,400);
			event27 e27 = new event27();
			delete.addActionListener(e27);
			panel.add(delete);

			modify = new JButton("Modify");
			modify.setSize(100,50);
			modify.setLocation(150,400);
			event28 e28 = new event28();
			modify.addActionListener(e28);
			panel.add(modify);			

			menu = new JButton("Main Menu");
			menu.setSize(100,50);
			menu.setLocation(250,500);
			
			event6 e6 = new event6();
			menu.addActionListener(e6);
			panel.add(menu);

		}
	}
	//prints out the tree of students by student number
	public class event22 implements ActionListener {
		public void actionPerformed(ActionEvent e22){
		main.bst.traverse();	

		}
	}
	//prints out the past 10 ideas from a student in the terminal
	public class event23 implements ActionListener {
		public void actionPerformed(ActionEvent e23){
			student.returnIdeas();
		}
	}
	//reverts back to the main menu. This class is only used in certain situations
	public class event24 implements ActionListener {
		public void actionPerformed(ActionEvent e24){
			panel.remove(newstud);
			panel.remove(oldstud);
			panel.remove(menu2);
			panel.repaint();
			panel.revalidate();
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	//reverts back to the main menu. This class is only used in certain situations
	public class event25 implements ActionListener {
		public void actionPerformed(ActionEvent e25){
			panel.remove(namelabel);
			panel.remove(lname);
			panel.remove(emaillabel);
			panel.remove(elogin);
			panel.remove(ssnlabel);
			panel.remove(ssn);
			panel.remove(studnumlabel);
			panel.remove(studnum);
			panel.remove(go);
			panel.remove(menu3);
			panel.remove(rateidea);
			panel.repaint();
			panel.revalidate();
			panel.add(userbutton);
			panel.add(studbutton);
		}
	}
	//returns the program to the main menu
	public class event26 implements ActionListener {
		public void actionPerformed(ActionEvent e26){
			panel.remove(rateidea);
			panel.remove(traverse);
			panel.remove(studlookup);
			panel.remove(updaterate);
			panel.remove(idearate);
			panel.remove(bestidea);
			panel.remove(sellidea);
			panel.remove(menu4);
			panel.repaint();
			panel.revalidate();
			panel.add(userbutton);
			panel.add(studbutton);
			label.setText("Com 212 Final Project GUI");
			label.setLocation(222,250);
		}
	}
	//returns the administrator to its main interface
	public class event27 implements ActionListener {
		public void actionPerformed(ActionEvent e27){
			main.bst.delete(student);
			main.hash.delete(student.getSSN());
			panel.remove(delete);
			panel.remove(modify);
			panel.remove(traverse);
			panel.remove(namelabel);
			panel.remove(printideas);
			panel.remove(studnumlabel);
			panel.remove(averageidea);
			panel.remove(emaillabel);
			panel.remove(ssnlabel);
			panel.remove(traverse);
			panel.remove(studentlabel);
			panel.repaint();
			panel.revalidate();
			panel.add(traverse);
			panel.add(rateidea);
			panel.add(studlookup);
		}
	}
	//this class allows the administrator to change the students last name
	public class event28 implements ActionListener {
		public void actionPerformed(ActionEvent e28){

			panel.remove(modify);
			panel.remove(delete);
			panel.remove(modify);
			panel.remove(traverse);
			panel.remove(namelabel);
			panel.remove(printideas);
			panel.remove(studnumlabel);
			panel.remove(averageidea);
			panel.remove(emaillabel);
			panel.remove(ssnlabel);
			panel.remove(traverse);
			panel.remove(studentlabel);
			panel.repaint();
			panel.revalidate();

			password = new JTextField("",50);


			label = new JLabel("");
			label.setText("Current Student Name: " + student.getLastName());
			label.setLocation(250,250);
			label.setSize(200,30);
			elogin = new JTextField("Change Email");
			elogin.setSize(120,30);
			elogin.setLocation(250,350);
			panel.add(elogin);
			panel.add(label);
			password.setText("Change Name");
			password.setSize(120,30);
			password.setLocation(250,300);
			panel.add(password);
			modify1 = new JButton("Modify");
			modify1.setToolTipText("Click me if you want to change a student's Name!");
			modify1.setSize(100,30);
			modify1.setLocation(380,300);
			panel.add(modify1);
			event29 e29 = new event29();
			modify1.addActionListener(e29);
			modify2 = new JButton("Modify");
			modify2.setToolTipText("Click me if you want to change the students Email!");
			modify2.setSize(100,30);
			modify2.setLocation(380,350);
			event30 e30 = new event30();
			modify2.addActionListener(e30);
			panel.add(modify2);
;
		}
	}
	public class event29 implements ActionListener {
		public void actionPerformed(ActionEvent e29){
			String text = password.getText();
			student.setLastName(text);
			student = main.bst.search(student.getStudentNum());
			student.setLastName(text);
			panel.remove(modify1);
			panel.remove(elogin);
			panel.remove(modify2);
			panel.remove(password);
			panel.repaint();
			panel.revalidate();
			System.out.println(student.getLastName());
			panel.add(rateidea);
			rateidea.setLocation(380,300);
			traverse = new JButton("Print all students");
			traverse.setLocation(230,300);
			traverse.setSize(150,50);
			event22 e22 = new event22();
			traverse.addActionListener(e22);
			panel.add(traverse);
			studlookup.setLocation(80,300);
			panel.add(studlookup);
			label.setText("Welcome Administrator. What would you like to do?");
			label.setSize(400,30);
			label.setLocation(150,200);
			panel.add(label);
		}
	}
	public class event30 implements ActionListener {
		public void actionPerformed(ActionEvent e30){
			String text = elogin.getText();
			student.setLogin(text);
			student = main.bst.search(student.getStudentNum());
			student.setLogin(text);
			panel.remove(modify1);
			panel.remove(modify2);
			panel.remove(elogin);
			panel.remove(password);
			panel.repaint();
			panel.revalidate();
			System.out.println(student.getLastName());
			panel.add(rateidea);
			rateidea.setLocation(380,300);
			traverse = new JButton("Print all students");
			traverse.setLocation(230,300);
			traverse.setSize(150,50);
			event22 e22 = new event22();
			traverse.addActionListener(e22);
			panel.add(traverse);
			studlookup.setLocation(80,300);
			panel.add(studlookup);
			label.setText("Welcome Administrator. What would you like to do?");
			label.setSize(400,30);
			label.setLocation(100,200);
			panel.add(label);
		}
	}

	public class event31 implements ActionListener {
		public void actionPerformed(ActionEvent e31){
			Idea temp = main.heap.deleteMin();
			if (temp != null){
				System.out.println(temp.getText());
			}
		}

	}

	public class event32 implements ActionListener{
		public void actionPerformed(ActionEvent e32){
			Idea temp = main.heap.front();
			
			if (temp != null){	
				System.out.println(temp.getText());
			}
		}
	}




}



	
			// TODO Auto-generated method stub
			
		
	
	


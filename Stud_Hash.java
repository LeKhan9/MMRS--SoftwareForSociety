/*
* Mohammad Khan Conn Coll First Year, Rodrigo Rogel-Perez Conn Coll First Year 
* Matt Burns Conn Coll Second Year, Scott Woods Conn Coll Second Year 
*	( 4/24/14 - 5/6/14 ) Data Structures Final Project
*
*  Hashtable to give key to students (and ideas) for another method of retrieval
*/

import java.io.Serializable;

public class Stud_Hash implements Serializable {
    private int n;
    private Student hash[];
    private Student backup[];
    private Student temp[];
    private int count[];
    private int size = 25;

    //hash constructor- two arrays- one for students, other for counts
    public Stud_Hash() {
        n = 0;
        hash = new Student[size];
        count = new int[size];
        for (int i = 0; i < size; i++) {
            count[i] = 0;
        }
    }

    //looks up nodes in array by key
    public Student lookUp(int ssn) {
        int hash_index = ssn % size;
        if (hash[hash_index] == null && count[hash_index] == 0) {
            System.out.println("NOT FOUND");
            return null;
        }
        else {
            int index_count = count[hash_index];
            int counter = 0;
            while (counter <= index_count) {
                if (hash[hash_index] == null) {
                    hash_index = (hash_index + 7) % size;
                    counter++;
                }
                else if (hash[hash_index].getSSN() == ssn) {
                    System.out.println(hash[hash_index].getSSN());
                    return hash[hash_index];
                }
                else {
                    hash_index = (hash_index + 7) % size;
                    counter++;
                }
            }
        }
        System.out.println("NOT FOUND!");
        return null;
    }

    //insert new node into hash table
    public void insert(Student x) {
        if (n == size) {
            System.out.println("FULL- REHASH!");
            reHash();
            insert(x);
        }
        else {
            int hash_index = x.getSSN() % size;
            if (hash[hash_index] ==  null) {
                hash[hash_index] = x;
                n++;
            }
            else {
                int hash_index2 = hash_index;
                int counter = 0;
                while (hash[hash_index2] != null) {
                    hash_index2 = (hash_index2 + 7) % size;
                    counter++;
                }
                hash[hash_index2] = x;
                if (counter > count[hash_index])
                    count[hash_index] = counter;
                n++;                
            }
        }
    }
    
    //delete desired node from hash table
    public void delete(int ssn) {
        int hash_index = ssn % size;
        if (hash[hash_index] == null && count[hash_index] == 0) {
            System.out.println("NOT FOUND");
        }
        else {
            int index_count = count[hash_index];
            int counter = 0;
            int temp = hash_index;
            while (counter <= index_count) {
                if (hash[temp] == null) {
                    temp = (temp + 7) % size;
                    counter++;
                }
                else if (hash[temp].getSSN() == ssn) {
                    hash[temp] = null;
                    n--;
                    if (counter == index_count && counter != 0)
                        count[hash_index]--;
                    break;
                }
                else {
                    temp = (temp + 7) % size;
                    counter++;
                }
            }
            if (counter > index_count)
                System.out.println("NOT FOUND!");
        }
    }
    
    public void reHash() {
		size = size*2;
		n = 0;
		Student[] backup = new Student[size];
		Student[] temp_hash = hash;
		int[] newcount = new int[size];
		count = newcount;
		hash = backup;
		for (int i=0; i<(size/2); i++) {
			System.out.println("rehashed");
			Student temp = temp_hash[i];
			insert(temp);
		}
	}
    
    //checks if hash table is empty or not
    public boolean isEmptyHash() {
        return n == 0;
    }
    
    //prints both hash table and count array
    public void printHash() {

        int index = 0;
        System.out.println("NODE ARRAY");
        for (int i = 0; i < size; i++) {
            if (hash[i] != null) 
                System.out.print(i + ": " + hash[i].getSSN() + " ");
            else
                System.out.print(i + ": " + hash[i] + " ");
        }
        System.out.println();
        System.out.println("COUNT ARRAY");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":" + count[i] + " ");
        }
        System.out.println();
    }
}

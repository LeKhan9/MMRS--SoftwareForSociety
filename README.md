MMRS--SoftwareForSociety
========================

04/29/14 - 05/06/14

Data Structures Final Project: Think Tank Software that Rates Ideas on Solving Societal Issues

Team: Mohammad Khan '17, Matt Burns '16, Rodrigo Rogel-Perez '17, Scott Woods '16 (MMRS)

The notion is that users will create Ideas tackling world issues and the best Ideas will be picked out from the database. Thus, not only the best Idea is found, but also the best user is found for employment. Essentially a bidding system. The database takes in Ideas from individuals, the ideas are rated, and the highest rated Idea will be bidded (the actual bidding has not yet been coded). A Graphical User Interface (GUI) is employed to make entering and reading information easier. There are two profiles - Student (or normal User) and Administrator. 

  To start the program , the file gui1.java should be run first. 

The program was made capable of being saved- thus any information entered was retrieved after closing the GUI and rebooting it through Terminal. To do this Serializable was used to store information to memory:          
            
                  -http://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html - 

Essentially each information input was converted to pure, basic byte form and written into a file. A process of De-Serialization was used to decode the byte information and reinstate the original data in the memory.

OBJECTS: 

Each student record includes:
1) last name
2) email login
3) four digit SSN 
4) four digit ID 
5) last 10 ideas
6) an average of the ratings oflast 10 ideas

Ideas are composed of:
1) Idea number
2) user's SSN
3) Idea description (at least 20 characters)
4) rating

Email Logins and Last Names can be modified by the user and even the whole record can be deleted by the user.New records and new Ideas can also be added by the user. Score/ Rating ranges from 0-100. Only the last 10 Ideas are kept for each student profile in the user queue, but these are still stored in the larger database. 

The Students SSN can be used by the Administrator to access a record by average less than O(n) time.
The best Idea is accessible in constant time. 
Adding new Ideas or deleting the best one (when bidding is completed) is done in O(lg n) time.
Using the Student ID, the Student's email login can be retrieved in O(n) average time on average.

BST, Heaps, Queues(Heap), and Hashtables are utilized for these conditions. 







Author: Nthabiseng Mashiane - mshnth009
	Lerato Mosegedi - msgler001
Date: 3 April 2014
Description: The code reads in information from a text file and then stores this information 
	     in a hashtable and retrieves specific data upon request via the interface,depending on whether it is present in the hashtable or not.
Instructions: 1.Run the program(Dispay.java)
	      2.Enter input upon request from program
List of files: HashTable.java, picture.txt, Display.java, all pictures that were given in the capetown folder 

Answers to part6

1. We used linear probing because: Insertion is fast
				   Searching for an element is fast
				   The size of the input isn't high therefore cahnces of primary clustering are low

2. No.In this case, the hashtable is small and has less than 10 elements so it is very
   unlikely that collisions may occurr. Even if they occurr, linear probing would be 
   efficient enough to resolve these collisions. Furthermore, a hybrid hashing alogorithm
   would work better in a situation where there is a lot of data and collisions are likely 
   to happen.

3.For each picture, count the number of collisions and store then under a variable, say x. When the file is not found dureing the search and the hashkey=current index, x = x+1. 

4.No, because there were no overflows and the load factor was always<0.5, linear probing
  was enough to deal with the collisions

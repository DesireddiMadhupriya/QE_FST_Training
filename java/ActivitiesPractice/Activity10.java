package ActivitiesPractice;
import java.util.HashSet;

public class Activity10 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	   hs.add("Apple");
       hs.add("Banana");
       hs.add("Cherry");
       hs.add("Date");
       hs.add("Elderberry");
       hs.add("Fig");

       // Print the size of the HashSet
       System.out.println("Initial size of HashSet: " + hs.size());

       // Remove an element
       
       System.out.println("Removed 'Cherry' from HashSet." + hs.remove("Cherry"));

       // Try to remove an element that is not present
       boolean removed = hs.remove("Grapes");
       System.out.println("Attempted to remove 'Grapes': " + (removed ? "Success" : "Not found"));
            // Check if an item is in the HashSet
      
       System.out.println("Does the HashSet contain 'Apple'? " + hs.contains("Apple"));

       // Print the updated HashSet
       System.out.println("Updated HashSet: " + hs);
 }

}

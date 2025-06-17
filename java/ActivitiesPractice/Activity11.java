package ActivitiesPractice;
import java.util.Map;
import java.util.HashMap;
public class Activity11 {
    public static void main(String[] args) {
    	 Map<Integer, String> colours = new HashMap<>();

         // Add 5 random colours to the Map
         colours.put(1, "Red");
         colours.put(2, "Blue");
         colours.put(3, "Green");
         colours.put(4, "Yellow");
         colours.put(5, "Purple");

         // Print the Map
         System.out.println("Initial Map: " + colours);

         // Remove one colour using remove() method
         
         System.out.println("Map after removing key 4: " + colours.remove(4));

         // Check if "Green" exists using containsValue()
        
         System.out.println("Does the Map contain 'Green'? " + colours.containsValue("Green"));

         // Print the size of the Map
         System.out.println("Size of the Map: " + colours.size());
         
   
        

      }
}

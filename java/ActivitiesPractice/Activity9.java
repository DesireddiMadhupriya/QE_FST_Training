package ActivitiesPractice;

import java.util.ArrayList;
import java.util.*;
public class Activity9 {
	public static void main(String[] args) {
    List<String> arrList = new ArrayList<>();
       arrList.add("Madhupriya Reddy");
       arrList.add("Sruthi Reddy");
       arrList.add("Bhaskar Reddy");
       arrList.add("Arunamma");
       arrList.add("Santhosh Kumar Reddy");
       
      //print names
       System.out.println("the items in the list are:");
       for(String item: arrList) {
    	   System.out.println(item);
       }
     
       System.out.println("The third item is" + arrList.get(2));
       // size of the list
       System.out.println("items before removimg" + arrList.size());
       //remove a name 
       System.out.println("values removed is: " + arrList.remove(2));
       //alternate remove
       System.out.println("Is value removed" +arrList.remove("Arunamma"));
       //print the size of the list
       System.out.println("size of list after removing " + arrList.size());

	}
}

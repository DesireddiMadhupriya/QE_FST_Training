package ActivitiesPractice;


interface Addable {
    int add(int num1, int num2);
}
public class Activity12 {
	public static void main(String[] args) {
        // Lambda expression without body (single-line expression)
        Addable ad1 = (num1, num2) -> num1 + num2;
          System.out.println(ad1.add(10,20));
          
          
        // Lambda expression with a body (multi-line block)
        Addable ad2 = (num1, num2) -> {
          int sum=num1 + num2;
          return sum;
           
        };
        System.out.println(ad2.add(20, 39));
      
    }
	
}
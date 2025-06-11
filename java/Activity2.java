package ActivitiesPractice;

public class Activity2 {

	public static void main(String[] args) {
        // Initialize the array with 6 numbers
        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sumOfTens = 0;

        for (int num : numbers) {
            if (num == 10) {
                sumOfTens += num;
            }
        }

       
        boolean result = (sumOfTens == 30);

        
        System.out.println(result);
    }
}

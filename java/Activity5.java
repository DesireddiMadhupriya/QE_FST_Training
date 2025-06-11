package ActivitiesPractice;
 abstract class Book{
	 String title;
	 public abstract void setTitle(String title);
	 public String getTitle(){
	 return title;
   }
 }
 class MyBook extends Book{
	 @Override
	 public void setTitle(String title) {
		 if(title != null && !title.isEmpty()) {
			 this.title=title;
		 }
	 }
 }



public class Activity5 {
	public static void main(String[] args) {
		Book B1= new MyBook();
		B1.setTitle("I dont love anymore");
		System.out.println("Book added is: " + B1.getTitle());
		
	}
  
}

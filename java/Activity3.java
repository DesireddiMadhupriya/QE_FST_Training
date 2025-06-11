package ActivitiesPractice;

public class Activity3 {
	 
   public static void main(String[] args)
   {
	   
	   double seconds=1000000000;
       double EarthSeconds = 31557600;
       double MercurySeconds = 0.2408467;
       double VenusSeconds = 0.61519726;
       double MarsSeconds = 1.8808158;
       double JupiterSeconds = 11.862615;
       double SaturnSeconds = 29.447498;
       double UranusSeconds = 84.016846;
       double NeptuneSeconds = 164.79132;
       System.out.println("Age of a person on thge earth: "  +  seconds/EarthSeconds + "Years");
       System.out.println("Age of a person on the Mercury: " +  seconds/EarthSeconds/MercurySeconds + " Years");
       System.out.println("Age of person on the Venus: "  +  seconds/EarthSeconds/VenusSeconds + " Years");
       System.out.println("Age of person on the mars: "  +  seconds/EarthSeconds/MarsSeconds + " Years");
       System.out.println("Age of person on the Jupiter: "   +  seconds/EarthSeconds/JupiterSeconds + " Years");
       System.out.println("Age of person on the Saturn: " +  seconds/EarthSeconds/SaturnSeconds + " Years");
       System.out.println("Age of person on the Uranus: "  +  seconds/EarthSeconds/UranusSeconds + " Years");
       System.out.println("Age of person on the Neptune: "  +  seconds/EarthSeconds/NeptuneSeconds + " Years");
       
       

   }

}

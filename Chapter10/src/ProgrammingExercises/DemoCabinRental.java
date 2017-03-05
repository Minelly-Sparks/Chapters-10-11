package ProgrammingExercises;
public class DemoCabinRental {
  public static void main(String[] args) {
		CabinRental cabin1 = new CabinRental(1);
		HollidayCabinRental cabin2 = new HollidayCabinRental(1, 1234);
		
		System.out.println("cabin1");
		System.out.println(" Cabin number: " + cabin1.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin1.getWeeklyRate());
		System.out.println();
		
		System.out.println("cabin2");
		System.out.println(" Cabin number: " + cabin2.getCabinNum());		
		System.out.println(" Cabin number: " + cabin2.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin2.getWeeklyRate());
		System.out.println();

	}  
}

package ProgrammingExercises;
public class HollidayCabinRental extends CabinRental{
    private int roomNum;
	
	HollidayCabinRental(int cabinNum, int room) {
		super(cabinNum);
		super.weeklyRate = super.getWeeklyRate() + 150;
		this.roomNum = room;
	}
	
	public int getRoomNum() {
		return this.roomNum;
	}
}

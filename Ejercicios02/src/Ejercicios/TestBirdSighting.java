package Ejercicios;
public class TestBirdSighting {
    
    public static void main(String[] args){
        BirdSighting memorie = new BirdSighting();
	System.out.println("Bird Species:  " + memorie.getBirdSeen());
	System.out.println("Number Seen:  " + memorie.getNumberSeen());
	memorie.getDateSeen();
	System.out.println("Day Of Year Seen:  " + memorie.getDateSeen());
        
	BirdSighting memorie2 = new BirdSighting("Blue Jay", 6, 2017, 6, 20);
	System.out.println("Bird Species:  " + memorie2.getBirdSeen());
	System.out.println("Number Seen:  " + memorie2.getNumberSeen());
	memorie2.getDateSeen();
	System.out.println("Day Of Year Seen:  " + memorie2.getDateSeen());
			}
    
}

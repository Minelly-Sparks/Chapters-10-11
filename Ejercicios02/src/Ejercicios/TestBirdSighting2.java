package Ejercicios;
public class TestBirdSighting2 {
   
    public static void main(String[] args) {
        
        BirdSighting2 memorie3 = new BirdSighting2(2015, 6, 1);
        System.out.println("Bird Species:  " + memorie3.getBirdSeen());
        System.out.println("Number Seen:  " + memorie3.getNumberSeen());
        memorie3.getDateSeen();
        System.out.println("Day Of Year Seen:  " + memorie3.getDateSeen());

    }
    

}

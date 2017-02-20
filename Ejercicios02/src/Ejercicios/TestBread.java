package Ejercicios;
public class TestBread {
    public static void main(String[] args) {
        Bread pan = new Bread("Wheat", 247);
        Bread pan2 = new Bread("White", 265);
        Bread pan3 = new Bread("Sourdough", 96);
        
	System.out.println(Bread.MOTTO);
	System.out.println("Bread test001 Bread Type: " + pan.getBreadType());
	System.out.println("Bread test001 Bread Calories:  " + pan.getBreadCalories());
	System.out.println();
	System.out.println(Bread.MOTTO);
	System.out.println("Bread test002 Bread Type: " + pan2.getBreadType());
	System.out.println("Bread test002 Bread Calories:  " + pan2.getBreadCalories());
	System.out.println();
	System.out.println(Bread.MOTTO);
	System.out.println("Bread test003 Bread Type: " + pan3.getBreadType());
	System.out.println("Bread test003 Bread Calories:  " + pan3.getBreadCalories());
    }
}

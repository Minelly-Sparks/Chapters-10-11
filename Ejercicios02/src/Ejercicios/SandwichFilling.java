package Ejercicios;
public class SandwichFilling {
    private String typeFilling;
    private int fillingCalories;
 
    public SandwichFilling(String filling, int cals){
	this.typeFilling = filling;
	this.fillingCalories = cals;
    
    }
    
    public String getTypeFilling(){
        return typeFilling;
    }
		
    public int getFillingCalories(){
        return fillingCalories;
    }
    
}

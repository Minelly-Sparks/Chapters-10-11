package Ejercicios;
public class Bread {
    private String BreadType;
    private int BreadCalories;
    public final static String MOTTO = "The Staff Of Life";
    public Bread(String type, int calories){
        
	this.BreadType = type;
	this.BreadCalories = calories;
    }
    
    public String getBreadType(){
        return BreadType;
    }
    public int getBreadCalories(){
	return BreadCalories;}
}

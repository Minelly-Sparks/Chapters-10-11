package GameZone;
import java.util.Random;
public class Die {
    private Integer numerito;
    
    public Die(){
        lanzar();    
    }
    public void lanzar(){
        Random rm = new Random();
        int numerito=rm.nextInt(6)+1;     
    }
    public Integer getNumerito(){
        return numerito;
    }        
   
}


package GameZone;
import java.util.Random;
public class Die {
    private Integer numerito;
  
    public Integer getNumerito(){
        return numerito;
    }        
   public static void mostrar(){
       Integer num=((int)(Math.random()*100 %6+1));
       System.out.println(num);
   }
}


package Ejercicios;
import Ejercicios.Enum.Blood;
import Ejercicios.Enum.RhFactor;
public class TestBloodData {
     public static void main(String[] args) {
      BloodData blood1 = new BloodData();
      BloodData blood2=new BloodData(Blood.A,RhFactor.POSITIVO);
      
      System.out.println(blood1.getTipo()+" "+blood1.getRh());
      System.out.println(blood2.getRh()+" "+blood2.getTipo());
    }
}


package Ejercicios;
import Ejercicios.Enum.Blood;
import Ejercicios.Enum.RhFactor;
public class TestPatient {
    
    public static void main(String[] args) {
        
        BloodData blood=new BloodData(Blood.O,RhFactor.POSITIVO);
        Patient patient=new Patient("159",19,blood);
        System.out.println(blood.getTipo());
        System.out.println(patient.getSangre().getTipo());
        blood.setTipo(Blood.O);
        System.out.println(patient.getSangre().getTipo());
    }
}

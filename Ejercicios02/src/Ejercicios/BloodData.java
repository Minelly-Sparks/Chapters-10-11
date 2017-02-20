package Ejercicios; 
import Ejercicios.Enum.Blood;
import Ejercicios.Enum.RhFactor;
public class BloodData {
    private Blood tipo;
    private RhFactor rh;
    
    public BloodData(){
        tipo=Blood.O;
        rh=RhFactor.POSITIVO;
    }
    
    public BloodData (Blood t, RhFactor rh){
        this.tipo=t;
        this.rh=rh;
        
    }

    public Blood getTipo() {
        return tipo;
    }

    public void setTipo(Blood tipo) {
        this.tipo = tipo;
    }

    public RhFactor getRh() {
        return rh;
    }

    public void setRh(RhFactor rh) {
        this.rh = rh;
    }
    
}


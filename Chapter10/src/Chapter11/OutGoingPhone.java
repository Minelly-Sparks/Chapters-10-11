package Chapter11;
public class OutGoingPhone extends PhoneCall{
     private Integer tiempo;

    public OutGoingPhone(String numero) {
        super(numero);
         tiempo=tiempo*60;
        setTiempo(tiempo);
        super.setPrecio(0.04);
    }

    OutGoingPhone(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public void mensaje() {
        System.out.println("Phone number "+super.getNumero());
        System.out.println("Minute price "+super.getPrecio());
        System.out.println("Price for call "+getTiempo());
        System.out.println("The total is :"+super.getPrecio()*getTiempo());
        
    }
}

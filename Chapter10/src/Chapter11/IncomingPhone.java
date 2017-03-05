package Chapter11;
public abstract class IncomingPhone extends PhoneCall {

    public IncomingPhone(String numero) {
        super(numero);
        super.setPrecio(0.02);
    }
    

    public void mensaje() {
          System.out.println("numero telefonico "+super.getNumero());
        System.out.println("precio por minuto "+super.getPrecio());
        
    }
    
}

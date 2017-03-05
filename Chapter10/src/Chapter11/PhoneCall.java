package Chapter11;
public abstract class PhoneCall {
    private String number;
    Double price;

    public PhoneCall(String numero) {
        this.number = numero;
        this.price=0.00;
    }

    public String getNumero() {
        return number;
    }

    public Double getPrecio() {
        return price;
    }

    public void setPrecio(Double precio) {
        this.price = precio;
    }
    
    public abstract void mensaje();
      
   
}

package Chapter11;
public class Ford extends Auto{
    public Ford(String marca, Double precio) {
        super(marca,precio);
      
    }

    public void setPrice() {
      super.setPrice(589000.00);
         System.out.println("The cost is:"+getPrice());
    }
  
   
}

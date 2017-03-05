package Chapter11;
public class Chevy extends Auto{
    public Chevy(String mark, Double price) {
        super(mark, price);
}
    public void setPrice() {
         super.setPrice(22000.00);
         System.out.println("The cost is:"+getPrice());
    }
    
}

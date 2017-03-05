package Chapter11;
public abstract class Auto {

    private String Markers;
    private Double price;

    public Auto(String Mark,Double price) {
        this.Markers = Mark;
        this.price=price;
    }

    public void setMark(String Mark) {
        this.Markers = Mark;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMark() {
        return Markers ;
    }

    public Double getPrice() {
        return price;
    }
    
    public abstract void setPrice();
 
    
}



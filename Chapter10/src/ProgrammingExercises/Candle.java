package ProgrammingExercises;
public class Candle {
    private String Color;
    private double Height;
    private double Price;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
        this.Price = Height*2;
    }

    public double getPrice() {
        return Price;
    }
    
    
}

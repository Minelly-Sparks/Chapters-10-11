package Chapter11;
public abstract class Book {
    private String titulo;
    private Double price;

    public Book(String titulo, Double precio) {
        this.titulo = titulo;
        this.price = price;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return price;
    }
    
    public abstract Double setPrice();
    

}

package Chapter11;
public class UseBook {
    public static void main(String[] args) {

        Book libro1 = new Fiction("la persona", 0.00);
        System.out.println(libro1.setPrice());
        System.out.println(libro1.getTitulo());
        System.out.println();
        Book libro2 = new NonFiction("programacion", 0.00);
        System.out.println(libro2.setPrice());
        System.out.println(libro2.getTitulo());

    }
}

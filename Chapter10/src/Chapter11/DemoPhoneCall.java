package Chapter11;
public class DemoPhoneCall {
    public static void main(String[] args) {
        OutGoingPhone phone1 = new OutGoingPhone("9512222239",2);
        phone1.mensaje();
        System.out.println();
        IncomingPhone phone2 = new IncomingPhone("3398651072") {};
        phone2.mensaje();
    }
}

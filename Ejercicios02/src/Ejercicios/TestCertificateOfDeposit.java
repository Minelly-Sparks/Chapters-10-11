package Ejercicios;
import java.util.Scanner;
public class TestCertificateOfDeposit {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String lastname;
        lastname = teclado.nextLine();
        CertificateOfDeposit test001 = new CertificateOfDeposit(1269, "Minelly", 500000.00, 19, 2, 2017);			
        System.out.println("Certificate Number: " + test001.getCertificateNum());			
        System.out.println("Owner Last Name: " + lastname);
        System.out.println("Account Balance: " + test001.getAccountBalance());
        System.out.println("Issue Date: " + test001.getIssueDate());
        System.out.println("Maturity Date: " + test001.MaturityDateFinal());
    }
}

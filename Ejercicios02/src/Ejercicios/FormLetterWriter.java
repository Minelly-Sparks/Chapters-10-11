package Ejercicios;

    public class FormLetterWriter {
        private static final String SALUTATION = "Dear Mr. or Ms.";
        public String lastName;
        public String firstName;
        private static final String motto = "Thank you for your recent order";

    public void displaySalutation(String last, String first){
	lastName = last;
	firstName = first;
	System.out.println(SALUTATION + " " + lastName + " " + firstName);
}
    public void displayLetter(){
    System.out.println(motto);
}
    public static void main(String[] args){
        FormLetterWriter Saludo = new FormLetterWriter();
        FormLetterWriter Lema = new FormLetterWriter();				
        Saludo.displaySalutation("Minelly", "Davila");
        Lema.displayLetter();

    }
    
}

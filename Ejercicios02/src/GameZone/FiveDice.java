package GameZone;
public class FiveDice {
    public static void main(String[] args) {
        Player cesar = new Player(5);
        Player minelly = new Player(5);
        cesar.lanzamiento();
        minelly.lanzamiento();
        
        if(cesar.resultado()==minelly.resultado()){
            System.out.println("Empate");
        }else if (cesar.resultado()>minelly.resultado()){
            System.out.println("Ganó César");
        }else{
            System.out.println("Ganó Minelly");
        }
    }
}

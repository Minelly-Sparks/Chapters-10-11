package ProgrammingExercises;
public class DemoTennisGame {
    public static void main(String[] args) {
        TennisGame game1 = new TennisGame();
        game1.setNames("Minelly", "Dani");
        game1.setScores(2, 1);
        game1.displayResults();

        TennisGame game2 = new TennisGame();
        game2.setNames("Cesar", "Dinorah");
        game2.setScores(5, 3);
        game2.displayResults();

        TennisGame game3 = new TennisGame();
        game1.setNames("Julian", "Maxi");
        game1.setScores(0, 4);
        game1.displayResults();

        DoublesTennisGame doublesGame1 = new DoublesTennisGame();
        doublesGame1.setNames("Sam", "Johny", "Jesus", "Marhitte");
        doublesGame1.setScores(0, 1);
        doublesGame1.displayResults();

        DoublesTennisGame doublesGame2 = new DoublesTennisGame();
        doublesGame2.setNames("Betty", "Vicky", "Lucia", "Jazy");
        doublesGame2.setScores(4, 3);
        doublesGame2.displayResults();

        DoublesTennisGame doublesGame3 = new DoublesTennisGame();
        doublesGame3.setNames("Liz", "Alexa", "Andy", "Lily");
        doublesGame3.setScores(-1, 2);
        doublesGame3.displayResults();
    }
    
}

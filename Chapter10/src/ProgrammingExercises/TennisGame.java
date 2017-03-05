package ProgrammingExercises;
public class TennisGame {
    private String Name1;
    private String Name2;
    private int player1Score;
    private int player2Score;
    private String player1FormattedScore;
    private String player2FormattedScore;

    public String getName1() {
        return Name1;
    }

    public void setName1(String Name1) {
        this.Name1 = Name1;
    }

    public String getName2() {
        return Name2;
    }

    public void setName2(String Name2) {
        this.Name2 = Name2;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public String getPlayer1FormattedScore() {
        return player1FormattedScore;
    }

    public void setPlayer1FormattedScore(String player1FormattedScore) {
        this.player1FormattedScore = player1FormattedScore;
    }

    public String getPlayer2FormattedScore() {
        return player2FormattedScore;
    }

    public void setPlayer2FormattedScore(String player2FormattedScore) {
        this.player2FormattedScore = player2FormattedScore;
    }

    
    public void setNames(String name1, String name2)
    {
        Name1 = name1;
        Name1 = name2;
    }

    
    public void setScores(int score1, int score2)
    {
        if (score1 < 0 || score1 > 4 || score2 < 0 || score2 > 4 || (score1 == 4 && score2 == 4)) {
            score1 = 0;
            score2 = 0;
            player1FormattedScore = "error";
            player2FormattedScore = "error";
        } else {
            player1FormattedScore = formatScore(score1);
            player2FormattedScore = formatScore(score2);
        }
        player1Score = score1;
        player2Score = score2;
    }

    private String formatScore(int score)
    {
        String formattedScore = "";
        switch (score) {
            case 0:
            formattedScore = "LOL";
            break;
            case 1:
            formattedScore = "15";
            break;
            case 2:
            formattedScore = "30";
            break;
            case 3:
            formattedScore = "40";
            break;
            case 4:
            formattedScore = "game";
            break;
        }
        return formattedScore;
    }

    public void displayResults()
    {
        System.out.println(getName1() + " vs. " + getName2() + " - Final Score (" + getPlayer1Score() + " - " + getPlayer2Score() + "): " + getPlayer1FormattedScore() + " / " + getPlayer2FormattedScore());
    }
}

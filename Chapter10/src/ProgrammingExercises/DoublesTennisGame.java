package ProgrammingExercises;
public class DoublesTennisGame extends TennisGame {
    private String player1PartnerName;
    private String player2PartnerName;
    
    public String getPlayer1PartnerName()
    {
        return player1PartnerName;
    }
    public String getPlayer2PartnerName()
    {
        return player2PartnerName;
    }

    /**
     * Sets the names of the players and their partners.
     */
    public void setNames(String name1, String name1Partner, String name2, String name2Partner)
    {
     
        Name1= name1;
        Name2 = name2;
        player1PartnerName = name1Partner;
        player2PartnerName = name2Partner;
    }

    /**
     * Displays the final score and names for all 4 players.
     */
    public void displayResults()
    {
        System.out.println(getName1() + " and " + getPlayer1PartnerName() + " vs. " + getName2() + " and " + getPlayer2PartnerName() + " - Final Score (" + getPlayer1Score() + " - " + getPlayer2Score() + "): " + getPlayer1FormattedScore() + " / " + getPlayer2FormattedScore());
    }
}

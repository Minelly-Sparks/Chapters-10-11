package Chapter11;
public abstract class WeekdaySubscriber extends NewsPaperSubscriber{
    public String subType;
    public WeekdaySubscriber() {
        setSubscription_rate();
    }
    
    public void setSubscription_rate(double subscription_rate) {
        subscription_rate = 3.50;
    }
    public String toString(String street_address){
        return "The street address for subscriber is: " + street_address + "\nThe subscription rate is: " + getSubscription_rate() +
                "\nThe service entered was: " + subType;
    }

    private void setSubscription_rate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSubscription_rate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

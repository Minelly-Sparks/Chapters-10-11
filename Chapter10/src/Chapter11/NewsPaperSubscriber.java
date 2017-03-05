package Chapter11;
public abstract class NewsPaperSubscriber {
    protected String streetAddress;
    protected double subscriptionRate;
    
    public void setStreetaddress(String address){
        streetAddress = address;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public abstract void setSubscriptionRate();
    public double getSubscriptionRate(){
        return subscriptionRate;
    }
    public boolean equals(NewsPaperSubscriber subscriber){
        boolean result;
        if(streetAddress.equals(subscriber.streetAddress)){
            result = true;
        }else
            result = false;
        return result;
}
}

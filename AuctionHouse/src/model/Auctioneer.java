package model;

public class Auctioneer extends Subject {

    String name;
    double currentBid;

    public Auctioneer(String name) {
        this.name = name;
        currentBid = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void acceptBid(double bid) {
        if (bid <= currentBid) {
            System.out.println("That bid isn't larger than the current bid!");
        } else{
            currentBid = bid;
        notifyObservers(currentBid);}
    }

    public void notifyObservers(double newBidAmt) {
        super.notifyObservers(this, newBidAmt);
    }

}


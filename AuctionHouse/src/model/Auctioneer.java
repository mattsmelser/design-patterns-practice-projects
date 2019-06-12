package model;

import observers.Observer;

import javax.security.auth.Subject;

public class Auctioneer extends Subject {

    String name;
    Double currentBid;

    public String getName(){
        return name;
    }

    public Double getCurrentBid(){
        return currentBid;
    }

    public void acceptBid(double currentBid){}

    public void notifyObservers(Double newBidAmt){}

    @Override
    public void update(Subject subj, Object obj) {

    }

    }
}

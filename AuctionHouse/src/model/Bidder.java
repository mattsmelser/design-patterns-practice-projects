package model;

import observers.Observer;

import javax.security.auth.Subject;

public class Bidder implements Observer {

    String name;
    Double personalBid;
    Double currentBid;
    Double maxBid;

    public String getName(){
        return name;
    }

    public Double getPersonalBid(){
        return personalBid;
    }

    public Double getCurrentBid(){
        return currentBid;
    }

    public Double getMaxBid(){
        return maxBid;
    }

    public void makeBid(double currentBid){};

    @Override
    public void update(Subject auctioneer, Object arg) {

    }
}

package model;

import java.util.Random;

public class Bidder implements Observer {

    String name;
    double personalBid;
    double currentBid = 0.0;
    double maxBid;

    public Bidder(String name, double maxBid){
        this.name = name;
        this.maxBid = maxBid;
        personalBid = 0.0;
        this.maxBid = maxBid;
        //auctioneer.addObserver(this);
    }

    public String getName(){
        return name;
    }

    public double getPersonalBid(){
        return personalBid;
    }

    public double getCurrentBid(){
        currentBid = personalBid;
        return currentBid;
    }

    public double getMaxBid(){
        return maxBid;
    }

    @Override
    public void update(Subject auctioneer, Object arg) {
        //currentBid = (double)arg;
        if (currentBid < (double)arg){currentBid = (double)arg;}
        //System.out.println(name + " has been updated with bid of " + currentBid);
        if (currentBid >= getMaxBid()){
            System.out.println(name + " can't bid any higher!");
        }
        else makeBid(currentBid);
    }

    public double makeBid(double currentBid){
        Random rand = new Random();
        personalBid = (double) rand.nextInt((int) 10) + (currentBid + 1);
        if (personalBid >= maxBid){personalBid = maxBid; }
        //currentBid = personalBid;
        System.out.println(name + "'s bid is : $" + personalBid);
        return getCurrentBid();
    }


}

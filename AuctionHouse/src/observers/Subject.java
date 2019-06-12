package observers;

import model.Bidder;

import java.util.LinkedList;

public class Subject implements Observer {

    LinkedList observers = new LinkedList();

    public void addObserver(Bidder b1) {
        observers.add(b1);
    }

    public void notifyObservers(Subject Observable, double bid){};

    @Override
    public void update(javax.security.auth.Subject subj, Object obj) {

    }
}


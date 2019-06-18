package model;

public abstract class Doable {

    protected boolean complete;

    public Doable() {
        complete = false;
    }

    public boolean getStatus(){return complete;}

    public abstract String getDescription();

    public abstract void complete();

    public abstract void display(String indentSpace);
}
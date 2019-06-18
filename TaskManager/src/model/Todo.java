package model;

import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable{

    private String description;
    private List<Doable> subs;


    public Todo(String description) {
        super();
        this.description = description;
        subs = new LinkedList<>();
    }

    public boolean addDoable(Doable d) {
        if (!subs.contains(d)) {
            subs.add(d);
            return true;
        } else {
            return false;
        }
    }
    public boolean removeDoable(Doable d) {
        if (subs.contains(d)) {
            subs.remove(d);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void complete() {
        boolean isAllDone = true;
        for (Doable d : subs) {
            if (!d.getStatus()) {
                isAllDone = false;
            }
        }
        complete = isAllDone;
    }

    @Override
    public void display(String indentSpace){
        System.out.println(indentSpace + getDescription());
        for (Doable d : subs){
            d.display(indentSpace + indentSpace);
        }
    }

    @Override
    public String getDescription(){
        return description;
    }
}
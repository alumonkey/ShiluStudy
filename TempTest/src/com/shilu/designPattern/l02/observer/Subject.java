package com.shilu.designPattern.l02.observer;
/**
 * Created by shilu on 15-10-29.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

package br.com.afcl.desingpattern.main.chapter2.subject;

import br.com.afcl.desingpattern.main.chapter2.observer.Observer;

public interface Subject {
    public void registerObservable(final Observer observer);
    public void removeObservable(final Observer observer);
    public void notifyObservers();
}

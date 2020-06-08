package br.com.afcl.desingpattern.main.chapter2.observer;

public interface Observer {
    public void update(final float temperature, final float humidity, final float pressure);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Free
 */
public class seatobserv implements Observable {

    List<Observer> observerlist = new ArrayList<>();

    private boolean registseat;

    public boolean isregistseat() {
        return registseat;
    }

    public void putregistseat() {
        registseat = true;
        notifyregist();
    }

    @Override
    public void check(Observer o) {
        observerlist.add(o);
    }

    @Override
    public void notifyregist() {
        observerlist.forEach(Observer::update);
    }

}

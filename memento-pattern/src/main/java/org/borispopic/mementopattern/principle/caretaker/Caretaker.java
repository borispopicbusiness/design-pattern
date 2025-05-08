package org.borispopic.mementopattern.principle.caretaker;

import org.borispopic.mementopattern.principle.memento.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker is a form of database that is used to store "history" of changes.
 * This is the place where snapshots(mementos) are stored, restored from and maintained.
 *
 */
public class Caretaker {
    private List<Memento> history;

    public Caretaker() {
        history = new ArrayList<>();
    }

    public void save(Memento memento) {
        history.add(memento);
    }

    public Memento restore() {
        if(history.isEmpty())
            return null;

        return history.remove(history.size() - 1);
    }
}

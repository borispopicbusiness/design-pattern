package org.borispopic.mementopattern.principle.caretaker;

import org.borispopic.mementopattern.principle.memento.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker class is responsible for managing the history of object states in the Memento pattern.
 * It acts as a storage facility that maintains a collection of Memento objects, allowing for:
 * - Saving new state snapshots
 * - Restoring previous states in a LIFO (last-in-first-out) manner
 * - Maintaining the history of state changes
 * <p>
 * The Caretaker has no knowledge of the internal structure of the Memento objects it stores,
 * preserving encapsulation while enabling state restoration functionality.
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

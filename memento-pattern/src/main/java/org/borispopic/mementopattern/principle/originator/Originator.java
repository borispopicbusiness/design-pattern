package org.borispopic.mementopattern.principle.originator;

import org.borispopic.mementopattern.principle.memento.Memento;

/**
 * This is Originator. This class prepares changes and produces a memento or restores it.
 *
 */

public class Originator<T, U> {
    private T currentStateSnapshoot;

    public void write(U stateUpdate) {
        updateState(stateUpdate);
    }

    public Memento<T> createStateSnapshoot() {
        return new Memento<>(this.currentStateSnapshoot);
    }

    public T getStateSnapshoot(Memento<T> memento) {
        return memento.getSnapshot();
    }

    private void updateState(U stateUpdate) {
        //This is the place where you should implement your update logic
        //to update the current state snapshoot being created.

    }
}

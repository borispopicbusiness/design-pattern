package org.borispopic.mementopattern.principle.memento;

/**
 * Represents a memento object that captures and holds the state of an object.
 *
 * Memento objects are primarily used in conjunction with the Memento Design Pattern
 * to encapsulate the state of an object at a specific point in time in such a way
 * that the state can be restored later without violating encapsulation.
 *
 * This class is generic, allowing it to store the state of any type specified
 * by the parameter T. Memento is typically created by an Originator and stored
 * and managed by a Caretaker.
 *
 * @param <T> The type of the object that this memento holds.
 */
public class Memento<T> {
    private T snapshot;

    public Memento(T snapshot) {
        this.snapshot = snapshot;
    }

    public T getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(T snapshot) {
        this.snapshot = snapshot;
    }
}

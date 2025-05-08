package org.borispopic.mementopattern.principle.memento;

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

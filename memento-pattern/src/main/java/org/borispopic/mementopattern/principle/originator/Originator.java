package org.borispopic.mementopattern.principle.originator;

import org.borispopic.mementopattern.principle.memento.Memento;

/**
 * The Originator class is a key component in the Memento pattern that creates and manages object states.
 * It is responsible for creating mementos containing the object's current state and restoring its state
 * from a memento. The class requires implementing updateState() method, hence it is abstract.
 *
 * @param <T> The type representing the full state of the object that can be saved/restored
 * @param <U> The type representing incremental state updates that can be applied
 * <p>
 * The Originator:
 * - Creates a memento containing a snapshot of its current state
 * - Uses a memento to restore its state to a previous version
 * - Processes state updates through the updateState() method before creating mementos
 */

public abstract class Originator<T, U> {
    protected T currentStateSnapshoot;

    public void write(U stateUpdate) {
        updateState(stateUpdate);
    }

    public Memento<T> createStateSnapshoot() {
        return new Memento<>(this.currentStateSnapshoot);
    }

    public T getStateSnapshoot(Memento<T> memento) {
        return memento.getSnapshot();
    }

    /**
     * Updates the current state snapshot based on the provided state update.
     * Implementing classes should define how state updates are applied to the current state.
     *
     * @param stateUpdate The incremental update to be applied to the current state
     * @throws IllegalArgumentException if the state update is invalid or incompatible
     */
    public abstract void updateState(U stateUpdate) throws IllegalArgumentException;
}

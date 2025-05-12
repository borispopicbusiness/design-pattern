package org.borispopic.principle;

/**
 * Represents a subject (publisher) in the Observer pattern that can be observed for changes.
 *
 * @param <T> the type of data that will be passed to observers
 */
public interface Subject<T> {
    /**
     * Registers a new observer to receive updates from this subject.
     *
     * @param observer the observer to register
     */
    void registerObserver(Observer<T> observer);

    /**
     * Removes an observer so it no longer receives updates from this subject.
     *
     * @param observer the observer to remove
     */
    void removeObserver(Observer<T> observer);

    /**
     * Notifies all registered observers with the current update.
     */
    void notifyObservers();
}
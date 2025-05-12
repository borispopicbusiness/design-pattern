package org.borispopic.principle;

/**
 * Represents an observer (subscriber) in the Observer pattern that receives updates from subjects.
 * Observers register themselves with subjects to receive notifications when changes occur.
 *
 * @param <T> the type of data that will be received from subjects
 */
public interface Observer<T> {
    /**
     * Called by the subject when an update occurs.
     *
     * @param update the updated data received from the subject
     */
    void onUpdate(T update);
}
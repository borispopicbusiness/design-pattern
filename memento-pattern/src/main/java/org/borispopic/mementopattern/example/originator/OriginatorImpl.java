package org.borispopic.mementopattern.example.originator;

import org.borispopic.mementopattern.principle.originator.Originator;

import java.util.Objects;

/**
 * Concrete implementation of the Originator in the Memento pattern that manages text-based states.
 * This class handles string concatenation as its state update strategy, where:
 * - New states are appended to existing ones if present
 * - Empty states are initialized with the update directly
 * - Null states are treated as empty states
 * 
 * The class ensures proper state management through the Memento pattern by:
 * - Creating snapshots of the current text state
 * - Restoring text states from previous snapshots
 * - Validating and processing text state updates
 */
public class OriginatorImpl extends Originator<String, String> {

    @Override
    protected void updateState(String stateUpdate) {
        Objects.requireNonNull(stateUpdate, "State update cannot be null");
    
        if (this.currentStateSnapshot == null) {
            this.currentStateSnapshot = "";
        }
    
        if (this.currentStateSnapshot.isEmpty()) {
            this.currentStateSnapshot = stateUpdate;
        } else {
            this.currentStateSnapshot = new StringBuilder(currentStateSnapshot)
                .append(stateUpdate)
                .toString();
        }
    }
}
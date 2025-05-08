package org.borispopic.mementopattern.example.originator;

import org.borispopic.mementopattern.principle.originator.Originator;

public class OriginatorImpl extends Originator<String, String> {

    @Override
    public void updateState(String stateUpdate) throws IllegalArgumentException {

        if(stateUpdate == null)
            throw new IllegalArgumentException("State update cannot be null");

        if(this.currentStateSnapshoot == null)
            this.currentStateSnapshoot = "";

        this.currentStateSnapshoot += stateUpdate;
    }
}

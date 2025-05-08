package org.borispopic.mementopattern;

import org.borispopic.mementopattern.example.originator.OriginatorImpl;
import org.borispopic.mementopattern.principle.caretaker.Caretaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class TestClass {

    @Test
    public void shouldReturnExpectedSizeAndContent() {
        Caretaker caretaker = new Caretaker();
        OriginatorImpl originator = new OriginatorImpl();

        originator.write("Hello World!");

        caretaker.save(originator.createStateSnapshoot());

        assertEquals(1, caretaker.size());
        assertEquals("Hello World!", originator.getStateSnapshoot(caretaker.restore()));
    }

    @Test
    public void shouldThrowExceptionWhenStateUpdateIsNull() {
        Caretaker caretaker = new Caretaker();
        OriginatorImpl originator = new OriginatorImpl();

        originator.write("Hello World!");

        assertThrowsExactly(NullPointerException.class, () -> originator.getStateSnapshoot(caretaker.restore()));
    }

    @Test
    public void shouldReturnExpectedSizeAndContentAfterMultipleStateUpdates() {
        Caretaker caretaker = new Caretaker();
        OriginatorImpl originator = new OriginatorImpl();

        originator.write("Hello World!");

        caretaker.save(originator.createStateSnapshoot());

        caretaker.restore();

        originator.write("Hello World!");

        caretaker.save(originator.createStateSnapshoot());

        originator.write("Hello World 2!");

        caretaker.save(originator.createStateSnapshoot());

        assertEquals(2, caretaker.size());

        assertEquals("Hello World 2!", originator.getStateSnapshoot(caretaker.restore()));
        assertEquals("Hello World!", originator.getStateSnapshoot(caretaker.restore()));
    }
}

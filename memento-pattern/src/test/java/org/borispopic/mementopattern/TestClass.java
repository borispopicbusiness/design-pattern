package org.borispopic.mementopattern;

import org.borispopic.mementopattern.example.originator.OriginatorImpl;
import org.borispopic.mementopattern.principle.caretaker.Caretaker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class TestClass {
    private static final String INITIAL_TEXT = "Hello World!";
    private static final String UPDATED_TEXT = "Hello World 2!";
    
    private Caretaker caretaker;
    private OriginatorImpl originator;
    
    @BeforeEach
    void setUp() {
        caretaker = new Caretaker();
        originator = new OriginatorImpl();
    }
    
    private void writeAndSaveState(String text) {
        originator.write(text);
        caretaker.save(originator.createStateSnapshoot());
    }
    
    private String restoreAndGetState() {
        return originator.getStateSnapshoot(caretaker.restore());
    }
    
    @Test
    void givenNewState_whenSaved_thenCorrectSizeAndContent() {
        writeAndSaveState(INITIAL_TEXT);
        
        assertEquals(1, caretaker.size());
        assertEquals(INITIAL_TEXT, restoreAndGetState());
    }
    
    @Test
    void givenEmptyHistory_whenRestoring_thenThrowsNullPointerException() {
        originator.write(INITIAL_TEXT);
        
        assertThrowsExactly(NullPointerException.class, 
            () -> originator.getStateSnapshoot(caretaker.restore()));
    }
    
    @Test
    void givenMultipleStates_whenRestoringSequentially_thenMaintainsCorrectOrder() {
        writeAndSaveState(INITIAL_TEXT);
        caretaker.restore();
        
        writeAndSaveState(INITIAL_TEXT);
        writeAndSaveState(UPDATED_TEXT);
        
        assertEquals(2, caretaker.size());
        assertEquals(UPDATED_TEXT, restoreAndGetState());
        assertEquals(INITIAL_TEXT, restoreAndGetState());
    }
}
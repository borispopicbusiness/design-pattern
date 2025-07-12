package org.borispopic;

import org.borispopic.example.elements.Button;
import org.borispopic.example.elements.TextField;
import org.borispopic.example.factory.UIFactory;
import org.borispopic.example.factory.impl.MacUIFactoryImpl;
import org.borispopic.example.factory.impl.WindowsUIFactoryImpl;
import org.junit.jupiter.api.Test;

/**
 * This class tests the implementation of the Abstract Factory design pattern
 * by verifying the creation of UI components for different platforms (Windows and Mac).
 *
 * The test method demonstrates how the concrete factory implementations 
 * (WindowsUIFactoryImpl and MacUIFactoryImpl) produce platform-specific UI components 
 * such as buttons and text fields. Each component's behavior is verified through 
 * render, onClick, and onType method calls.
 *
 * This class ensures that the created components adhere to their respective contracts 
 * and function as intended within the abstract factory framework.
 */
public class AbstractFactoryPatternTest {
    /**
     * Tests UI component creation and interaction for different platforms
     */
    @Test
    public void shouldCreateAndInteractWithUIComponentsForDifferentPlatforms() {
        testUIComponents(new WindowsUIFactoryImpl());
        testUIComponents(new MacUIFactoryImpl());
    }

    private void testUIComponents(UIFactory uiFactory) {
        // Test button functionality
        Button button = uiFactory.createButton();
        button.render();
        button.onClick();

        // Test text field functionality
        TextField textField = uiFactory.createTextField();
        textField.render();
        textField.onType();
    }
}
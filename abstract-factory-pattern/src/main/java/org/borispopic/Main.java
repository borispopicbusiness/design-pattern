package org.borispopic;

import org.borispopic.example.factory.impl.MacUIFactoryImpl;
import org.borispopic.example.factory.impl.WindowsUIFactoryImpl;

/**
 * The Main class serves as the entry point to demonstrate the implementation
 * of the Abstract Factory design pattern for creating platform-specific UI components.
 *
 * The program initializes factory implementations for two platforms: Windows
 * and Mac. Each factory creates instances of UI components—such as buttons
 * and text fields—that are specific to the corresponding platform.
 *
 * When executed, the Main class showcases the rendering and interaction
 * functionality of these components. It highlights how different factory
 * implementations can generate consistent yet platform-specific results,
 * keeping the client code decoupled from the actual implementation details.
 *
 * Responsibilities:
 * - Create instances of Windows and Mac specific UI factories.
 * - Demonstrate rendering and interaction (e.g., clicking a button, typing in a text field)
 *   for both Windows and Mac UI components.
 */
public class Main {
    public static void main(String[] args) {
        WindowsUIFactoryImpl uiFactory = new WindowsUIFactoryImpl();

        uiFactory.createButton().render();
        uiFactory.createTextField().render();

        uiFactory.createButton().onClick();
        uiFactory.createTextField().onType();

        MacUIFactoryImpl macUIFactory = new MacUIFactoryImpl();

        macUIFactory.createButton().render();
        macUIFactory.createTextField().render();

        macUIFactory.createButton().onClick();
        macUIFactory.createTextField().onType();
    }
}
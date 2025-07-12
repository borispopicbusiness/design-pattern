package org.borispopic.example.factory;

import org.borispopic.example.elements.Button;
import org.borispopic.example.elements.TextField;

/**
 * UIFactory is an interface that defines a contract for creating UI components.
 * The factory pattern enables the creation of platform-specific implementations
 * of UI components—such as buttons and text fields—without exposing the client
 * to platform-specific details.
 *
 * Classes implementing this interface are responsible for creating instances of
 * Button and TextField tailored to a specific platform or UI style. This promotes
 * consistency in UI design and supports scalability by decoupling the client code
 * from the specific implementations of the created objects.
 */
public interface UIFactory {
    Button createButton();
    TextField createTextField();
}

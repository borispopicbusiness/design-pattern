package org.borispopic.example.factory.impl;

import org.borispopic.example.elements.Button;
import org.borispopic.example.elements.TextField;
import org.borispopic.example.elements.impl.mac.MacButtonImpl;
import org.borispopic.example.elements.impl.mac.MacTextFieldImpl;
import org.borispopic.example.factory.UIFactory;

public class MacUIFactoryImpl implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButtonImpl();
    }

    @Override
    public TextField createTextField() {
        return new MacTextFieldImpl();
    }
}

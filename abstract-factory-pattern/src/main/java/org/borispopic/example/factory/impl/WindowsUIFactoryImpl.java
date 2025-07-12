package org.borispopic.example.factory.impl;

import org.borispopic.example.elements.Button;
import org.borispopic.example.elements.TextField;
import org.borispopic.example.elements.impl.windows.WindowsButtonImpl;
import org.borispopic.example.elements.impl.windows.WindowsTextFieldImpl;
import org.borispopic.example.factory.UIFactory;

public class WindowsUIFactoryImpl implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButtonImpl();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextFieldImpl();
    }
}

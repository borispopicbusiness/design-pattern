package org.borispopic.example.elements.impl.windows;

import org.borispopic.example.elements.TextField;

public class WindowsTextFieldImpl implements TextField {
    @Override
    public void render() {
        System.out.println("WindowsTextFieldImpl: render()");
    }

    @Override
    public void onType() {
        System.out.println("WindowsTextFieldImpl: onType()");
    }
}

package org.borispopic.example.elements.impl.mac;

import org.borispopic.example.elements.TextField;

public class MacTextFieldImpl implements TextField {
    @Override
    public void render() {
        System.out.println("MacTextFieldImpl: render()");
    }

    @Override
    public void onType() {
        System.out.println("MacTextFieldImpl: onType()");
    }
}

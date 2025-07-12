package org.borispopic.example.elements.impl.mac;

import org.borispopic.example.elements.Button;

public class MacButtonImpl implements Button {
    @Override
    public void render() {
        System.out.println("MacButtonImpl: render()");
    }

    @Override
    public void onClick() {
        System.out.println("MacButtonImpl: onClick()");
    }
}

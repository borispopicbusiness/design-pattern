package org.borispopic.example.elements.impl.windows;

import org.borispopic.example.elements.Button;

public class WindowsButtonImpl implements Button {
    @Override
    public void render() {
        System.out.println("WindowsButtonUIImpl: render()");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButtonUIImpl: onClick()");
    }
}

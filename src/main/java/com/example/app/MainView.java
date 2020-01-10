package com.example.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Add more", event -> addMicroComponent());
        add(button);
        for (int i = 0; i < 500; i++)
            addMicroComponent();
    }

    private void addMicroComponent() {
        add(new MicroItemComponent());
    }
}

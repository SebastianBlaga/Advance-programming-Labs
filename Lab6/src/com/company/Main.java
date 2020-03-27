package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainFrame main = new MainFrame();

        main.setLayout(new FlowLayout());
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");

        main.add(b1);
        main.add(b2);

	    main.setVisible(true);
    }
}

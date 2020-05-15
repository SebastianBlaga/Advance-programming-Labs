package com.company;

import javax.swing.*;

import java.awt.*;


public class DesignPanel extends JPanel {
    final MainFrame frame;

    public DesignPanel(MainFrame frame){
        this.frame = frame;
        frame.setLayout(new GridLayout(1,4));
    }

    public void component(JComponent component){
        add(component, BorderLayout.AFTER_LAST_LINE);
        frame.repaint();
    }
}

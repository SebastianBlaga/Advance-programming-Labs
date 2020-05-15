package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {

    final MainFrame frame;
    JLabel swingComponent = new JLabel("Swing Component");
    JTextField textComponent = new JTextField();
    JButton buttonComponent = new JButton("Add");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }


    private void init(){
        setLayout(new GridLayout(1,4));
        add(buttonComponent);
        add(textComponent);
        add(swingComponent);
        buttonComponent.addActionListener(this::load);
    }

    private void load(ActionEvent e) {
        String driverName = textComponent.getText();
        try {
            Class clazz = Class.forName(driverName);
            JComponent component = (JComponent) clazz.getContrustor().newInstance();
            frame.designPanel.add(component);
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

        frame.repaint();
    }
}

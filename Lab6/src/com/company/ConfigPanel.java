package com.company;

import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel sidesLabel;
    JLabel shapeLabel;
    JSpinner sidesField;
    JSpinner shapeField;
    JComboBox colorCombo;
    JComboBox typeCombo;



    public ConfigPanel (MainFrame frame) {
        this.frame = frame;
        init();
    }

    private  void init() {
        sidesLabel = new JLabel("Number of sides:" );
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6);

        shapeLabel = new JLabel("Type:");
        String[] types = {"Square", "Ellipse2D"};
        JComboBox comboType = new JComboBox(types);

        String[] colors = {"Random", "Black"};
        JComboBox comboBox = new JComboBox(colors);

        add(sidesLabel);
        add(sidesField);
        add(colorCombo);
        add(shapeField);
        add(shapeLabel);
        add(typeCombo);
    }
}

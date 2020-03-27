package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn =  new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
    }

    private  void init() {
        setLayout(new GridLayout(1,4));
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);


        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);


    }

    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }

    private void load(ActionEvent e) {
        try {
            ImageIO.read(new File("test.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }

    private void reset(ActionEvent e) {
        frame.repaint();
    }

    private void exit(ActionEvent e) {
        frame.dispose();
    }




}

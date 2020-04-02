package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Component;

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
     /*   try {
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
        } catch (IOException ex) { System.err.println(ex); } */
        JFileChooser choose = new JFileChooser();
        int returnVal =  choose.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                ImageIO.write(frame.canvas.image, "PNG", new File(choose.getSelectedFile().getAbsoluteFile(),"test.png"));

            }catch (IOException ex){
                System.err.println(ex);
            }

        }
    }

    private void load(ActionEvent e) {
        JFileChooser choose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png", "png");    //oracle swing tutorial
        choose.setFileFilter(filter);
        int returnVal = choose.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File image =  choose.getSelectedFile();
            try {
                ImageIO.read(image);
                frame.canvas.image = ImageIO.read(image);
                frame.canvas.graphics = frame.canvas.image.createGraphics();
                frame.canvas.repaint();

            } catch (IOException ex) { System.err.println(ex); }
        }
    }

    private void reset(ActionEvent e) {
        frame.repaint();
    }

    private void exit(ActionEvent e) {
        frame.dispose();
    }




}

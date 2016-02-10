package me.demerzel.util;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Demerzel on 2/5/16.
 */
public class DisplayManager {
    private final static int WINDOW_HEIGHT = 600;
    private final static int WINDOW_WIDTH = 500;

    private static DisplayManager displayManager;

    private JTextField input;
    private JTextArea output;

    private DisplayManager(JPanel jPanel){
        JFrame frame = new JFrame();
        frame.setTitle("The Hunt");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.LIGHT_GRAY);


        output = new JTextArea("", 20, 40);
        output.setEditable(false);
        input = new JTextField("", 40);


        jPanel.add(output);
        jPanel.add(input);

        frame.add(jPanel);
        frame.setVisible(true);
    }

    public static DisplayManager getInstance(){
        if(displayManager == null){
            displayManager = new DisplayManager(new JPanel());
        }

        return displayManager;
    }

    public JTextField getInput() {
        return input;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    public JTextArea getOutput() {
        return output;
    }

    public void setOutput(JTextArea output) {
        this.output = output;
    }

    public void output(String string, boolean replace){
        if(replace){
            getOutput().setText(string);
        }else{
            getOutput().append("\n" + string);
        }
    }
}

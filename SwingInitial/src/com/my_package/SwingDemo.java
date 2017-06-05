package com.my_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {2/14/2017}
 */
public class SwingDemo {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My First GUI java Application");
        myFrame.setSize(500,500);
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));

        JPanel myPanel = new JPanel();

        JLabel label = new JLabel();
        label.setSize(300,50);
        label.setText("Wow What a nice looking text field");

        myPanel.add(label);

        JPanel newPanel = new JPanel();
        JButton btn = new JButton("Click Me");

        btn.addActionListener((e) -> label.setText("You have clicked on the button"));
        newPanel.add(btn);
        newPanel.setBounds(20,70,300,100);

        rootPanel.add(myPanel);
        rootPanel.add(newPanel);
        myFrame.add(rootPanel);
        myFrame.setVisible(true);

        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

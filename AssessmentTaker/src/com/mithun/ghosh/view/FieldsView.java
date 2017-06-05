package com.mithun.ghosh.view;

import com.mithun.ghosh.model.Student;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {3/7/2017}
 */
public class FieldsView extends JFrame {
    public FieldsView(Student student) {
        initViews(student);
        setSize(500,300);
    }

    private void initViews(Student student) {
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(null);

        JLabel nameLbl = new JLabel("Name : " + student.getStName());
        nameLbl.setBounds(new Rectangle(50,30,300,35));

        JLabel idLbl = new JLabel("GId : " + student.getGId());
        idLbl.setBounds(new Rectangle(50,70,300,35));

        JLabel psLbl = new JLabel("Password : " + student.getPassword());
        psLbl.setBounds(new Rectangle(50, 110,300,35));


        JButton closeButton = new JButton("Close");
        closeButton.setBounds(new Rectangle(200,150,100,35));
        closeButton.addActionListener(e -> {
            System.exit(0);
        });
        rootPanel.add(nameLbl);
        rootPanel.add(idLbl);
        rootPanel.add(psLbl);
        rootPanel.add(closeButton);

        add(rootPanel);
    }
}

package com.mithun.ghosh.view;

import com.mithun.ghosh.controller.SubmitConImpl;
import com.mithun.ghosh.controller.SubmitController;
import com.mithun.ghosh.model.Student;

import javax.swing.*;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {2/22/2017}
 */
public class LoginView extends JFrame {

    private JLabel nameLabel, gIdLabel, passLabel;
    private JTextField nameField, gIdField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JPanel rootPanel;

    public LoginView() {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initView();

        submitButton.addActionListener(e -> {
            String stName = nameField.getText();
            String gId = gIdField.getText();
            String password = passwordField.getText();

            if(!(stName.isEmpty() && gId.isEmpty()&& password.isEmpty())) {
                Student student = new Student(stName, gId, password);
                SubmitConImpl submitCon = new SubmitConImpl();
                submitCon.submitButtonClicked(student);
                setVisible(false);
                dispose();
            } else if(stName.isEmpty())
                nameField.setToolTipText("Please Enter your Name.");
            else if(gId.isEmpty())
                gIdField.setToolTipText("Please Enter The graduate ID you Have.");
            else if(password.isEmpty())
                passwordField.setToolTipText("Please Enter The Password.");

        });
    }

    private void initView() {
        rootPanel = new JPanel();
        rootPanel.setLayout(null);

        nameLabel = new JLabel("Name : ");
        nameLabel.setBounds(80, 20, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 30);

        gIdLabel = new JLabel("Graduate ID : ");
        gIdLabel.setBounds(50, 70, 100, 30);
        gIdField = new JTextField();
        gIdField.setBounds(150, 70, 200, 30);

        passLabel = new JLabel("PASSWORD : ");
        passLabel.setBounds(50, 120, 100, 30);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 30);

        submitButton = new JButton("Login");
        submitButton.setBounds(150, 250, 100, 30);
//        rootPanel.setBackground(Color.DARK_GRAY);
        rootPanel.add(nameLabel);
        rootPanel.add(nameField);
        rootPanel.add(gIdLabel);
        rootPanel.add(gIdField);
        rootPanel.add(passLabel);
        rootPanel.add(passwordField);
        rootPanel.add(submitButton);
        add(rootPanel);
    }
}

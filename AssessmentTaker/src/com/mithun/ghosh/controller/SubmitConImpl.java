package com.mithun.ghosh.controller;

import com.mithun.ghosh.model.Student;
import com.mithun.ghosh.view.FieldsView;

import javax.swing.*;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {3/7/2017}
 */
public class SubmitConImpl implements SubmitController {

    private FieldsView fieldsView;
    @Override
    public void submitButtonClicked(Student student) {
        fieldsView = new FieldsView(student);
        fieldsView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fieldsView.setVisible(true);
    }
}

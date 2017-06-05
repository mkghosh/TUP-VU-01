package com.mithun.ghosh.model;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {2/22/2017}
 */
public class QuestionModel {

    private int questionNo;
    private String question;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;

    public QuestionModel(int questionNo, String question) {
        this.questionNo = questionNo;
        this.question = question;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }
}

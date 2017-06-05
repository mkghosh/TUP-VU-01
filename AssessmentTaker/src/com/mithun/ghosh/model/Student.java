package com.mithun.ghosh.model;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {2/26/2017}
 */
public class Student {
    private String stName, gId, password;
    public Student(String stName, String gId, String password) {
        this.stName = stName;
        this.gId = gId;
        this.password = password;
    }

    public String getStName() {
        return stName;
    }

    public String getGId() {
        return gId;
    }

    public String getPassword() {
        return password;
    }
}

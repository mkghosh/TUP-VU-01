package test.logic;

import test.excp.LeaveExceededException;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {1/24/2017}
 */
public class LeaveSystem {

    private int totalLeave;

    public LeaveSystem(int totalLeave) {
        this.totalLeave = totalLeave;
    }

    public void checkLeave(int appliedLeave) {
        if(appliedLeave <= totalLeave) {
            totalLeave -= appliedLeave;
            System.out.println("Your leave has been sanctioned. \n" +
                    "You got " + appliedLeave + " days leave \n" +
                    "You have " + totalLeave + " days left for this year.");
        } else {
            try {
                throw new LeaveExceededException("Your Leave has been exceeded.");
            } catch (LeaveExceededException e) {
                System.out.println("You should not apply for a leave when your leave has exceeded \n" +
                        "Or you should not apply for leaves more than your quota.");
            }
        }
    }
}

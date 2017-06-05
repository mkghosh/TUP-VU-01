package test.excp;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {1/24/2017}
 */
public class LeaveExceededException extends Exception {

    public LeaveExceededException() {
    }

    public LeaveExceededException(String message) {
        super(message);
    }

}

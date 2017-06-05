package test.mattest;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {1/24/2017}
 */
public class CustomMath {

    public String backward(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--)
            result += input.charAt(i);
        return result;
    }
}

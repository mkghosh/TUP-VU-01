package test.main;

import test.mattest.CustomMath;

import java.util.Scanner;

/**
 * @author Mithun Kumer Ghose.
 *         Created on {1/24/2017}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CustomMath cm = new CustomMath();
        System.out.println("Congratulations! Mr./Mist/Miss : " + input);
        System.out.println("Your name's backward spelling is : " +
                cm.backward(input));

//        for(int i = input.length() -1; i>= 0; i--)
//            System.out.print(input.charAt(i));
    }
}

package my_package;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        // Create file
        File file = new File(args[0]);

        try(InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(isr)) {
            // Create a buffered reader to read each line from standard in.
            // Create a print writer on this file.
            PrintWriter out
                    = new PrintWriter(new FileWriter(file));
            String s;

            System.out.print("Enter file text. ");
            System.out.println("[Type quit to stop.]");

            // Read each input line and echo it
            //to the screen.
            while ((s = in.readLine()) != null) {
                if(s.equals("quit"))
                    break;
                out.println(s);
            }

        } catch (IOException e) {
            // Catch any IO exceptions.
            e.printStackTrace();
        }
    }
}

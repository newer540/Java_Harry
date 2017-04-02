package chapter3;

/**
 * Created by harry on 02-Apr-17.
 */
public class Final {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        int quant = 0;

        System.out.println("Input any key.\nInput a dot to stop.");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                quant++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                quant++;
                System.out.println(ch);

            }

        } while (ch != '.');
        System.out.println("changes " + quant);

    }
}



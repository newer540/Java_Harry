package chapter3;

/**
 * Created by hbagratyan on 28.03.2017.
 */
public class dowhile {
    public static void main (String args [])
        throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press any key and then  press <Enter>:");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}

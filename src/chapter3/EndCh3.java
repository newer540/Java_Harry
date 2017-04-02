package chapter3;

/**
 * Created by harry on 02-Apr-17.
 */
public class EndCh3 {
    public static void main (String args [])
        throws java.io.IOException {
            int spaces = 0;
            char ch;

            System.out.print ("Для остановки нажмите символ точки");

            do {
                ch = (char) System.in.read();
                if (ch == ' ') spaces++;
            }
            while (ch != '.');


System.out.print("проблелов " + spaces);
        }

    }

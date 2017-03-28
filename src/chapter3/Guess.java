package chapter3;

class Guess {
    public static void main (String args[])
        throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println(" letter A-Z");
            System.out.print("try to guess it: ");

            ch = (char) System.in.read(); // получить символ с клавиатуры
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Correct! **");
            else {
                System.out.print(" try ");
                //сложенный оператор If
                if (ch < answer)
                    System.out.println("closer to the end");
                else System.out.println("closer to the start");

            }
        } while (answer != ch);
    }

}

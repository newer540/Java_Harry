package chapter3;

class Guess {
    public static void main (String args[])
        throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.print("Попытайтесь ее угадать: ");

            ch = (char) System.in.read(); // получить символ с клавиатуры
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Correct! **");
            else {
                System.out.print(" Попробуйте букву ");
                //сложенный оператор If
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");

            }
        } while (answer != ch);
    }

}

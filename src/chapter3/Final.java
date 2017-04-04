package chapter3;

class Final {
    public static void main(String args[])
            throws java.io.IOException {
        int num = 0;
        char ch;

        System.out.println("Введите символ 'a-z' 'A'Z'\nДля отстановски нажмите точку.");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                num++;
                ch -= 32;
                System.out.print(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                num++;
                ch += 32;
                System.out.print(ch);
            }
        } while (ch != '.');
        System.out.println("Конец операции. Изменений: " + num);
    }
}



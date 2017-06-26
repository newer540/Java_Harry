package chapter5;

/**
 * Created by Harry on 26.06.2017.
 * Класс, реализующий очередь для хранения символов
 */
class Quene {
    char q[]; //массив для хранения элементов очереди
    int putloc, getloc; // индексы для вставки и извлечения

    // элементов очереди
    Quene(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    // Поместить символ в очередь

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

//Демонстрация использования класса Quene
class QDemo {
    public static void main(String args[]) {
        Quene bigQ = new Quene(100);
        Quene smallQ = new Quene(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения " +
                "алфавита");
        // Помеcтить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации " +
                "ошибок");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //Дополнительные ошибки при обращении к очереди smallQ

        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}





package ownwork;
/*Найдите победителя марафона.
Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
(Опционально) Найдите человека, который прибежал вторым.*/

class Winners {
    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
            "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
    int ind = 0;
    int i;
    int sec = 0;

    void getWin() {
        for (i = 0; i < times.length; i++) {
            if (times[i] < times[ind]) {
                ind = i;
            }
        }
        System.out.println(names[ind] + " " + times[ind]);
    }
    void getSecond() {
        for (i = 0; i < times.length; i++) {
            if (times[i] < times[sec] & times[i] != times[ind] ) {
                sec = i;
            }
        }

        System.out.println(names[sec] + " " + times[sec]);
    }
}
public class Winner {
    public static void main(String args[]) {
        Winners as = new Winners();
        as.getWin();
        as.getSecond();
    }
}


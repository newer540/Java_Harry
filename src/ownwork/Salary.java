package ownwork;

/*Создайте метод, который будет считать сколько денег получает работник в неделю.
Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
Условия:
1) Каждый час после 40 считается за полтора.
2) Работник не может работать больше, чем 60 часов в неделю.
3) Работник не может получать меньше 8 долларов в час.
*/



class Salary {
    private double hours;
    private double dolperhour;


    double howmuch(double a, double b) {
        dolperhour = a;
        hours = b;
        if (dolperhour >= 8 & hours < 60 & hours <= 40) System.out.println ("This worker earned " + dolperhour * hours + " dollars");
         else if (dolperhour >= 8 & hours < 60 & hours > 40) System.out.println("This worker earned " +
                (dolperhour * 40 + dolperhour * (hours - 40) * 1.5) + " dollars");
        else System.out.println("Salary cannot be less than 8$ and worker cannot work more than 60 hours per week");
        return 0;
    }
}
class SDemo {
    public static void main(String args[]){
        Salary demo = new Salary();

        demo.howmuch(10, 35);
        demo.howmuch(8, 50);
        demo.howmuch(5,30);
        demo.howmuch(9, 75);
    }
}
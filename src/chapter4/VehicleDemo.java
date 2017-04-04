package chapter4;

/**
 * Created 04.04.2017.
 * Программа, в которой используется класс Vehicle
 */
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}

// В этом классе объявляется объект типа Vehicle
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        //Присвоить значения полям в объекте minivan
        minivan.passengers =7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 12;
        sportcar.mpg = 20;

        //Рассчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;
        System.out.println("Mини-фypгoн может перевезти " + minivan.passengers +
        " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Спорткар может перевезти " + sportcar.passengers +
        " пассажиров на расстояние " + range2 + " миль");

    }
}

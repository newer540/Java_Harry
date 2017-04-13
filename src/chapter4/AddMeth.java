package chapter4;

/**
 * Created by hbagratyan on 06.04.2017.
 */

class vehicle {
    int passengers;
    int mpg;
    int fuelcap;

    int range() {
        return mpg * fuelcap;
    }
}

class AddMeth {
    public static void main(String args[]) {
        vehicle minivan = new vehicle();
        vehicle sportscar = new vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Мини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль.");
        System.out.println("Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + sportscar.range() + " миль.");
// спортивного автомобиля

    }
}

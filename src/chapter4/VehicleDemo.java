package chapter4;

/**
 * Created 04.04.2017.
 * ���������, � ������� ������������ ����� Vehicle
 */
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}

// � ���� ������ ����������� ������ ���� Vehicle
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        //��������� �������� ����� � ������� minivan
        minivan.passengers =7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 12;
        sportcar.mpg = 20;

        //���������� ��������� ������� ��� ������ ����
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;
        System.out.println("M���-�yp�o� ����� ��������� " + minivan.passengers +
        " ���������� �� ���������� " + range1 + " ����");
        System.out.println("�������� ����� ��������� " + sportcar.passengers +
        " ���������� �� ���������� " + range2 + " ����");

    }
}

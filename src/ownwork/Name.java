package ownwork;
import java.util.Scanner;

/*Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.*/

class Name {
    public static void main(String args[]){
        String name;
        System.out.println("Введите ваше имя");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Вас зовут " + name);

    }
}

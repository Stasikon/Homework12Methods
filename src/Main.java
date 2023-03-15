import java.util.Scanner;

public class Main {


    public static int initLeapYaer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите Год");
        int yaer =scanner.nextInt();
        return yaer;
    }
    public static int checkOs(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Укажите вашу Os: iOS -0 или Android - 1");
        int clientOs = scanner1.nextInt();
        if (clientOs == 0 || clientOs == 1) {
            return clientOs;
        } else {
            throw new RuntimeException("Указана не существующая OS");
        }
    }
    public static int checkVersionYear(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Укажите год выпуска Вашего устройства");
        int clientDeviceYear = scanner2.nextInt();
        return clientDeviceYear;
    }
    public static int delivery(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Укажите дистанцию доставки");
        int distance = scanner3.nextInt();
                return distance;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1: Високосны год?");
        int yaer = initLeapYaer();
        if ((yaer %4==0)||(yaer%400==0)&&(yaer%100!=0)) {
            System.out.println(yaer+" Является високосным");
        }else{
            System.out.println(yaer+" Не является високосным");
        }
    }


    public static void task2() {
        System.out.println("Задача 2: Операционная система");
        int clientOS = checkOs();
        int clientDeviceYear = checkVersionYear();
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3: Доставки");
        int deliveryDistance = delivery();
        if (deliveryDistance <= 20) {
            System.out.println("Доставка 1 сутки "+deliveryDistance+" Км");
        } else if (deliveryDistance <= 20 || deliveryDistance <= 60) {
            System.out.println("Доставка 2е суток "+deliveryDistance+" Км");
        } else if (deliveryDistance <= 60 || deliveryDistance <= 100) {
            System.out.println("Доставка 3е суток "+deliveryDistance+" Км");
        } else if (deliveryDistance>100) {
            System.out.println("Доставки нет так как она превышает "+deliveryDistance+" Км");
    }
    }
}

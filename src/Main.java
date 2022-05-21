import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args) {

        //Задание №1
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }

        //Задание №2
        int clientOS1 = 0;
        int clientDeviceYear = 2014;

        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке ");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android По ссылке ");
            } else {
                System.out.println("Установите версию приложениия для Android по ссылке ");
            }
        }

        //Задание №3
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является весокосным");
        } else {
            System.out.println(year + " Не явялется весокосным");
        }

        //Задание №4
        int deliveryDistance = 95;

        int deliveryDays = 1;

        if (deliveryDistance > 20); {
            deliveryDays++;
        }

        if (deliveryDistance > 60); {
            deliveryDays++;
        }

        System.out.println("количество дней: " + deliveryDays);

        //Задание №5
        int monthNumber = 8;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println ("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ("Осень");
            default:
                System.out.println ("Не корректный месяц " + monthNumber);
        }

    }
}
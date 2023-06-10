import java.time.LocalDate;

public class Methods {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task1() {
        int year = 2021;
        checkLeapYear(year);
    }

    public static void checkOS(int clientOS, int yearOfIssue) {
        int iOS = 0;
        int androidOS = 1;
        int checkYear = LocalDate.now().getYear();
        if (clientOS == iOS && yearOfIssue < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == androidOS && yearOfIssue < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == androidOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС не поддерживается.");
        }
    }

    public static void task2() {
        int yearOfIssue = 2015;
        int clientOS = 0;
        checkOS(clientOS, yearOfIssue);

    }

    public static int deliver(int deliveryDistance) {
        int delivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (delivery + 1));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (delivery + 2));

        } else {
            System.out.println("Доставки нет.");
        }
        return delivery;
    }

    public static void task3() {
        int deliveryDistance = 110;
        deliver(deliveryDistance);

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}



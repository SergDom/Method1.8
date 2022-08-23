import java.time.LocalDate;

public class Main {


    static int checkingYear () {
        int currentYear = 2022;
        return currentYear;}

    // task 2
    static int operationSystem() {
        int system=0; // iOs=0, Android=1.
        return system;
    }
    static int productionYear() {
        int phoneYear = 2021;
        return phoneYear;
    }

    // task 3

    static int deliveryRange() {
        int deliveryDistance = 95;
        int day;
//        for (day = 0; day < deliveryDistance; day++);

        if (deliveryDistance < 20)
            day=0;
            else if (deliveryDistance >= 20 && deliveryDistance< 60)
                day=2;
                else (deliveryDistance >=60 && deliveryDistance <=100)
                   day=3;
        return day;}



    public static void main(String[] args) {

        System.out.println("Задание 1");
        {
            if (checkingYear() % 4 == 0 && checkingYear() % 100 != 0 || (checkingYear() % 400 == 0))
                System.out.println(checkingYear() + " - високосный год");
            else System.out.println(checkingYear() + " - не високосный год");
        }

        System.out.println("Задание 2");
        {
            int currentYear = LocalDate.now().getYear();

            System.out.println();

            if ( operationSystem() == 0 && productionYear() < currentYear) {
                System.out.println("Установите облегченную версию iOS ");
            } else if (operationSystem() == 0 && productionYear() >= currentYear) {
                System.out.println("Установите полную версию iOS ");
            }
            if (operationSystem() == 1 && productionYear() < currentYear) {
                System.out.println("Установите облегченную версию Android ");
            } else if (operationSystem() == 1 && productionYear() >= currentYear) {
                System.out.println("Установите полную версию Android ");
            }
        }

        System.out.println("Задание 3");
        {

            System.out.println(deliveryRange());
//        if (deliveryRange()<20) {
//            System.out.println ("срок доставки" + deliveryRange(int day) +"день");
        }


        }


    }



import java.time.LocalDate;

public class Main {


    static int checkingYear (int a) {
        int currentYear = a;
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

    static int deliveryRange(int d) {
        int day=0;
        if (d < 20)
            day=day+1;
            else if (d >= 20 && d< 60)
                day=day+2;
                else if (d >=60 && d <=100)
                   day=day+3;
        return day;}



    public static void main(String[] args) {

        System.out.println("\nЗадание 1");
        {
            int year = 2021;
            int review = checkingYear(year);

            if (review % 4 == 0 && review % 100 != 0 || (review % 400 == 0))
            System.out.println(review + " - високосный год");
           else System.out.println(review + " - не високосный год");
        }

        System.out.println("\nЗадание 2");
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

        System.out.println("\nЗадание 3");
        {
            int distance = 20;
            int check = deliveryRange(distance);
            if (distance < 20)
            System.out.println("Потребуется: " + check + " день");
            else if (distance >= 20)
            System.out.println("Потребуется: " + check + " дня") ;

        }


        }


    }



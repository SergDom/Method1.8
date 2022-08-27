import java.time.LocalDate;

public class Main {

    // task 1
    static void checkingYear (int year) {

        boolean checkingYear = true;
        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
            System.out.println(year + " - високосный год");
            else System.out.println(year + " - не високосный год");
    }

    // task 2
    static int receiveOs(String name) {
        if (name.equals("IoS")) {
            return 0;
        } else {
            return 1;}
    }
    static boolean productionYear (int product) {
        if (product >= LocalDate.now().getYear()) return true;
        else return false;
    }
    // task 3
    static int deliveryDay(int distance) {
        int day=0;
        if (distance < 20)
            day=day+1;
            else if (distance >= 20 && distance< 60)
                day=day+2;
                else if (distance >=60 && distance <=100)
                   day=day+3;
        return day;}


    public static void main(String[] args) {

        System.out.println("Задание 1");
        {

            checkingYear(2021);

//           if (review % 4 == 0 && review % 100 != 0 || (review % 400 == 0))
//           System.out.println(review + " - високосный год");
//           else System.out.println(review + " - не високосный год");
        }
        System.out.println();

        System.out.println("Задание 2");
        {
            int currentYear = LocalDate.now().getYear();
            int phoneOs = receiveOs("IoS");
            int year = 202;
            boolean phoneYear = productionYear(year);

            if (phoneOs == 0  && !phoneYear ) {
                System.out.println("Установите облегченную версию iOS ");
            } else if (phoneOs == 0 && phoneYear) {
                System.out.println("Установите полную версию iOS ");
            }
            if (phoneOs == 1 && phoneYear) {
                System.out.println("Установите облегченную версию Android ");
            } else if (phoneOs== 1 && !phoneYear) {
                System.out.println("Установите полную версию Android ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        {
            int distance = 20;
            int check = deliveryDay(distance);
            if (distance < 20)
            System.out.println("Потребуется: " + check + " день");
            else if (distance >= 20)
            System.out.println("Потребуется: " + check + " дня");
        }

        }

    }



import java.time.LocalDate;

public class Main {

    // task 1
    static int checkingYear (int a) {
        int currentYear = a;
        return currentYear;}

    // task 2
    static int receiveOs(String name) {
        if (name.equals("IoS")) {
            return 0;
        } else {
            return 1;}
    }
    // task 3
    static int productionYear (int a) {
        int phone = a;
        return phone;
    }

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

        System.out.println("Задание 1");
        {
            int year = 2021;
            int review = checkingYear(year);

            if (review % 4 == 0 && review % 100 != 0 || (review % 400 == 0))
            System.out.println(review + " - високосный год");
           else System.out.println(review + " - не високосный год");
        }
        System.out.println();

        System.out.println("Задание 2");
        {
            int currentYear = LocalDate.now().getYear();
            String operationSystem = "Andriod";
            int phoneOs = receiveOs(operationSystem);
            int year = 2022;
            int phoneYear = productionYear(year);

            if (phoneOs == 0  && phoneYear < currentYear) {
                System.out.println("Установите облегченную версию iOS ");
            } else if (phoneOs == 0 && phoneYear  >= currentYear) {
                System.out.println("Установите полную версию iOS ");
            }
            if (phoneOs == 1 && phoneYear < currentYear) {
                System.out.println("Установите облегченную версию Android ");
            } else if (phoneOs== 1 && phoneYear >= currentYear) {
                System.out.println("Установите полную версию Android ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        {
            int distance = 20;
            int check = deliveryRange(distance);
            if (distance < 20)
            System.out.println("Потребуется: " + check + " день");
            else if (distance >= 20)
            System.out.println("Потребуется: " + check + " дня");
        }

        }

    }



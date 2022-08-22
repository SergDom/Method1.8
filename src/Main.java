import java.time.LocalDate;

public class Main {

    // task 1
    static int checkingYear () {
        int currentYear = 2022;
        return currentYear;}

    // task 2
    static int operationSystem() {
        int operationSystem = 0; // iOS=0, Android=1
        int phoneYear = 2015;
        if (operationSystem == 0 && phoneYear < 2015) {
            String liteIos = "Установите облегченную версию iOS ";}
         else if (operationSystem == 0 && phoneYear >= 2015) {
            String fullIos = "Установите полную версию iOS ";}

            return liteIos;}



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

            if (clientSystem == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию iOS ");
            } else if (clientSystem == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите полную версию iOS ");
            }
            if (clientSystem == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию Android ");
            } else if (clientSystem == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите полную версию Android ");
            }
        }



    }
}


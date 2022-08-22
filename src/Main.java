public class Main {

    public static void main(String[] args) {

        if (checkingYear() % 4 == 0 && checkingYear() % 100 != 0 || (checkingYear() % 400 == 0))
        System.out.println(checkingYear() + " - високосный год");
        else System.out.println (checkingYear() + " - не високосный год");
    }

    static int checkingYear() {
        int currentYear = 2020;
        return currentYear;
    }


}


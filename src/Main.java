import org.w3c.dom.ls.LSOutput;

public class Main {


    // Задание 1


    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*1)*/
        printIsLeapYear(2020);
        printIsMessenger(1, 2008);
        cardDeliveryDays(100);

    }

    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }

    }

    // Задание 2


    private static void printIsMessenger(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println(" установите облегченную версию приложения для Андройд по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println(" установите облегченную версию для IOS по ссылке ");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println(" установите обычную версию приложения для Андроид");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println(" установите обычную версию приложения для IOS ");
        }
    }


    // Задание 3
    private static void cardDeliveryDays(int deliveryDistance) {
        int start = 20;
        int step = 40;
        int result;
        if (deliveryDistance<start){
            result=1;
        }else {
            result=(Math.abs((deliveryDistance-start)/step)+2);
        }
        System.out.println(" Потребуется дней для доставки: " + result);


    }
}








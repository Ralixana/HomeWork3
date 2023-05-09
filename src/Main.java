// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 12345678;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = -101;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = -12345;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 123456789L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 2.54f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 3.12345678906;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short paper = 480;
        System.out.println(paper + " бумаги всего");
        byte students = 23 + 27 + 30;
        System.out.println(students + " учеников");
        int sheets = paper / students;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesMinute = 16 / 2;
        System.out.println(bottlesMinute + " бутылок машина производит в минуту");
        int twentyMinutes = bottlesMinute * 20;
        System.out.println("За 20 минут машина произведет " + twentyMinutes + " штук бутылок");
        int hour = bottlesMinute * 60;
        int day = hour * 24;
        System.out.println("За сутки машина произведет " + day + " штук бутылок");
        int threeDays = day * 3;
        System.out.println("За 3 суток машина произведет " + threeDays + " штук бутылок");
        long month = day * 30;
        System.out.println("За месяц машина произведет " + month + " штук бутылок");
    }
}
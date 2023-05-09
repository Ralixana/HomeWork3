// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
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
    public static void task5 () {
        System.out.println("Задача 5");
        byte cans = 120;
        System.out.println("Банок с краской " + cans);
        byte wh = 2;
        System.out.println(wh + " белой банки краски на класс");
        byte br = 4;
        System.out.println(br + " коричневые банки краски на класс");
        int cansClass = wh + br;
        System.out.println(cansClass + " банок на класс");
        int cabinet = cans / cansClass;
        System.out.println(cabinet + " классов в школе");
        int white = cabinet * wh;
        System.out.println(white + " банок белой краски");
        int brown = cabinet * br;
        System.out.println("В школе, где " + cabinet + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananas = 80 * 5;
        System.out.println(bananas + "г бананов");
        short milk = 105 * 2;
        System.out.println(milk + "г молока");
        short iceCream = 100 * 2;
        System.out.println(iceCream + "г мороженого");
        short eggs = 70 * 4;
        System.out.println(eggs + "г яиц");
        int breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Вес завтрака - " + breakfast + "г");
        breakfast = breakfast / 1000;
        System.out.println("Вес завтрака - " + breakfast + "кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7 * 1000;
        System.out.println(weight + "г веса спортсмену требуется сбросить");
        short a = 250;
        int dayA = weight / a;
        System.out.println(dayA + " дней понадобится, если худеть на 250г в день");
        short b = 500;
        int dayB = weight / b;
        System.out.println(dayB + " дней понадобится, если худеть на 500г в день");
        int dayC = (dayA + dayB) / 2;
        System.out.println(dayC + " день в среднем понадобится, чтобы похудеть на 7кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        System.out.println(masha + " - старая зарплата Маши");
        int yearOld = masha * 12;
        System.out.println(yearOld + " - старая годовая зарплата Маши");
        double mashaNew = masha * 0.1 + masha;
        System.out.println(mashaNew + " - новая зарплата Маши");
        double yearNew = mashaNew * 12;
        System.out.println(yearNew + " - новая годовая зарплата Маши");
        double difference = yearNew - yearOld;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + difference + " рублей");
    }
    public static void task9 () {
        int denis = 83690;
        System.out.println(denis + " - старая зарплата Дениса");
        int yearOld = denis * 12;
        System.out.println(yearOld + " - старая годовая зарплата Дениса");
        double denisNew = denis * 0.1 + denis;
        System.out.println(denisNew + " - новая зарплата Дениса");
        double yearNew = denisNew * 12;
        System.out.println(yearNew + " - новая годовая зарплата Дениса");
        double difference = yearNew - yearOld;
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + difference + " рублей");
    }
        public static void task10 () {
        int kris = 76230;
        System.out.println(kris + " - старая зарплата Кристины");
        int yearOld = kris * 12;
        System.out.println(yearOld + " - старая годовая зарплата Кристины");
        double krisNew = kris * 0.1 + kris;
        System.out.println(krisNew + " - новая зарплата Кристины");
        double yearNew = krisNew * 12;
        System.out.println(yearNew + " - новая годовая зарплата Кристины");
        double difference = yearNew - yearOld;
        System.out.println("Кристина теперь получает " + krisNew + " рублей. Годовой доход вырос на " + difference + " рублей");
    }
}
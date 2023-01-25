
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
    }
    public static void task1() {
        int a = 2;
        System.out.println ("Значение переменной " + "a " + "с типом " + "int " + "равно " + a);
        byte b = 22;
        System.out.println ("Значение переменной " + "b " + "с типом " + "byte " + "равно " + b);
        short c = 14828;
        System.out.println ("Значение переменной " + "c " + "с типом " + "short " + "равно " + c);
        long d = 1488228;
        System.out.println ("Значение переменной " + "d " + "с типом " + "long " + "равно " + d);
        float e = 143.5f;
        System.out.println ("Значение переменной " + "e " + "с типом " + "float " + "равно " + e);
        double f = 123.5;
        System.out.println ("Значение переменной " + "f " + "с типом " + "double " + "равно " + f);
    }
    public static void task2() {
        int a = 569;
        System.out.println (a);
        byte b = 67;
        System.out.println (b);
        short c = 27897;
        System.out.println (c);
        long d = 987_678_965_549L;
        System.out.println (d);
        float e = 2.786f;
        System.out.println (e);
        double f = 27.12;
        System.out.println (f);
    }
    public static void task3() {
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int quantity = aS + lP + eA;
        System.out.println("Количество учеников " + quantity + " человек");
        int papers = 480;
        int quantityPapers = papers/quantity;
        System.out.println("Количество листков на каждого ученика " + quantityPapers);
    }
    public static void task4() {
        int quantityBottles = 16;
        int time = 2;
        int quantityBottles20 = quantityBottles * 10;
        System.out.println("За 20 минут машина произвела " + quantityBottles20 + " штук бутылок");
        int quantityBottles1440 = quantityBottles * 720;
        System.out.println("За сутки минут машина произвела " + quantityBottles1440 + " штук бутылок");
        int quantityBottles4320 = quantityBottles * 2160;
        System.out.println("За 3 дня машина произвела " + quantityBottles4320 + " штук бутылок");
        int quantityBottles44640 = quantityBottles * 22320;
        System.out.println("За месяц машина произвела " + quantityBottles44640 + " штук бутылок");
    }
    public static void task5() {
        short quantityColours = 120;
        int quantityClasses = quantityColours / 6;
        System.out.println("Количество классов " + quantityClasses);
        int whitePrint = quantityClasses * 2;
        int brownPrint = quantityClasses * 4;
        System.out.println("В школе, где 20 классов, нужно" + whitePrint + "банок белой краски и " + brownPrint + " банок коричневой краски");
    }
    public static void task6() {
        short bananas = 5;
        short milk = 210;
        short iceCream = 2;
        short eggs = 4;
        int weightGr = bananas * 80 + milk + iceCream * 100 + eggs * 70;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Масса напитка " + weightKg + " кг");
    }
    public static void task7() {
        int weightEveryday = 7_000;
        int weightEverydayMin = 250;
        int weightEverydayMax = 500;
        double maxDaysCount = (double) weightEveryday/weightEverydayMin;
        double minDaysCount = (double) weightEveryday/weightEverydayMax;
        double lossWeightPerDayAverage = (weightEverydayMin+weightEverydayMax)/ 20;
        double averageDayCounts = weightEveryday/lossWeightPerDayAverage;
        System.out.println("Минимальное количество дней для похудения " + minDaysCount);
        System.out.println("Максимальное количество дней для похудения " + maxDaysCount);
        System.out.println("Среднее количество дней для похудения " + averageDayCounts);

    }
    public static void task8() {
        int Maria = 67760;
        int Denis = 83690;
        int Christina = 76230;
        int annualMaria = Maria * 10 / 100;
        int annualMaria1 = Maria + annualMaria;
        System.out.println("Маша теперь получает " + annualMaria1 + " рублей" + "." + "Годовой доход вырос на " + annualMaria + " рублей");
        int annualDenis = Denis * 10 / 100;
        int annualDenis1 = Denis + annualDenis;
        System.out.println("Денис теперь получает " + annualDenis1 + " рублей"+ "." + "Годовой доход вырос на " + annualDenis + " рублей");
        int annualChristina = Christina * 10 / 100;
        int annualChristina1 = Christina + annualChristina;
        System.out.println("Кристина теперь получает " + annualChristina1 + " рублей" + "." + "Годовой доход вырос на " + annualChristina + " рублей");

    }
}

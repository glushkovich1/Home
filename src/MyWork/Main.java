package MyWork;

public class Main {
    public static void main(String[] args) {
        One();
        System.out.println("a * (b + (c / d)) = " + Two(2,4,12,3));
        System.out.println(Three(7, 6));
        Four(19);
        System.out.println(Five(-5));
        Six("Александр");
        Seven(2020);
    }
    static void One() {
        System.out.println("Задание 1.");
        byte bt = 124;
        short s = 12442;
        int i = 1000;
        float f = 12.23f;
        double d = -123.123;
        char c = 'x';
        boolean b = false;
        long l = 200000L;

        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа long = " + l);
    }
    static double Two(double a, double b, double c, double d) {
        System.out.println("\nЗадание 2.");
        return a * (b + (c / d));
    }
    static boolean Three(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    static void Four(int a) {
        System.out.println("\nЗадание 4.");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    static boolean Five(int a) {
        System.out.println("\nЗадание 5.");
        if (a < 0) return true;
        return false;
    }
    static void Six(String name) {
        System.out.println("\nЗадание 6.");
        System.out.println("Привет, " + name + "!");
    }
    static void Seven(int year) {
        System.out.println("\nЗадание 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }
}

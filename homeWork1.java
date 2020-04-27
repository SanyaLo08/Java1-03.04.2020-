public class homeWork1 {
    public static void main(String[] args) { // 1.1
        doOne(); // 1.2
        System.out.println("a * (b + (c / d)) = " + doTwo(3,6,9,12)); // 1.3
        System.out.println(doThree(7, 10)); // 1.4
        doFour(-7); // 1.5
        System.out.println(doFive(-7)); // 1.6
        doSix("Студенты"); // 1.7
        doSeven(2020); // 1.8
    }

    //1.2 - Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void doOne() {
        System.out.println("Задание 1.2 ");
        byte b = 10;
        short s = 2404;
        int i = 123456;
        long l = 1500L; // для переменной long в конце ставится буква L
        float f = 120.0f; // для переменной float в конце ставится буква f
        double d = 15.72775;
        boolean bool = true;
        String hl = "Hello, Alex!";
        char c = 'A';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(hl);
        System.out.println(c);
    }

    //1.3 - Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;
    static double doTwo(double a, double b, double c, double d) {
        System.out.println("\nЗадание 1.3 ");
        return a * (b + (c / d));
    }

    //1.4 - Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 1.4");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //1.5 - Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void doFour(int a) {
        System.out.println("\nЗадание 1.5 ");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    // 1.6 - Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    static boolean doFive(int a) {
        System.out.println("\nЗадание 1.6");
        if (a < 0) return true;
        return false;
    }

    // 1.7 - Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void doSix(String name) {
        System.out.println("\nЗадание 1.7");
        System.out.println("Привет, " + name + "!");
    }

    // 1.8 - * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void doSeven(int year) {
        System.out.println("\nЗадание 1.8");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный, будь он не ладен :( ");
    }
}
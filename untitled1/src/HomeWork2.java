public class HomeWork2 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method5();
    }
    public static boolean method1() {
        int a = 5;
        int b = 9;
        if (a + b > 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        return true;
    }
    public static void method2() {
        int a = 4;
        if (a >= 0) {
            System.out.println("Положительная");
        } else {
            System.out.println("Отрицательная");
        }

    }

    public static boolean method3() {
        int c = 5;
        if (c > 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        return false;
    }

    public static void method5() {
        int x = 4;
        if (x % 4 == 0 && (x % 100 != 0 || x % 400 == 0)) {
            System.out.println(x + "-й високосный");
        } else {
            System.out.println(x + "-й не високосный");
        }

    }
}

public class MainJava {

    public static void main (String[] args) {
        System.out.println("Hehe");

        MainKt.printJava();

        System.out.println(MainKt.multiply(10, 20));
        System.out.println(MainKt.divide(10, 20));
    }

    /// 1. java
    public static void printKotlin() {
        System.out.println("Halo, ini dari java");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }
}



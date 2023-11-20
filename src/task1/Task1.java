package task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
        System.out.println(calculate(11, 22));
        System.out.println(calculate(0, 0));
    }

    public static double calculate(double x, double y) {
        double operation = 1 + Math.pow(Math.sin(x + y), 2);
        return operation / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}

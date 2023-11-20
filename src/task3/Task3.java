package task3;

public class Task3 {

    public static void main(String[] args) {
        double h = 0.2;
        double a = 0;
        double b = 1;
        System.out.println(function(a, b, h));
    }

    public static String function(double a, double b, double h){
        StringBuilder result = new StringBuilder();
        for (double x = a; x <= b; x+=h )
            result.append(String.format("| %.4f | %.4f |\n", x, Math.tan(x)));
        return result.toString();
    }
}

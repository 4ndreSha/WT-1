package task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(check(1, 1));
        System.out.println(check(2, 2));
        System.out.println(check(-5, -5));
    }

    public static boolean check(int x, int y) {
        Boolean lowFigure = (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
        Boolean upFigure = (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
        return lowFigure || upFigure;
    }
}

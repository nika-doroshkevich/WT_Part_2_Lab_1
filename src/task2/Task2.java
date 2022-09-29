package task2;

public class Task2 {

    public static boolean belongsToShadedArea(double x, double y) {
        return ((y <= 0 && y >= -3) && (x >= -6 && x <= 6)) || ((y > 0 && y <= 5) && (x >= -4 && x <= 4));
    }
}

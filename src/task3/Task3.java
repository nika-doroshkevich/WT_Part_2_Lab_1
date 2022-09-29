package task3;

public class Task3 {

    public static void calculateValuesOfFunctionOnSegment(double x, double a, double b, double h) {
        if (x < a || x >= b) {
            System.out.println("Your x is below a or above b!");
            return;
        }

        while (x <= b) {
            System.out.println(x + " -- " + Math.tan(x));
            x += h;
        }
    }
}

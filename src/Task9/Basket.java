package Task9;

public class Basket {

    private double totalWeight = 0;
    private int numberOfBlueBalls;

    public double findWeight(Ball[] balls) {
        for (int i = 0; i < balls.length; i++) {
            totalWeight += balls[i].getWeight();
        }
        return totalWeight;
    }

    public int findColor(Ball[] balls) {
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].getColor().equals("blue")) {
                numberOfBlueBalls++;
            }
        }
        return numberOfBlueBalls;
    }
}

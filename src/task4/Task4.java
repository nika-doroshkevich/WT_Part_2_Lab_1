package task4;

import java.math.BigInteger;

public class Task4 {

    public static void checkArrayForPrimeNumbers(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(numArray[i]);

            if (bigInteger.isProbablePrime((int) Math.log(numArray[i]))) {
                System.out.print(i + "  ");
            }
        }
        System.out.println(" ");
    }
}

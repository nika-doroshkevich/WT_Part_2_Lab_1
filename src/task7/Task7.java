package task7;

public class Task7 {

    public static void sortShell(int[] numArray) {
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= numArray.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < numArray.length; outer++) {
                temp = numArray[outer];
                inner = outer;
                while (inner > h - 1 && numArray[inner - h] >= temp) {
                    numArray[inner] = numArray[inner - h];
                    inner -= h;
                }
                numArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}

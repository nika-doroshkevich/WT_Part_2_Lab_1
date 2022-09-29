package Task8;

public class Task8 {

    public static void findPlacesToInsertSequenceElements() {
        int n = 5;
        int[] arr1 = {0, 1, 2, 6, 9};
        int[] arr2 = {5, 7, 78, 88, 89};
        int[] resArr = new int[10];

        int i;
        int j = 0;
        int t = 0;
        boolean chDouble = false;

        i = 0;
        while (i < n * 2) {

            if (t == n)
                t--;
            if ((arr1[j] < arr2[t]) && (j < n)) {
                resArr[i] = arr1[j];
                j++;
                chDouble = true;
            }

            if (j == n)
                j--;
            if ((arr1[j] >= arr2[t]) && (t < n)) {
                if (chDouble) {
                    i++;
                    chDouble = false;
                }
                resArr[i] = arr2[t];
                t++;
            }
            i++;
        }

        i = n * 2 - (n - j);
        if (t != n) {
            i = n * 2 - (n - t);
        }

        while (i < n * 2) {
            if (j != n) {
                resArr[i] = arr1[j];
                j++;
            }

            if (t != n) {
                resArr[i] = arr2[t];
                t++;
            }
            i++;
        }

        for (i = 0; i < n * 2; i++) {
            System.out.printf("%d ", resArr[i]);
        }
    }
}

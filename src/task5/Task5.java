package task5;

public class Task5 {

    public static void findSmallestNumberOfElements(int[] numArray) {
        int[] arr = numArray;

        int j;
        int i = 0;
        int k = 0;

        do {
            for (j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] = 0;
                }
            }
            i++;
        } while (i < arr.length);

        for (i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            if (arr[i] == 0)
                k++;
        }
        System.out.printf("\nk = %d", k);
    }
}

package Task6;

public class Task6 {

    public static void getSquareMatrixN() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] resArray = new int[5][5];
        int n = 5;

        int j = 0;
        int t = n;
        int valUp = 0;
        int valDown = 0;

        for (int i = 0; i < n; i++) {

            while (j < t) {
                resArray[i][j] = arr[j + valUp];
                System.out.printf("%d ", resArray[i][j]);
                j++;
                if (j == t) {
                    while (j < n) {
                        resArray[i][j] = arr[valDown];
                        System.out.printf("%d ", resArray[i][j]);
                        valDown++;
                        j++;
                    }
                    valDown = 0;
                }
            }

            valUp++;
            t--;
            j = 0;
            System.out.println();
        }
    }
}

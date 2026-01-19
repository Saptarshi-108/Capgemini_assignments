public class SaddlePoint {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i = 0; i < a.length; i++) {
            int minRow = a[i][0];
            int colIndex = 0;

            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] < minRow) {
                    minRow = a[i][j];
                    colIndex = j;
                }
            }

            boolean saddle = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k][colIndex] > minRow) {
                    saddle = false;
                    break;
                }
            }

            if (saddle)
                System.out.println("Saddle Point: " + minRow);
        }
    }
}

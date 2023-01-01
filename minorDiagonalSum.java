import java.util.*;

class minorDiagonalSum {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter rows and cols of the 2d matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        System.out.println();
        System.out.println("Enter elements of the 2d matrix: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Minor Diagnol sum = " + solve(A, row, col));
        sc.close();
    }

    public static int solve(int[][] A, int row, int col) {
        int sum = 0;
        for (int i=0; i<row; i++) {
            sum += A[i][row-i-1];
        }
        return sum;
    }
}
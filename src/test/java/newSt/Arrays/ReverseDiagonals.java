package newSt.Arrays;

public class ReverseDiagonals {

    public void reverseDiagonal(int[][] matrix, int N){

        int i =0;
        int j=N;
                while(i<j)
                {
                    int temp;

                    temp = matrix[i][i];
                    matrix[i][i] = matrix[j-1][j-1];
                    matrix[j-1][j-1] = temp;


                    temp = matrix[i][j-1];
                    matrix[i][j-1] = matrix[j-1][i];
                    matrix[j-1][i] = temp;

                    i++;
                    j--;






                }


                for (i=0; i<N; i++){
                    for (j=0; j<N; j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }



    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ReverseDiagonals reverseDiagonals = new ReverseDiagonals();
        reverseDiagonals.reverseDiagonal(arr, arr.length);

    }


}

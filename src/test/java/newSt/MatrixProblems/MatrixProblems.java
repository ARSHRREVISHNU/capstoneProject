package newSt.MatrixProblems;

public class MatrixProblems {

    public void addingDiagonalMatrix(int a[][], int rows){
        System.out.println("Adding Diagonal two matrics");
        int addedDiagonal = 0;
        int reverseDiagonal = 0;

        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){


                if(i==j){

                    addedDiagonal += a[i][j];
                }

                 if(i+j==rows-1){

                    reverseDiagonal += a[i][j];
                }

            }

        }

        System.out.println(addedDiagonal);
        System.out.println(reverseDiagonal);
    }

    public void addingTwoMatrics(int a[][], int b[][])
    {
        System.out.println("Adding two matrics");
        int c[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }


    public void subtractingTwoMatrics(int a[][], int b[][])
    {
        System.out.println("Subtracting two matrics");
        int c[][] = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = b[i][j] - a[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }

    public void multiplyTwoMatrics(int a[][], int b[][]){

        System.out.println("Multiply two matrics");
        int c[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = 0;
                for(int k=0; k<3; k++) {
                    c[i][j] += a[i][k] * a[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


    public void transposeMatrix(int a[][]){

        int transpose[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                transpose[i][j] = a[j][i];
            }
        }
        System.out.println("Original Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] b = {{1,1,1},{2,2,2},{3,3,3}};

        MatrixProblems matrixProblems = new MatrixProblems();
        //matrixProblems.addingDiagonalMatrix(a, 3);
        //matrixProblems.addingTwoMatrics(a, b);
        //matrixProblems.subtractingTwoMatrics(a, b);
        //matrixProblems.multiplyTwoMatrics(a, b);
        matrixProblems.transposeMatrix(a);
    }




}

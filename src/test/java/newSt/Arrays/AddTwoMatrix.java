package newSt.Arrays;

public class AddTwoMatrix {



    public void addTwoMatrix(int a[][], int b[][]){

        for (int i=0; i<a.length; i++){

            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void subTwoMatrix(int a[][], int b[][]){

        for (int i =0; i<a.length; i++){

            for(int j =0; j<a[i].length; j++){

                System.out.print(a[i][j] - b[i][j]+ " ");
            }

            System.out.println();
        }

    }

    public void arrayMul(int[][] a, int[][] b){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]*b[i][j]+" ");
            }


            System.out.println();
        }

    }

    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        AddTwoMatrix addTwoMatrix = new AddTwoMatrix();
        addTwoMatrix.addTwoMatrix(a, b);
        addTwoMatrix.subTwoMatrix(a,b);
        addTwoMatrix.arrayMul(a,b);

    }


}

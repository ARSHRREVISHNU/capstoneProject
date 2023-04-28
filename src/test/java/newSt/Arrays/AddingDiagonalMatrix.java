package newSt.Arrays;

public class AddingDiagonalMatrix {

    public void diagonalMatrix(){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j<arr[0].length; j++){


                if(i==j){
                   sum = sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
     AddingDiagonalMatrix addingDiagonalMatrix = new AddingDiagonalMatrix();
     addingDiagonalMatrix.diagonalMatrix();

    }


}

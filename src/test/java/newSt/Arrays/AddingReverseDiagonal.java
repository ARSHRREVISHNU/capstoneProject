package newSt.Arrays;

public class AddingReverseDiagonal {

  public void addRevDia(int[][] matrix){
    int sum=0;
    for(int i= 0; i<matrix.length; i++){
      for(int j= matrix.length; j>=0; j--){

        if(i==(j-1)){
         sum = sum+matrix[i][j-1];
        }
      }

    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    AddingReverseDiagonal addingReverseDiagonal = new AddingReverseDiagonal();

    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

    addingReverseDiagonal.addRevDia(arr);
  }

}

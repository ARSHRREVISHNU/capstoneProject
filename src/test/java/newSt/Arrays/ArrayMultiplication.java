package newSt.Arrays;

public class ArrayMultiplication {

public void mulMat(int[][] a, int[][] b){
    int i=0,j=0;

    System.out.println(a.length);
    System.out.println(a[i].length);

    if(a[i].length==a.length && b[i].length == b.length && a.length ==b.length){

    for(i=0; i<a.length; i++){

        for(j=0; j<a[i].length; j++){

            int value = 0;


            for(int k =0; k<a.length; k++){
               int mul = a[i][k]*b[k][j];
                value = value+mul;
            }

            System.out.print(value+" ");




        }
        System.out.println();
    }

    }
else {
        System.out.println("Length was not equal.");
    }

}

    public static void main(String[] args) {
        ArrayMultiplication arrayMultiplication = new ArrayMultiplication();
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};

        arrayMultiplication.mulMat( a, b);
    }


}

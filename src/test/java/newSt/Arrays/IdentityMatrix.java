package newSt.Arrays;

public class IdentityMatrix {


    public void identity(){

        boolean condi = true;
        int a[][] = {

                {1,0,0},
                {0,1,0},
                {0,0,1}
        };



        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
              if(i==j && a[i][j] !=1){
                  condi = false;
                  break;
              }

            if (i !=j && a[i][j] !=0){
                condi = false;
                break;
            }

            }
        }
        if(condi){
            System.out.println("Its an Identity Matrix");
        }
        else {
            System.out.println("its not an identity matrix.");
        }

    }

    public static void main(String[] args) {
        IdentityMatrix identityMatrix = new IdentityMatrix();
        identityMatrix.identity();
    }

}

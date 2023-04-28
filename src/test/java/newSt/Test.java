package newSt;

public class Test {

    public static void main(String[] args) {

        String str = "Hello I am Shrrevishnu";
       String[] str1 = str.split(" ");
        int count = str1.length;
        String str2 = "";
        for (int i=0; i<count-1; i++){

            if(i == count-2){
            str2 += str1[i+1] + " ";
            str2 += str1[i];
            }
            else {
                str2 += str1[i]+ " ";
            }


        }
        System.out.println(str2);

    }

}

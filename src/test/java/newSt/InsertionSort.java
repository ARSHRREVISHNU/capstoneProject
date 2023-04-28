package newSt;

public class InsertionSort {

public void insertionSort(int arr[]){
for(int i=1; i<arr.length; i++){

    int key = arr[i];
    int j = i-1;

    while(j>-1&& arr[j] >key){
        arr[j+1] = arr[j];

        j--;
    }
    arr[j+1] = key;
}
            for(int value: arr){
                System.out.println(value+" ");
            }


    }


    public static void main(String[] args) {
        int arr[] = {3,6,1,10,5,96,87,45,100};
        for(int value: arr){
            System.out.print(value+" ");
        }
        System.out.println(" ");
      InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr);

    }
}

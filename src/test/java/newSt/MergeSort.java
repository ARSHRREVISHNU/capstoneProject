package newSt;

public class MergeSort{

    public void mergeSort(int arr[], int beg, int mid, int end){

        int i,j,k;
        int n1, n2;
        n1 = mid-beg+1;
        n2 = end - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for(i=0; i<n1; i++){
            leftArray[i] = arr[beg+i];
        }
        for (j=0; j<n2; j++){
            rightArray[j] = arr[mid+1+j];
        }

        i=0;
        j=0;
        k=beg;
        while(i<n1 && j<n2){

            if(leftArray[i] <=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else {
               arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;

        }
        while (j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;


        }
    }

    public void array(int arr[]){


        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }


    public void merge(int arr[], int beg, int end){

        if(beg<end){

            int mid = (beg+end)/2;
            merge(arr, beg, mid);
            merge(arr, mid+1, end);
            mergeSort(arr, beg, mid, end);

        }


    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,59,87,65,34,18};

        int beg = 0;
        int end = 7;

        MergeSort sort = new MergeSort();
        sort.merge(arr, beg, end);
        sort.array(arr);


    }
}
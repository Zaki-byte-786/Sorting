import java.util.Arrays;

public class merge_Sort {
    static void merge(int [] array,int l,int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int [] array_n1 = new int[n1];
        int [] array_n2 = new int[n2];
        for (int i = 0; i < n1; i++) array_n1[i] = array[l+i];
        for (int i = 0; i < n2; i++) array_n2[i] = array[mid+1+i];
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(array_n1[i] <= array_n2[j]){
                array[k++] = array_n1[i++];
            }
            else {
                array[k++] = array_n2[j++];
            }
        }
        while (i < n1){
            array[k++] = array_n1[i++];
        }
        while (j < n2){
            array[k++] = array_n2[j++];
        }

    }
    static void mergeSort(int [] array,int l,int r){
        if(l>=r)return;
        int mid = (l + r)/2;
        mergeSort(array,l,mid);
        mergeSort(array,mid+1,r);
        merge(array,l,mid,r);
    }
    public static void main(String[] args) {
        int [] array = {1,9,4,7};
mergeSort(array,0,array.length-1);
        System.out.print(Arrays.toString(array));
    }
}

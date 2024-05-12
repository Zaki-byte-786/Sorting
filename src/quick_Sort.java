import java.util.Arrays;
import java.util.Random;
public class quick_Sort {
    static int randomNumberGenerator(int max,int min){
        Random r = new Random();
        int random = r.nextInt(max - min + 1) + min;
        return random;
    }

    static void swap(int [] array,int x,int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    static int partition(int[] array,int st,int end){
        int pivot = array[randomNumberGenerator(st,end)];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if(pivot > array[i]){
                count++;
            }
        }
        int pivotIndex = count + st;
        swap(array,st,pivotIndex);
        int i = st;
        int j = end;
        while (i < pivotIndex && j > pivotIndex){
while (array[i] <= array[pivotIndex])i++;
while (array[j] > array[pivotIndex])j--;
if(i < pivotIndex && j > pivotIndex){
    swap(array,i,j);
    i++;
    j--;
}
        }
return pivotIndex;

    };
    static void quickSort(int [] array,int st,int end){
        if(st >= end){
            return;
        }
        int pivotIndex = partition(array,st,end);
        quickSort(array,st,pivotIndex-1);
        quickSort(array,pivotIndex+1,end);
    }
    public static void main(String[] args) {
        int [] array = {7,4,3,2,5,6,8};
  quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
//        System.out.println(randomNumberGenerator(10,1));
     }
}

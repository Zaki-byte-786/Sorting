import java.util.Arrays;

public class count_Sort {
    static int findMax(int [] array){
       int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxElement){
                maxElement = array[i];
            }
        }
        return maxElement+1;
    }
//    static void countArrayMethod(int [] array){
//        int countArray_length = findMax(array);
//        int [] countArray = new int[countArray_length];
//        for (int i = 0; i < array.length; i++) {
//            countArray[array[i]]++;
//        }
//    }

//    the below method can sort the array but it will not retain the stablility property

//static void basicCountSort(int[] array){
//        int max = findMax(array);
//        int [] count = new int[max+1];
//    for (int i = 0; i < array.length; i++) {
//        count[array[i]]++;
//    }
//    int k = 0;
//    for (int i = 0; i < count.length; i++) {
//        for (int j = 0; j < count[i]; j++) {
//            array[k++] = i;
//        }
//    }
//}


    public static void main(String[] args) {
        int [] array = {4,3,1,5,3,1,3,5};
//        countArrayMethod(array);
        int countArraysize = findMax(array);
       int [] countArray = new int[countArraysize];
//        System.out.println(Arrays.toString(countArray));
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
//        System.out.println(Arrays.toString(countArray));
//        int [] prefixSumArray = new int[countArraysize];
//          prefixSumArray[0] =  countArray[0];
        for (int i = 1; i < countArraysize; i++) {
            countArray[i] += countArray[i-1];
        }
//        System.out.println(Arrays.toString(countArray));
        int [] outputArray = new int[array.length];
        int j;
        for (int i = array.length-1; i >= 0; i--) {
            j = countArray[array[i]]-1;
            outputArray[j] = array[i];
            countArray[array[i]]--;
        }
        System.out.println(Arrays.toString(outputArray));
    }
}

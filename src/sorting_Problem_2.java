import java.util.Arrays;

public class sorting_Problem_2 {
    static void swap(int [] array,int x,int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    static void question_3_alternateMethod(int[] array ){
        int count_0 = 0,count_1 = 0,count_2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)count_0++;
            else if (array[i] == 1) count_1++;
            else count_2++;
        }
        int i = 0;
        while (count_0>0){
            array[i++] = 0;
            count_0--;
        }
        while (count_1 > 0){
            array[i++] = 1;
            count_1--;
        }
        while (count_2 > 0){
            array[i++] = 2;
            count_2--;
        }
    }
    static void question_3(int [] array){
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        while (mid <= high){
            if (array[mid] == 0){
                swap(array,mid,low);
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else if (array[mid] == 2) {
                swap(array,mid,high);
                high--;
            }
        }

    }
    static void question_2(int [] array){
            int i = 0;
            int j = array.length-1;
            while (i < j){
                if (array[i] >= 0 && array[j] < 0 ){
                    swap(array,i,j);
                    i++;
                    j--;
                } else if (array[i] < 0) {
                    i++;
                } else if (array[j] >= 0) {
                    j--;
                }
            }
    }
    static void question_1(int [] array){
        int i = 0;
        int j = array.length-1;
        if (j<=1){
            swap(array,i,j);
            return;
        }
        i=1;
        while (i < j){
            if (array[i] < array[i-1] && array[j] < array[j-1]){
                swap(array,i-1,j);
            } else if (array[i] > array[i-1]) {
                i++;

            } else if (array[j] > array[j-1]) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {10,5,6,7,8,9,3};
        int [] array_2 = {19,-20,7,-4,-13,11,-5,3};
        int [] array_3 = {2,2,0,0,1,0,1,1,0};
question_1(array);
        System.out.println(Arrays.toString(array));
        question_2(array_2);
        System.out.println(Arrays.toString(array_2));
        question_3(array_3);
        System.out.println(Arrays.toString(array_3));
        question_3_alternateMethod(array_3);
        System.out.println(Arrays.toString(array_3));
    }
}

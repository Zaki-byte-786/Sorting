import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int [] array = {6,5,3,7,2};
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

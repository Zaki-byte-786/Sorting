import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int [] array = {6,5,3,7,1};
        for (int i = 0; i < array.length-1; i++) {
            int min_value_index = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] <array[min_value_index] ){
                    min_value_index = j;
                }
            }
            int temp = array[i];
            array[i] =array[min_value_index];
            array[min_value_index] = temp;
            System.out.println(Arrays.toString(array));
        }
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

import java.util.Arrays;

public class problem_1 {
static void stringSort(String [] s){
    for (int i = 0; i < s.length; i++) {
       int min_value_index = i;
        for (int j = i+1; j < s.length; j++) {
            if(s[j].compareTo(s[min_value_index]) < 0){
                min_value_index = j;
            }
        }
        String temp = s[min_value_index];
        s[min_value_index ] = s[i];
        s[i] = temp;
    }
}

    public static void main(String[] args) {
        int [] array = {0,5,0,4,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] == 0 && array[j+1] != 0){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        String [] s = {"mango","papaya","orange","apple"};
        stringSort(s);
        for (String x : s){
            System.out.print(x+" ");
        }
    }
}

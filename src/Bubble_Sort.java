public class Bubble_Sort {
    static int [] bubbleSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)return array;
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array = {1,6,2,3,4};
        for (int i : bubbleSort(array)){
            System.out.print(i+" ");
        }
    }
}

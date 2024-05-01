public class quick_Sort {
    static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    static int partition(int[] array){
        int n = array.length;
        int partition = 0;
        for (int i = 0; i < n-1; i++) {
            if(i == 0){
                if(array[i] > array[i+1]){
                    swap(array[i],array[i+1]);
                }
            }
            else {
                if(array[i] > array[i+1]){
                    swap(array[i],array[i+1]);
                } else if (array[i] < array[i-1]) {
                    swap(array[i],array[i-1]);
                }
                else if (array[i-1] < array[i] && array[i] < array[i+1]) {
                    partition = i;
                    return partition;
                }
            }
        }
        return partition;
    }
    public static void main(String[] args) {
        int [] array = {7,4,3,2,5,6,8};
  int a =   partition(array);
        System.out.println(a);
     }
}

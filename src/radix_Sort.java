public class radix_Sort {
    static int maximumElementFind(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]);
            max = array[i];
        }
        return max;
    }
    static void countSort(int [] array,int place){
//       int countArraySize = maximumElementFind(array);

       int countArraySize = 10;
        int [] countArray = new int[countArraySize];
        for (int i = 0; i < array.length; i++) {
            countArray[(array[i]/place)%10]++;
        }
        for (int i = 1; i < countArraySize; i++) {//psa
            countArray[i] += countArray[i-1];
        }
        int [] tempArray = new int[array.length];
        for (int i = array.length-1; i >= 0 ; i--) {
            tempArray[countArray[(array[i]/place)%10]-1] = array[i];
            countArray[(array[i]/place)%10]--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }
    static void radixSort(int [] array){
        int max = maximumElementFind(array);
        for (int place = 1; max/place > 0 ; place *= 10) {
              countSort(array,place);
        }
    }
    public static void main(String[] args) {
        int [] array = {404,313,112,511,113,321,2309,1358};
radixSort(array);
        for (int val : array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

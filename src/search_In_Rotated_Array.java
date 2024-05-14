public class search_In_Rotated_Array {
    static int minimumElementIndexOfRotatedArray(int[] array){
        int start = 0;
        int end = array.length-1;
        int n = array.length;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] <= array[n-1]){
                end = mid - 1;
                ans = mid;
            } else if (array[mid] > array[n-1]) {
                start = mid + 1;
            }
//            else if (array[mid] == array[n-1]) {
//                ans = mid;
//                return ans;
//            }
        }
        return ans;
    }
    static int targetInRotatedArray(int [] array,int target){
    int start = 0;
    int end = array.length-1;
    int ans = -1;
    while (start <= end ){
        int mid = start + (end - start) / 2;
       if (array[mid] == target)return mid;
       else if (array[mid] <= array[end]) {
           if (array[mid] < target && array[end] >= target){
               start = mid + 1;
           }
           else {
               end = mid - 1;
           }
       }
       else if(array[mid] >= array[start]){
           if (array[start] <= target && array[mid] > target){
           end = mid - 1;
           }
           else {
               start = mid + 1;

           }
       }
    }
    return ans;
    }
    static int targetInRotatedArrayWithduplicateElement(int [] array,int target){
        int start = 0;
        int end = array.length-1;
        int ans = -1;
        while (start <= end ){
            int mid = start + (end - start) / 2;
            if (array[mid] == target)return mid;
            else if (array[start] == array[mid] && array[mid] == array[end]) {
                start++;
                end--;
            } else if (array[mid] <= array[end]) {
                if (array[mid] < target && array[end] >= target){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else if(array[mid] >= array[start]){
                if (array[start] <= target && array[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int [] array = {10,11,12,13,1,2,3,4,5,6,7,8,9};
        int [] array = {2,3,4,5,1};
        int [] array_1 = {1,1,2,2,0,0,1};
        System.out.println(minimumElementIndexOfRotatedArray(array));
        System.out.println(targetInRotatedArray(array,1));
        System.out.println(targetInRotatedArrayWithduplicateElement(array_1,2));
    }
}

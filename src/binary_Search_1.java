public class binary_Search_1 {
    static int basicBinarySearch(int [] array,int target){
        int start = 0;
        int end = array.length-1;
        int mid ;
        while (start <= end){
        mid = start + (end - start) / 2;

            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;
            }

        }
        return -1;
    }
    static int firstOccurenceIndex(int [] array,int target){
        int start = 0;
        int ans = -1;
        int end = array.length-1;
        while (start <= end){
        int mid = start + (end - start) / 2 ;
            if (array[mid] == target){
                ans = mid;
                end = mid - 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static int lastOccurenceIndex(int [] array,int target){
        int start = 0;
        int ans = -1;
        int end = array.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (array[mid] == target){
                ans = mid;
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static int recursiveBinarySearch(int [] array,int target,int start,int end){
       while (start <= end){
        int mid = start + (end - start) / 2;
           if (target == array[mid]){
               return mid;
           } else if (target > array[mid]) {
               return recursiveBinarySearch(array,target,mid+1,end);
           } else if (target < array[mid]) {
               return recursiveBinarySearch(array,target,start,mid-1);
           }
       }
return -1;
    }

static int squareRoot(int x){
        int ans = -1;
        int start = 0;
        int end = x;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int value = mid * mid;
            if (x == value)return mid;
            else if (value > x) {
                end = mid - 1;

            }
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
}
    public static void main(String[] args) {
        int [] array = {1,2,4,5,6,7,8,11,13,154};
        System.out.println(basicBinarySearch(array,154));
        System.out.println(recursiveBinarySearch(array,3,0,9));
        int [] firstOccurence = {1,5,5,5,6,6,7,7,7,8,8,8,8,8,9};
      int result =  firstOccurenceIndex(firstOccurence,8);
        System.out.println(result);
         result =  lastOccurenceIndex(firstOccurence,8);
        System.out.println(result);
        System.out.println(squareRoot(34));
    }
}

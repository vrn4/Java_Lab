public class maxmin{
    public static void main(String[] args) {
        int arr1[] = {81,32,139,10,75};
        int maxVal = largest(arr1);
        System.out.println("The max value is " + maxVal);
        int minVal = smallest(arr1);
        System.out.println("The min value is " + minVal);
    }
    static int largest(int []arr1){
        int max = arr1[0];
        for(int val:arr1){
            if(max<val){
                max = val;
            }
        }
        return max;
    }
    static int smallest(int []arr1){
        int min = arr1[0];
        for(int val:arr1){
            if(min>val){
                min = val;
            }
        }
        return min;
    }
}

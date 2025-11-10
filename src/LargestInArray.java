public class LargestInArray {
    public static void main(String[] args) {

        int arr[] = {1,3,5,6,23,679,22,67,12,78};
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i =0; i<n; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest element is "+ max);
    }
}

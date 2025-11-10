public class FirstAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = {4,6,9,1,2,12,36,8};
        int n = arr.length;
        int i;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (i = 0; i < n; i++){
            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else {
                if (arr[i] > secondMax){
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("First largest: " + firstMax);
        System.out.println("Second largest: "+ secondMax);
    }
}

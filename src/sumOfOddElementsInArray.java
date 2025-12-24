public class sumOfOddElementsInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3, 7, 18, 17};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i]%2 !=0)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

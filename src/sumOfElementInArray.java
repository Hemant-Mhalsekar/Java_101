public class sumOfElementInArray {
    public static void main(String[] args) {
        int arr[] = {4, 81, 53, 59, 12, 33,45};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

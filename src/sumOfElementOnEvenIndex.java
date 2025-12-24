public class sumOfElementOnEvenIndex {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 5, 6, 7, 8};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

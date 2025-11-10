public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 0};

        boolean flag = true;
        int n = arr.length;
        for (int i = 1; i<n; i++)
        {
            if (arr[i] < arr[i-1])
            {
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}

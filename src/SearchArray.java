public class SearchArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 3, 7};

        int n = arr.length;
        int elem = 6;
        boolean flag = false;

        for (int i = 0; i<n; i++){
            if (arr[i] == elem) {
                flag = true;
            }
        }
        if (flag == true){
            System.out.println("Element found");
        }else {
            System.out.println("Element not found");

        }

    }
}

public class FindLeader {

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,23,679,22,607,12,78};
        int n = arr.length;
        int leader = arr[n-1];
        System.out.println("Leader is "+leader);

        for (int i = n-2; i >= 0; i--){
            if (arr[i] > leader){
                leader = arr[i];
                System.out.println("Leader is "+leader);
            }
        }
    }
}

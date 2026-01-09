package ArrayPrograms;

public class IntermediateQuestions {
    public static void main(String[] args) {
        int[] arr = {21, 52, 9, 46, 32, 12, 21, 18, 9, 12, 55, 15, 38};
        int i;
        // Write a program to find the second largest element in an array.
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(i = 0; i < arr.length; i++){
            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second max = "+secondMax);

        // Write a program to find the second smallest element in an array.
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (i = 0; i < arr.length; i++){
            if (arr[i] < firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }
        System.out.println("Second min = "+secondMin);

        // Write a program to check if an array is sorted.
        boolean flag = true;
        for (i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array not sorted");
        }
        // Write a program to copy one array into another array.
        int [] arr2 = new int[arr.length] ;

        for (i=0; i< arr.length; i++){
            arr2[i] = arr[i];

        }
        for (i=0; i< arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        // Write a program to count duplicate elements in an array.
        int duplicateCount = 0;
        for (i = 0; i < arr.length; i++){
            boolean isDuplicate = false;

            //check if arr[i] appeared before
            for (int k = 0; k < i; k++){
                if (arr[i] == arr[k]){
                    isDuplicate = true;
                    break;
                }
            }

            // if not appeared before, check if appears later
            if (!isDuplicate){
                for (int j = i+1; j< arr.length; j++){
                    if (arr[i] == arr[j]){
                        duplicateCount++;
                        break;
                    }
                }
            }
        }
        System.out.println("Duplicate elements count = "+ duplicateCount);
        // Write a program to remove duplicate elements from a sorted array.
        // Write a program to find the sum of elements at odd indexes.
        // Write a program to find the sum of elements at even indexes.
        // Write a program to find the difference between max and min elements.
        // Write a program to print all negative numbers in an array.
    }
}

package ArrayPrograms;

public class EasyQuestions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0, 8, 9, 10};
        int i;

        // Write a program to print all elements of an array.
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Write a program to find the sum of all elements in an array.
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);

        // Write a program to count the number of elements in an array.
        System.out.println("The Count is "+ arr.length);
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Count is " + count);


        // Write a program to find the maximum element in an array.
        int max = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is " + max);

        // Write a program to find the minimum element in an array.
        int min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum is " + min);

        // Write a program to count even and odd numbers in an array.
        int even = 0;
        int odd = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers " + even);
        System.out.println("Odd numbers " + odd);

        // Write a program to print elements at even indexes.
        System.out.println("Elements at even indexes");
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Write a program to print elements at odd indexes.
        System.out.println("Elements at odd indexes");
        for (i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Write a program to search an element in an array (linear search).
        int target = 6;
        int position = -1;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i;
                 ;
            }
        }

        if (position != -1) {
            System.out.println("Element found: " + arr[position] + " at position " + position);
        } else {
            System.out.println("Element not found");
        }

        // Write a program to print the array in reverse order.
        System.out.println("Array in reverse order");
        for (i= arr.length - 1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }

    }
}
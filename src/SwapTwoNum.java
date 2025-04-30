import java.util.Scanner;

public class SwapTwoNum {

    void swapTwoNum(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Numbers after swapping is "+a+" and "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Numbers before swapping is "+num1+" and "+num2);

        SwapTwoNum swap = new SwapTwoNum();
        swap.swapTwoNum(num1,num2);

        sc.close();
    }
}

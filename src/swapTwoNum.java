import java.util.Scanner;

public class swapTwoNum {

    int swapTwoNum(int a, int b){

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Numbers after swapping is "+a+" and "+b);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Numbers before swapping is "+num1+" and "+num2);

        swapTwoNum swap = new swapTwoNum();
        swap.swapTwoNum(num1,num2);
    }
}

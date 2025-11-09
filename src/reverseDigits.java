import java.util.Scanner;



public class reverseDigits {

    public static void main(String[] args){

        int num, d, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = sc.nextInt();

        while (num != 0) {
            d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        System.out.println("The reversed order is " +rev);

    }
}

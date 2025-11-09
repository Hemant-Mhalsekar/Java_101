import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num , d, temp = 0;
        int rev = 0;
        System.out.println("enter the number: ");
        num =  sc.nextInt();

        temp = num;
        while (temp != 0){
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        if (num == rev){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    sc.close();
    }
}

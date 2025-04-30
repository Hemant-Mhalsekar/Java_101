import java.util.Scanner;

public class readInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The number is " +num);
        sc.close(); //Always close Scanner
    }
}

import java.util.Scanner;

public class floatMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float prod = num1 * num2;
        System.out.println("The product of "+num1+ " and "+num2+" is "+prod);
        sc.close();
    }
}
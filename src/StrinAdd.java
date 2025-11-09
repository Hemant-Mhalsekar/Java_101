public class StrinAdd {

    static String add_binary(String x, String y ) {

        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;

        String result = Integer.toString(sum);
        return result;
    }

    public static void main(String[] args) {
        String x = "1010";
        String y = "10011";

        System.out.println(add_binary(x,y));

    }
}

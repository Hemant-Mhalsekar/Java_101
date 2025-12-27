package stringPrograms;

public class findLengthWithoutLenFun {
    public static void main(String[] args) {
        String s = new String("Programmer");
        int count = 0;
        for (char ch : s.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}

package stringPrograms;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "Level";
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equalsIgnoreCase(s))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}

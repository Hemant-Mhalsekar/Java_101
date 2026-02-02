package stringPrograms;

public class ReplacingLowerToUpper {
    public static void main(String[] args) {
        String s = "Java is easy";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
            {
                ch = (char) (ch - 32);
            }
            sb.append(ch);
        }

        System.out.println(sb);
    }
}

package stringPrograms;

public class removeVowelsUsingStringBuilder {
    public static void main(String[] args) {
        String s1 = "Program";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            char lower = Character.toLowerCase(ch);

            if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' &&lower != 'u')
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}

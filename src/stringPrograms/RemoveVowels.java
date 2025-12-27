package stringPrograms;

public class RemoveVowels {
    public static void main(String[] args) {
        String s1 = "Program";
        s1 = s1.toLowerCase();
        String s2 = new String();
        int n = s1.length();

        for (int i = 0; i < n; i++)
        {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
               s2 = s2.concat(String.valueOf(s1.charAt(i)));
            }
        }
        System.out.println(s2);
    }
}

package stringPrograms;

public class CountConsonants {
    public static void main(String[] args) {
        String s = "Programmer";
        int n = s.length();
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }
        System.out.println("The total number of consonants are "+ count);
    }
}

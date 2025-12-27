package stringPrograms;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Programmer";
        int n = s.length();
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The total number of vowels are "+ count);
    }
}

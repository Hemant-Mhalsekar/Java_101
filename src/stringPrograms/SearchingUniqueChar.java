package stringPrograms;

public class SearchingUniqueChar {
    public static void main(String[] args) {
        String s = "Programmer";

        for (int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            //Skip if character was already processed

            if(s.indexOf(ch) != i)
                continue;

            boolean check = s.indexOf(ch) == s.lastIndexOf(ch);

            if (check)
                System.out.println("Character "+ ch + " is unique");
            else
                System.out.println("Character " + ch + " is not unique");
        }
    }
}

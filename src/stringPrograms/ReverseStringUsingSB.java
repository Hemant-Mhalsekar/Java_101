package stringPrograms;

public class ReverseStringUsingSB {
    public static void main(String[] args) {
        String s1 = "Program";
        StringBuilder sb =new StringBuilder();

        //Using reverse function
        StringBuilder sb2 = new StringBuilder(s1);
        sb2.reverse();
        System.out.println(sb2);


        //Using for loop
        for (int i = s1.length() - 1; i>=0; i--)
        {
            char ch = s1.charAt(i);
            sb.append(ch);
        }

        System.out.println(sb);
    }
}

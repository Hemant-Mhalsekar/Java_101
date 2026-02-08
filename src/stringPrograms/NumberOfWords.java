package stringPrograms;

public class NumberOfWords {
    public static void main(String[] args) {
        String s = "Java is easy to learn";
        int count = 0;

        for (int i= 0; i < s.length(); i++){
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt( i-1 ) == ' ')){
                count++;
            }
        }
        System.out.println("Number of words: " + count);

        StringBuilder sb = new StringBuilder();
        int ch = s.length() - 1;
        while(s.charAt(ch) != ' '){
            sb.append(s.charAt(ch));
            ch--;
        }
        sb.reverse();

        System.out.println(sb);

        String[] words = s.trim().split("\\s+");
        System.out.println("Number of words: "+ words.length);
    }
}

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


        String[] words = s.trim().split("\\s+");
        System.out.println("Number of words: "+ words.length);
    }
}

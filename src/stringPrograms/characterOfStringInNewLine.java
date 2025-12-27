package stringPrograms;

public class characterOfStringInNewLine {
    public static void main(String[] args) {
        String s = new String("Programming");
        int n = s.length();
        for(int i = 0; i < n; i++){
            System.out.println(s.charAt(i));
        }
    }
}

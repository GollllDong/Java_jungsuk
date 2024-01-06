package Ch3.test;

public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'a';
        boolean b = ((ch >= 'A' && ch <= 'Z') || ('a'<= ch && ch <= 'z')) || ('0' <= ch && ch <= '9');

        System.out.println(b);
    }
}

package Ch4.test;

public class Exercise4_3 {
    public static void main(String[] args) {
        int sum= 0;
        int total = 0;
        for(int i = 1; i<=10; i++) {
            sum += i;         
            total += sum;
        }
        System.out.println(total);
    }
}

package Ch4.test;

public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i<= 20) {
            if (!(i % 2 == 0 || i % 3 == 0)) {
                sum += i;
            }
        i++;
        }    
        System.out.println(sum);
        }
    }

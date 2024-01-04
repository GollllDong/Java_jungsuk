package Ch3;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortpi = (int)(pi*1000+0.5)/ 1000.0;
        System.out.println(shortpi);
        
        short a = 10;
        char b = 'A';
        int c = (int) a+b;
        System.out.println(c);
    }
}

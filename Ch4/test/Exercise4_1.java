package Ch4.test;

public class Exercise4_1 {
    public static void main(String[] args) {
        int x = 0;
        char ch = 'A';

/*1*/   if(x > 10 && x < 20) { 
            System.out.println(true);
        }
/*1*/   else if (!(ch == ' ' && ch == '\t')) {
            System.out.println(true);
        }
    }
}

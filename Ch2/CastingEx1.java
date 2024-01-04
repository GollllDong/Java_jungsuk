package Ch2;
public class CastingEx1 {
    public static void main(String[] args) {
        double d = 50.43;
        int score = 30;

        System.out.println(score+(int)d);
        int ss = (int)d;
        System.out.println("double형 "+d);
        System.out.println("int형변환 후 :"+ss);
    }
}

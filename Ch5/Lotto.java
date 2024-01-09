package Ch5;
import java.util.*;;

public class Lotto {
    public static void main(String[] args) {
        int[] paper = new int[6];
        for(int i = 0; i < paper.length; i++) {
            paper[i] = (int)(Math.random()*45 + 1);
        }
        Arrays.sort(paper);
        System.out.println(Arrays.toString(paper));
    }   
}

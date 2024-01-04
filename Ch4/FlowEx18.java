package Ch4;
import java.util.*;

public class FlowEx18 {
    public static void main(String[] args) {
        System.out.print("출력할 단을 입력해주세요>>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int int_casting = Integer.parseInt(tmp);

        for(int i=1; i <= 9; i++) {
            System.out.println(int_casting+"*"+i+"="+int_casting * i);
        }
    }
}

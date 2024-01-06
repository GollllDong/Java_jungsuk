package Ch3;

import java.util.*;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요 : ");   

        String str = scanner.nextLine();
        char ch = str.charAt(0);
        
        if ('0' <= ch && ch <= '9') {
            int a = (int) ch;
            System.out.println("입력하신 문자는 숫자입니다. 해당 숫자의 int형 값 " +a);
        }
        else if ('A' <= ch && ch <= 'Z') {
            int a = (int) ch;
            System.out.printf("입력하신 문자는 영문자(대)입니다. 해당 문자의 int형 값 %d", a);
        }
        else if ('a' <= ch && ch <= 'z') {
            int a = (int) ch;
            System.out.printf("입력하신 문자는 영문자(소)입니다. 해당 문자의 int형 값 %d",a);
        }
        scanner.close();
    }
}

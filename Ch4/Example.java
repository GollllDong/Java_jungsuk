package Ch4;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        outer :
        while(true) {
            System.out.println("(1) 제곱");
            System.out.println("(2) 홀짝");
            System.out.println("(3) 양음수");
            System.out.printf("원하는 메뉴(1~3)을 입력하세요. 종료)0번 >>");
            String tmp = scanner.nextLine();
            int int_tmp = Integer.parseInt(tmp);
            if(int_tmp == 0) {
                System.out.println("프로그램을 종료합니다.");
                break outer;
            }else if(!(int_tmp >= 0 && int_tmp <= 3)) {
                System.out.println("------------------------------------");
                System.out.println("잘못된 값을 입력하였습니다. 다시 시도해주세요");
                continue;
            }else if(int_tmp == 1) {
                System.out.println("계산할 값을 입력해주세요 :");
                String a = scanner.nextLine();
                int b = Integer.parseInt(a);
                double c = Math.pow(b, b);
                System.out.println(a+"^ ="+c);
                break;
            }else if(int_tmp == 2) {
                System.out.println("계산할 값을 입력해주세요 :");
                String a = scanner.nextLine();
                int b = Integer.parseInt(a);
                if (b % 2 ==0) {
                    System.out.println("입력하신 값"+b+"은 짝수입니다.");
                }else {
                    System.out.println("입력하신 값"+b+"은 홀수입니다.");
                }
            }else if(int_tmp == 3) {
                System.out.println("계산할 값을 입력해주세요 :");
                String a = scanner.nextLine();
                int b = Integer.parseInt(a);
                if (b >0) {
                    System.out.println("입력하신 값"+b+"는 양수입니다.");
                }else {
                    System.out.println("입력하신 값"+b+"는 양수입니다.");
                }
            }
        }
    }
}

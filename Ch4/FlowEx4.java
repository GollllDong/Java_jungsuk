package Ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';   

        System.out.println("점수를 입력하세요 :");
        Scanner scanner = new Scanner(System.in);
        String s_sca = scanner.nextLine();
        score = Integer.parseInt(s_sca);

        if (score >= 101 || score < 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
            System.exit(grade);
        }
        else if (100 >= score && score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            System.out.println("낙제입니다. 다음 시험을 잘보세요.");
            System.exit(grade);
        }
        System.out.println("당신의 성적은"+grade+ "입니다");
    }
}

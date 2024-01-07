package Ch4.test;
import java.util.*;

public class Exercise4_14 {
    public static void main(String[] args) {
        int answer =(int)(Math.random()*100 + 1) /* (1) */;
        int input = 0; // 사용자입력을 저장할 공간 
        int count = 0; // 시도횟수를 세기위한 변수
        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용 
       Scanner scanner = new Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = scanner.nextInt(); // 입력받은 값을 변수 input에 저장한다.
            
            if (input < 0 || input >= 101){
                System.out.println("유효하지 않은 범위입니다.");
            }else if (!(answer == input)){
                if (input > answer) {
                    System.out.println("Down");
                }else if(input < answer) {
                    System.out.println("Up");
                }
            }else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수 :" + count);
                scanner.close();
                break;
            }
        } while(true); // 무한반복문 }
    }   
}
// 다음은 숫자맞추기 게임을 작성한 것이다. 
// 1과 100사이의 값을 반복적으로 입력 해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
// 사용자가 값을 입력하면, 컴퓨터는 자 신이 생각한 값과 비교해서 결과를 알려준다. 
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
// (1)~(2)에 알맞은 코드를 넣어 프 로그램을 완성하시오.
package Ch4.test;

public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "7574"; 
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; // 0은 48, 문자열에 있는 값을 하나씩 다 char형으로 변환되서 계산
        }
        System.out.println("sum = " + sum);
    }
}

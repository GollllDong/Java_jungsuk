package Ch2;

public class Example {
    public static void main(String[] args) {
        char ch = 'A'; 
        char s = 65;

        // 사실상 메모리에는 2진수로 65가 들어가있는건데 println은 문자형일때는 유니코드로 변환해서 보여준다.
        System.out.printf("ch : %c, %d %n",ch, (int)ch); 
        System.out.println(ch);
        System.out.println(s);
        System.out.println("\"안녕하세여\" ");
        if(ch ==s) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

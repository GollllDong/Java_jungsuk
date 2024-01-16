package Ch6;

class Data_2 { 
    int x;
    String s;
 }

public class ReferenceParamEx {
	public static void main(String[] args) {

		Data_2 d = new Data_2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change_int(d);
		System.out.println("After change_int(d)");
		System.out.println("main() : x = " + d.x);

        System.out.println("-------------------");

        d.s = "오늘은 화요일 입니다.";
        System.out.println("main() : s = " + d.s);

        change_str(d);  // 메서드 이후에 반영이 됨 >> 기본형 매개변수가 아닌 참조형 매개변수를 사용해서 값 자체가 바뀜
        System.out.println("After change_str(s)");
		System.out.println("main() : s = " + d.s);

	}

	static void change_int(Data_2 d) {
		d.x = 1000;
		System.out.println("change_int() : x = " + d.x);
	}
    static void change_str(Data_2 d) {
		d.s = "오늘은 수요일 입니다.";
		System.out.println("change_str() : s = " + d.s);
	}
}
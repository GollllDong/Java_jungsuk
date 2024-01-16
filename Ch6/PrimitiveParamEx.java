package Ch6;

class Data { 
    int x; 
}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; // Data 클래스의 x라는 변수에 10 할당
		System.out.println("main() : x = " + d.x);

		change(d.x); // 해당 메서드에 매개변수로 x값 즉 - 10을 가져와서 메서드 실행 >> 1000이 나옴
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // main메서드에서 호출하면서 Data클래스의 값이 복사가 되서 매개변수로 넘어옴
		x = 1000;                // 10 -> 1000
		System.out.println("change() : x = " + x);
	}   // change메서드가 종료되면서 매개변수의 값도 같이 삭제.
}
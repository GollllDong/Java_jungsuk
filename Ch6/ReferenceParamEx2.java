package Ch6;

public class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x = {10, 40, 50, 1992};  // 크기가 4인 배열. x[0] = 10;
		System.out.println("main() : x[0] = " + x[0]);
		System.out.println("main() : x[3] = " + x[3]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x[0] = " + x[0]);
		System.out.println("main() : x[3] = " + x[3]);
	}

	static void change(int[] x) { // 참조형 매개변수   >> 배열도 참조형 매개변수로 들어가고 참조형은 인스턴스의 주소를 복사해서 오기 때문에 값이 변경된게 반영된다.
		x[0] = 1000;              // 기본형은 값만 복사해서 쓸 수 있고 참조형은 값을 불러와서 수정가능
        x[3] = 2000;
		System.out.println("change() : x[0] = " + x[0]);
		System.out.println("change() : x[3] = " + x[3]);
	}
}
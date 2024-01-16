package Ch6;

public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);    // 매개변수에 값 할당
		System.out.println("r1 result : "+result);

		int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
		System.out.println("r2 result[0] : "+result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) { // 매개변수와 메서드 호출시 인자값 순서는 동일해야함
		result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}
}
package Ch6;

class FactorialTest {
	public static void main(String args[]) {
		// FactorialTest.factorail(4) 로 해도됨, 
        // 만약 값을 0으로 주면 계산할게 없고 계속 무한반복이 되서 StackOverFlowError가 발생한다.
        int result = factorial(4); 
        System.out.println("Factorial : "+result);
	}

	static int factorial(int n) {  // 기본형 매개변수 = 값을 복사해서 사용
		int result = 0;

		if (n == 1) {
            return 1;		
        }else {
            result = n * factorial(n-1); // 4 * 3 * 2 * 1
        }

		return result;
	}
}
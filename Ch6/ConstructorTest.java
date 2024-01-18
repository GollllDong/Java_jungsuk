package Ch6;

class Data1 {
	int value = 10; // -> Data1클래스는 안에 생성자를 지정한게 없기 때문에 자동적으로 생성자가 초기화된다.
}

class Data2 {
	int value;
    int tmp;

	Data2(int value, int tmp) { 	// 매개변수가 있는 생성자.
		value = 40; // 초기값들은 20 50 이지만 이후에 생성자 초기화를 시켜준다.
		tmp = 200;
		this.value = value;
        this.tmp = tmp;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
        System.out.println("d1.value : "+d1.value);
		Data2 d2 = new Data2(20, 50);	//compile error발생
        System.out.println("d2.value : "+d2.value+", "+d2.tmp);
	}
}
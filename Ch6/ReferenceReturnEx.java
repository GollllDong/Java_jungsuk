package Ch6;

class Data_2_2 { int x; }

class ReferenceReturnEx {
	public static void main(String[] args) 
	{
		Data_2 d = new Data_2();    // d라는 참조변수에 0x100번지에 x라는 값을 가진 객체 생성
		d.x = 10;               // 0x100번지에 x값 10 할당

		Data_2 d2 = copy(d);      // 참조변수 d의 주소번지를 매개변수로 할당시켜줌 
        // >> 반환된 10의 값이 tmp의 주소번지까지 따라가게 되면서 d2는 0x200번지를 가짐. 
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data_2 copy(Data_2 d) { // 참조형 변수이므로 d의 주소번지 0x100번지가 할당된다.
		Data_2 tmp = new Data_2(); // tmp라는 참조변수에 0x200번지의 x라는 값을 가진 객체 생성
		tmp.x = d.x;           // 0x100번지의 참조변수 d의 x의값인 10을 0x200번지에 복사
		return tmp;            // tmp가 가진 x의 값 10을 copy(d)의 값으로 반환
	}
}
package Ch2;

class CastingEx4 {
	public static void main(String[] args) {
		int   i  = 91234567;  // 8자리 	int형 값 보유
		float f  = (float)i;  // 8자리의 int형 float형으로 형변환	
		int   i2 = (int)f;	  // 다시 int형으로 변환

		double d = (double)i; 
		int   i3 = (int)d;    

		float f2 = 1.666f;
		int   i4 = (int)f2;
		// int형은 10자리, float형은 7자리, double형은 15자리까지 정밀도 지원

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
	}
}
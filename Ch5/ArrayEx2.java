package Ch5;
import java.util.*; 

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
        int[] iArr4 = new int[iArr3.length * 2];
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
		}

        for (int i = 0; i < iArr4.length; i++) {
            iArr4[i] = iArr3[i];
        }


		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		}
		System.out.println();													
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
        // System.out.println(Arrays.toString(iArr4));  이 값은 인덱스범위 [5] ~[9]까지 값이 없어서 인덱스 오류가 발생한다.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
    }
}
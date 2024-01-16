package Ch6;

import java.util.*;

public class ReferenceParamEx3 {
	public static void main(String[] args) 
	{
		int[] arr = new int[] {3,2,1,6,5,4}; // 인덱스 0~5까지

		printArr(arr);  // 배열의 모든 요소를 출력
		sortArr(arr);   // 배열을 정렬
		printArr(arr);  // 정렬후 결과를 출력
		System.out.println("sum="+sumArr(arr)); // 배열의 총합을 출력
	}

	static void printArr(int[] arr) {  // 배열의 모든 요소를 출력 >> 배열이므로 참조형 매개변수
		System.out.print("[");

		// for(int i : arr) 향상된 for문으로 쓸 수 있지만 조건을 걸기 위해서
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
            if (i < arr.length - 1) {   // 총 길이는 0~5인데 -1을 해줌으로써 마지막 인덱스에는 반점이 안오게
                System.out.print(",");
            }
        }
		System.out.println("]");
	}

	static int sumArr(int[] arr) {  // 배열의 모든 요소의 합을 반환
		int sum = 0;

		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
    static void sortArr(int[] arr) {
        Arrays.sort(arr);
    }
	// static void sortArr(int[] arr) {  // 배열을 오름차순으로 정렬
	// 	for(int i=0; i<arr.length-1; i++) // 0~4까지
	// 		for(int j=0; j<arr.length-1-i; j++) // 0~2까지
	// 			if(arr[j] > arr[j+1]) {
	// 				int tmp = arr[j];
	// 				arr[j] = arr[j+1];
	// 				arr[j+1] = tmp;
	// 			}    
}
package Ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;
        int[] arr = {75, 41, 65, 70, 100};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / (float)arr.length;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}

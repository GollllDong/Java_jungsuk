package Ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] value = {52, 70, 47, 99, 83, 55, 69};
        int max = value[0];
        int min = value[0];
        
        for(int i = 0; i < value.length; i++) {
            if(max < value[i]) {
                max = value[i];
            }else if(min > value[i]) {
                min = value[i];
            }
        }
        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}

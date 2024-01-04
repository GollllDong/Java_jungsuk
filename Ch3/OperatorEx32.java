package Ch3;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x,y,z = 0;
        int absX, absY, absZ = 0;
        char signX, signY, signZ = 0;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
        signY = y > 0 ? '+' : (x==0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (x==0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);
    }
}

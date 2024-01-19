package Ch6.test;

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance_2(int a, int b) {
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
}

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance_2(2,2));
    }
}
/*10- b e
11 - a b vv
12 - c d
13 - b d v
14 - c e
15 - a
16 - a e
17-2
*/
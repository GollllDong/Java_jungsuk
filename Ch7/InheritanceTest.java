package Ch7;

class MyPoint {
    int x;
    int y;
}
// class Circle_2 extends MyPoint{ -> 상속
//     int z;
// }

class Circle_2 {
    MyPoint p = new MyPoint();  // -> 포함관계
    int z;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle_2 c_2 = new Circle_2();
        // c_2.x = 15; 상속
        // c_2.y = 23;
        // c_2.z = 53;
        c_2.p.x = 20; // 포함
        c_2.p.y = 50;
        c_2.z = 67;
        System.out.println("c_2.p.x : " + c_2.p.x );
        System.out.println("c_2.p.y : " + c_2.p.y );
        System.out.println("c_2.z : " + c_2.z);
    }    
}

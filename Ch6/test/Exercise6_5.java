package Ch6.test;

public class Exercise6_5 {
    public static void main(String[] args) {
        Student_5 s = new Student_5("홍길동",1,1,100,60,76);

        System.out.println(s.info_2());
    }
}
class Student_5 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student_5(String name, int a, int b, int c, int d, int e) {
        this.name = name;
        this.ban = a;
        this.no = b;
        this.kor = c;
        this.eng = d;
        this.math = e;
    }
    int getTotal_2() {
        return kor + eng + math;
    }
    float getAverage_2() {
        float avg = (float)getTotal_2() / 3;
        return Math.round(avg * 10.0) / 10.0f;
    }

    String info_2 () {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal_2() + "," + getAverage_2();
    }
}

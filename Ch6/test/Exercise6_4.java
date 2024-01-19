package Ch6.test;

public class Exercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("이름 : "+ s.name);
        System.out.println("총합 : "+ s.getTotal());
        System.out.println("평균 : "+ s.getAverage());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int result;

    Student() {
        this.name = "홍길동";
        this.ban = 1;
        this.no = 1;
        this.kor = 100;
        this.eng = 60;
        this.math = 76;
        this.result = getTotal();
    }

    int getTotal() {
        int result = this.kor + this.eng + this.math;
        return result;
    }
    float getAverage() {
        float avg = (float)this.result / 3;
        return Math.round(avg * 10.0) / 10.0f;
    }
    
}
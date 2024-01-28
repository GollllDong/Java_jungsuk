package Ch6;

public class Car_010 {
    public static void main(String[] args) {
        Car_22 c = new Car_22("비싼 파츠",4000,10);
        System.out.println(c.rate);

        Car_22 c2 = new Car_22(50, 90);
        System.out.println(c2.part);
        System.out.println(c2.value);
        System.out.println(c2.rate);
        System.out.println(c2.name);
    }    
}
class Car_22 {
    String part;
    int value;
    int rate;
    String name = "제네시스";

    Car_22(int value, int rate) {
        this("생성자 초기화 할때 값이 2개인 경우",value, rate);
    }
    Car_22(String part, int value, int rate) {
        this.part = part;
        this.value = value;
        this.rate = rate;
    }
}


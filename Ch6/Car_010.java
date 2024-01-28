package Ch6;

public class Car_010 {
    public static void main(String[] args) {
        Car_22 c = new Car_22("비싼 파츠",4000,10);
        System.out.println(c.part);
        System.out.println(c.value);
        System.out.println(c.rate);
        System.out.println(c.name);

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

    Car_22(int value, int rate) {   //생성자 초기화를 할때 인자 값으로 2개를 받아와도 모든 인스턴스 변수에는 값이 초기화 되어야 한다.
                                    // 예를 들어 part, value, rate, name중 현재 name은 제네시스로 초기화 되어있고 
                                    // c2라는 참조변수에 value = 50, rate = 90으로 인스턴스 변수를 초기화 했지만 part는 값이 없기 때문에 생성자 호출 오류가 발생하게 된다.
        this("생성자 초기화 할때 값이 2개인 경우",value, rate);
    }
    Car_22(String part, int value, int rate) {
        this.part = part;
        this.value = value;
        this.rate = rate;
    }
}


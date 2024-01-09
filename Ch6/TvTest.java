package Ch6;

class Tv { 
    // Tv의 속성(멤버변수) 
    String color;           	// 색상 
    boolean power;         	// 전원상태(on/off) 
    int channel;           	// 채널 

    // Tv의 기능(메서드) 
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드  
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
}

public class TvTest { 
     public static void main(String args[]) { 
       Tv t = new Tv();
       t.channel = 10;
       t.channelDown();
       System.out.println("현재 채널은 " + t.channel + " 입니다.");
     } 
} 
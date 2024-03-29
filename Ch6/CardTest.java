package Ch6;

public class CardTest{
	public static void main(String args[]) {
		System.out.println("Card.width = "  + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );		

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        Card.width = 50;    
        Card.height = 80;
		// c1.width = 50;   이처럼 객체를 통해 객체에 값을 넣어도 되지만 
		// c1.height = 80;  static(클래스 변수)에 접근할때 클래스.변수로 접근하지않으면 경고가 발생

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
 }

class Card {
	String kind ;				// 카드의 무늬 - 인스턴스 변수
	int number;				    // 카드의 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭  - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}
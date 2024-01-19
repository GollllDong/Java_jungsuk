package Ch6;

class Document {
	static int count = 0;
	String name;     // 문서명(Document name)

	Document() {     // 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}

	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main(String args[]) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}
// 메서드 오버로딩을 통해 인자값이 존재하는 코드는 2번째 메서드로 가서 
// name이라는 매개변수에 자바.txt라는 값을 주고 그 값을 인스턴스 변수에 집어넣음
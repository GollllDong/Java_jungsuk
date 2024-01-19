package Ch6;

public class BlockTest {

    static {
        System.out.println("static {}");
    }
    {
        System.out.println("Instance {}");
    }
    public BlockTest() {
        System.out.println("생성자");
    }
    void run() {
        System.out.println("달리기ing~~");
    }
    public static void main(String[] args) {
        System.out.println("BlockTest b1 = new BlockTest()");
        BlockTest b1 = new BlockTest();
        b1.run();
        
        System.out.println("BlockTest b2 = new BlockTest()");
        BlockTest b2 = new BlockTest();
        b2.run();
    }
}

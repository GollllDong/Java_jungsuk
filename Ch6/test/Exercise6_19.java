package Ch6.test;

class Exercise6_19 {
    public static String change(String str) {
        str += "456";
        return str; // 변경된 문자열을 반환
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        str = change(str); // 변경된 값을 다시 참조 변수에 할당
        System.out.println("After change:" + str);
    }
}

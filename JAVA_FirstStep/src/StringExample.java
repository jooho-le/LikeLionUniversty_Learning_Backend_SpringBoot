public class StringExample {
    public static void main(String[] args) {

        // String : 문자열 객체
        // 객체 : 힙 메모리 영역
        // 변수 : 힙 메모리 영역의 주소

        String str = "안녕하세요"; // 문자열 리터럴
        String str_2 = new String("안녕하세요"); // 생성자
        String str_3 = "안녕하세요";

        if (str == str_2) {
            System.out.println("str == str_2");
        }
        if (str == str_3) {
            System.out.println("str == str_3");
        }
        if (str_2 == str_3) {
            System.out.println("str2 == str_3");
        }

        // 내용 비교
        if (str.equals(str_2)) {
            System.out.println("str.equals(str_2)");
        }
        if (str.equals(str_3)) {
            System.out.println("str.equals(str_3)");
        }
        if (str_2.equals(str_3)) {
            System.out.println("str_2.equals(str_3)");
        }

    }
}

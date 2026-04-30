public class ReferenceType {
    public static void main(String[] args) {

        // 참조형
        // 참조형 데이터의 값 : 힙 메모리에 생성
        // 변수에 대입되는 값 : 힙 메모리 영역의 주소값

        String a = new String("Hello");
        System.out.println(a);

        // 리터럴 방식으로 생성
        // 동일한 주소를 가져감
        String b = "Hello";
        String c = "Hello";

        if (a == b) {
            System.out.println("a==b"); // a랑 b가 다른 주소값을 가짐
        }
        if (b == c) {
            System.out.println("b==c"); // b랑 c가 같은 주소값을 가짐
        }

    }
}

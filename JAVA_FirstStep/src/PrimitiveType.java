public class PrimitiveType {
    public static void main(String[] args) {

        // 정수형 구분
        // 1. byte(= 8bits)
        // 2. short(= 2bytes)
        // 3. int(= 4bytes)
        // 4. long(= 8bytes)

        // byte a = 128; // 범위를 넘어서 오류 발생

        // 실수형 구분
        // 1. double(= 8bytes) - 15자리 , 주로 많이 사용
        // 2. float(= 4bytes) - 7자리

        double a = 1.23;
        float b = 9.45f;
        System.out.println(a);
        System.out.println(b);
    }
}

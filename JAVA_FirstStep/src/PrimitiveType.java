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

        // 문자형 구분
        // 1. char(= 2bytes)

        char char_1 = 'a';
        char char_2 = 97; // 아스키코드
        char char_3 = 0x61; // 유니코드
        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);

        // 논리형
        // 1. boolean(= 1byte)

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0);
        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);
    }
}

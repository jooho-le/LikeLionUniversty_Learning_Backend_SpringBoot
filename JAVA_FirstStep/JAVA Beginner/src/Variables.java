public class Variables {

    //변수 : 데이터가 저장되는 공간

    // 규칙
    // 1. 한 개의 변수에는 1개의 값만 할당
    // 2. 변수에 저장된 값은 재할당을 통해 변경 가능
    // 3. 값의 형태에 맞는 자료형 사용
    // 4. 변수명은 소문자로 시작
    // 5. 대소문자 구분 , 공백 포함 불가능
    // 6. 자바 예약어 사용 불가
        /* int int = 1;
         */

    public static void main(String[] args) {
        int num = 1;
        double width = 12.34;
        String name = "John"; // 힙에 저장하고 주소값 참조

        num = 10; // num에 값 재할당
        System.out.println(num);
    }

}
